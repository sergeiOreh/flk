package by.btslogistics.fklservice.web.rest.flk.update.flktypecontrol;


import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.read.flktypecontrol.FlkTypeControlReadService;
import by.btslogistics.fklservice.service.flk.update.flktypecontrol.FlkTypeControlUpdateService;
import by.btslogistics.fklservice.web.exceptions.common.UpdateException;
import by.btslogistics.fklservice.web.rest.constants.flk.constants.flktypecontrol.FlkTypeControlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(FlkTypeControlConstants.ROOT_UPDATE_FLK_TYPE_CONTROL)
public class FlkTypeControlUpdateRest {

    private FlkTypeControlUpdateService service;
    private FlkTypeControlReadService readService;


    @Autowired
    public FlkTypeControlUpdateRest(FlkTypeControlUpdateService service, FlkTypeControlReadService readService) {
        this.service = service;
        this.readService = readService;
    }

    /**
     * <p> api: </p>
     * <p> <b> api/update/flkTypeControl/list/isActive </b> </p>
     *
     * @param list  принимается список записей, у которых обновлен статус в поле `IS_ACTIVE`
     *             таблицы `FLK_TYPE_CONTROL`
     * @return Возвращается статус выполнения HTTP-запроса
     */

    @PutMapping(FlkTypeControlConstants.UPDATE_LIST_BY_IS_ACTIVE)
    public ResponseEntity<Object> updateFlkChecks(@RequestBody Iterable<FlkTypeControlDto> list) {

        this.service.updateListByIsActive(list);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    /**
     * <p> api: </p>
     * <p> <b> api/update/flkTypeControl </b> </p>
     *
     * @param flkTypeControlDto - обновляемый объект передаваемый с пользовательского интерфейса
     * @return Возвращается статус выполнения HTTP-запроса
     */

    @PutMapping
    public ResponseEntity<Object> updateFlkTypeControlById(@RequestBody FlkTypeControlDto flkTypeControlDto)
    {
        verificationExistingEntry(flkTypeControlDto.getId());

        this.service.updateByIdFlkTypeControl(flkTypeControlDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    /**
     * <p>Проверяет существование записи, которую необходимо обновить в таблице FLK_TYPE_CONTROL.</p>
     */
    private void verificationExistingEntry(long id) {
        readService.getById(id);
    }

}
