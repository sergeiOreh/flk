package by.btslogistics.fklservice.service.flk.mapper.flk.flktypecontrol;

import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlCopyDto;
import by.btslogistics.fklservice.service.flk.mapper.CommonWithCycleAvoidingMappingContext;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlkTypeControlSaveMapper extends CommonWithCycleAvoidingMappingContext<FlkTypeControlCopyDto, FlkTypeControl> {
}
