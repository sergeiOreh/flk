package by.btslogistics.fklservice.service.flk.save.flk.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.dao.model.flk.repository.flkchecks.FlkChecksReadRepository;
import by.btslogistics.fklservice.dao.model.flk.repository.flktypecontrol.FlkTypeControlSaveRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlCopyDto;
import by.btslogistics.fklservice.service.flk.mapper.CycleAvoidingMappingContext;
import by.btslogistics.fklservice.service.flk.mapper.flk.flkchecks.FlkChecksMapper;
import by.btslogistics.fklservice.service.flk.mapper.flk.flktypecontrol.FlkTypeControlMapper;
import by.btslogistics.fklservice.service.flk.mapper.flk.flktypecontrol.FlkTypeControlSaveMapper;
import by.btslogistics.fklservice.service.flk.save.flk.FlkTypeControlSaveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FlkTypeControlSaveServiceImpl implements FlkTypeControlSaveService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlkTypeControlSaveServiceImpl.class);
    private final FlkTypeControlSaveRepository repository;
    private final FlkChecksReadRepository checksReadRepository;
    private final FlkTypeControlMapper mapper;
    private final FlkChecksMapper checksMapper;
    private final FlkTypeControlSaveMapper saveMapper;

    @Autowired
    public FlkTypeControlSaveServiceImpl(FlkTypeControlSaveRepository repository, FlkChecksReadRepository checksReadRepository, FlkTypeControlMapper mapper, FlkChecksMapper checksMapper, FlkTypeControlSaveMapper saveMapper) {
        this.repository = repository;
        this.checksReadRepository = checksReadRepository;
        this.mapper = mapper;
        this.checksMapper = checksMapper;
        this.saveMapper = saveMapper;
    }

    @Transactional
    @Override
    public FlkTypeControlDto setToFlkTypeControlDto(FlkTypeControlDto dto) {


        FlkTypeControl entity = transformToEntity(dto);

        LOGGER.debug(
                "FlkTypeControlDto setToFlkTypeControlDto: it has performed a search in the table FlkTypeControl : {}", dto);

        FlkTypeControl flkTypeControl = repository.save(entity);

        FlkTypeControlDto flkTypeControlDto = transformToDto(flkTypeControl);

        return flkTypeControlDto;
    }

    @Transactional
    @Override
    public FlkTypeControlDto copyParentChecksToNewChecks(FlkTypeControlCopyDto dto, Long id) {

        List<FlkChecksDto> listdto = (List<FlkChecksDto>)checksMapper.toListDto(checksReadRepository.findByFlkTypeControlId(id), new CycleAvoidingMappingContext());

        FlkTypeControlCopyDto flkTypeControlCopyDto = new FlkTypeControlCopyDto(dto);

        flkTypeControlCopyDto.cloneFlkChecks(listdto, flkTypeControlCopyDto);

        FlkTypeControl typeControl = repository.save(saveMapper.toEntity(flkTypeControlCopyDto, new CycleAvoidingMappingContext()));

        return mapper.toDto(typeControl);
    }

    private FlkTypeControl transformToEntity(FlkTypeControlDto dto) {

        FlkTypeControl entity = this.mapper.toEntity(dto);

        return entity;
    }

    private FlkTypeControlDto transformToDto(FlkTypeControl flkTypeControl) {

        FlkTypeControlDto dto = this.mapper.toDto(flkTypeControl);

        return dto;
    }
}
