package by.btslogistics.fklservice.web.rest.flk.save.flkchecks;


import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import by.btslogistics.fklservice.service.flk.json.JsonReaderService;
import by.btslogistics.fklservice.service.flk.save.flk.FlkChecksSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static by.btslogistics.fklservice.web.rest.constants.flk.constants.flkchecks.FlkChecksConstants.ROOT_SAVE_FLK_CHECKS;
import static by.btslogistics.fklservice.web.rest.constants.flk.constants.flkchecks.FlkChecksConstants.SAVE_FLK_CHECKS;

@RestController
@RequestMapping(ROOT_SAVE_FLK_CHECKS)
public class FlkChecksSaveRest {

    FlkChecksSaveService service;
    JsonReaderService jsonReaderService;

    @Autowired
    public FlkChecksSaveRest(FlkChecksSaveService flkChecksSaveService, JsonReaderService jsonReaderService) {
        this.service = flkChecksSaveService;
        this.jsonReaderService = jsonReaderService;
    }

    /**
     * api/save/flkChecks
     *
     * @param dto Новый вид контроля в таблицу FLK_TYPE_CONTROL
     * @return статус
     */
    @PutMapping(SAVE_FLK_CHECKS)
    public ResponseEntity<FlkChecksDto> setFlkChecksEntry(@RequestBody FlkChecksDto dto) {

        FlkChecksDto flkChecksDto;

        flkChecksDto = service.setToFlkChecksDto(dto);

     //   String rulesInJson = flkChecksDto.getRulesInJson();

    //    jsonReaderService.doParse(rulesInJson);

        return ResponseEntity.ok(flkChecksDto);
    }

}
