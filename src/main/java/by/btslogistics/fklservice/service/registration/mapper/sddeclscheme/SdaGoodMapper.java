package by.btslogistics.fklservice.service.registration.mapper.sddeclscheme;

import by.btslogistics.fklservice.dao.model.sddeclscheme.SdaGood;
import by.btslogistics.fklservice.service.flk.mapper.CommonWithCycleAvoidingMappingContext;
import by.btslogistics.fklservice.service.registration.dto.sddeclscheme.SdaGoodDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SdaGoodMapper
        extends CommonWithCycleAvoidingMappingContext<SdaGoodDto, SdaGood> {
}
