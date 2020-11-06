package by.btslogistics.fklservice.service.flk.dto.flk.flkresult;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlkResultDto {

    private String id;

    private String nameError;

    private Integer goodsNumeric;

    private String numberGrafa;

    private String nameGrafa;

    private String namePole;

    private String codeCheck;

    private String descriptionError;

    private LocalDateTime dateFlk;

    private Integer countEr1;

    private Integer countEr2;

    private Integer countEr3;

    public FlkResultDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameError() {
        return nameError;
    }

    public void setNameError(String nameError) {
        this.nameError = nameError;
    }

    public Integer getGoodsNumeric() {
        return goodsNumeric;
    }

    public void setGoodsNumeric(Integer goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
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

    public String getCodeCheck() {
        return codeCheck;
    }

    public void setCodeCheck(String codeCheck) {
        this.codeCheck = codeCheck;
    }

    public String getDescriptionError() {
        return descriptionError;
    }

    public void setDescriptionError(String descriptionError) {
        this.descriptionError = descriptionError;
    }

    public LocalDateTime getDateFlk() {
        return dateFlk;
    }

    public void setDateFlk(LocalDateTime dateFlk) {
        this.dateFlk = dateFlk;
    }

    public Integer getCountEr1() {
        return countEr1;
    }

    public void setCountEr1(Integer countEr1) {
        this.countEr1 = countEr1;
    }

    public Integer getCountEr2() {
        return countEr2;
    }

    public void setCountEr2(Integer countEr2) {
        this.countEr2 = countEr2;
    }

    public Integer getCountEr3() {
        return countEr3;
    }

    public void setCountEr3(Integer countEr3) {
        this.countEr3 = countEr3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkResultDto that = (FlkResultDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameError, that.nameError) &&
                Objects.equals(goodsNumeric, that.goodsNumeric) &&
                Objects.equals(numberGrafa, that.numberGrafa) &&
                Objects.equals(nameGrafa, that.nameGrafa) &&
                Objects.equals(namePole, that.namePole) &&
                Objects.equals(codeCheck, that.codeCheck) &&
                Objects.equals(descriptionError, that.descriptionError) &&
                Objects.equals(dateFlk, that.dateFlk) &&
                Objects.equals(countEr1, that.countEr1) &&
                Objects.equals(countEr2, that.countEr2) &&
                Objects.equals(countEr3, that.countEr3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameError, goodsNumeric, numberGrafa, nameGrafa, namePole, codeCheck, descriptionError, dateFlk, countEr1, countEr2, countEr3);
    }

    @Override
    public String toString() {
        return "FlkResultDto{" +
                "id='" + id + '\'' +
                ", nameError='" + nameError + '\'' +
                ", goodsNumeric=" + goodsNumeric +
                ", numberGrafa='" + numberGrafa + '\'' +
                ", nameGrafa='" + nameGrafa + '\'' +
                ", namePole='" + namePole + '\'' +
                ", codeCheck='" + codeCheck + '\'' +
                ", descriptionError='" + descriptionError + '\'' +
                ", dateFlk=" + dateFlk +
                ", countEr1=" + countEr1 +
                ", countEr2=" + countEr2 +
                ", countEr3=" + countEr3 +
                '}';
    }
}
