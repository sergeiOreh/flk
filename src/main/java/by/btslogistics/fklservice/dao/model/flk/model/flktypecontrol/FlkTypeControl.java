package by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol;

import by.btslogistics.fklservice.dao.model.flk.model.flkchecks.FlkChecks;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "FLK_TYPE_CONTROL", schema = "TTS_FORMAT_LOGICAL_CONTROL")
public class FlkTypeControl {

    @SequenceGenerator(name = "jpaSequence.FlkTypeControl",
            sequenceName = "TTS_FORMAT_LOGICAL_CONTROL.SEQUENCE_FLK_TYPE_CONTROL",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "jpaSequence.FlkTypeControl")
    @Id
    private Long id;

    /**
     * Название типа контроля
     */
    @Column(name = "NAME_TYPE")
    @Size(message = "NAME_TYPE{FlkTypeControl.size}", max = 150)
    private String nameType;

    /**
     * Описание вида контроля
     */
    @Size(message = "DESCRIPTION{FlkTypeControl.size}", max = 300)
    private String description;

    /**
     * Дата начала действия контроля
     */
    @Column(name = "D_ON")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime dOn;

    /**
     *Дата конца действия контроля
     */
    @Column(name = "D_OFF")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime dOff;


    /**
     * 1 - Активный контроль,
     * 0 - неактивный контроль
     */
    @Column(name = "IS_ACTIVE")
    private String active;


    /**
     * Признак, который показывает какая запись является по-умолчанию родительской
     * Родительская - это запись, проверки которой (FLK_CHECKS) копируются и
     * вставляются по триггеру TRG_INSERT_CHECKS к новому виду контроля
     */
    @Column(name = "DEFAULT_CONTROL")
    private Integer defaultControl;


    /**
     * дата создания вида контроля
     */
    @Column(name = "DATE_CREATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime  dateCreate;

    /**
     * дата обновления вида контроля
     */
    @Column(name = "DATE_UPDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime  dateUpdate;

    /**
     * Ссылка на таблицу FLK_DOK которая справочником
    */
    @Column(name = "ID_DOC")
    private Integer idTypeDocument;

    @OneToMany(
            mappedBy = "flkTypeControl",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<FlkChecks> flkChecks = new ArrayList<>();

    public FlkTypeControl() {
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

    public List<FlkChecks> getFlkChecks() {
        return flkChecks;
    }

    public void setFlkChecks(List<FlkChecks> flkChecks) {
        this.flkChecks = flkChecks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkTypeControl that = (FlkTypeControl) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameType, that.nameType) &&
                Objects.equals(description, that.description) &&
                Objects.equals(dOn, that.dOn) &&
                Objects.equals(dOff, that.dOff) &&
                Objects.equals(active, that.active) &&
                Objects.equals(defaultControl, that.defaultControl) &&
                Objects.equals(dateCreate, that.dateCreate) &&
                Objects.equals(dateUpdate, that.dateUpdate) &&
                Objects.equals(idTypeDocument, that.idTypeDocument) &&
                Objects.equals(flkChecks, that.flkChecks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameType, description, dOn, dOff, active, defaultControl, dateCreate, dateUpdate, idTypeDocument, flkChecks);
    }
}
