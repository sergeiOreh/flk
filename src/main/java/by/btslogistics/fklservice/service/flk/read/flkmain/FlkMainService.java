package by.btslogistics.fklservice.service.flk.read.flkmain;

public interface FlkMainService {

    /**
     * @param idTypeControl указывает на номер вида контроля из таблицы <b>FLK_TYPE_CONTROL</b>
     * @return возвращаем <b>true</b>, если есть связь с таблицей <b>FLK_TYPE_CONTROL</b>,
     * <b>false</b> - если нет записей, ссылающихся на предоставленный номер вида контроля
     */
    Boolean isRelationships(Integer idTypeControl);
}
