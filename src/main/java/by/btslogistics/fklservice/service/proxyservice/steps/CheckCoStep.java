package by.btslogistics.fklservice.service.proxyservice.steps;

import by.btslogistics.commons.dao.enums.typeobjects.TypeDoc;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentCoRestProxy;

public class CheckCoStep extends RegistrationDocuments {

    private final RegistrationDocumentCoRestProxy coRestProxy;

    public CheckCoStep(RegistrationDocumentCoRestProxy coRestProxy) {
        this.coRestProxy = coRestProxy;
    }

    @Override
    public void doStep(MessageLogDto dto) {
        if (dto.getTypeDoc().equals(TypeDoc.GC.name())) {
            coRestProxy.registerDocumentCo(dto);
        }
        nextStep(dto);
    }
}
