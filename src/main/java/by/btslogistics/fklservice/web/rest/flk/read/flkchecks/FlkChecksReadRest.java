package by.btslogistics.fklservice.web.rest.flk.read.flkchecks;


import by.btslogistics.fklservice.dao.model.flk.model.flkchecks.FlkChecks;
import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import by.btslogistics.fklservice.service.flk.read.flkchecks.FlkChecksReadService;
import by.btslogistics.fklservice.web.rest.constants.flk.constants.flkchecks.FlkChecksConstants;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(FlkChecksConstants.ROOT_READ_FLK_CHECKS)
public class FlkChecksReadRest {

    private FlkChecksReadService service;

    @Autowired
    public FlkChecksReadRest(FlkChecksReadService service) {
        this.service = service;
    }


    /**
     * <p> api: </p>
     * <p> <b> api/read/flkChecks/list </b> </p>
     * параметры, передаваемые с фронта ?id=3&active=0&page=0&size=2
     *
     * @param flkChecksSpecification принимается id, согласно которому будет произведен поиск
     *           записей в таблице `FlkChecks`
     * @return Возвращается список записей
     */

    @GetMapping(path = FlkChecksConstants.PATH_LIST)
    public Page<FlkChecksDto> getListFlkChecks(
       @And({
            @Spec(params = "id", path = "flkTypeControl.id", spec = Equal.class),
            @Spec(params = "active", path = "active", spec = Equal.class)
    }) Specification<FlkChecks> flkChecksSpecification,
       @PageableDefault(size = 20, sort = "codeCheck",direction = Sort.Direction.ASC) Pageable pageable) {

        return service.getListByIdTypeControlOrderByCodeCheck(flkChecksSpecification, pageable);
    }
}
