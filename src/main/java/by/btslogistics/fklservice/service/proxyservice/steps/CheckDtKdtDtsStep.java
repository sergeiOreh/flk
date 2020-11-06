package by.btslogistics.fklservice.service.proxyservice.steps;

import by.btslogistics.commons.dao.enums.typeobjects.TypeDoc;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentDtKdtDtsRestProxy;

public class CheckDtKdtDtsStep extends RegistrationDocuments{

    private final RegistrationDocumentDtKdtDtsRestProxy registrationDocumentDtKdtDtsRestProxy;

    public CheckDtKdtDtsStep(RegistrationDocumentDtKdtDtsRestProxy registrationDocumentDtKdtDtsRestProxy) {
        this.registrationDocumentDtKdtDtsRestProxy = registrationDocumentDtKdtDtsRestProxy;
    }

    @Override
    public void doStep(MessageLogDto dto) {
        if(dto.getTypeDoc().equals(TypeDoc.DT.name())||dto.getTypeDoc().equals(TypeDoc.KT.name())||dto.getTypeDoc().equals(TypeDoc.D4.name())||dto.getTypeDoc().equals(TypeDoc.TMPA.name())) {
            registrationDocumentDtKdtDtsRestProxy.registerDocument(dto.getId());
            return;
        }
        nextStep(dto);
    }
}
