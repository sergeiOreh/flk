package by.btslogistics.fklservice.service.flk.delete.flktypecontrol.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.dao.model.flk.repository.flktypecontrol.FlkTypeControlDeleteRepository;
import by.btslogistics.fklservice.service.flk.delete.flktypecontrol.FlkTypeControlDeleteService;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.mapper.flk.flktypecontrol.FlkTypeControlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlkTypeControlDeleteServiceImpl implements FlkTypeControlDeleteService {


    private FlkTypeControlDeleteRepository repository;

    private FlkTypeControlMapper mapper;

    @Autowired
    public FlkTypeControlDeleteServiceImpl(FlkTypeControlDeleteRepository repository, FlkTypeControlMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public void deleteTypeControl(FlkTypeControlDto dto) {

        FlkTypeControl entity = transformToDto(dto);

        delete(entity);
    }


    private void delete(FlkTypeControl entity){

        this.repository.delete(entity);
    }

    private FlkTypeControl transformToDto(FlkTypeControlDto dto){

       return this.mapper.toEntity(dto);
    }
}
