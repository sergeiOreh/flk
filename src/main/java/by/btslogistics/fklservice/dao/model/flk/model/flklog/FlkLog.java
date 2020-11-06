package by.btslogistics.fklservice.dao.model.flk.model.flklog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Таблица, которая содержит результаты проведения валидации полей в БД
 */

@Entity
@Table(name = "FLK_LOG", schema = "TTS_FORMAT_LOGICAL_CONTROL")
public class FlkLog {

    @Id
    private String id;

    /**
     * Ссылка на таблицу FLK_MAIN
     */
    @Column(name = "ID_MAIN")
    @Size(message = "ID_MAIN{FlkLog.size}", max = 32)
    private String idMain;

    /**
     * Сссылка на таблице FLK_СHECKS
     */
    @Column(name = "ID_CHECKS")
    private Long idChecks;

    public FlkLog() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMain() {
        return idMain;
    }

    public void setIdMain(String idMain) {
        this.idMain = idMain;
    }

    public Long getIdChecks() {
        return idChecks;
    }

    public void setIdChecks(Long idChecks) {
        this.idChecks = idChecks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkLog flkLog = (FlkLog) o;
        return Objects.equals(id, flkLog.id) &&
                Objects.equals(idMain, flkLog.idMain) &&
                Objects.equals(idChecks, flkLog.idChecks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idMain, idChecks);
    }

    @Override
    public String toString() {
        return "FlkLog{" +
                "id='" + id + '\'' +
                ", idMain='" + idMain + '\'' +
                ", idChecks=" + idChecks +
                '}';
    }
}
