package by.btslogistics.fklservice.service.flk.read.flkgrafa.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flkgrafa.FlkGrafa;
import by.btslogistics.fklservice.dao.model.flk.repository.flkgrafa.FlkGrafaReadRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flkgrafa.FlkGrafaDto;
import by.btslogistics.fklservice.service.flk.mapper.flk.flkgrafa.FlkGrafaMapper;
import by.btslogistics.fklservice.service.flk.read.flkgrafa.FlkGrafaReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlkGrafaReadServiceImpl implements FlkGrafaReadService {

    private FlkGrafaMapper mapper;

    private FlkGrafaReadRepository repository;


    @Autowired
    public FlkGrafaReadServiceImpl(FlkGrafaMapper mapper,
                                   FlkGrafaReadRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public Iterable<FlkGrafaDto> getFlkGrafaByNumberGrafa() {

        Iterable<FlkGrafa> listEntity = findFlkGraphByNumberGraph();
        Iterable<FlkGrafaDto> listDto = transformerToListDto(listEntity);
        return listDto;
    }

    private Iterable<FlkGrafa> findFlkGraphByNumberGraph() {

        Iterable<FlkGrafa> flkResult = this.repository.findByNumberGrafaIsNotNull();

        return flkResult;
    }

    private Iterable<FlkGrafaDto> transformerToListDto(Iterable<FlkGrafa> entityList) {

        Iterable<FlkGrafaDto> listDto = this.mapper.toListDto(entityList);

        return listDto;
    }
}
