package by.btslogistics.fklservice.service.flk.read.flkgrafa;

import by.btslogistics.fklservice.service.flk.dto.flk.flkgrafa.FlkGrafaDto;

public interface FlkGrafaReadService {

    /**
     * Получить список из таблицы FLK_GRAFA где поле NUMBER_GRAFA не равно NULL
     * @return возращается список записей из таблицы FLK_GRAFA
     */

    Iterable<FlkGrafaDto> getFlkGrafaByNumberGrafa();

}
