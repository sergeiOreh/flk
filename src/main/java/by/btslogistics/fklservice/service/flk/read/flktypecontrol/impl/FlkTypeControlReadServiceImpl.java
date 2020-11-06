package by.btslogistics.fklservice.service.flk.read.flktypecontrol.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.dao.model.flk.repository.flktypecontrol.FlkTypeControlReadRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.exception.ResourceNotFoundException;
import by.btslogistics.fklservice.service.flk.exception.common.CommonException;
import by.btslogistics.fklservice.service.flk.mapper.flk.flktypecontrol.FlkTypeControlMapper;
import by.btslogistics.fklservice.service.flk.mapper.flk.flktypecontrol.FlkTypeControlSaveMapper;
import by.btslogistics.fklservice.service.flk.read.flktypecontrol.FlkTypeControlReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@PropertySources({
        @PropertySource("classpath:properties/app-exception-messages.properties")
})
@Service
public class FlkTypeControlReadServiceImpl implements FlkTypeControlReadService {

    @Value("${messages.log.not.null}")
    private String paramNotNull;

    @Value("${NotFound.FlkTypeControl}")
    private String dataNotFound;

    private FlkTypeControlMapper mapper;

    private FlkTypeControlReadRepository repository;

    private final FlkTypeControlSaveMapper saveMapper;

    @Autowired
    public FlkTypeControlReadServiceImpl(FlkTypeControlMapper mapper,
                                         FlkTypeControlReadRepository repository, FlkTypeControlSaveMapper saveMapper) {
        this.mapper = mapper;
        this.repository = repository;
        this.saveMapper = saveMapper;
    }

    @Transactional
    @Override
    public Page<FlkTypeControlDto> getListByActiveStatus(Specification<FlkTypeControl> specification, Pageable pageable) {

        Page<FlkTypeControl> listEntity = this.repository.findAll(specification,pageable);

        return transformToListDto(listEntity);
    }

    private Page<FlkTypeControlDto> transformToListDto(Page<FlkTypeControl> listEntity){

        return new PageImpl<>((List<FlkTypeControlDto>) this.mapper.toListDto(listEntity),listEntity.getPageable(),listEntity.getTotalElements());
    }

    @Transactional
    @Override
    public FlkTypeControlDto getById(Long id) throws CommonException {

        if (id == null) throw new CommonException(paramNotNull);

        FlkTypeControl entity = findById(id);

        return transformToDto(entity);
    }

    private FlkTypeControl findById(Long id) {

        FlkTypeControl entity = this.repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(dataNotFound));

        return entity;
    }

    private FlkTypeControlDto transformToDto(FlkTypeControl entity) {

        return this.mapper.toDto(entity);
    }
}

