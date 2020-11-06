package by.btslogistics.fklservice.service.flk.save.flk.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flkchecks.FlkChecks;
import by.btslogistics.fklservice.dao.model.flk.model.jsonmodel.BlockRules;
import by.btslogistics.fklservice.dao.model.flk.model.jsonmodel.Rule;
import by.btslogistics.fklservice.dao.model.flk.repository.flkchecks.FlkChecksSaveRepository;
import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import by.btslogistics.fklservice.service.flk.mapper.CycleAvoidingMappingContext;
import by.btslogistics.fklservice.service.flk.mapper.flk.flkchecks.FlkChecksMapper;
import by.btslogistics.fklservice.service.flk.save.flk.FlkChecksSaveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FlkChecksSaveServiceImpl implements FlkChecksSaveService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlkChecksSaveServiceImpl.class);
    FlkChecksSaveRepository repository;

    FlkChecksMapper mapper;

    @Autowired
    public FlkChecksSaveServiceImpl(FlkChecksSaveRepository repository, FlkChecksMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Transactional
    @Override
    public FlkChecksDto setToFlkChecksDto(FlkChecksDto dto) {

        System.out.println(dto.getBlockRules());


        List<BlockRules> blockRules = dto.getBlockRules();



        for (int i = 0; i < blockRules.size() ; i++) {
            for (int j = 0;  j < blockRules.get(i).getConditions().size(); j++) {
               List<Rule> rules = blockRules.get(i).getConditions().get(j).getRules();
                 rules.forEach(x -> System.out.println(x.getElement()+" "+x.getLogicalOperator()+" "+x.getValues()));

            }

        }


        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("new by.btslogistics.fklservice.dao.model.flk.model.jsonmodel.BlockRules()");
        BlockRules a = exp.getValue(BlockRules.class);

        // Получить Boolean результат в методе, который присутсьвует в классе BlockRules

        FlkChecks entity = transformToEntity(dto);

        LOGGER.debug(
                "FlkChecksDto setToFlkChecksDto: it has performed a search in the table FlkChecks : {}", dto );

        FlkChecks flkChecks = this.repository.save(entity);


        FlkChecksDto flkChecksDto = transformToDto(flkChecks);
        return flkChecksDto;

    }

    private FlkChecks transformToEntity(FlkChecksDto dto) {

        FlkChecks entity = this.mapper.toEntity(dto, new CycleAvoidingMappingContext());

        return entity;
    }

    private FlkChecksDto transformToDto(FlkChecks flkTypeControl) {

        FlkChecksDto dto = this.mapper.toDto(flkTypeControl, new CycleAvoidingMappingContext());

        return dto;
    }


}
