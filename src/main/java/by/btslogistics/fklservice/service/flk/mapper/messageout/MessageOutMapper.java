package by.btslogistics.fklservice.service.flk.mapper.messageout;


import by.btslogistics.commons.service.mapper.CommonMapper;
import by.btslogistics.fklservice.dao.model.messageout.model.MessageOut;
import by.btslogistics.fklservice.service.flk.dto.messageout.MessageOutDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageOutMapper extends CommonMapper<MessageOutDto, MessageOut> {
}
