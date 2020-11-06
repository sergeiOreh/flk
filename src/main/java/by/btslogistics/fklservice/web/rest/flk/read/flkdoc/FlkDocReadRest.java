package by.btslogistics.fklservice.web.rest.flk.read.flkdoc;

import by.btslogistics.fklservice.service.flk.dto.flk.flkdoc.FlkDocDto;
import by.btslogistics.fklservice.service.flk.read.flkdoc.FlkDocReadService;
import by.btslogistics.fklservice.web.rest.constants.flk.constants.flkdoc.FlkDocConstants;
import by.btslogistics.fklservice.web.rest.constants.flk.constants.flkgrafa.FlkGrafaConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(FlkDocConstants.ROOT_READ_FLK_DOC)
public class FlkDocReadRest {

        private FlkDocReadService service;

    public FlkDocReadRest(FlkDocReadService service) {
        this.service = service;
    }

    /**
     * <p> api: </p>
     * <p> <b> api/read/flkDoc/list</b> </p>
     * возвращаем список с типом документа, который используется при заполнении таблицы FLK_TYPE_CONTROL
     * при создании нового вида контроля
     * @return Возвращается список записей
     */

    @GetMapping(path = FlkDocConstants.PATH_LIST)
    public Iterable<FlkDocDto> getListFlkDoc() {

        Iterable<FlkDocDto> listDto = service.getListDocuments();

        return listDto;
    }

}
