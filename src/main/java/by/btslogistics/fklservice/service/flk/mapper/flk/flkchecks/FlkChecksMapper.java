package by.btslogistics.fklservice.service.flk.mapper.flk.flkchecks;

import by.btslogistics.fklservice.dao.model.flk.model.flkchecks.FlkChecks;
import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import by.btslogistics.fklservice.service.flk.mapper.CommonMapper;
import by.btslogistics.fklservice.service.flk.mapper.CommonWithCycleAvoidingMappingContext;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlkChecksMapper extends CommonWithCycleAvoidingMappingContext<FlkChecksDto, FlkChecks> {
}
