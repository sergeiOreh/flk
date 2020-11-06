package by.btslogistics.fklservice.service.registration.read.sddeclscheme.impl;

import by.btslogistics.fklservice.dao.model.sddeclscheme.SdaMain;
import by.btslogistics.fklservice.dao.repository.sddeclscheme.SdaMainReadRepository;
import by.btslogistics.fklservice.service.flk.exception.common.CommonException;
import by.btslogistics.fklservice.service.flk.mapper.CycleAvoidingMappingContext;
import by.btslogistics.fklservice.service.registration.dto.sddeclscheme.SdaMainDto;
import by.btslogistics.fklservice.service.registration.mapper.sddeclscheme.SdaMainMapper;
import by.btslogistics.fklservice.service.registration.read.sddeclscheme.SdaMainReadService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@PropertySources({
        @PropertySource("classpath:properties/app-exception-messages.properties")
})
@Service
public class SdaMainReadServiceImpl implements SdaMainReadService {

    @Value("${messages.log.not.null}")
    private String paramNotNull;

    private SdaMainReadRepository repository;

    private SdaMainMapper mapper;

    private CycleAvoidingMappingContext context;

    public SdaMainReadServiceImpl(SdaMainReadRepository repository, SdaMainMapper mapper, CycleAvoidingMappingContext context) {
        this.repository = repository;
        this.mapper = mapper;
        this.context = context;
    }

    @Transactional
    public SdaMainDto findByNomPrin(String numPrin){
        if(numPrin==null) throw new CommonException(paramNotNull);
        SdaMain sdaMain = repository.findByNomPrin(numPrin);
        return transformToDto(sdaMain);
    }

    @Transactional
    public SdaMainDto findByToMessagesLogId(String id){
        if(id==null) throw new CommonException(paramNotNull);
        Optional<SdaMain> sdaMain = repository.findByToMessagesLogId(id);
        SdaMain sdaMainById = sdaMain.orElse(new SdaMain());
        return transformToDto(sdaMainById);
    }

    private SdaMainDto transformToDto( SdaMain entity){
        return mapper.toDto(entity, this.context);
    }


}
