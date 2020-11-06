package by.btslogistics.fklservice.service.registration.dto.sddeclscheme;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class SdaGoodDto {

    private String id;

    /**
     * Год 4 знака (по значению поля DATE_RCV).
     * Формируется из системной даты
     */
    private Integer yearReg;

    /**
     * Код таможенного органа.
     */
    private String custom;

    /**
     * Формы. Порядковый номер листа. Поле 3.1.
     */
    private Long g3AdditionalSheetCount;

    /**
     * Товар. Порядковый номер товара. Поле 15.
     */
    private Long g15GoodsNumeric;

    /**
     * Код товара. Код товара по ТН ВЭД ТС. Поле 16.
     */
    private String g16GoodsTnvedCode;

    /**
     * Описание товаров. Количество акцизных марок. Поле 9.
     */
    private Long g9ExciseQuantity;

    /**
     * Описание товаров. Отгрузка / поступление. Поле 9.1.
     */
    private LocalDateTime g9LiabilityDate;

    /**
     * Описание товара.
     */
    private String g9GoodsDescription;

    /**
     * Вес нетто (кг). Поле 18.
     */
    private BigDecimal g18NetWeightQuantity;

    /**
     * Вес нетто (кг) без упаковки. Поле 18.
     */
    private BigDecimal g18NetWeightQuantity2;

    /**
     * Вес брутто (кг). Поле 19.
     */
    private BigDecimal g19GrossWeightQuantity;

    /**
     * Стоимость товара. Буквенный код валюты платежа (оценки) в соответствии с Классификатором валют. Поле 21.1.
     */
    private String g21CurrencyCode;

    /**
     * Стоимость товара. Стоимость товара в валюте платежа (оценки). Поле 21.2.
     */
    private BigDecimal g21InvoicedCost;

    /**
     * Цифровой код основания для внесения изменений или аннулирования в соответствии с Классификатором оснований для внесения изменений или классификатором оснований для аннулирования. Поле 13.
     */
    private String g13WareCorrectionReasonCode;

    /**
     * Количество товара в единице измерения
     */
    private BigDecimal g20GoodsQuantity;

    /**
     * Условное обозначение единицы измерения
     */
    private String g20MeasureUnitQualifierName;

    /**
     * Код единицы измерения в соответствии единицами измерения, применяемым в ТНВЭД ТС
     */
    private String g20MeasureUnitQualifierCode;

    /**
     * Буквенный код страны отправления в соответствии с Классификатором стран мира. Поле 10а.1.
     */
    private String g10DispatchCountryCode;

    /**
     * Краткое название страны отправления в соответствии с Классификатором стран мира. Поле 10.
     */
    private String g10DispatchCountryName;

    /**
     * Код административно-территориального деления страны отправления в соответствии с Классификатором административно-территориального деления или «000». Поле 10а.2.
     */
    private String g10RbDispatchCountryCode;

    /**
     * Краткое название страны отправления в соответствии с Классификатором стран мира. Поле 10.
     */
    private String g11OriginCountryCode;

    /**
     * Краткое название страны происхождения в соответствии с Классификатором стран мира или «ЕВРОСОЮЗ» или «НЕИЗВЕСТНА». Поле 11.
     */
    private String g11OriginCountryName;

    /**
     * Буквенный код страны происхождения в соответствии с Классификатором стран мира или «EU» или «00». Поле 12.
     */
    private String g12DestinationCountryCode;

    /**
     * Краткое название страны назначения в соответствии с Классификатором стран мира. Поле 17.
     */
    private String g12DestinationCountryName;

    /**
     * Код административно-территориального деления страны назначения в соответствии с Классификатором административно-территориального деления или «000». Поле 17а.2.
     */
    private String g12RbDestinationCountryCode;

    private SdaMainDto sdaMain;

    /**
     * Номер редакции записи.
     */
    private Long nRed;

    private List<SdaGoodPresentedDocDto> sdaGoodPresentedDocs;

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

    public SdaMainDto getSdaMain() {
        return sdaMain;
    }

    public void setSdaMain(SdaMainDto sdaMain) {
        this.sdaMain = sdaMain;
    }

    public Long getnRed() {
        return nRed;
    }

    public void setnRed(Long nRed) {
        this.nRed = nRed;
    }

    public List<SdaGoodPresentedDocDto> getSdaGoodPresentedDocs() {
        return sdaGoodPresentedDocs;
    }

    public void setSdaGoodPresentedDocs(List<SdaGoodPresentedDocDto> sdaGoodPresentedDocs) {
        this.sdaGoodPresentedDocs = sdaGoodPresentedDocs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SdaGoodDto sdaGoodDto = (SdaGoodDto) o;
        return Objects.equals(id, sdaGoodDto.id) &&
                Objects.equals(yearReg, sdaGoodDto.yearReg) &&
                Objects.equals(custom, sdaGoodDto.custom) &&
                Objects.equals(g3AdditionalSheetCount, sdaGoodDto.g3AdditionalSheetCount) &&
                Objects.equals(g15GoodsNumeric, sdaGoodDto.g15GoodsNumeric) &&
                Objects.equals(g16GoodsTnvedCode, sdaGoodDto.g16GoodsTnvedCode) &&
                Objects.equals(g9ExciseQuantity, sdaGoodDto.g9ExciseQuantity) &&
                Objects.equals(g9LiabilityDate, sdaGoodDto.g9LiabilityDate) &&
                Objects.equals(g9GoodsDescription, sdaGoodDto.g9GoodsDescription) &&
                Objects.equals(g18NetWeightQuantity, sdaGoodDto.g18NetWeightQuantity) &&
                Objects.equals(g18NetWeightQuantity2, sdaGoodDto.g18NetWeightQuantity2) &&
                Objects.equals(g19GrossWeightQuantity, sdaGoodDto.g19GrossWeightQuantity) &&
                Objects.equals(g21CurrencyCode, sdaGoodDto.g21CurrencyCode) &&
                Objects.equals(g21InvoicedCost, sdaGoodDto.g21InvoicedCost) &&
                Objects.equals(g13WareCorrectionReasonCode, sdaGoodDto.g13WareCorrectionReasonCode) &&
                Objects.equals(g20GoodsQuantity, sdaGoodDto.g20GoodsQuantity) &&
                Objects.equals(g20MeasureUnitQualifierName, sdaGoodDto.g20MeasureUnitQualifierName) &&
                Objects.equals(g20MeasureUnitQualifierCode, sdaGoodDto.g20MeasureUnitQualifierCode) &&
                Objects.equals(g10DispatchCountryCode, sdaGoodDto.g10DispatchCountryCode) &&
                Objects.equals(g10DispatchCountryName, sdaGoodDto.g10DispatchCountryName) &&
                Objects.equals(g10RbDispatchCountryCode, sdaGoodDto.g10RbDispatchCountryCode) &&
                Objects.equals(g11OriginCountryCode, sdaGoodDto.g11OriginCountryCode) &&
                Objects.equals(g11OriginCountryName, sdaGoodDto.g11OriginCountryName) &&
                Objects.equals(g12DestinationCountryCode, sdaGoodDto.g12DestinationCountryCode) &&
                Objects.equals(g12DestinationCountryName, sdaGoodDto.g12DestinationCountryName) &&
                Objects.equals(g12RbDestinationCountryCode, sdaGoodDto.g12RbDestinationCountryCode) &&
                Objects.equals(nRed, sdaGoodDto.nRed) &&
                Objects.equals(sdaGoodPresentedDocs, sdaGoodDto.sdaGoodPresentedDocs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yearReg, custom, g3AdditionalSheetCount, g15GoodsNumeric, g16GoodsTnvedCode, g9ExciseQuantity, g9LiabilityDate, g9GoodsDescription, g18NetWeightQuantity, g18NetWeightQuantity2, g19GrossWeightQuantity, g21CurrencyCode, g21InvoicedCost, g13WareCorrectionReasonCode, g20GoodsQuantity, g20MeasureUnitQualifierName, g20MeasureUnitQualifierCode, g10DispatchCountryCode, g10DispatchCountryName, g10RbDispatchCountryCode, g11OriginCountryCode, g11OriginCountryName, g12DestinationCountryCode, g12DestinationCountryName, g12RbDestinationCountryCode, nRed, sdaGoodPresentedDocs);
    }

    @Override
    public String toString() {
        return "SdaGoodDto{" +
                "id='" + id + '\'' +
                ", yearReg='" + yearReg + '\'' +
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
                ", nRed=" + nRed +
                ", sdGoodPresentedDocs=" + sdaGoodPresentedDocs +
                '}';
    }
}
