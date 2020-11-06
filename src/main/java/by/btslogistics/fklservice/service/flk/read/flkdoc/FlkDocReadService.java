package by.btslogistics.fklservice.service.flk.read.flkdoc;

import by.btslogistics.fklservice.service.flk.dto.flk.flkdoc.FlkDocDto;

public interface FlkDocReadService {

    /**
     * получаем список записей, из справочника типов документов.
     * @return возрващаем список записей из таблицы <b>FLK_DOC</b>
     */
    Iterable<FlkDocDto> getListDocuments();

}
