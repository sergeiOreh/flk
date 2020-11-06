package by.btslogistics.fklservice.web.rest.constants.receive.messagesout;

public interface MessagesOutConstants {

    /*READ*/
    String ROOT_READ_MESSAGES_OUT = "api/read/messagesOut";

    String PATH_MSG_OWNER_ID = "msgOwnerId/{msgOwnerId}";

    String PATH_MSG_CODE = "msgCode/{msgCode}";

    String PATH_TYPE_DOC = "type/{type}";

    String PATH_LIST_VIEW = "view/list";


    // Сообщения отправленные и исходящие из представления MESSAGESOUT_VIEW
    String PATH_LIST_VIEW_MESS_OUT_STATE = "view/list/messOutState/{messOutState}";

    /*SAVE*/
    String ROOT_SAVE_MESSAGES_OUT="api/save/messagesOut";
}
