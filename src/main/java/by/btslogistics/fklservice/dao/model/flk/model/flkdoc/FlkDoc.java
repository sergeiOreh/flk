package by.btslogistics.fklservice.dao.model.flk.model.flkdoc;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "FLK_DOK", schema = "TTS_FORMAT_LOGICAL_CONTROL")
public class FlkDoc {

    @SequenceGenerator(name = "jpaSequence.FlkDoc",
            sequenceName = "TTS_FORMAT_LOGICAL_CONTROL.SEQUENCE_FLK_DOK",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "jpaSequence.FlkDoc")
    @Id
    private Long id;

    /**
     * Ссылка на тип(вид) контроля - внутренний список кодов таможеных документов
     */
    @Column(name = "ID_TYPE_CONTROL")
    private Integer idTypeControl;

    /**
     * Код вида документа
     */
    @Column(name = "ABBREVIATION")
    @Size(message = "ABBREVIATION{FlkDoc.size}", max = 300)
    private String abbreviation;

    /**
     * Наименование вида документа
     */
    @Column(name = "DESCRIPTION")
    @Size(message = "DESCRIPTION{FlkDoc.size}", max = 300)
    private String description;

    public FlkDoc() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdTypeControl() {
        return idTypeControl;
    }

    public void setIdTypeControl(Integer idTypeControl) {
        this.idTypeControl = idTypeControl;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkDoc flkDoc = (FlkDoc) o;
        return Objects.equals(id, flkDoc.id) &&
                Objects.equals(idTypeControl, flkDoc.idTypeControl) &&
                Objects.equals(abbreviation, flkDoc.abbreviation) &&
                Objects.equals(description, flkDoc.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idTypeControl, abbreviation, description);
    }

    @Override
    public String toString() {
        return "FlkDoc{" +
                "id=" + id +
                ", idTypeControl=" + idTypeControl +
                ", abbreviation='" + abbreviation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
