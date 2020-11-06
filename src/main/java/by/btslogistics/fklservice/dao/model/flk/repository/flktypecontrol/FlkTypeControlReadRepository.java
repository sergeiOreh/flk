package by.btslogistics.fklservice.dao.model.flk.repository.flktypecontrol;


import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface FlkTypeControlReadRepository extends CrudRepository<FlkTypeControl, Long>, JpaSpecificationExecutor<FlkTypeControl> {

}
