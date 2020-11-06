package by.btslogistics.fklservice.service.flk.save.messageslog;

import by.btslogistics.commons.service.exception.common.CommonException;

import by.btslogistics.fklservice.dao.model.messageslog.model.MessageLog;
import by.btslogistics.fklservice.dao.model.messageslog.repository.MessageLogSaveRepository;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.service.flk.mapper.messageslog.MessageLogMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MessagesLogSaveServiceImpl implements MessagesLogSaveService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessagesLogSaveServiceImpl.class);

    @Value("${messages.log.not.null}")
    private String paramNotNull;

    private final MessageLogSaveRepository repository;

    private final MessageLogMapper mapper;

    @Autowired
    public MessagesLogSaveServiceImpl(MessageLogSaveRepository repository,
                                      MessageLogMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Transactional
    @Override
    public MessageLogDto setToMessageLog(MessageLogDto dto) {

        LOGGER.debug("setToMessageLog(MessageLogDto dto) (data has given): {}", dto);

        if (dto == null) throw new CommonException(paramNotNull);

        MessageLog messageLog = mapper.toEntity(dto);

        LOGGER.debug("setToMessageLog(MessageLogDto dto) (data has transformed into entity): {}", dto);

        MessageLog entitySaved = this.repository.save(messageLog);

        LOGGER.debug("setToMessageLog(MessageLogDto dto) (data has saved into database): {}", dto);

        return mapper.toDto(entitySaved);
    }

}
