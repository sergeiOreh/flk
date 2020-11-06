package by.btslogistics.fklservice.service.flk.read.messageslog;


import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;

/**
 * Обрабатываются запросы к таблице MESSAGESLOG
 */
public interface MessagesLogReadService {

    /**
     * @param id -id записи в таблице
     * @return - единственная запись из таблицы ( так как по первичному ключу)
     */
    MessageLogDto getMessageLogById(String id);


}
