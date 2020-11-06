package by.btslogistics.fklservice.dao.model.flk.repository.flkchecks;


import by.btslogistics.fklservice.dao.model.flk.model.flkchecks.FlkChecks;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface FlkChecksReadRepository extends CrudRepository<FlkChecks, Long>, JpaSpecificationExecutor<FlkChecks> {

    Iterable<FlkChecks> findByFlkTypeControlId(Long flkTypeControl_id);

}
