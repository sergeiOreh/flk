package by.btslogistics.fklservice.service.flk.dto.flk.flkcategoryerror;

import java.util.Objects;

public class FlkCategoryErrorDto {

    private Long id;

    /** Код ошибки */
    private String codeError;


    /** Имя ошибки*/
    private String nameError;

    /** Описание ошибки  */
    private String description;

    public FlkCategoryErrorDto() {
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
        FlkCategoryErrorDto that = (FlkCategoryErrorDto) o;
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
        return "FlkTypeControlDto{" +
                "id=" + id +
                ", codeError='" + codeError + '\'' +
                ", nameError='" + nameError + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
