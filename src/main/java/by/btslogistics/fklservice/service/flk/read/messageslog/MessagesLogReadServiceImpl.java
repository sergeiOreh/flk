package by.btslogistics.fklservice.service.flk.read.messageslog;

import by.btslogistics.commons.dao.enums.typeobjects.BCM_01;
import by.btslogistics.fklservice.dao.model.messageslog.model.MessageLog;
import by.btslogistics.fklservice.dao.model.messageslog.repository.MessageLogReadRepository;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.service.flk.mapper.messageslog.MessageLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@PropertySources({
        @PropertySource("classpath:properties/app-exception-messages.properties")
})
@Service
public class MessagesLogReadServiceImpl implements MessagesLogReadService {

    @Value("${messages.log.not.null}")
    private String paramNotNull;

    private final MessageLogReadRepository messagesLogReadRepository;

    private final MessageLogMapper mapper;

    public MessagesLogReadServiceImpl(MessageLogReadRepository messagesLogReadRepository, MessageLogMapper mapper) {
        this.messagesLogReadRepository = messagesLogReadRepository;
        this.mapper = mapper;
    }

    @Override
    public MessageLogDto getMessageLogById(String id) {
        MessageLog entity = messagesLogReadRepository.findById(id).orElse(new MessageLog());
        MessageLogDto dto = mapper.toDto(entity);
        return dto;
    }

}
