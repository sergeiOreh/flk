package by.btslogistics.fklservice.service.flk.mapper.flk.flktypecontrol;

import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.mapper.CommonMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlkTypeControlMapper extends CommonMapper<FlkTypeControlDto, FlkTypeControl> {
}
