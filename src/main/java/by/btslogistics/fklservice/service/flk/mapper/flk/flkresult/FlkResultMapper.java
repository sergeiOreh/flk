package by.btslogistics.fklservice.service.flk.mapper.flk.flkresult;

import by.btslogistics.fklservice.dao.model.flk.model.flkresult.FlkResult;
import by.btslogistics.fklservice.service.flk.dto.flk.flkresult.FlkResultDto;
import by.btslogistics.fklservice.service.flk.mapper.CommonMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlkResultMapper extends CommonMapper<FlkResultDto, FlkResult> {
}
