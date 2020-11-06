package by.btslogistics.fklservice.service.flk.mapper.messageslog;


import by.btslogistics.commons.service.mapper.CommonMapper;
import by.btslogistics.fklservice.dao.model.messageslog.model.MessageLog;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageLogMapper extends CommonMapper<MessageLogDto, MessageLog> {
}
