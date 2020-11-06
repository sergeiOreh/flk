package by.btslogistics.fklservice.service.flk.dto.flk.flkgrafa;

import java.io.Serializable;
import java.util.Objects;

public class FlkGrafaDto {

    private Long id;

    /**
     * Идентификатор формы (бланка) нужно создать внутренний список шаблонов для бланков
     */
    private String idForm;

    /**
     * активность проверки поля;
     * 0- обязательно не заполнено,
     * 1- обязательно заполнено,
     * 2- может быть заполнено
     */
    private String presence;

    /**
     * Номер графы, в которой отображаются сведения на клиентской форме
     * Граф всего в декларации 1..54, 17А на данный момент 19.03.2020
     * и графы некоторые состоят из цифры и буквы
     */
    private String numberGrafa;

    /**
     * Наименование графы
     */
     private String nameGrafa;

    /**
     * Наименование поля в графе
     */
    private String namePole;

    /**
     * Наименование таблицы согласно xml
     */
     private String nameTable;

    /**
     * Наименование поля в таблице согласно xml
     */
    private String nameColumn;

    /**
     * Полный путь xml
     */
    private String pathXml;

    /**
     * Тип поля в таблице (строковый, числовой, дата)
     */
    private String dataType;

    public FlkGrafaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdForm() {
        return idForm;
    }

    public void setIdForm(String idForm) {
        this.idForm = idForm;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public String getNumberGrafa() {
        return numberGrafa;
    }

    public void setNumberGrafa(String numberGrafa) {
        this.numberGrafa = numberGrafa;
    }

    public String getNameGrafa() {
        return nameGrafa;
    }

    public void setNameGrafa(String nameGrafa) {
        this.nameGrafa = nameGrafa;
    }

    public String getNamePole() {
        return namePole;
    }

    public void setNamePole(String namePole) {
        this.namePole = namePole;
    }

    public String getNameTable() {
        return nameTable;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }

    public String getNameColumn() {
        return nameColumn;
    }

    public void setNameColumn(String nameColumn) {
        this.nameColumn = nameColumn;
    }

    public String getPathXml() {
        return pathXml;
    }

    public void setPathXml(String pathXml) {
        this.pathXml = pathXml;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkGrafaDto that = (FlkGrafaDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idForm, that.idForm) &&
                Objects.equals(presence, that.presence) &&
                Objects.equals(numberGrafa, that.numberGrafa) &&
                Objects.equals(nameGrafa, that.nameGrafa) &&
                Objects.equals(namePole, that.namePole) &&
                Objects.equals(nameTable, that.nameTable) &&
                Objects.equals(nameColumn, that.nameColumn) &&
                Objects.equals(pathXml, that.pathXml) &&
                Objects.equals(dataType, that.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idForm, presence, numberGrafa, nameGrafa, namePole, nameTable, nameColumn, pathXml, dataType);
    }

    @Override
    public String toString() {
        return "FlkGrafaDto{" +
                "id=" + id +
                ", idForm='" + idForm + '\'' +
                ", presence='" + presence + '\'' +
                ", numberGrafa='" + numberGrafa + '\'' +
                ", nameGrafa='" + nameGrafa + '\'' +
                ", namePole='" + namePole + '\'' +
                ", nameTable='" + nameTable + '\'' +
                ", nameColumn='" + nameColumn + '\'' +
                ", pathXml='" + pathXml + '\'' +
                ", dataType='" + dataType + '\'' +
                '}';
    }
}
