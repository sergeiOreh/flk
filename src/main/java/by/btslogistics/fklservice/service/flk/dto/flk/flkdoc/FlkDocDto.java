package by.btslogistics.fklservice.service.flk.dto.flk.flkdoc;

import java.util.Objects;

public class FlkDocDto {

    private Long id;

    /**
     * Ссылка на тип(вид) контроля - внутренний список кодов таможеных документов
     */
  //  private Integer idTypeControl;

    /**
     * Код вида документа
     */
    private String abbreviation;


    /**
     * Наименование вида документа
     */
    private String description;

    public FlkDocDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


/*    public Integer getIdTypeControl() {
        return idTypeControl;
    }

    public void setIdTypeControl(Integer idTypeControl) {
        this.idTypeControl = idTypeControl;
    }*/

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
        FlkDocDto flkDocDto = (FlkDocDto) o;
        return Objects.equals(id, flkDocDto.id) &&
                Objects.equals(abbreviation, flkDocDto.abbreviation) &&
                Objects.equals(description, flkDocDto.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, abbreviation, description);
    }

    @Override
    public String toString() {
        return "FlkDocDto{" +
                "id=" + id +
                ", abbreviation='" + abbreviation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
