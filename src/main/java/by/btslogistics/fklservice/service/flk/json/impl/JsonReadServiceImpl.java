package by.btslogistics.fklservice.service.flk.json.impl;

import by.btslogistics.fklservice.dao.model.flk.model.jsonmodel.BlockRules;
import by.btslogistics.fklservice.service.flk.json.JsonReaderService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class JsonReadServiceImpl implements JsonReaderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlockRules.class);


    @Override
    public void doParse(String jsonObject) {

        System.out.println(jsonObject);

        try {
            LOGGER.debug(
                    "JsonReadServiceImpl it has performed a search in the table FlkTypeControl : {}", jsonObject );

            ObjectMapper objectMapper = new ObjectMapper();
         //   List<BlockRules> blockRules = objectMapper.readValue(jsonObject, new TypeReference<List<BlockRules>>(){});

              List<BlockRules> blockRules = Arrays.asList(objectMapper.readValue(jsonObject, BlockRules[].class)); // works up to 10 time faster than TypeRefence

              for (BlockRules item: blockRules){
                  System.out.println(item.getConditions());
              }

        } catch (JsonGenerationException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        } catch (JsonMappingException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }


    }
}
