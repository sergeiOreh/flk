package by.btslogistics.fklservice.service.flk.save.flk;


import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlCopyDto;

public interface FlkTypeControlSaveService {

    /**
     *   Сохранение записи в таблицу видов контроля FLK_TYPE_CONTROL
     * @param dto - объект для сохранения
     * @return - возвращается объект, который был сохранен
     */
    FlkTypeControlDto setToFlkTypeControlDto(FlkTypeControlDto dto);


    FlkTypeControlDto copyParentChecksToNewChecks(FlkTypeControlCopyDto dto, Long id);


}
