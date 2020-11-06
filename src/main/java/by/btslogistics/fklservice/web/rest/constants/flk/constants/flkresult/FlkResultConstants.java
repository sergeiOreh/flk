package by.btslogistics.fklservice.web.rest.constants.flk.constants.flkresult;

/**
 * Описываются шаблоны адресов `API` для `RestControllers` , обслуживающих
 * результат проверок, передаваемых от SYS_CURSOR, в пользовательский
 * тип данных <b>FlkResultDto</b>
 */
public interface FlkResultConstants {
    /*READ*/
    String ROOT_FLK_RESULT_FROM_SYS_CURSOR = "api/read/flkResult";
    String PATH_LIST_BY_ID_DECLARATION_SD_MAIN = "list/{id}";
    String PATH_LIST_BY_ID_DECLARATION_MESSAGE_LOG = "list/documents";

    String LIST_ERRORS = "listErrors";
    String LIST_ERRORS_FOR_ANOTHER_SERVICE = "receive/list/errors";
    String URL_TO_FLK_SERVICE = "receive/call/firststage";

}
