package by.btslogistics.fklservice.service.flk.mapper.flk.flkgrafa;

import by.btslogistics.fklservice.dao.model.flk.model.flkgrafa.FlkGrafa;
import by.btslogistics.fklservice.service.flk.dto.flk.flkgrafa.FlkGrafaDto;
import by.btslogistics.fklservice.service.flk.mapper.CommonMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlkGrafaMapper extends CommonMapper<FlkGrafaDto, FlkGrafa> {
}
