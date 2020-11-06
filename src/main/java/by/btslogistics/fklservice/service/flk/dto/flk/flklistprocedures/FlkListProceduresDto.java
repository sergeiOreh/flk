package by.btslogistics.fklservice.service.flk.dto.flk.flklistprocedures;

import java.util.Objects;

public class FlkListProceduresDto {

    private Long id;

    /**
     * Ссылка на таблицу FLK_LVL_CHECKS
     */
    private Long idLevel;

    /**
     * Резервное поле
     */
    private String shortName;

    /**
     * Имя процедуры
     */
    private String procName;

    /**
     * Описание процедуры
     */
    private String description;

    /**
     * Примечание
     */
    private String note;

    /**
     * Кол-во входных параметров в процедуру
     */
    private Integer inCountP;

    /**
     Кол-во выходных параметров из процедуры
     */
    private Integer outCountP;

    public FlkListProceduresDto() {
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
        FlkListProceduresDto that = (FlkListProceduresDto) o;
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
        return "FlkListProceduresDto{" +
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
