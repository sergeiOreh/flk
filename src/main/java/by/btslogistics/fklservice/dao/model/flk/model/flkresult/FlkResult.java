package by.btslogistics.fklservice.dao.model.flk.model.flkresult;

import by.btslogistics.fklservice.dao.model.flk.constants.FlkNamesProcAndPkg;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = FlkNamesProcAndPkg.GET_LIST_ERRORS_FOR_SERVICE,
                procedureName = FlkNamesProcAndPkg.VALIDATE_SD_START_VALIDATE,
                resultClasses = FlkResult.class

        ),
        @NamedStoredProcedureQuery(
                name = FlkNamesProcAndPkg.GET_LIST_ERRORS_FOR_UI,
                procedureName = FlkNamesProcAndPkg.VALIDATE_SD_ERRORS_FLK_LOG_FOR_UI,
                resultClasses = FlkResult.class

        )
})
public class FlkResult {

    @Id
    private String id;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "NAME_ERROR")
    private String nameError;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "GOODSNUMERIC")
    private Integer goodsNumeric;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "NUMBER_GRAFA")
    private String numberGrafa;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "NAME_GRAFA")
    private String nameGrafa;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "NAME_POLE")
    private String namePole;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "CODE_CHECK")
    private String codeCheck;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "DESCRIPTION_ERROR")
    private String descriptionError;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "DATE_FLK")
    private LocalDateTime dateFlk;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "COUNT_ER1")
    private Integer countEr1;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "COUNT_ER2")
    private Integer countEr2;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "COUNT_ER3")
    private Integer countEr3;

    public FlkResult() {
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
        FlkResult flkResult = (FlkResult) o;
        return Objects.equals(id, flkResult.id) &&
                Objects.equals(nameError, flkResult.nameError) &&
                Objects.equals(goodsNumeric, flkResult.goodsNumeric) &&
                Objects.equals(numberGrafa, flkResult.numberGrafa) &&
                Objects.equals(nameGrafa, flkResult.nameGrafa) &&
                Objects.equals(namePole, flkResult.namePole) &&
                Objects.equals(codeCheck, flkResult.codeCheck) &&
                Objects.equals(descriptionError, flkResult.descriptionError) &&
                Objects.equals(dateFlk, flkResult.dateFlk) &&
                Objects.equals(countEr1, flkResult.countEr1) &&
                Objects.equals(countEr2, flkResult.countEr2) &&
                Objects.equals(countEr3, flkResult.countEr3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameError, goodsNumeric, numberGrafa, nameGrafa, namePole, codeCheck, descriptionError, dateFlk, countEr1, countEr2, countEr3);
    }

    @Override
    public String toString() {
        return "FlkResult{" +
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
