package by.btslogistics.fklservice.dao.model.sddeclscheme;

import by.btslogistics.fklservice.dao.model.IdMainForEntities;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "SDA_GOODS" , schema = "TTS_DCLR_STATISTIC")
public class SdaGood extends IdMainForEntities {

    /**
     * Год 4 знака (по значению поля DATE_RCV).
     * Формируется из системной даты
     */
    @Column(name = "YEARREG", nullable = false)
    private Integer yearReg;

    /**
     * Код таможенного органа.
     */
    @Column(name = "CUSTOM", nullable = false)
    @Size(message = "CUSTOM{SdaGood.size}", max = 2)
    private String custom;

    /**
     * Формы. Порядковый номер листа. Поле 3.1.
     */
    @Column(name = "G3_ADDITIONALSHEETCOUNT")
    private Long g3AdditionalSheetCount;

    /**
     * Товар. Порядковый номер товара. Поле 15.
     */
    @Column(name = "G15_GOODSNUMERIC")
    private Long g15GoodsNumeric;

    /**
     * Код товара. Код товара по ТН ВЭД ТС. Поле 16.
     */
    @Column(name = "G16_GOODSTNVEDCODE")
    @Size(message = "G16_GOODSTNVEDCODE{SdaGood.size}", max = 10)
    private String g16GoodsTnvedCode;

    /**
     * Описание товаров. Количество акцизных марок. Поле 9.
     */
    @Column(name = "G9_EXCISEQUANTITY")
    private Long g9ExciseQuantity;

    /**
     * Описание товаров. Отгрузка / поступление. Поле 9.1.
     */
    @Column(name = "G9_LIABILITYDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime g9LiabilityDate;

    /**
     * Описание товара.
     */
    @Column(name = "G9_GOODSDESCRIPTION")
    @Size(message = "G9_GOODSDESCRIPTION{SdaGood.size}", max = 1004)
    private String g9GoodsDescription;

    /**
     * Вес нетто (кг). Поле 18.
     */
    @Column(name = "G18_NETWEIGHTQUANTITY")
    private BigDecimal g18NetWeightQuantity;

    /**
     * Вес нетто (кг) без упаковки. Поле 18.
     */
    @Column(name = "G18_NETWEIGHTQUANTITY2")
    private BigDecimal g18NetWeightQuantity2;

    /**
     * Вес брутто (кг). Поле 19.
     */
    @Column(name = "G19_GROSSWEIGHTQUANTITY")
    private BigDecimal g19GrossWeightQuantity;

    /**
     * Стоимость товара. Буквенный код валюты платежа (оценки) в соответствии с Классификатором валют. Поле 21.1.
     */
    @Column(name = "G21_CURRENCYCODE")
    @Size(message = "G21_CURRENCYCODE{SdaGood.size}", max = 3)
    private String g21CurrencyCode;

    /**
     * Стоимость товара. Стоимость товара в валюте платежа (оценки). Поле 21.2.
     */
    @Column(name = "G21_INVOICEDCOST")
    private BigDecimal g21InvoicedCost;

    /**
     * Цифровой код основания для внесения изменений или аннулирования в соответствии с Классификатором оснований для внесения изменений или классификатором оснований для аннулирования. Поле 13.
     */
    @Column(name = "G13_WARECORRECTIONREASONCODE")
    @Size(message = "G13_WARECORRECTIONREASONCODE{SdGood.size}", max = 2)
    private String g13WareCorrectionReasonCode;

    /**
     * Количество товара в единице измерения
     */
    @Column(name = "G20_GOODSQUANTITY")
    private BigDecimal g20GoodsQuantity;

    /**
     * Условное обозначение единицы измерения
     */
    @Column(name = "G20_MEASUREUNITQUALIFIERNAME")
    @Size(message = "G20_MEASUREUNITQUALIFIERNAME{SdaGood.size}", max = 13)
    private String g20MeasureUnitQualifierName;

    /**
     * Код единицы измерения в соответствии единицами измерения, применяемым в ТНВЭД ТС
     */
    @Column(name = "G20_MEASUREUNITQUALIFIERCODE")
    @Size(message = "G20_MEASUREUNITQUALIFIERCODE{SdaGood.size}", max = 3)
    private String g20MeasureUnitQualifierCode;

    /**
     * Буквенный код страны отправления в соответствии с Классификатором стран мира. Поле 10а.1.
     */
    @Column(name = "G10_DISPATCHCOUNTRYCODE")
    @Size(message = "G10_DISPATCHCOUNTRYCODE{SdaGood.size}", max = 2)
    private String g10DispatchCountryCode;

    /**
     * Краткое название страны отправления в соответствии с Классификатором стран мира. Поле 10.
     */
    @Column(name = "G10_DISPATCHCOUNTRYNAME")
    @Size(message = "G10_DISPATCHCOUNTRYNAME{SdaGood.size}", max = 40)
    private String g10DispatchCountryName;

    /**
     * Код административно-территориального деления страны отправления в соответствии с Классификатором административно-территориального деления или «000». Поле 10а.2.
     */
    @Column(name = "G10_RBDISPATCHCOUNTRYCODE")
    @Size(message = "G10_RBDISPATCHCOUNTRYCODE{SdaGood.size}", max = 3)
    private String g10RbDispatchCountryCode;

    /**
     * Краткое название страны отправления в соответствии с Классификатором стран мира. Поле 10.
     */
    @Column(name = "G11_ORIGINCOUNTRYCODE")
    @Size(message = "G11_ORIGINCOUNTRYCODE{SdaGood.size}", max = 2)
    private String g11OriginCountryCode;

    /**
     * Краткое название страны происхождения в соответствии с Классификатором стран мира или «ЕВРОСОЮЗ» или «НЕИЗВЕСТНА». Поле 11.
     */
    @Column(name = "G11_ORIGINCOUNTRYNAME")
    @Size(message = "G11_ORIGINCOUNTRYNAME{SdaGood.size}", max = 40)
    private String g11OriginCountryName;

    /**
     * Буквенный код страны происхождения в соответствии с Классификатором стран мира или «EU» или «00». Поле 12.
     */
    @Column(name = "G12_DESTINATIONCOUNTRYCODE")
    @Size(message = "G12_DESTINATIONCOUNTRYCODE{SdaGood.size}", max = 2)
    private String g12DestinationCountryCode;

    /**
     * Краткое название страны назначения в соответствии с Классификатором стран мира. Поле 17.
     */
    @Column(name = "G12_DESTINATIONCOUNTRYNAME")
    @Size(message = "G12_DESTINATIONCOUNTRYNAME{SdaGood.size}", max = 40)
    private String g12DestinationCountryName;

    /**
     * Код административно-территориального деления страны назначения в соответствии с Классификатором административно-территориального деления или «000». Поле 17а.2.
     */
    @Column(name = "G12_RBDESTINATIONCOUNTRYCODE")
    @Size(message = "G12_RBDESTINATIONCOUNTRYCODE{SdaGood.size}", max = 3)
    private String g12RbDestinationCountryCode;

    /**
     * Внешний ключ на таблицу SDA_MAIN.
     */
    @ManyToOne
    @JoinColumn(name = "TO_SD_ID", referencedColumnName = "ID")
    private SdaMain sdaMain;

    /**
     * Номер редакции записи.
     */
    @Column(name = "N_RED")
    private Long nRed;

    @OneToMany(mappedBy = "sdaGood", orphanRemoval = true,cascade = CascadeType.ALL)
    private List<SdaGoodPresentedDoc> sdaGoodPresentedDocs;

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

    public Long getG3AdditionalSheetCount() {
        return g3AdditionalSheetCount;
    }

    public void setG3AdditionalSheetCount(Long g3AdditionalSheetCount) {
        this.g3AdditionalSheetCount = g3AdditionalSheetCount;
    }

    public Long getG15GoodsNumeric() {
        return g15GoodsNumeric;
    }

    public void setG15GoodsNumeric(Long g15GoodsNumeric) {
        this.g15GoodsNumeric = g15GoodsNumeric;
    }

    public String getG16GoodsTnvedCode() {
        return g16GoodsTnvedCode;
    }

    public void setG16GoodsTnvedCode(String g16GoodsTnvedCode) {
        this.g16GoodsTnvedCode = g16GoodsTnvedCode;
    }

    public Long getG9ExciseQuantity() {
        return g9ExciseQuantity;
    }

    public void setG9ExciseQuantity(Long g9ExciseQuantity) {
        this.g9ExciseQuantity = g9ExciseQuantity;
    }

    public LocalDateTime getG9LiabilityDate() {
        return g9LiabilityDate;
    }

    public void setG9LiabilityDate(LocalDateTime g9LiabilityDate) {
        this.g9LiabilityDate = g9LiabilityDate;
    }

    public String getG9GoodsDescription() {
        return g9GoodsDescription;
    }

    public void setG9GoodsDescription(String g9GoodsDescription) {
        this.g9GoodsDescription = g9GoodsDescription;
    }

    public BigDecimal getG18NetWeightQuantity() {
        return g18NetWeightQuantity;
    }

    public void setG18NetWeightQuantity(BigDecimal g18NetWeightQuantity) {
        this.g18NetWeightQuantity = g18NetWeightQuantity;
    }

    public BigDecimal getG18NetWeightQuantity2() {
        return g18NetWeightQuantity2;
    }

    public void setG18NetWeightQuantity2(BigDecimal g18NetWeightQuantity2) {
        this.g18NetWeightQuantity2 = g18NetWeightQuantity2;
    }

    public BigDecimal getG19GrossWeightQuantity() {
        return g19GrossWeightQuantity;
    }

    public void setG19GrossWeightQuantity(BigDecimal g19GrossWeightQuantity) {
        this.g19GrossWeightQuantity = g19GrossWeightQuantity;
    }

    public String getG21CurrencyCode() {
        return g21CurrencyCode;
    }

    public void setG21CurrencyCode(String g21CurrencyCode) {
        this.g21CurrencyCode = g21CurrencyCode;
    }

    public BigDecimal getG21InvoicedCost() {
        return g21InvoicedCost;
    }

    public void setG21InvoicedCost(BigDecimal g21InvoicedCost) {
        this.g21InvoicedCost = g21InvoicedCost;
    }

    public String getG13WareCorrectionReasonCode() {
        return g13WareCorrectionReasonCode;
    }

    public void setG13WareCorrectionReasonCode(String g13WareCorrectionReasonCode) {
        this.g13WareCorrectionReasonCode = g13WareCorrectionReasonCode;
    }

    public BigDecimal getG20GoodsQuantity() {
        return g20GoodsQuantity;
    }

    public void setG20GoodsQuantity(BigDecimal g20GoodsQuantity) {
        this.g20GoodsQuantity = g20GoodsQuantity;
    }

    public String getG20MeasureUnitQualifierName() {
        return g20MeasureUnitQualifierName;
    }

    public void setG20MeasureUnitQualifierName(String g20MeasureUnitQualifierName) {
        this.g20MeasureUnitQualifierName = g20MeasureUnitQualifierName;
    }

    public String getG20MeasureUnitQualifierCode() {
        return g20MeasureUnitQualifierCode;
    }

    public void setG20MeasureUnitQualifierCode(String g20MeasureUnitQualifierCode) {
        this.g20MeasureUnitQualifierCode = g20MeasureUnitQualifierCode;
    }

    public String getG10DispatchCountryCode() {
        return g10DispatchCountryCode;
    }

    public void setG10DispatchCountryCode(String g10DispatchCountryCode) {
        this.g10DispatchCountryCode = g10DispatchCountryCode;
    }

    public String getG10DispatchCountryName() {
        return g10DispatchCountryName;
    }

    public void setG10DispatchCountryName(String g10DispatchCountryName) {
        this.g10DispatchCountryName = g10DispatchCountryName;
    }

    public String getG10RbDispatchCountryCode() {
        return g10RbDispatchCountryCode;
    }

    public void setG10RbDispatchCountryCode(String g10RbDispatchCountryCode) {
        this.g10RbDispatchCountryCode = g10RbDispatchCountryCode;
    }

    public String getG11OriginCountryCode() {
        return g11OriginCountryCode;
    }

    public void setG11OriginCountryCode(String g11OriginCountryCode) {
        this.g11OriginCountryCode = g11OriginCountryCode;
    }

    public String getG11OriginCountryName() {
        return g11OriginCountryName;
    }

    public void setG11OriginCountryName(String g11OriginCountryName) {
        this.g11OriginCountryName = g11OriginCountryName;
    }

    public String getG12DestinationCountryCode() {
        return g12DestinationCountryCode;
    }

    public void setG12DestinationCountryCode(String g12DestinationCountryCode) {
        this.g12DestinationCountryCode = g12DestinationCountryCode;
    }

    public String getG12DestinationCountryName() {
        return g12DestinationCountryName;
    }

    public void setG12DestinationCountryName(String g12DestinationCountryName) {
        this.g12DestinationCountryName = g12DestinationCountryName;
    }

    public String getG12RbDestinationCountryCode() {
        return g12RbDestinationCountryCode;
    }

    public void setG12RbDestinationCountryCode(String g12RbDestinationCountryCode) {
        this.g12RbDestinationCountryCode = g12RbDestinationCountryCode;
    }

    public SdaMain getSdaMain() {
        return sdaMain;
    }

    public void setSdaMain(SdaMain sdaMain) {
        this.sdaMain = sdaMain;
    }

    public Long getnRed() {
        return nRed;
    }

    public void setnRed(Long nRed) {
        this.nRed = nRed;
    }

    public List<SdaGoodPresentedDoc> getSdaGoodPresentedDocs() {
        return sdaGoodPresentedDocs;
    }

    public void setSdaGoodPresentedDocs(List<SdaGoodPresentedDoc> sdaGoodPresentedDocs) {
        this.sdaGoodPresentedDocs = sdaGoodPresentedDocs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SdaGood sdaGood = (SdaGood) o;
        return Objects.equals(yearReg, sdaGood.yearReg) &&
                Objects.equals(custom, sdaGood.custom) &&
                Objects.equals(g3AdditionalSheetCount, sdaGood.g3AdditionalSheetCount) &&
                Objects.equals(g15GoodsNumeric, sdaGood.g15GoodsNumeric) &&
                Objects.equals(g16GoodsTnvedCode, sdaGood.g16GoodsTnvedCode) &&
                Objects.equals(g9ExciseQuantity, sdaGood.g9ExciseQuantity) &&
                Objects.equals(g9LiabilityDate, sdaGood.g9LiabilityDate) &&
                Objects.equals(g9GoodsDescription, sdaGood.g9GoodsDescription) &&
                Objects.equals(g18NetWeightQuantity, sdaGood.g18NetWeightQuantity) &&
                Objects.equals(g18NetWeightQuantity2, sdaGood.g18NetWeightQuantity2) &&
                Objects.equals(g19GrossWeightQuantity, sdaGood.g19GrossWeightQuantity) &&
                Objects.equals(g21CurrencyCode, sdaGood.g21CurrencyCode) &&
                Objects.equals(g21InvoicedCost, sdaGood.g21InvoicedCost) &&
                Objects.equals(g13WareCorrectionReasonCode, sdaGood.g13WareCorrectionReasonCode) &&
                Objects.equals(g20GoodsQuantity, sdaGood.g20GoodsQuantity) &&
                Objects.equals(g20MeasureUnitQualifierName, sdaGood.g20MeasureUnitQualifierName) &&
                Objects.equals(g20MeasureUnitQualifierCode, sdaGood.g20MeasureUnitQualifierCode) &&
                Objects.equals(g10DispatchCountryCode, sdaGood.g10DispatchCountryCode) &&
                Objects.equals(g10DispatchCountryName, sdaGood.g10DispatchCountryName) &&
                Objects.equals(g10RbDispatchCountryCode, sdaGood.g10RbDispatchCountryCode) &&
                Objects.equals(g11OriginCountryCode, sdaGood.g11OriginCountryCode) &&
                Objects.equals(g11OriginCountryName, sdaGood.g11OriginCountryName) &&
                Objects.equals(g12DestinationCountryCode, sdaGood.g12DestinationCountryCode) &&
                Objects.equals(g12DestinationCountryName, sdaGood.g12DestinationCountryName) &&
                Objects.equals(g12RbDestinationCountryCode, sdaGood.g12RbDestinationCountryCode) &&
                Objects.equals(sdaMain, sdaGood.sdaMain) &&
                Objects.equals(nRed, sdaGood.nRed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearReg, custom, g3AdditionalSheetCount, g15GoodsNumeric, g16GoodsTnvedCode, g9ExciseQuantity, g9LiabilityDate, g9GoodsDescription, g18NetWeightQuantity, g18NetWeightQuantity2, g19GrossWeightQuantity, g21CurrencyCode, g21InvoicedCost, g13WareCorrectionReasonCode, g20GoodsQuantity, g20MeasureUnitQualifierName, g20MeasureUnitQualifierCode, g10DispatchCountryCode, g10DispatchCountryName, g10RbDispatchCountryCode, g11OriginCountryCode, g11OriginCountryName, g12DestinationCountryCode, g12DestinationCountryName, g12RbDestinationCountryCode, sdaMain, nRed);
    }

    @Override
    public String toString() {
        return "SdGood{" +
                "yearReg='" + yearReg + '\'' +
                ", custom='" + custom + '\'' +
                ", g3AdditionalSheetCount=" + g3AdditionalSheetCount +
                ", g15GoodsNumeric=" + g15GoodsNumeric +
                ", g16GoodsTnvedCode='" + g16GoodsTnvedCode + '\'' +
                ", g9ExciseQuantity=" + g9ExciseQuantity +
                ", g9LiabilityDate=" + g9LiabilityDate +
                ", g9GoodsDescription='" + g9GoodsDescription + '\'' +
                ", g18NetWeightQuantity=" + g18NetWeightQuantity +
                ", g18NetWeightQuantity2=" + g18NetWeightQuantity2 +
                ", g19GrossWeightQuantity=" + g19GrossWeightQuantity +
                ", g21CurrencyCode='" + g21CurrencyCode + '\'' +
                ", g21InvoicedCost=" + g21InvoicedCost +
                ", g13WareCorrectionReasonCode='" + g13WareCorrectionReasonCode + '\'' +
                ", g20GoodsQuantity=" + g20GoodsQuantity +
                ", g20MeasureUnitQualifierName='" + g20MeasureUnitQualifierName + '\'' +
                ", g20MeasureUnitQualifierCode='" + g20MeasureUnitQualifierCode + '\'' +
                ", g10DispatchCountryCode='" + g10DispatchCountryCode + '\'' +
                ", g10DispatchCountryName='" + g10DispatchCountryName + '\'' +
                ", g10RbDispatchCountryCode='" + g10RbDispatchCountryCode + '\'' +
                ", g11OriginCountryCode='" + g11OriginCountryCode + '\'' +
                ", g11OriginCountryName='" + g11OriginCountryName + '\'' +
                ", g12DestinationCountryCode='" + g12DestinationCountryCode + '\'' +
                ", g12DestinationCountryName='" + g12DestinationCountryName + '\'' +
                ", g12RbDestinationCountryCode='" + g12RbDestinationCountryCode + '\'' +
                ", sdaMain=" + sdaMain +
                ", nRed=" + nRed +
                '}';
    }
}
