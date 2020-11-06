package by.btslogistics.fklservice.service.registration.read.sddeclscheme;


import by.btslogistics.fklservice.service.registration.dto.sddeclscheme.SdaMainDto;

public interface SdaMainReadService {

    /**
     *  Поиск в таблице SDA_MAIN записи по полю NOM_PRIN
     * @param numPrin - строковое значение номера принятия декларации
     * @return - возвращает объект типа SdaMainDto
     */

    SdaMainDto findByNomPrin(String numPrin);

    SdaMainDto findByToMessagesLogId(String messagesLogId);

}
