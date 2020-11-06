package by.btslogistics.fklservice.service.flk.save.messageout.impl;

import by.btslogistics.commons.service.exception.common.CommonException;
import by.btslogistics.fklservice.dao.model.messageout.model.MessageOut;
import by.btslogistics.fklservice.dao.model.messageout.repository.MessageOutRepository;
import by.btslogistics.fklservice.service.flk.dto.messageout.MessageOutDto;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.service.flk.mapper.messageout.MessageOutMapper;
import by.btslogistics.fklservice.service.flk.save.messageout.MessageOutSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;


@PropertySources({
        @PropertySource("classpath:properties/app-exception-messages.properties")
})
@Service
public class MessageOutSaveServiceImpl implements MessageOutSaveService {

    @Value("${messages.log.not.null}")
    private String paramNotNull;

    private final MessageOutRepository repository;

    private final MessageOutMapper mapper;

    @Autowired
    public MessageOutSaveServiceImpl(MessageOutRepository repository,
                                     MessageOutMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public MessageOutDto setToMessagesOut(MessageOutDto dto) {

        if (dto == null) throw new CommonException(paramNotNull);

        MessageOut messageOut = mapper.toEntity(dto);

        MessageOut save = this.repository.save(messageOut);

        MessageOutDto messageOutDto = mapper.toDto(save);

        return messageOutDto;
    }

    @Transactional
    @Override
    public MessageOutDto setToMessagesOut(MessageLogDto messageLogDto, String messageType, String state, String xmlMsg) {
        return setToMessagesOut(messageLogDto, messageType, state,null, xmlMsg);
    }

    @Transactional
    @Override
    public MessageOutDto setToMessagesOut(MessageLogDto messageLogDto, String messageType, String state, String msgText, String xmlMsg) {

        if(messageLogDto.getYearReg() == null || messageLogDto.getTypeDoc() == null) throw new CommonException(paramNotNull);

        MessageOutDto dto = new MessageOutDto();
        dto.setMsgCode(messageType);
        dto.setDateSend(LocalDateTime.now());
        dto.setYearReg(messageLogDto.getYearReg() );
        dto.setTypeDoc(messageLogDto.getTypeDoc());
        dto.setMsgText(msgText);
        dto.setMessOutState(state);
        dto.setMessageLogId(messageLogDto.getId());
        dto.setMsgXml(xmlMsg);

        MessageOut messageOut = mapper.toEntity(dto);

        MessageOut save = this.repository.save(messageOut);

        return mapper.toDto(save);
    }
}
