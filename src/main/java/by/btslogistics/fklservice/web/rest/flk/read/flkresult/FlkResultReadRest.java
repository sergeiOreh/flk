package by.btslogistics.fklservice.web.rest.flk.read.flkresult;


import by.btslogistics.commons.dao.enums.Stage;
import by.btslogistics.fklservice.dao.model.messageslog.repository.MessageLogSaveRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flkresult.FlkResultDto;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.service.flk.read.flkresult.FlkResultReadService;
import by.btslogistics.fklservice.service.flk.save.messageslog.MessagesLogSaveService;
import by.btslogistics.fklservice.service.proxyservice.ProxyService;
import by.btslogistics.fklservice.service.registration.dto.sddeclscheme.SdaMainDto;
import by.btslogistics.fklservice.service.registration.read.sddeclscheme.impl.SdaMainReadServiceImpl;
import by.btslogistics.fklservice.web.exceptions.common.ValueNotFoundException;
import by.btslogistics.fklservice.web.rest.constants.flk.constants.flkresult.FlkResultConstants;
import by.btslogistics.fklservice.web.rest.flk.bean.ParametersForFlkResultDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static by.btslogistics.fklservice.web.rest.constants.flk.constants.flkresult.FlkResultConstants.*;

@RestController
@RequestMapping(ROOT_FLK_RESULT_FROM_SYS_CURSOR)
public class FlkResultReadRest {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlkResultReadRest.class);

    @Value("Данного идентификатора документа в аналитичической БД статистики не существует")
    private String messageNullId;

    private final FlkResultReadService service;

    private final SdaMainReadServiceImpl sdaMainReadService;

    private final MessagesLogSaveService messagesLogSaveService;

    private final ProxyService proxyService;

    @Autowired
    public FlkResultReadRest(FlkResultReadService service, SdaMainReadServiceImpl sdaMainReadService, MessageLogSaveRepository repository, MessagesLogSaveService messagesLogSaveService, ProxyService proxyService) {
        this.service = service;
        this.sdaMainReadService = sdaMainReadService;
        this.messagesLogSaveService = messagesLogSaveService;

        this.proxyService = proxyService;
    }

    /**
     * <p> api: </p>
     * <p> <b> api/read/flkResult/listErrors </b> </p>
     *
     * @param idDeclaration 32-символьный (GUID) идентификатор записи в таблице SD_MAIN
     * @param dateStart     дата в формате YYYY-MM-DD T 24HH:MM:SS
     * @param typeDocument  тип документа согласно классификатору типов документов 2-4 символьных знака
     * @return возвращает список проверок
     */
    @GetMapping(LIST_ERRORS)
    public Iterable<FlkResultDto> getListErrorFromDeclaration(@RequestParam String idDeclaration,
                                                              @RequestParam("dateStart")
                                                              @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                                                                      LocalDateTime dateStart,
                                                              @RequestParam String typeDocument) {

        LOGGER.debug(ROOT_FLK_RESULT_FROM_SYS_CURSOR + "/" + LIST_ERRORS +
                " : it has come a request for processing data.");

        return service.getFlkResultFromProcedure(idDeclaration, dateStart, typeDocument);
    }

    /**
     * <p> api: Модуль приема передает MessagesLogDto для проведения ФЛК-1 (до регистрации (длинный номер) декларации
     * на товары и проставления признака STAGE_DOC со статусом 201 и после проведения проверки статус 202</p>
     * <p> <b> api/read/flkResult/receive/call/firststage </b> </p>
     *
     * @param dto 32-символьный (GUID) идентификатор записи в таблице SD_MAIN
     * @return возвращает список проверок
     */
    @PostMapping(URL_TO_FLK_SERVICE)
    public void getDocumentForValidateAtTheFirstStage(@RequestBody MessageLogDto dto) {

        dto.setStageDoc(Stage.FLC_STAGE.getStatus()); //присваиваем статус до выполнения ФЛК-1 (до регистрации)
        messagesLogSaveService.setToMessageLog(dto);

        /* TODO Выполнить проверку на ФЛК и сформировать протокол ошибок */

        dto.setStageDoc(Stage.FLC_PROCESSED.getStatus()); //присваиваем статус до выполнения ФЛК-1 (до регистрации)
        messagesLogSaveService.setToMessageLog(dto);

        proxyService.doRegistration(dto);
    }

    /**
     * Запрос данных из другого сервиса
     *
     * @param dto контейнер для хранения нужных данных
     * @return возвращает список ошибок
     */
    @GetMapping(LIST_ERRORS_FOR_ANOTHER_SERVICE)
    public Iterable<FlkResultDto> getListErrorFromDeclarationWithoutParam(@RequestBody ParametersForFlkResultDto dto) {

        LOGGER.debug(ROOT_FLK_RESULT_FROM_SYS_CURSOR + "/" + LIST_ERRORS_FOR_ANOTHER_SERVICE +
                " : it has come a request for processing data from an another service.");

        String idDeclaration = dto.getIdDeclaration();
        String typeDocument = dto.getTypeDocument();
        LocalDateTime dateStart = dto.getDateStart();

        return service.getFlkResultFromProcedure(idDeclaration, dateStart, typeDocument);
    }

    /**
     * <p> Метод возвращает на пользоватейский интерфейс по запросу id из журнала стат.деклараций список ошибок (инспекторская часть) </p>
     * <p> <b> api/read/flkResult/list/{id} </b> </p>
     *
     * @param id 32-символьный (GUID) идентификатор записи в таблице SD_MAIN
     * @return возвращает список проверок для отображения на пользовательском интерфейсе по запросу
     */

    @SuppressWarnings("MVCPathVariableInspection")

    @GetMapping(FlkResultConstants.PATH_LIST_BY_ID_DECLARATION_SD_MAIN)
    public Iterable<FlkResultDto> getListErrorForDeclarationFromUiSdMain(@PathVariable String id) {

        return service.getFlkResultFromProcedure(id);
    }

    /**
     * <p> Метод возвращает на пользоватейский интерфейс по запросу id из вкладки ДОКУМЕНТЫ (амдинистраторская часть) </p>
     * MESSAGESLOG.ID  8a008441715ef92401715ef95f3d0001
     * SELECT в таблицу SDA_MAIN по MESSAGESLOG.ID
     * По найденному документу из таблицы SDA_MAIN берется ID. По этому ID осуществляется SELECT в таблицу FLK_MAIN
     * <p> <b> api/read/flkResult/list/documents/{id} </b> </p>
     *
     * @param id 32-символьный (GUID) идентификатор записи в таблице SD_MAIN
     * @return возвращает список проверок для отображения на пользовательском интерфейсе по запросу
     */
    @SuppressWarnings("MVCPathVariableInspection")
    @GetMapping(FlkResultConstants.PATH_LIST_BY_ID_DECLARATION_MESSAGE_LOG)
    public ResponseEntity<Iterable<FlkResultDto>> getListErrorForDeclarationFromUiMessageLog(@RequestParam("idMessagesLog") String id) throws ValueNotFoundException {

        SdaMainDto sdaMainDto = sdaMainReadService.findByToMessagesLogId(id);

        if (sdaMainDto.getId() == null) throw new ValueNotFoundException(messageNullId);

        String sdaMainDtoId = sdaMainDto.getId();

        return ResponseEntity.ok(service.getFlkResultFromProcedure(sdaMainDtoId));
    }

}

