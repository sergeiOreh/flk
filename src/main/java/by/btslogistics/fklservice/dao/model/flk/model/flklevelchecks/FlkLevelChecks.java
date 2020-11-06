package by.btslogistics.fklservice.dao.model.flk.model.flklevelchecks;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * таблица уровня проверок (внутренний список);
 * заполняется из хранимой фукнции.
 */
@Entity
@Table(name = "FLK_LVL_CHECKS", schema = "TTS_FORMAT_LOGICAL_CONTROL")
public class FlkLevelChecks {


    @SequenceGenerator(name = "jpaSequence.FlkLevelChecks",
            sequenceName = "TTS_FORMAT_LOGICAL_CONTROL.SEQUENCE_FLK_LVL_CHECKS",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "jpaSequence.FlkLevelChecks")
    @Id
    private Long id;

    /**
     * Имя ошибки
     */
    @Column(name = "CODE_LVL")
    @Size(message = "ID_MAIN{FlkLevelChecks.size}", max = 3)
    private String codeLevel;

    /**
     * Описание ошибки
     */
    @Size(message = "DESCRIPTION{FlkLevelChecks.size}", max = 255)
    private String description;

    public FlkLevelChecks() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeLevel() {
        return codeLevel;
    }

    public void setCodeLevel(String codeLevel) {
        this.codeLevel = codeLevel;
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
        FlkLevelChecks that = (FlkLevelChecks) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(codeLevel, that.codeLevel) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codeLevel, description);
    }

    @Override
    public String toString() {
        return "FlkLevelChecks{" +
                "id=" + id +
                ", codeLevel='" + codeLevel + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
