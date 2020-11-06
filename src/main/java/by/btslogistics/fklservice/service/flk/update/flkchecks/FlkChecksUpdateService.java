package by.btslogistics.fklservice.service.flk.update.flkchecks;


import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;

public interface FlkChecksUpdateService {

  /**
   * обновляется список записей, у которых может бытть изменено значение
   * поля IS_ACTIVE для таблицы FLK_CHECKS
   *
   * @param list - передается список записей, которые нужно обновить
   */
  void updateListByIsActive(Iterable<FlkChecksDto> list);

}
