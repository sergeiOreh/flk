package by.btslogistics.fklservice.service.flk.mapper.flk.flkdoc;

import by.btslogistics.fklservice.dao.model.flk.model.flkdoc.FlkDoc;
import by.btslogistics.fklservice.service.flk.dto.flk.flkdoc.FlkDocDto;
import by.btslogistics.fklservice.service.flk.mapper.CommonMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlkDocMapper extends CommonMapper<FlkDocDto, FlkDoc> {
}
