package by.btslogistics.fklservice.service.flk.read.flkresult;

import by.btslogistics.fklservice.service.flk.dto.flk.flkresult.FlkResultDto;

import java.time.LocalDateTime;

public interface FlkResultReadService {
    /**
     * <p>
     * Метод обращается к пакету <b>VALIDATE_SD</b>, в котором вызываемая процедура пакета <b>Start_Validate</b>
     * принимает параметры. Возвращаемым параметром процедуры <b>Start_Validate</b> является курсорная переменная
     * типа <b>SYS_REFCURSOR</b></p>
     *
     * @param idDeclaration 32-символьный (GUID) идентификатор записи в таблице SD_MAIN
     * @param dateStart     дата в формате YYYY-MM-DD T 24HH:MM:SS
     * @param typeDocument  тип документа согласно классификатору типов документов 2-4 символьных знака
     * @return возвращает список ошибок при проверке документа на соответствия условий в БД. Данный список
     * обрабатывается модулем регистрации для передаче в формате сообщения CSTM.00011 -
     */
    Iterable<FlkResultDto> getFlkResultFromProcedure(String idDeclaration, LocalDateTime dateStart, String typeDocument);

    /**
     * <p>
     * Метод обращается к пакету <b>VALIDATE_SD</b>, в котором вызываемая процедура пакета <b>ERRORS_FLK_LOG_FOR_UI</b>
     * принимает параметр. Возвращаемым параметром процедуры <b>Start_Validate</b> является курсорная переменная
     * типа <b>SYS_REFCURSOR</b></p>
     *
     * @param idDeclaration 32-символьный (GUID) идентификатор записи в таблице SD_MAIN
     * @return возвращает список ошибок при проверке документа на соответствия условиям в БД.
     * Данный список отображается на стороне пользовательского интерфейса из журнала регистрации документов
     * по нажатию кнопки "Просмотр протокола ФЛК"
     */
    Iterable<FlkResultDto> getFlkResultFromProcedure(String idDeclaration);


}
