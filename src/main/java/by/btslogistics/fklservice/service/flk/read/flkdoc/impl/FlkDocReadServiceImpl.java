package by.btslogistics.fklservice.service.flk.read.flkdoc.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flkdoc.FlkDoc;
import by.btslogistics.fklservice.dao.model.flk.repository.flkdoc.FlkDocReadRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flkdoc.FlkDocDto;
import by.btslogistics.fklservice.service.flk.mapper.flk.flkdoc.FlkDocMapper;
import by.btslogistics.fklservice.service.flk.read.flkdoc.FlkDocReadService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FlkDocReadServiceImpl implements FlkDocReadService {

    FlkDocReadRepository flkDocReadRepository;

    FlkDocMapper flkDocMapper;

    public FlkDocReadServiceImpl(FlkDocReadRepository flkDocReadRepository, FlkDocMapper flkDocMapper) {
        this.flkDocReadRepository = flkDocReadRepository;
        this.flkDocMapper = flkDocMapper;
    }

    @Transactional
    @Override
    public Iterable<FlkDocDto> getListDocuments() {

        Iterable<FlkDoc> listEntity = this.flkDocReadRepository.findAllByOrderByIdAsc();

        return this.flkDocMapper.toListDto(listEntity);
    }
}
