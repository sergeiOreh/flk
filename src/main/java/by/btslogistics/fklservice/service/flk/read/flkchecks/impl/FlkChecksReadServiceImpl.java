package by.btslogistics.fklservice.service.flk.read.flkchecks.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flkchecks.FlkChecks;
import by.btslogistics.fklservice.dao.model.flk.repository.flkchecks.FlkChecksReadRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import by.btslogistics.fklservice.service.flk.mapper.CycleAvoidingMappingContext;
import by.btslogistics.fklservice.service.flk.mapper.flk.flkchecks.FlkChecksMapper;
import by.btslogistics.fklservice.service.flk.read.flkchecks.FlkChecksReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FlkChecksReadServiceImpl implements FlkChecksReadService {

    private FlkChecksReadRepository repository;

    private FlkChecksMapper mapper;

    @Autowired
    public FlkChecksReadServiceImpl(FlkChecksReadRepository repository, FlkChecksMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public Page<FlkChecksDto> getListByIdTypeControlOrderByCodeCheck(Specification<FlkChecks> specification, Pageable pageable) {

        Page<FlkChecks> listEntity = findByIdTypeControlOrderByCodeCheck(specification, pageable);

        return transformToListDto(listEntity);
    }


    private Page<FlkChecks> findByIdTypeControlOrderByCodeCheck(Specification<FlkChecks> specification, Pageable pageable) {

        return this.repository.findAll(specification, pageable);
    }

    private Page<FlkChecksDto> transformToListDto(Page<FlkChecks> listEntity) {

        Iterable<FlkChecksDto> a = this.mapper.toListDto(listEntity, new CycleAvoidingMappingContext());

        return new PageImpl<>((List<FlkChecksDto>) a, listEntity.getPageable(), listEntity.getTotalElements());
    }


}
