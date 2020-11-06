package by.btslogistics.fklservice.service.registration.mapper.sddeclscheme;

import by.btslogistics.fklservice.dao.model.sddeclscheme.SdaSubject;
import by.btslogistics.fklservice.service.flk.mapper.CommonMapper;
import by.btslogistics.fklservice.service.registration.dto.sddeclscheme.SdaSubjectDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SdaSubjectMapper extends CommonMapper<SdaSubjectDto, SdaSubject> {
}
