package by.btslogistics.fklservice.web.rest.flk.save.flktypecontrol;


import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlCopyDto;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.save.flk.FlkTypeControlSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static by.btslogistics.fklservice.web.rest.constants.flk.constants.flktypecontrol.FlkTypeControlConstants.*;


@RestController
@RequestMapping(ROOT_SAVE_TYPE_CONTROL)
public class FlkTypeControlSaveRest {

    @Autowired
    private FlkTypeControlSaveService service;

    @Autowired
    public FlkTypeControlSaveRest(FlkTypeControlSaveService service) {
        this.service = service;
    }

    /**
     * api/save/flkTypeControl
     *
     * @param dto Новый вид контроля в таблицу FLK_TYPE_CONTROL
     * @return статус
     */
    @PostMapping(FLK_TYPE_CONTROL)
    public ResponseEntity<FlkTypeControlDto> setFlkTypeControlEntry(@RequestBody FlkTypeControlDto dto) {

        FlkTypeControlDto flkTypeControlDto = service.setToFlkTypeControlDto(dto);

        return ResponseEntity.ok(flkTypeControlDto);
    }

    @PostMapping(FLK_TYPE_CONTROL_COPY)
    public ResponseEntity<FlkTypeControlDto> setFlkTypeControlSaveEntry(@RequestBody FlkTypeControlCopyDto dto, @RequestParam("idTypeControl") Long id) {


        FlkTypeControlDto flkTypeControlDto = service.copyParentChecksToNewChecks(dto, id);

        return ResponseEntity.ok(flkTypeControlDto);
    }


}
