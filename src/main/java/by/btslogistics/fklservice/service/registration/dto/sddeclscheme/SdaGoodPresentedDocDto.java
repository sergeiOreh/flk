package by.btslogistics.fklservice.service.registration.dto.sddeclscheme;

import java.time.LocalDateTime;
import java.util.Objects;

public class SdaGoodPresentedDocDto {

    private String id;

    /**
     * Partition, Год (4 цифры) сформированные на основе поля DATE_REG
     */
    private Integer yearReg;

    /**
     * Partition, Код таможенного органа
     */
    private String custom;

    /**
     * Код вида документа в соответствии с Классификатором видов документов, используемых при таможенном декларировании.
     * Поле 22.
     */
    private String g22PresentedDocumentModeCode;

    /**
     * Наименование документа
     */
    private String g22PrDocumentName;

    /**
     * Номер документа
     */
    private String g22PrDocumentNumber;

    /**
     * Дата документа
     */
    private LocalDateTime g22PrDocumentDate;

    private SdaGoodDto sdaGood;

    /**
     * Номер редакции записи
     */
    private long nRed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public SdaGoodDto getSdaGood() {
        return sdaGood;
    }

    public void setSdaGood(SdaGoodDto sdaGood) {
        this.sdaGood = sdaGood;
    }

    public long getnRed() {
        return nRed;
    }

    public void setnRed(long nRed) {
        this.nRed = nRed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SdaGoodPresentedDocDto that = (SdaGoodPresentedDocDto) o;
        return nRed == that.nRed &&
                Objects.equals(id, that.id) &&
                Objects.equals(yearReg, that.yearReg) &&
                Objects.equals(custom, that.custom) &&
                Objects.equals(g22PresentedDocumentModeCode, that.g22PresentedDocumentModeCode) &&
                Objects.equals(g22PrDocumentName, that.g22PrDocumentName) &&
                Objects.equals(g22PrDocumentNumber, that.g22PrDocumentNumber) &&
                Objects.equals(g22PrDocumentDate, that.g22PrDocumentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yearReg, custom, g22PresentedDocumentModeCode, g22PrDocumentName, g22PrDocumentNumber, g22PrDocumentDate, nRed);
    }

    @Override
    public String toString() {
        return "SdGoodPresentedDocDto{" +
                "id='" + id + '\'' +
                ", yearReg='" + yearReg + '\'' +
                ", custom='" + custom + '\'' +
                ", g22PresentedDocumentModeCode='" + g22PresentedDocumentModeCode + '\'' +
                ", g22PrDocumentName='" + g22PrDocumentName + '\'' +
                ", g22PrDocumentNumber='" + g22PrDocumentNumber + '\'' +
                ", g22PrDocumentDate=" + g22PrDocumentDate +
                ", nRed=" + nRed +
                '}';
    }
}
