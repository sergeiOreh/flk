package by.btslogistics.fklservice.service.flk.update.flktypecontrol.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.dao.model.flk.repository.flktypecontrol.FlkTypeControlUpdateRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.mapper.flk.flktypecontrol.FlkTypeControlMapper;
import by.btslogistics.fklservice.service.flk.update.flktypecontrol.FlkTypeControlUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FlkTypeControlUpdateServiceImpl implements FlkTypeControlUpdateService {

   private FlkTypeControlUpdateRepository repository;

   private FlkTypeControlMapper mapper;


   @Autowired
    public FlkTypeControlUpdateServiceImpl(FlkTypeControlUpdateRepository repository, FlkTypeControlMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public void updateListByIsActive(Iterable<FlkTypeControlDto> list) {

        Iterable<FlkTypeControl> listEntity = transformToListEntity(list);

        update(listEntity);
    }


    private Iterable<FlkTypeControl>  transformToListEntity(Iterable<FlkTypeControlDto> dtoList){

        return this.mapper.toListEntity(dtoList);
    }

    private void update(Iterable<FlkTypeControl> listEntity){

        this.repository.saveAll(listEntity);
    }

    /**
     * @param flkTypeControlDto - Объект FLK_TYPE_CONTROL, который передается с пользовательского интерфейса для обновления.
     */
    @Transactional
    @Override
    public void updateByIdFlkTypeControl(FlkTypeControlDto flkTypeControlDto) {

        FlkTypeControl entity = transformToEntity(flkTypeControlDto);

        updateById(entity);
    }

    private FlkTypeControl transformToEntity(FlkTypeControlDto dto) {
        return this.mapper.toEntity(dto);
    }

    private void updateById(FlkTypeControl entity) {
        this.repository.save(entity);
    }

}
