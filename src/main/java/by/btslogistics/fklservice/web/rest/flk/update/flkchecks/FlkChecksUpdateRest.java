package by.btslogistics.fklservice.web.rest.flk.update.flkchecks;


import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import by.btslogistics.fklservice.service.flk.update.flkchecks.FlkChecksUpdateService;
import by.btslogistics.fklservice.web.rest.constants.flk.constants.flkchecks.FlkChecksConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(FlkChecksConstants.ROOT_UPDATE_FLK_CHECKS)
public class FlkChecksUpdateRest {

    private FlkChecksUpdateService service;

    @Autowired
    public FlkChecksUpdateRest(FlkChecksUpdateService service) {
        this.service = service;
    }

    /**
     * <p> api: </p>
     * <p> <b> api/update/flkChecks/list/isActive </b> </p>
     *
     * @param list  принимается список записей, у которых обновлен статус в поле `IS_ACTIVE`
     *             таблицы `FlkChecks`
     * @return Возвращается статус выполнения HTTP-запроса
     */

    @PutMapping(FlkChecksConstants.UPDATE_LIST_BY_IS_ACTIVE)
    public ResponseEntity<Object> updateFlkChecks(@RequestBody Iterable<FlkChecksDto> list) {

        this.service.updateListByIsActive(list);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
