package by.btslogistics.fklservice.dao.model.flk.model.flkgrafa;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

//@NamedEntityGraph(
//        name = "entity-graph-with-flkChecks",
//        attributeNodes = {
//                @NamedAttributeNode("flkChecks")
//        }
//)
@Entity
@Table(name = "FLK_GRAFA", schema = "TTS_FORMAT_LOGICAL_CONTROL")
public class FlkGrafa {

    @SequenceGenerator(name = "jpaSequence.FlkGrafa",
            sequenceName = "TTS_FORMAT_LOGICAL_CONTROL.SEQUENCE_FLK_GRAFA",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "jpaSequence.FlkGrafa")
    @Id
    private Long id;


    /**
     * Идентификатор формы (бланка) нужно создать внутренний список шаблонов для бланков
     */
    @Column(name = "ID_FORM")
    @Size(message = "ID_FORM{FlkGrafa.size}", max = 10)
    private String idForm;


    /**
     * активность проверки поля;
     * 0- обязательно не заполнено,
     * 1- обязательно заполнено,
     * 2- может быть заполнено
     */
    @Column(name = "IS_PRESENCE")
    @Size(message = "IS_PRESENCE{FlkGrafa.size}", max = 1)
    private String presence;

    /**
     * Номер графы, в которой отображаются сведения на клиентской форме
     * Граф всего в декларации 1..54, 17А на данный момент 19.03.2020
     * и графы некоторые состоят из цифры и буквы
     */
    @Column(name = "NUMBER_GRAFA")
    @Size(message = "NUMBER_GRAFA{FlkGrafa.size}", max = 3)
    private String numberGrafa;

    /**
     * Наименование графы
     */
    @Column(name = "NAME_GRAFA")
    @Size(message = "NAME_GRAFA{FlkGrafa.size}", max = 300)
    private String nameGrafa;

    /**
     * Наименование поля в графе
     */
    @Column(name = "NAME_POLE")
    @Size(message = "NAME_POLE{FlkGrafa.size}", max = 300)
    private String namePole;

    /**
     * Наименование таблицы согласно xml
     */
    @Column(name = "NAME_TABLE")
    @Size(message = "NAME_TABLE{FlkGrafa.size}", max = 300)
    private String nameTable;

    /**
     * Наименование поля в таблице согласно xml
     */
    @Column(name = "NAME_COLUMN")
    @Size(message = "NAME_COLUMN{FlkGrafa.size}", max = 300)
    private String nameColumn;


    /**
     * Полный путь xml
         */
    @Column(name = "PATH_XML")
    @Size(message = "PATH_XML{FlkGrafa.size}", max = 300)
    private String pathXml;

    @Column(name = "DATA_TYPE")
    @Size(message = "DATA_TYPE{FlkGrafa.size}", max = 250)
    private String dataType;

//    @OneToMany(mappedBy = "flkGrafa")
//    private List<FlkChecks> flkChecks;

    public FlkGrafa() {
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
        FlkGrafa flkGrafa = (FlkGrafa) o;
        return Objects.equals(id, flkGrafa.id) &&
                Objects.equals(idForm, flkGrafa.idForm) &&
                Objects.equals(presence, flkGrafa.presence) &&
                Objects.equals(numberGrafa, flkGrafa.numberGrafa) &&
                Objects.equals(nameGrafa, flkGrafa.nameGrafa) &&
                Objects.equals(namePole, flkGrafa.namePole) &&
                Objects.equals(nameTable, flkGrafa.nameTable) &&
                Objects.equals(nameColumn, flkGrafa.nameColumn) &&
                Objects.equals(pathXml, flkGrafa.pathXml) &&
                Objects.equals(dataType, flkGrafa.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idForm, presence, numberGrafa, nameGrafa, namePole, nameTable, nameColumn, pathXml, dataType);
    }

    @Override
    public String toString() {
        return "FlkGrafa{" +
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
