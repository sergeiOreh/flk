package by.btslogistics.fklservice.dao.model.flk.repository.flkresult;


import by.btslogistics.fklservice.dao.model.flk.model.flkresult.FlkResult;
import org.springframework.data.repository.CrudRepository;

public interface FlkResultRepository extends CrudRepository<FlkResult, Long>, FlkResultRepositoryCustom {

}
