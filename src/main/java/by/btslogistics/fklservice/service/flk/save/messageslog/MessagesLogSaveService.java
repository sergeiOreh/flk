package by.btslogistics.fklservice.service.flk.save.messageslog;

import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;

public interface MessagesLogSaveService {

    /**
     *
     *   Сохранение записи в таблицу  MessagesLog
     *
     * @param dto - объект для сохранения
     * @return - возвращается объект, который был сохранен
     */
        MessageLogDto setToMessageLog(MessageLogDto dto);
}
