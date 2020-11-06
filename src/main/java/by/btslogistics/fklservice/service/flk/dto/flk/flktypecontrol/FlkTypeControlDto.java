package by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlkTypeControlDto {

    private Long id;

    /**
     * Название типа контроля
     */
    private String nameType;

    /**
     * Описание вида контроля
     */
    private String description;

    /**
     * Дата начала действия контроля
     */
    private LocalDateTime dOn;

    /**
     *Дата конца действия контроля
     */
    private LocalDateTime dOff;

    /**
     * 1 - Активный контроль,
     * 0 - неактивный контроль
     */
    private String active;

    /**
     * Признак, который показывает какая запись является по-умолчанию родительской
     */
    private Integer defaultControl;

    /**
     * дата создания вида контроля
     */
    private LocalDateTime  dateCreate;

    /**
     * дата обновления вида контроля
     */
    private LocalDateTime  dateUpdate;

    /**
     * Id документа из таблицы FLK_DOK - справочник видов документов
     */
    private Integer idTypeDocument;


    public FlkTypeControlDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getdOn() {
        return dOn;
    }

    public void setdOn(LocalDateTime dOn) {
        this.dOn = dOn;
    }

    public LocalDateTime getdOff() {
        return dOff;
    }

    public void setdOff(LocalDateTime dOff) {
        this.dOff = dOff;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Integer getDefaultControl() {
        return defaultControl;
    }

    public void setDefaultControl(Integer defaultControl) {
        this.defaultControl = defaultControl;
    }

    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Integer getIdTypeDocument() {
        return idTypeDocument;
    }

    public void setIdTypeDocument(Integer idTypeDocument) {
        this.idTypeDocument = idTypeDocument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkTypeControlDto that = (FlkTypeControlDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameType, that.nameType) &&
                Objects.equals(description, that.description) &&
                Objects.equals(dOn, that.dOn) &&
                Objects.equals(dOff, that.dOff) &&
                Objects.equals(active, that.active) &&
                Objects.equals(defaultControl, that.defaultControl) &&
                Objects.equals(dateCreate, that.dateCreate) &&
                Objects.equals(dateUpdate, that.dateUpdate) &&
                Objects.equals(idTypeDocument, that.idTypeDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameType, description, dOn, dOff, active, defaultControl, dateCreate, dateUpdate, idTypeDocument);
    }

    @Override
    public String toString() {
        return "FlkTypeControlDto{" +
                "id=" + id +
                ", nameType='" + nameType + '\'' +
                ", description='" + description + '\'' +
                ", dOn=" + dOn +
                ", dOff=" + dOff +
                ", active='" + active + '\'' +
                ", defaultControl=" + defaultControl +
                ", dateCreate=" + dateCreate +
                ", dateUpdate=" + dateUpdate +
                ", idTypeDocument=" + idTypeDocument +
                '}';
    }
}
