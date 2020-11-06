package by.btslogistics.fklservice.service.registration.mapper.sddeclscheme;

import by.btslogistics.fklservice.dao.model.sddeclscheme.SdaFilledPerson;
import by.btslogistics.fklservice.service.flk.mapper.CommonMapper;
import by.btslogistics.fklservice.service.registration.dto.sddeclscheme.SdaFilledPersonDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SdaFilledPersonMapper extends CommonMapper<SdaFilledPersonDto, SdaFilledPerson> {
}
