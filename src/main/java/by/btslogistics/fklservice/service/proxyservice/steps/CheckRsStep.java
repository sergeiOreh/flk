package by.btslogistics.fklservice.service.proxyservice.steps;

import by.btslogistics.commons.dao.enums.typeobjects.TypeDoc;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentRsRestProxy;

public class CheckRsStep extends RegistrationDocuments{

    private final RegistrationDocumentRsRestProxy rsRestProxy;

    public CheckRsStep(RegistrationDocumentRsRestProxy rsRestProxy) {
        this.rsRestProxy = rsRestProxy;
    }

    @Override
    public void doStep(MessageLogDto dto) {
        if(dto.getTypeDoc().equals(TypeDoc.RS.name())) {
            rsRestProxy.registerDocumentRs(dto);
        }
        nextStep(dto);
    }
}
