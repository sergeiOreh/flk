package by.btslogistics.fklservice.web.rest.flk.read.flkgrafa;

import by.btslogistics.fklservice.service.flk.dto.flk.flkgrafa.FlkGrafaDto;
import by.btslogistics.fklservice.service.flk.read.flkgrafa.FlkGrafaReadService;
import by.btslogistics.fklservice.web.rest.constants.flk.constants.flkgrafa.FlkGrafaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(FlkGrafaConstants.ROOT_READ_FLK_GRAFA)
public class FlkGrafaReadRest {

    private FlkGrafaReadService service;

    @Autowired
    public FlkGrafaReadRest(FlkGrafaReadService service) {
        this.service = service;
    }

    /**
     * <p> api: </p>
     * <p> <b> api/read/flkGrafa/list/numberGraph </b> </p>
     *
     *
     * @return Возвращается список записей
     */

    @GetMapping(path = FlkGrafaConstants.PATH_LIST_BY_NUMBER_GRAFA)
    public Iterable<FlkGrafaDto> getListFlkGraph() {

        Iterable<FlkGrafaDto> listDto = service.getFlkGrafaByNumberGrafa();

        return listDto;
    }
}
