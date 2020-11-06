package by.btslogistics.fklservice.service.flk.read.flktypecontrol;

import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.exception.common.CommonException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface FlkTypeControlReadService {

    /**
     * По полю <b>ID_TYPE_CONTROL</b> (вторичный ключ по отношению к таблице <b>FLK_TYPE_CONTROL</b>)
     * получаем список записей, которые связаны с записью из родительской таблицы - <b>FLK_TYPE_CONTROL</b>
     * активные контроли - 1
     * неактивные контроли - 0
     * все - контроли указываются без параметра
     * @param specification - параметры для запроса
     * @return возрващаем список записей из таблицы <b>FLK_TYPE_CONTROL</b>, которые связаны с одной
     * записью из родительской таблицы <b>FLK_TYPE_CONTROL</b>
     */
    Page<FlkTypeControlDto> getListByActiveStatus(Specification<FlkTypeControl> specification, Pageable pageable);

    /**
     * Получение записи по указанному идентификатору.
     * Применятся при удалении типа контроля для проверки на наличие протокола ошибок
     * в таблице FLK_MAIN
     * @param id - идентификатор записи
     * @return возвращается одна запись
     */
    FlkTypeControlDto getById(Long id) throws CommonException;
}
