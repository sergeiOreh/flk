package by.btslogistics.fklservice.web.rest.constants.flk.constants.flkchecks;

/**
 * Описываются шаблоны адресов `API` для `RestControllers` , обслуживающих
 * таблицу <b>FLK_CHECKS</b>
 */
public interface FlkChecksConstants {

    /*READ*/
    String ROOT_READ_FLK_TYPE_CONTROL = "api/read/flkTypeControl";

    String ROOT_READ_FLK_CHECKS = "api/read/flkChecks";

    String PATH_LIST = "list";

    String PATH_GET_ID = "get";


    /*UPDATE*/
    String ROOT_UPDATE_FLK_CHECKS = "api/update/flkChecks";

    String UPDATE_LIST_BY_IS_ACTIVE = "list/isActive";

    /*SAVE from Construstor FLC with Json*/
    String ROOT_SAVE_FLK_CHECKS = "api/save";
    String SAVE_FLK_CHECKS = "flkChecks";
}

