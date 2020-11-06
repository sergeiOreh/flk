package by.btslogistics.fklservice.dao.model.flk.model.flkmain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * первичные ключи для данной таблицы формируются из Oracle (ипспользуется
 * stored function)
 */
@Entity
@Table(name = "FLK_MAIN", schema = "TTS_FORMAT_LOGICAL_CONTROL")
public class FlkMain {

    @Id
    private String id;

    /**
     * Идентификатор декларации, которая проверяется на ФЛК
     */
    @Column(name = "ID_DECLARATION")
    @Size(message = "ID_DECLARATION{FlkMain.size}", max = 32)
    private String idDeclaration;

    /**
     * Дата и время проведения ФЛК
     */
    @Column(name = "DATE_FLK")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime dateFlk;

    /**
     * идентификатор вида контроля (вторичный ключ на таблицу FLK_TYPE_CONTROL)
     */
    @Column(name = "ID_TYPE_CONTROL")
    private Integer idTypeControl;

    /**
     * Кол-во ошибок(1)
     */
    @Column(name = "COUNT_ER1")
     private Integer countErOne;

    /**
     * Кол-во предупреждений(2)
     */
    @Column(name = "COUNT_ER2")
    private Integer countErSecond;

    /**
     * Кол-во информирований(3)
     */
    @Column(name = "COUNT_ER3")
    private Integer countErThird;

    public FlkMain() {
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
        FlkMain flkMain = (FlkMain) o;
        return Objects.equals(id, flkMain.id) &&
                Objects.equals(idDeclaration, flkMain.idDeclaration) &&
                Objects.equals(dateFlk, flkMain.dateFlk) &&
                Objects.equals(idTypeControl, flkMain.idTypeControl) &&
                Objects.equals(countErOne, flkMain.countErOne) &&
                Objects.equals(countErSecond, flkMain.countErSecond) &&
                Objects.equals(countErThird, flkMain.countErThird);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idDeclaration, dateFlk, idTypeControl, countErOne, countErSecond, countErThird);
    }

    @Override
    public String toString() {
        return "FlkMain{" +
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
