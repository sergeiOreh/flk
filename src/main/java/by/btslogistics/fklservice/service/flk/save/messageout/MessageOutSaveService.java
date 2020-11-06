package by.btslogistics.fklservice.service.flk.save.messageout;


import by.btslogistics.fklservice.service.flk.dto.messageout.MessageOutDto;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;

/**
 * бизнес-логика для таблицы MessagesOut
 */
public interface MessageOutSaveService {

    /**
     *  Сохранение записи в таблицу  MessagesOut
     * @param dto - объект для сохранения
     * @return - возвращается объект, который был сохранен
     */
    MessageOutDto setToMessagesOut(MessageOutDto dto);

    MessageOutDto setToMessagesOut(MessageLogDto messageLogDto, String messageType, String state, String xmlMsg);

    MessageOutDto setToMessagesOut(MessageLogDto messageLogDto, String messageType, String state,String msgText, String xmlMsg);
}
