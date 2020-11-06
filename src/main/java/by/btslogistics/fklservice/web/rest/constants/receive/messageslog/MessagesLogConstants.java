package by.btslogistics.fklservice.web.rest.constants.receive.messageslog;

public interface MessagesLogConstants {

    /*READ*/
    String ROOT_READ_MESSAGES_LOG = "api/read/messagesLog";

    String PATH_MSG_OWNER_ID = "msgOwnerId/{msgOwnerId}";

    String PATH_DOCUMENT = "document/{document}";

    String PATH_STATUS = "status/{status}";

 // String PATH_TYPE_DOC = "typeDoc/{type}";

    String PATH_CATEGORY = "category/{type}";

    String PATH_STATE = "received";

    /*SAVE*/
    String ROOT_SAVE_MESSAGES_LOG = "api/save/messagesLog";
}
