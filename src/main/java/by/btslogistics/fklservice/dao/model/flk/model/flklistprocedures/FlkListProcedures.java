package by.btslogistics.fklservice.dao.model.flk.model.flklistprocedures;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "FLK_LIST_PROCEDURES", schema = "TTS_FORMAT_LOGICAL_CONTROL")
public class FlkListProcedures {

    @SequenceGenerator(name = "jpaSequence.FlkListProcedures",
            sequenceName = "TTS_FORMAT_LOGICAL_CONTROL.SEQUENCE_FLK_LIST_PROCEDURES",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "jpaSequence.FlkListProcedures")
    @Id
    private Long id;

    /**
     * Ссылка на таблицу FLK_LVL_CHECKS
     */
    @Column(name = "ID_LVL")
    private Long idLevel;

    /**
     * Резервное поле
     */
    @Column(name = "SHORT_NAME")
    @Size(message = "SHORT_NAME{FlkListProcedures.size}", max = 255)
    private String shortName;

    /**
     * Имя процедуры
     */
    @Column(name = "PROC_NAME")
    @Size(message = "PROC_NAME{FlkListProcedures.size}", max = 255)
    private String procName;

    /**
     * Описание процедуры
     */
    @Size(message = "DESCRIPTION{FlkListProcedures.size}", max = 255)
    private String description;

    /**
     * Примечание
     */
    @Size(message = "NOTE{FlkListProcedures.size}", max = 255)
    private String note;

    /**
     * Кол-во входных параметров в процедуру
     */
    @Column(name = "IN_COUNT_P")
    private Integer inCountP;

    /**
     Кол-во выходных параметров из процедуры
     */
    @Column(name = "OUT_COUNT_P")
    private Integer outCountP;

    public FlkListProcedures() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(Long idLevel) {
        this.idLevel = idLevel;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getInCountP() {
        return inCountP;
    }

    public void setInCountP(Integer inCountP) {
        this.inCountP = inCountP;
    }

    public Integer getOutCountP() {
        return outCountP;
    }

    public void setOutCountP(Integer outCountP) {
        this.outCountP = outCountP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkListProcedures that = (FlkListProcedures) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idLevel, that.idLevel) &&
                Objects.equals(shortName, that.shortName) &&
                Objects.equals(procName, that.procName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(note, that.note) &&
                Objects.equals(inCountP, that.inCountP) &&
                Objects.equals(outCountP, that.outCountP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idLevel, shortName, procName, description, note, inCountP, outCountP);
    }

    @Override
    public String toString() {
        return "FlkListProcedures{" +
                "id=" + id +
                ", idLevel=" + idLevel +
                ", shortName='" + shortName + '\'' +
                ", procName='" + procName + '\'' +
                ", description='" + description + '\'' +
                ", note='" + note + '\'' +
                ", inCountP=" + inCountP +
                ", outCountP=" + outCountP +
                '}';
    }
}
