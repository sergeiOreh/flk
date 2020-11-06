package by.btslogistics.fklservice.service.proxyservice.messages.impl;

import by.btslogistics.commons.dao.dto.flk.FlkResultDto;
import by.btslogistics.commons.dao.enums.errors.BCM_09;
import by.btslogistics.commons.dao.enums.typeobjects.XMLMessageTypes;
import by.btslogistics.commons.service.soap.client.WSClientService;
import by.btslogistics.commons.service.soap.client.impl.WSClientServiceImpl;
import by.btslogistics.commons.service.soap.client.message.CSTM0002Message;
import by.btslogistics.commons.service.soap.client.message.CSTM0006Message;
import by.btslogistics.commons.service.soap.client.message.CSTM0011Message;
import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import by.btslogistics.fklservice.service.flk.save.messageout.MessageOutSaveService;
import by.btslogistics.fklservice.service.proxyservice.messages.SendMessagesToMarsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class SendMessagesToMarsServiceImpl implements SendMessagesToMarsService {

    private static final Logger LOGGER  = LoggerFactory.getLogger( SendMessagesToMarsService.class );

    private final MessageOutSaveService service;

    public SendMessagesToMarsServiceImpl(MessageOutSaveService service) {
        this.service = service;
    }

    @Override
    public void sendCSTM0002Message(MessageLogDto messageLogDto) {
        try {
            final CSTM0002Message msg = new CSTM0002Message(messageLogDto, null);
            WSClientService wsClientService = new WSClientServiceImpl();
            service.setToMessagesOut(messageLogDto,
                    XMLMessageTypes.MessageType.CSTM0002.code,
                    wsClientService.sendToMars(msg)?"1":"0",
                    msg.toXMLString());
        } catch (Exception e) {
            LOGGER.error("Error CSTM0002Message: " + e);
        }
    }


    @Override
    public void sendCSTM0006Message(MessageLogDto messageLogDto, Iterable<FlkResultDto> flkResultDto) {
        try {
            final CSTM0006Message msg = new CSTM0006Message(messageLogDto, flkResultDto);
            WSClientService wsClientService = new WSClientServiceImpl();
            service.setToMessagesOut(messageLogDto, XMLMessageTypes.MessageType.CSTM0006.code, wsClientService.sendToMars(msg)?"1":"0", msg.toXMLString());
        } catch (Exception e) {
            LOGGER.error("Error CSTM0006Message: " + e);
        }
    }

    @Override
    public void sendCSTM0007Message(MessageLogDto messageLogDto) {
        /*try {
            final CSTM0007Message msg = new CSTM0007Message(messageLogDto, flkResultDto);
            WSClientService wsClientService = new WSClientServiceImpl();
            service.setToMessagesOut(messageLogDto, XMLMessageTypes.MessageType.CSTM0006.code, wsClientService.sendToMars(msg)?"1":"0", msg.toXMLString());
        } catch (Exception e) {
            LOGGER.error("Error CSTM0006Message: " + e);
        }*/
    }

    @Override
    public void sendCSTM0008Message(MessageLogDto messageLogDto) {

    }


    @Override
    public void sendCSTM0011Message(MessageLogDto messageLogDto, BCM_09 e, Iterable<FlkResultDto> flkResultDto) {
        try {
            final CSTM0011Message msg = new CSTM0011Message(messageLogDto, flkResultDto, e.getErrorCode()+" "+e.getErrorText());
            WSClientService wsClientService = new WSClientServiceImpl();
            service.setToMessagesOut(messageLogDto, XMLMessageTypes.MessageType.CSTM0011.code, wsClientService.sendToMars(msg)?"1":"0", e.getErrorCode()+" "+e.getErrorText(), msg.toXMLString());

        } catch (Exception exception) {

            LOGGER.debug("Error CSTM0006Message: ", exception);
        }
    }

    @Override
    public void sendCSTM0011Message(MessageLogDto messageLogDto,  BCM_09 e){
        sendCSTM0011Message(messageLogDto, e,null);
    }
}
