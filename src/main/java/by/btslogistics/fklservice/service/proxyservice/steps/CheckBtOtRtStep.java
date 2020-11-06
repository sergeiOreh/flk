package by.btslogistics.fklservice.service.proxyservice.steps;

import by.btslogistics.commons.dao.enums.typeobjects.TypeDoc;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentBtRtOtRestProxy;
import org.springframework.http.ResponseEntity;

public class CheckBtOtRtStep extends RegistrationDocuments{

    private final RegistrationDocumentBtRtOtRestProxy registrationDocumentBtRtOtRestProxy;

    public CheckBtOtRtStep(RegistrationDocumentBtRtOtRestProxy registrationDocumentBtRtOtRestProxy) {
        this.registrationDocumentBtRtOtRestProxy = registrationDocumentBtRtOtRestProxy;
    }

    @Override
    public void doStep(MessageLogDto dto) {
        if (dto.getTypeDoc().equals(TypeDoc.BT.name()) || dto.getTypeDoc().equals(TypeDoc.RT.name()) || dto.getTypeDoc().equals(TypeDoc.OT.name())) {
            registrationDocumentBtRtOtRestProxy.registerDocumentBtRtOt(dto);
            return;
        }
        nextStep(dto);
    }
}
