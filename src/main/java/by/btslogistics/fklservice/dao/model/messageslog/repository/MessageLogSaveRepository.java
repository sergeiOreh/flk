package by.btslogistics.fklservice.dao.model.messageslog.repository;

import by.btslogistics.fklservice.dao.model.messageslog.model.MessageLog;
import org.springframework.data.repository.CrudRepository;

public interface MessageLogSaveRepository extends CrudRepository<MessageLog, String> {
}
