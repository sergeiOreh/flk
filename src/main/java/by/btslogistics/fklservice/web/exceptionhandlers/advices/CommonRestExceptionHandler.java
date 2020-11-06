package by.btslogistics.fklservice.web.exceptionhandlers.advices;

import by.btslogistics.fklservice.service.flk.exception.ResourceNotFoundException;
import by.btslogistics.fklservice.web.exceptionhandlers.bean.ApiErrorResponse;
import by.btslogistics.fklservice.web.exceptionhandlers.bean.ApiErrorsListResponse;
import by.btslogistics.fklservice.web.exceptions.common.DeleteException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.RollbackException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import static by.btslogistics.fklservice.web.utils.handlerutils.StringConversationUtils.getListErrMessage;


/**
 * Данный класс будет перехватывать exceptions, который возникают во время обработки данных
 */
@ControllerAdvice
public class CommonRestExceptionHandler extends ResponseEntityExceptionHandler {


    /**
     * Обработка исключиения типа ViolationException, которое бросается, когда происходит
     * откат транзакции, в случае неудачной работы с базой данных.
     * @param ex - объект типа DataIntegrityViolationException, который является оболочкой для вложенного ViolationException
     *           данный параметр передается методу, когда происходит перехват исключения
     * @return - возвращает ответ клиенту, с указанием ошибки
     */
    @ExceptionHandler({DataIntegrityViolationException.class})
    protected ResponseEntity<Object> handlePersistenceException(final DataIntegrityViolationException ex) {

        Throwable cause = ex.getRootCause();

        if (cause instanceof SQLIntegrityConstraintViolationException) {

            SQLIntegrityConstraintViolationException consEx = (SQLIntegrityConstraintViolationException) cause;

            final ApiErrorResponse apiError =  ApiErrorResponse.newBuilder()
                    .message(consEx.getLocalizedMessage())
                    .status(HttpStatus.BAD_REQUEST)
                    .build();

            return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
        }

        final ApiErrorResponse apiError =  ApiErrorResponse.newBuilder()
                .message(ex.getLocalizedMessage())
                .status(HttpStatus.NOT_ACCEPTABLE)
                .build();

        return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
    }

    /**
     * обработка exception, который возникает на уровне dao, когда просходит попытка сохранения данных.
     * Если какие-то поля не соответсвтуют установленным ограничениями, тогда формируются сообщения
     * @param ex - объект типа RollbackException, который появляется в момент ошибки выполнения транзакции
     * @return - возвращается объект, который затем будет использован для формирования response клиенту,
     * в случае ошибки
     */
   @ExceptionHandler(RollbackException.class)
   public ResponseEntity<ApiErrorsListResponse> handleNotValidException(RollbackException ex){

       String errMessage = ex.getCause().getMessage();

       List<String> listErrMessage = getListErrMessage(errMessage);
       ApiErrorsListResponse response = ApiErrorsListResponse.newBuilder()
               .status(HttpStatus.NOT_ACCEPTABLE)
               .errorMessage(listErrMessage)
               .build();

       return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);

   }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> notFoundException(ResourceNotFoundException ex){

        final ApiErrorResponse apiError =  ApiErrorResponse.newBuilder()
                .message(ex.getLocalizedMessage())
                .status(HttpStatus.NOT_FOUND)
                .statusCode(HttpStatus.NOT_FOUND.value())
                .build();

        return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
    }

    @ExceptionHandler(DeleteException.class)
    public ResponseEntity<ApiErrorResponse> deleteException(DeleteException ex){

        final ApiErrorResponse apiError =  ApiErrorResponse.newBuilder()
                .message(ex.getLocalizedMessage())
                .status(HttpStatus.BAD_REQUEST)
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();

        return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
    }


}
