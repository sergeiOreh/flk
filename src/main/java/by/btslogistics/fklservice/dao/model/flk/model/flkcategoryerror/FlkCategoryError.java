package by.btslogistics.fklservice.dao.model.flk.model.flkcategoryerror;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * FLK_CATEGORY_ERROR - Внутренний справочник ошибокюю
 * К этой таблицы, будут обращаться из других таблиц, где есть ссылки,
 * чтобы сделать расшифровку ошибок.
 */
@Table(name = "FLK_CATEGORY_ERROR", schema = "TTS_FORMAT_LOGICAL_CONTROL")
@Entity
public class FlkCategoryError {

    @SequenceGenerator(name = "jpaSequence.FlkCategoryError",
            sequenceName = "TTS_FORMAT_LOGICAL_CONTROL.SEQUENCE_FLK_CATEGORY_ERROR",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jpaSequence.FlkCategoryError")
    @Id
    private Long id;

    /**
     * Код ошибки
     */
    @Column(name = "CODE_ERROR")
    @Size(message = "CODE_ERROR{FlkCategoryError.size}", max = 3)
    private String codeError;


    /**
     * Имя ошибки
     */
    @Size(message = "NAME_ERROR{FlkCategoryError.size}", max = 20)
    @Column(name = "NAME_ERROR")
    private String nameError;

    /**
     * Описание ошибки
     */
    @Size(message = "DESCRIPTION{FlkCategoryError.size}", max = 300)
    private String description;

    public FlkCategoryError() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeError() {
        return codeError;
    }

    public void setCodeError(String codeError) {
        this.codeError = codeError;
    }

    public String getNameError() {
        return nameError;
    }

    public void setNameError(String nameError) {
        this.nameError = nameError;
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
        FlkCategoryError that = (FlkCategoryError) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(codeError, that.codeError) &&
                Objects.equals(nameError, that.nameError) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codeError, nameError, description);
    }

    @Override
    public String toString() {
        return "FlkCategoryError{" +
                "id=" + id +
                ", codeError='" + codeError + '\'' +
                ", nameError='" + nameError + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
