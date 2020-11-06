package by.btslogistics.fklservice.service.flk.dto.flk.flklog;

import java.util.Objects;

public class FlkLogDto {

    private String id;

    /**
     * Ссылка на таблицу FLK_MAIN
     */
    private String idMain;

    /**
     * Сссылка на таблице FLK_СHECKS
     */
    private Long idChecks;

    public FlkLogDto() {
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
        FlkLogDto flkLogDto = (FlkLogDto) o;
        return Objects.equals(id, flkLogDto.id) &&
                Objects.equals(idMain, flkLogDto.idMain) &&
                Objects.equals(idChecks, flkLogDto.idChecks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idMain, idChecks);
    }

    @Override
    public String toString() {
        return "FlkLogDto{" +
                "id='" + id + '\'' +
                ", idMain='" + idMain + '\'' +
                ", idChecks=" + idChecks +
                '}';
    }
}
