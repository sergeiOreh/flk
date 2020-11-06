package by.btslogistics.fklservice.dao.model.flk.repository.flkdoc;

import by.btslogistics.fklservice.dao.model.flk.model.flkdoc.FlkDoc;
import org.springframework.data.repository.CrudRepository;

public interface FlkDocReadRepository extends CrudRepository<FlkDoc, Long> {

    Iterable<FlkDoc> findAllByOrderByIdAsc();
}
