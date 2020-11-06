package by.btslogistics.fklservice.web.rest.flk.read.flktypecontrol;

import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.read.flktypecontrol.FlkTypeControlReadService;
import by.btslogistics.fklservice.web.rest.constants.flk.constants.flkchecks.FlkChecksConstants;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(FlkChecksConstants.ROOT_READ_FLK_TYPE_CONTROL)
public class FlkTypeControlReadRest {

    private FlkTypeControlReadService service;

    @Autowired
    public FlkTypeControlReadRest(FlkTypeControlReadService service) {
        this.service = service;
    }

    /**
     * <p> api: </p>
     * <p> <b> api/read/flkTypeControl/list </b> </p>
     *
     * @param flkTypeControlSpecification принимается is_active, согласно которому будет произведен поиск
     *                  записей в таблице `FLK_TYPE_CONTROL` по id записи и статусу IS_ACTIVE
     *                  1 - действующие контроли ?id=1&active=1
     *                  0 - архивные контроли    ?id=1&active=0
     *                  Все - без параметров     ?id=1
     *   idTypeDocument -  id из таблицы FLK_DOK по которому будет вываливаться список со всеми типами контроля по выбранному документу
     * @param pageable параметры навигации и сортировки таблицы
     * @return Возвращается список записей
     */
    @GetMapping(path = FlkChecksConstants.PATH_LIST)
    public Page<FlkTypeControlDto> getListTypeControl(
            @And({
                    @Spec(params = "active", path = "active", spec = Equal.class),
                    @Spec(params = "idTypeDocument", path = "idTypeDocument", spec = Equal.class),
                    @Spec(params = "id",path = "id", spec = Equal.class)
            }) Specification<FlkTypeControl> flkTypeControlSpecification,
            @PageableDefault(sort = "description", direction = Sort.Direction.ASC) Pageable pageable) { //size = 20 кол-во строк по умолчанию при отображении

        return service.getListByActiveStatus(flkTypeControlSpecification, pageable);
    }
}
