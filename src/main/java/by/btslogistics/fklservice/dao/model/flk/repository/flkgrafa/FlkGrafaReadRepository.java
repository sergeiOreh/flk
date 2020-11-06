package by.btslogistics.fklservice.dao.model.flk.repository.flkgrafa;

import by.btslogistics.fklservice.dao.model.flk.model.flkgrafa.FlkGrafa;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface FlkGrafaReadRepository extends CrudRepository<FlkGrafa,Long> {

    /**
     * Запрашиваем данные из таблицы FLK_GRAFA по полю NUMBER_GRAFA где значение не равно NULL.
     * К полученной записи будут присоединен список записей из таблицы FLK_CHECKS
     * @return
     */
    @EntityGraph(value = "entity-graph-with-flkChecks")
    Iterable<FlkGrafa> findByNumberGrafaIsNotNull();

}
