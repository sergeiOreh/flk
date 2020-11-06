package by.btslogistics.fklservice.service.flk.dto.messageslog;

import by.btslogistics.commons.dao.dto.messageslog.MessageLogDefaultDto;

import java.util.Objects;

public class MessageLogDto extends MessageLogDefaultDto {

    private String msgXml;

    public String getMsgXml() {
        return msgXml;
    }

    public void setMsgXml(String msgXml) {
        this.msgXml = msgXml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MessageLogDto that = (MessageLogDto) o;
        return Objects.equals(msgXml, that.msgXml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), msgXml);
    }
}
