package by.btslogistics.fklservice.service.proxyservice.steps;

import by.btslogistics.commons.dao.enums.typeobjects.TypeDoc;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.service.proxyservice.messages.SendMessagesToMarsService;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentZvtRestProxy;

public class CheckZvtStep extends RegistrationDocuments{

    private final RegistrationDocumentZvtRestProxy zvtRestProxy;

    private final SendMessagesToMarsService sendMessagesToMarsService;

    public CheckZvtStep(RegistrationDocumentZvtRestProxy zvtRestProxy, SendMessagesToMarsService sendMessagesToMarsService) {
        this.zvtRestProxy = zvtRestProxy;
        this.sendMessagesToMarsService = sendMessagesToMarsService;
    }

    @Override
    public void doStep(MessageLogDto dto) {
        if(dto.getTypeDoc().equals(TypeDoc.ZVT.name())) {
            sendMessagesToMarsService.sendCSTM0002Message(dto);
            zvtRestProxy.registerDocumentZvt(dto);
        }
        nextStep(dto);
    }
}
