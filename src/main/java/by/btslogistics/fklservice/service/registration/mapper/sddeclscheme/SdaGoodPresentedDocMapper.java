package by.btslogistics.fklservice.service.registration.mapper.sddeclscheme;

import by.btslogistics.fklservice.dao.model.sddeclscheme.SdaGoodPresentedDoc;
import by.btslogistics.fklservice.service.flk.mapper.CommonWithCycleAvoidingMappingContext;
import by.btslogistics.fklservice.service.registration.dto.sddeclscheme.SdaGoodPresentedDocDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface SdaGoodPresentedDocMapper
        extends CommonWithCycleAvoidingMappingContext<SdaGoodPresentedDocDto, SdaGoodPresentedDoc> {
}
