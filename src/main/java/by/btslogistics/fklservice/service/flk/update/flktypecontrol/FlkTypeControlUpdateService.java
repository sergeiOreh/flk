package by.btslogistics.fklservice.service.flk.update.flktypecontrol;


import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;

public interface FlkTypeControlUpdateService {

    /**
     * обновляется список записей, у которых может бытть изменено значение
     * поля IS_ACTIVE для таблицы FLK_TYPE_CONTROL
     *
     * @param list - передается список записей, которые нужно обновить
     */
    void updateListByIsActive(Iterable<FlkTypeControlDto> list);

    void updateByIdFlkTypeControl(FlkTypeControlDto flkTypeControlDto);
}
