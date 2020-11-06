package by.btslogistics.fklservice.service.flk.save.flk;

import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;

public interface FlkChecksSaveService {

    /**
     * таблица FLK_CHECKS
     * @param dto - объект для сохранения
     * @return возвращается объект, который был сохранен
     */
    FlkChecksDto setToFlkChecksDto(FlkChecksDto dto);

}
