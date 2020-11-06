package by.btslogistics.fklservice.service.flk.read.flkresult.impl;

import by.btslogistics.commons.dao.enums.Stage;
import by.btslogistics.fklservice.dao.model.flk.model.flkresult.FlkResult;
import by.btslogistics.fklservice.dao.model.flk.repository.flkresult.FlkResultRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flkresult.FlkResultDto;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.service.flk.mapper.flk.flkresult.FlkResultMapper;
import by.btslogistics.fklservice.service.flk.read.flkresult.FlkResultReadService;
import by.btslogistics.fklservice.service.flk.read.messageslog.MessagesLogReadService;
import by.btslogistics.fklservice.service.flk.save.messageslog.MessagesLogSaveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
public class FlkResultReadServiceImpl implements FlkResultReadService {

    private static final Logger LOGGER  = LoggerFactory.getLogger( FlkResultReadServiceImpl.class );

    private final FlkResultRepository repository;

    private final FlkResultMapper mapper;

    private final MessagesLogReadService messagesLogReadService;

    private final MessagesLogSaveService messagesLogSaveService;

    @Autowired
    public FlkResultReadServiceImpl(FlkResultRepository repository, FlkResultMapper mapper, MessagesLogReadService messagesLogReadService, MessagesLogSaveService messagesLogSaveService) {
        this.repository = repository;
        this.mapper = mapper;
        this.messagesLogReadService = messagesLogReadService;
        this.messagesLogSaveService = messagesLogSaveService;
    }

    @Transactional
    @Override
    public Iterable<FlkResultDto> getFlkResultFromProcedure(String idDeclaration, // id из таблицы MessagesLog
                                                            LocalDateTime dateStart,
                                                            String typeDocument) {

        MessageLogDto dto = messagesLogReadService.getMessageLogById(idDeclaration);
        dto.setStageDoc(Stage.FLC_STAGE2.getStatus());
        messagesLogSaveService.setToMessageLog(dto);

        Iterable<FlkResult> result = findFlkResultFromProcedure(idDeclaration, dateStart, typeDocument);

        LOGGER.debug(
                "Iterable<FlkResultDto> getFlkResultFromProcedure: it has performed a search in the table FlkResult : {}", result );


        Iterable<FlkResultDto> listDto = transformerToListDto(result);
        dto.setStageDoc(Stage.FLC_PROCESSED2.getStatus());
        messagesLogSaveService.setToMessageLog(dto);

        return listDto;
    }

    private Iterable<FlkResult> findFlkResultFromProcedure(String idDeclaration,
                                                           LocalDateTime dateStart,
                                                           String typeDocument) {

        Iterable<FlkResult> flkResult = this.repository.findFlkResultFromProcedure(idDeclaration, dateStart, typeDocument);

        return flkResult;
    }

    private Iterable<FlkResultDto> transformerToListDto(Iterable<FlkResult> entityList) {

        Iterable<FlkResultDto> listDto = this.mapper.toListDto(entityList);

        return listDto;
    }


    /**
     * Метод предназначен для отображения результата запроса на пользовательском интерфейсе
     * при нажатии кнопки "Просмотр результата ФЛК"
     * Запрос
     *
     * @param idDeclaration
     * @return
     */
    @Transactional
    @Override
    public Iterable<FlkResultDto> getFlkResultFromProcedure(String idDeclaration) {

        Iterable<FlkResult> result = this.repository.findFlkResultFromProcedure(idDeclaration);

        Iterable<FlkResultDto> listDto = transformerToListDto(result);

        return listDto;
    }



}
