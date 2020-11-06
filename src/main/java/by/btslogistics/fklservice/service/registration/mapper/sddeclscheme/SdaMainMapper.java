package by.btslogistics.fklservice.service.registration.mapper.sddeclscheme;

import by.btslogistics.fklservice.dao.model.sddeclscheme.SdaMain;
import by.btslogistics.fklservice.service.flk.mapper.CommonWithCycleAvoidingMappingContext;
import by.btslogistics.fklservice.service.registration.dto.sddeclscheme.SdaMainDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SdaMainMapper
        extends CommonWithCycleAvoidingMappingContext<SdaMainDto, SdaMain> {
}
