package by.btslogistics.fklservice.service.flk.mapper.flk.flkmain;

import by.btslogistics.fklservice.dao.model.flk.model.flkmain.FlkMain;
import by.btslogistics.fklservice.service.flk.dto.flk.flkmain.FlkMainDto;
import by.btslogistics.fklservice.service.flk.mapper.CommonMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlkMainMapper extends CommonMapper<FlkMainDto, FlkMain> {
}
