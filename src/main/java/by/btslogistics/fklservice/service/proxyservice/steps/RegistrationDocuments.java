package by.btslogistics.fklservice.service.proxyservice.steps;

import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;

public abstract class RegistrationDocuments {

    private  RegistrationDocuments next;

    public RegistrationDocuments linkWith(RegistrationDocuments next){
        this.next = next;
        return next;
    }

    public abstract void doStep(MessageLogDto dto);

    protected void nextStep(MessageLogDto dto){
        if(next == null){
            return;
        }
        next.doStep(dto);
    }

}
