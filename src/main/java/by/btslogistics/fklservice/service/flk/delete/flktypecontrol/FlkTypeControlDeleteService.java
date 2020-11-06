package by.btslogistics.fklservice.service.flk.delete.flktypecontrol;

import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;

public interface FlkTypeControlDeleteService {

    /**
     * <p>Обработка запроса, на удаление ранее созданной записи пользовательского
     * контроля в таблице FLK_TYPE_CONTROL </p>
     * @param dto - данные записи, которую нужно удалить
     */
    void deleteTypeControl(FlkTypeControlDto dto);
}
