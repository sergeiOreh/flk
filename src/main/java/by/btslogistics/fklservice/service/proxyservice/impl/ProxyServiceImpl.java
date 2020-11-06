package by.btslogistics.fklservice.service.proxyservice.impl;


import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.service.proxyservice.ProxyService;
import by.btslogistics.fklservice.service.proxyservice.messages.SendMessagesToMarsService;
import by.btslogistics.fklservice.service.proxyservice.steps.*;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentBtRtOtRestProxy;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentCoRestProxy;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentDtKdtDtsRestProxy;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentRsRestProxy;
import by.btslogistics.fklservice.web.rest.proxyfeign.RegistrationDocumentZvtRestProxy;
import org.springframework.stereotype.Service;

@Service
public class ProxyServiceImpl implements ProxyService {

    private final SendMessagesToMarsService sendMessagesToMarsService;

    private  final RegistrationDocumentBtRtOtRestProxy registrationDocumentBtRtOtRestProxy;

    private final RegistrationDocumentDtKdtDtsRestProxy registrationDocumentDtKdtDtsRestProxy;

    private final RegistrationDocumentRsRestProxy registrationDocumentRsRestProxy;

    private final RegistrationDocumentZvtRestProxy registrationDocumentZvtRestProxy;

    private final RegistrationDocumentCoRestProxy registrationDocumentCoRestProxy;

    public ProxyServiceImpl(SendMessagesToMarsService sendMessagesToMarsService, RegistrationDocumentBtRtOtRestProxy registrationDocumentBtRtOtRestProxy,
                            RegistrationDocumentDtKdtDtsRestProxy registrationDocumentDtKdtDtsRestProxy, RegistrationDocumentRsRestProxy registrationDocumentRsRestProxy, RegistrationDocumentZvtRestProxy registrationDocumentZvtRestProxy,
                            RegistrationDocumentCoRestProxy registrationDocumentCoRestProxy) {
        this.sendMessagesToMarsService = sendMessagesToMarsService;
        this.registrationDocumentBtRtOtRestProxy = registrationDocumentBtRtOtRestProxy;
        this.registrationDocumentDtKdtDtsRestProxy = registrationDocumentDtKdtDtsRestProxy;
        this.registrationDocumentRsRestProxy = registrationDocumentRsRestProxy;
        this.registrationDocumentZvtRestProxy = registrationDocumentZvtRestProxy;
        this.registrationDocumentCoRestProxy = registrationDocumentCoRestProxy;
    }

    @Override
    public void doRegistration(MessageLogDto dto) {
        RegistrationDocuments registrationDocuments = new CheckBtOtRtStep(registrationDocumentBtRtOtRestProxy);
        registrationDocuments
                .linkWith(new CheckDtKdtDtsStep(registrationDocumentDtKdtDtsRestProxy))
                .linkWith(new CheckRsStep(registrationDocumentRsRestProxy))
                .linkWith(new CheckZvtStep(registrationDocumentZvtRestProxy, sendMessagesToMarsService))
                .linkWith(new CheckCoStep(registrationDocumentCoRestProxy));

        registrationDocuments.doStep(dto);

    }
}
