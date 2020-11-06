package by.btslogistics.fklservice.service.flk.read.flkchecks;


import by.btslogistics.fklservice.dao.model.flk.model.flkchecks.FlkChecks;
import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface FlkChecksReadService {

    /**
     * По полю <b>ID_TYPE_CONTROL</b> (вторичный ключ по отношению к таблице <b>FLK_TYPE_CONTROL</b>)
     * получаем список записей, который связаны
     * с записью из родительской таблицы - <b>FLK_TYPE_CONTROL</b>
     * @param specification - параметры для запроса
     * @return возрващаем список записей из таблицы <b>FLK_TYPE_CONTROL</b>, которые связаны с одной
     * записью из родительской таблицы <b>FLK_TYPE_CONTROL</b>
     */
    Page<FlkChecksDto> getListByIdTypeControlOrderByCodeCheck(Specification<FlkChecks> specification, Pageable pageable);

}
