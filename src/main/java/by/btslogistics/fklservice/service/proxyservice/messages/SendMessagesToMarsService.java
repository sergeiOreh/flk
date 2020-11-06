package by.btslogistics.fklservice.service.proxyservice.messages;

import by.btslogistics.commons.dao.dto.flk.FlkResultDto;
import by.btslogistics.commons.dao.enums.errors.BCM_09;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;

public interface SendMessagesToMarsService {

    void sendCSTM0002Message(MessageLogDto messageLogDto);

    void sendCSTM0006Message(MessageLogDto messageLogDto, Iterable<FlkResultDto> flkResultDto);

    void sendCSTM0007Message(MessageLogDto messageLogDto);

    void sendCSTM0008Message(MessageLogDto messageLogDto);

    void sendCSTM0011Message(MessageLogDto messageLogDto, BCM_09 e, Iterable<FlkResultDto> flkResultDto);

    void sendCSTM0011Message(MessageLogDto messageLogDto,  BCM_09 e);

}
