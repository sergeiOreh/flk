package by.btslogistics.fklservice.service.flk.dto.flk.flklevelchecks;


import java.util.Objects;

public class FlkLevelChecksDto {


     private Long id;

    /**
     * Имя ошибки
     */
    private String codeLevel;

    /**
     * Описание ошибки
     */
    private String description;

    public FlkLevelChecksDto() {
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
        FlkLevelChecksDto that = (FlkLevelChecksDto) o;
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
        return "FlkLevelChecksDto{" +
                "id=" + id +
                ", codeLevel='" + codeLevel + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
