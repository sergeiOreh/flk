package by.btslogistics.fklservice.dao.model.messageslog.repository;

import by.btslogistics.fklservice.dao.model.messageslog.model.MessageLog;
import org.springframework.data.repository.CrudRepository;

public interface MessageLogReadRepository extends CrudRepository<MessageLog, String> {
}
