package by.btslogistics.fklservice.dao.model.sddeclscheme;

import by.btslogistics.fklservice.dao.model.IdMainForEntities;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "SDA_GOODS_PRESENTED_DOCS", schema = "TTS_DCLR_STATISTIC")
public class SdaGoodPresentedDoc extends IdMainForEntities {

    /**
     * Partition, Год (4 цифры) сформированные на основе поля DATE_REG
     */
    @Column(name = "YEARREG", nullable = false)
    private Integer yearReg;

    /**
     * Partition, Код таможенного органа
     */
    @Column(name = "CUSTOM", nullable = false)
    @Size(message = "CUSTOM{SdaGoodPresentedDoc.size}", max = 2)
    private String custom;

    /**
     * Код вида документа в соответствии с Классификатором видов документов, используемых при таможенном декларировании.
     * Поле 22.
     */
    @Column(name = "G22_PRESENTEDDOCUMENTMODECODE")
    @Size(message = "G22_PRESENTEDDOCUMENTMODECODE{SdaGoodPresentedDoc.size}", max = 5)
    private String g22PresentedDocumentModeCode;

    /**
     * Наименование документа
     */
    @Column(name = "G22_PRDOCUMENTNAME")
    @Size(message = "G22_PRDOCUMENTNAME{SdaGoodPresentedDoc.size}", max = 250)
    private String g22PrDocumentName;

    /**
     * Номер документа
     */
    @Column(name = "G22_PRDOCUMENTNUMBER")
    @Size(message = "G22_PRDOCUMENTNUMBER{SdaGoodPresentedDoc.size}", max = 50)
    private String g22PrDocumentNumber;

    /**
     * Дата документа
     */
    @Column(name = "G22_PRDOCUMENTDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime g22PrDocumentDate;

    /**
     * Внешний ключ на таблицу SD_GOODS.
     */
    @ManyToOne
    @JoinColumn(name = "TO_GOODS_ID", referencedColumnName = "ID")
    private SdaGood sdaGood;

    /**
     * Номер редакции записи
     */
    @Column(name = "N_RED")
    private long nRed;

    public Integer getYearReg() {
        return yearReg;
    }

    public void setYearReg(Integer yearReg) {
        this.yearReg = yearReg;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getG22PresentedDocumentModeCode() {
        return g22PresentedDocumentModeCode;
    }

    public void setG22PresentedDocumentModeCode(String g22PresentedDocumentModeCode) {
        this.g22PresentedDocumentModeCode = g22PresentedDocumentModeCode;
    }

    public String getG22PrDocumentName() {
        return g22PrDocumentName;
    }

    public void setG22PrDocumentName(String g22PrDocumentName) {
        this.g22PrDocumentName = g22PrDocumentName;
    }

    public String getG22PrDocumentNumber() {
        return g22PrDocumentNumber;
    }

    public void setG22PrDocumentNumber(String g22PrDocumentNumber) {
        this.g22PrDocumentNumber = g22PrDocumentNumber;
    }

    public LocalDateTime getG22PrDocumentDate() {
        return g22PrDocumentDate;
    }

    public void setG22PrDocumentDate(LocalDateTime g22PrDocumentDate) {
        this.g22PrDocumentDate = g22PrDocumentDate;
    }

    public SdaGood getSdaGood() {
        return sdaGood;
    }

    public void setSdaGood(SdaGood sdaGood) {
        this.sdaGood = sdaGood;
    }

    public long getnRed() {
        return nRed;
    }

    public void setnRed(long nRed) {
        this.nRed = nRed;
    }

    public SdaGoodPresentedDoc() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SdaGoodPresentedDoc that = (SdaGoodPresentedDoc) o;
        return nRed == that.nRed &&
                Objects.equals(yearReg, that.yearReg) &&
                Objects.equals(custom, that.custom) &&
                Objects.equals(g22PresentedDocumentModeCode, that.g22PresentedDocumentModeCode) &&
                Objects.equals(g22PrDocumentName, that.g22PrDocumentName) &&
                Objects.equals(g22PrDocumentNumber, that.g22PrDocumentNumber) &&
                Objects.equals(g22PrDocumentDate, that.g22PrDocumentDate) &&
                Objects.equals(sdaGood, that.sdaGood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearReg, custom, g22PresentedDocumentModeCode, g22PrDocumentName, g22PrDocumentNumber, g22PrDocumentDate, sdaGood, nRed);
    }

    @Override
    public String toString() {
        return "SdGoodPresentedDoc{" +
                ", yearReg='" + yearReg + '\'' +
                ", custom='" + custom + '\'' +
                ", g22PresentedDocumentModeCode='" + g22PresentedDocumentModeCode + '\'' +
                ", g22PrDocumentName='" + g22PrDocumentName + '\'' +
                ", g22PrDocumentNumber='" + g22PrDocumentNumber + '\'' +
                ", g22PrDocumentDate=" + g22PrDocumentDate +
                ", sdGood=" + sdaGood +
                ", nRed=" + nRed +
                '}';
    }
}
