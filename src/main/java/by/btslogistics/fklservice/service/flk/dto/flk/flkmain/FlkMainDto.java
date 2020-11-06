package by.btslogistics.fklservice.service.flk.dto.flk.flkmain;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

public class FlkMainDto {

    @Id
    private String id;

    /**
     * Идентификатор декларации, которая проверяется на ФЛК
     */
    private String idDeclaration;

    /**
     * Дата и время проведения ФЛК
     */
    private LocalDateTime dateFlk;

    /**
     * идентификатор вида контроля (вторичный ключ на таблицу FLK_TYPE_CONTROL)
     */
    private Integer idTypeControl;

    /**
     * Кол-во ошибок(1)
     */
    private Integer countErOne;

    /**
     * Кол-во предупреждений(2)
     */
    private Integer countErSecond;

    /**
     * Кол-во информирований(3)
     */
    private Integer countErThird;


    public FlkMainDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdDeclaration() {
        return idDeclaration;
    }

    public void setIdDeclaration(String idDeclaration) {
        this.idDeclaration = idDeclaration;
    }

    public LocalDateTime getDateFlk() {
        return dateFlk;
    }

    public void setDateFlk(LocalDateTime dateFlk) {
        this.dateFlk = dateFlk;
    }

    public Integer getIdTypeControl() {
        return idTypeControl;
    }

    public void setIdTypeControl(Integer idTypeControl) {
        this.idTypeControl = idTypeControl;
    }

    public Integer getCountErOne() {
        return countErOne;
    }

    public void setCountErOne(Integer countErOne) {
        this.countErOne = countErOne;
    }

    public Integer getCountErSecond() {
        return countErSecond;
    }

    public void setCountErSecond(Integer countErSecond) {
        this.countErSecond = countErSecond;
    }

    public Integer getCountErThird() {
        return countErThird;
    }

    public void setCountErThird(Integer countErThird) {
        this.countErThird = countErThird;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkMainDto that = (FlkMainDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idDeclaration, that.idDeclaration) &&
                Objects.equals(dateFlk, that.dateFlk) &&
                Objects.equals(idTypeControl, that.idTypeControl) &&
                Objects.equals(countErOne, that.countErOne) &&
                Objects.equals(countErSecond, that.countErSecond) &&
                Objects.equals(countErThird, that.countErThird);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idDeclaration, dateFlk, idTypeControl, countErOne, countErSecond, countErThird);
    }

    @Override
    public String toString() {
        return "FlkMainDto{" +
                "id='" + id + '\'' +
                ", idDeclaration='" + idDeclaration + '\'' +
                ", dateFlk=" + dateFlk +
                ", idTypeControl=" + idTypeControl +
                ", countErOne=" + countErOne +
                ", countErSecond=" + countErSecond +
                ", countErThird=" + countErThird +
                '}';
    }
}
