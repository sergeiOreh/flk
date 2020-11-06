package by.btslogistics.fklservice.web.rest.flk.delete;


import by.btslogistics.fklservice.service.flk.delete.flktypecontrol.FlkTypeControlDeleteService;
import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlDto;
import by.btslogistics.fklservice.service.flk.exception.ResourceNotFoundException;
import by.btslogistics.fklservice.service.flk.read.flkmain.FlkMainService;
import by.btslogistics.fklservice.service.flk.read.flktypecontrol.FlkTypeControlReadService;
import by.btslogistics.fklservice.web.exceptions.common.DeleteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static by.btslogistics.fklservice.web.rest.constants.flk.constants.flktypecontrol.FlkTypeControlConstants.FLK_TYPE_CONTROL;
import static by.btslogistics.fklservice.web.rest.constants.flk.constants.flktypecontrol.FlkTypeControlConstants.ROOT_DELETE_TYPE_CONTROL;

@RestController
@RequestMapping(ROOT_DELETE_TYPE_CONTROL)
@PropertySources({
        @PropertySource("classpath:properties/app-exception-messages.properties")
})
public class FlkTypeControlRest {

    private FlkTypeControlDeleteService service;

    private FlkTypeControlReadService serviceRead;

    private FlkMainService flkMainService;

    @Value("${cannot.delete.flkTypeControl}")
    private String messageNotDelete;

    @Autowired
    public FlkTypeControlRest(FlkTypeControlDeleteService service,
                              FlkTypeControlReadService serviceRead,
                              FlkMainService flkMainService) {
        this.service = service;
        this.serviceRead = serviceRead;
        this.flkMainService = flkMainService;
    }

    /**
     * <p>Обработка запроса на удаление записи, которая представляет
     * собой пользовательский контроль.
     * Перед удалением происходит проверка того, что запись относиться к
     * виду записей, который были созданы ранее пользователями. У записи проверяется
     * поле <b>DEFAULT_CONTROL</b>, которое символизирует о том является ли запись,
     * из преодпределенного набора видов контролей или же была создана пользователем.
     * </p>
     * <p><b>0</b> - запись является предустановленной</p>
     * <p><b>1</b> - запись создана пользователем </p>
     * Если запрос указывает на то, что нужно удалить запись, которая была предопределена,
     * тогда клиенту возвращается сообщение об ошибке.
     * <p>Следующая проверка делается для того, чтобы узнать, что запись запрашиваемая на удаление,
     * существует в базе данны.
     * Если такой записи нет, тогда клиенту возвращается сообщение об ошибке</p>
     *
     * @param id идентификатор записи на удаление
     * @return возвращается код ответа и сообщение о результате обработки запроса.
     * @throws ResourceNotFoundException выбрасывается, в случае невозможности найти запрашиваемый ресурс
     * @throws DeleteException           выбрасывается в случае запрета на удаление, запрашиваемого ресурса
     */
    @DeleteMapping(FLK_TYPE_CONTROL)
    public ResponseEntity<Object> deleteCustomTypeControl(@RequestParam(name = "id") Long id)
            throws ResourceNotFoundException, DeleteException {

        FlkTypeControlDto dto = this.serviceRead.getById(id);

        checkStatusType(dto);

        verificationExistingEntry(dto);

        verificationPresenceRelationship(dto);

        this.service.deleteTypeControl(dto);

        return ResponseEntity.ok().build();

    }

    /**
     * Проверяется, есть ли связанные записи, в дочерней таблице <b>FLK_MAIN</b>
     * Если связь есть, тогда будет выброшен exception о невозможности удаления.
     * @param dto даннные удаляемой записи
     */
    private void verificationPresenceRelationship(FlkTypeControlDto dto) {

        Integer id = Math.toIntExact(dto.getId());

        Boolean isRelationShip = this.flkMainService.isRelationships(id);

        if(isRelationShip) throw new DeleteException(messageNotDelete);
    }

    /**
     * Если в поле `defaultControl` указано значение 1, это означает, что запрашиваемый
     * на удаление тип контроля - пользовательский.
     * Если в поле `defaultControl` указано значение 0, это означает, что запрашиваемый
     * на удаление тип контроля - статический (предопределен), поэтому будет выборошен exception.
     *
     * @param dto данные записи, которую нужно удалить из таблицы
     */
    private void checkStatusType(FlkTypeControlDto dto) {

        int zero = 0;

        boolean isDefaultControl = dto.getDefaultControl().equals(zero);

        if (isDefaultControl) throw new DeleteException(messageNotDelete);
    }


    /**
     * <p>Проверяет существование записи, которую необходимо удалить.</p>
     */
    private void verificationExistingEntry(FlkTypeControlDto dto) {

        getFlkTypeControl(dto);

    }

    /**
     * <p>Перед удалением, делается запрос в таблицу <b>FLK_TYPE_CONTROL</b>,
     * на предмет наличия записи, запрашиваемой для удаления</p>
     *
     * @param dto данные записи, которую предполагается удалить
     *            <p>Если во время обработки запроса на слое бизнес-логики, запись не будет
     *            найдена, тогда будет выборошен ResourceNotFoundException и автоматически
     *            будет сформирован ответ клиенту, в котором будет указана ошибка</p>
     */
    private void getFlkTypeControl(FlkTypeControlDto dto) {

        Long id = dto.getId();

        this.serviceRead.getById(id);
    }


}
