package by.btslogistics.fklservice.service.flk.update.flkchecks.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flkchecks.FlkChecks;
import by.btslogistics.fklservice.dao.model.flk.repository.flkchecks.FlkChecksUpdateRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import by.btslogistics.fklservice.service.flk.mapper.CycleAvoidingMappingContext;
import by.btslogistics.fklservice.service.flk.mapper.flk.flkchecks.FlkChecksMapper;
import by.btslogistics.fklservice.service.flk.update.flkchecks.FlkChecksUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FlkChecksUpdateServiceImpl implements FlkChecksUpdateService {

    private FlkChecksMapper mapper;

   private FlkChecksUpdateRepository repository;

   @Autowired
    public FlkChecksUpdateServiceImpl(FlkChecksMapper mapper, FlkChecksUpdateRepository repository) {
       this.mapper = mapper;

       this.repository = repository;

   }

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Transactional
    @Override
    public void updateListByIsActive(Iterable<FlkChecksDto> list) {

        Iterable<FlkChecks> listEntity = transformToListEntity(list);

        update(listEntity);

    }


    private Iterable<FlkChecks>  transformToListEntity(Iterable<FlkChecksDto> dtoList){

        Iterable<FlkChecks> list = this.mapper.toListEntity(dtoList, new CycleAvoidingMappingContext());

        return list;
    }

    private void update(Iterable<FlkChecks> listEntity){

       this.repository.saveAll(listEntity);
    }
}
