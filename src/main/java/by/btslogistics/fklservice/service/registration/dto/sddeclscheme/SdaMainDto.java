package by.btslogistics.fklservice.service.registration.dto.sddeclscheme;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@PropertySources({
        @PropertySource("classpath:properties/app-exception-messages.properties")
})
public class SdaMainDto {

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
     * Код подразделения ПТО таможенного органа.
     */
    private String pto;

    /**
     * Идентификатор вида документа (код документа внутренний список BCM_01).
     */
    private String typeDoc;

    /**
     * Регистрационный номер.
     */
    private String nomReg;

    /**
     * Дата/время регистрации (формируется в приложении)
     *
     * Системная дата: ДДММГГ и время ЧЧ:ММ
     */
    private LocalDateTime dateReg;

    /**
     * Код статуса.
     */
    private String status;

    /**
     * Внешний ключ на таблицу MASSAGESLOG (ссылка на ID ,базы данных ЭД и ЭКД).
     */
    private String documentId;

    /**
     * Код типа декларации:ИМ – импортная статистическая декларация;ЭК – экспортная статистическая декларация. Поле 1.1.
     */
    private String g1CustomsProcedure;

    /**
     * Код статистической декларации: СД – статистическая декларация, ПД – периодическая статистическая декларация  Поле 1.2.
     */
    private String g1DocumentType;

    /**
     * Поле 1.3. Признак корректировки (КС) или аннулирования (АН) статистической декларации.
     */
    private String g1DeclKind;

    /**
     * Цифровой код основания аннулирования в соответствии с Классификатором оснований для аннулирования, цифровой код основания для внесения изменений в соответствии с Классификатором оснований для внесения изменений. Поле 1-4.
     */
    private String g1CorrectionReasonCode;

    /**
     * Код таможенного органа, в регионе деятельности которого зарегистрировано заинтересованное лицо.
     */
    private String g2CustomsCodeReg;

    /**
     * Формы. Общее количество форм.
     */
    private Long g3TotalSheetNumber;

    /**
     * Всего товаров.
     */
    private Long g4TotalGoodsNumber;

    /**
     * Торгующая страна. Буквенный код. Код страны alpha-2 (две буквы латинского алфавита).
     */
    private String g6TradeCountryCode;

    /**
     * Торгующая страна. Код административно-территориального деления страны в соответствии с Классификатором административно-территориального деления стран, применяемым в Республике Беларусь или «000». Поле 6.2.
     */
    private String g6RbCountryCode;

    /**
     * Буквенный код валюты платежа (оценки) в соответствии с Классификатором валют. Поле 8.1.
     */
    private String g8ContractCurrencyCode;

    /**
     * Общая стоимость товаров. Поле 8.2.
     */
    private BigDecimal g8TotalInvoiceAmount;

    /**
     * Код характера сделки в соответствии с Классификатором характера сделки. Поле 7.1.
     */
    private String g7DealNatureCode;

    /**
     * Код особенности сделки . В соответствии с Классификатором особенности внешнеэкоКод особенности сделки в соответствии с Классификатором особенности внешнеэкономической сделки. Поле 7.2.
     */
    private String g7DealFeatureCode;

    /**
     * Код вида поставки товаров в соответствии с Классификатором видов поставок товаров, подлежащих учету при осуществлении экспортных операций. Поле 7.3.
     */
    private String g7DeliveryTermsRbCode;

    /**
     * Дата заполнения статистической декларации. Поле 23.
     */
    private LocalDateTime g23ExecutionDate;

    /**
     * Исходящий номер регистрации документов в соответствии с системой учета исходящих документов лица, заполнившего статистическую декларацию. Поле 23.
     */
    private String g23RegNumberDoc;

    /**
     * Код таможенного органа, зарегистрировавшего предшествующий документ.
     */
    private String g5PrecedingCustomsCode;

    /**
     * Дата регистрации документа в формате DD-MM-YYYY.
     */
    private LocalDateTime g5PrecedingRegistrationDate;

    /**
     * Номер СД. Порядковый номер документа по журналу регистрации.
     */
    private String g5PrecedingGtdNumber;

    /**
     * Регистрационный номер принятия.
     */
    private String nomPrin;

    /**
     * Дата регистрационного номера принятия.
     */
    private LocalDateTime datePrin;

    /**
     * Уточнить что за флаг. РЕЗЕРВ.
     */
    private String flagRazr;

    /**
     * Тип документа. S1 – экспорт.S2 – импорт.
     */
    private String typeDecl;

    /**
     * Внешний ключ на таблицу SD_FILLEDPERSON.
     */
    private SdaFilledPersonDto sdaFilledPerson;

    /**
     * Внешний ключ на таблицу SD_EXIMPORTER.
     */
    private SdaSubjectDto sdaSubject;

    /**
     * Номер редакции записи.
     */
    private Long nRed;

    /**
     * Служебный признак.
     */
    private String priznakAbd;

    /**
     * Служебное поле (ID предыдущей записи).
     */
    private String idPred;

    private String toMessagesLogId;

    private String changeLog;

    private List<SdaGoodDto> sdaGoods;

    public SdaMainDto() {
    }

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

    public String getPto() {
        return pto;
    }

    public void setPto(String pto) {
        this.pto = pto;
    }

    public String getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getNomReg() {
        return nomReg;
    }

    public void setNomReg(String nomReg) {
        this.nomReg = nomReg;
    }

    public LocalDateTime getDateReg() {
        return dateReg;
    }

    public void setDateReg(LocalDateTime dateReg) {
        this.dateReg = dateReg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getG1CustomsProcedure() {
        return g1CustomsProcedure;
    }

    public void setG1CustomsProcedure(String g1CustomsProcedure) {
        this.g1CustomsProcedure = g1CustomsProcedure;
    }

    public String getG1DocumentType() {
        return g1DocumentType;
    }

    public void setG1DocumentType(String g1DocumentType) {
        this.g1DocumentType = g1DocumentType;
    }

    public String getG1DeclKind() {
        return g1DeclKind;
    }

    public void setG1DeclKind(String g1DeclKind) {
        this.g1DeclKind = g1DeclKind;
    }

    public String getG1CorrectionReasonCode() {
        return g1CorrectionReasonCode;
    }

    public void setG1CorrectionReasonCode(String g1CorrectionReasonCode) {
        this.g1CorrectionReasonCode = g1CorrectionReasonCode;
    }

    public String getG2CustomsCodeReg() {
        return g2CustomsCodeReg;
    }

    public void setG2CustomsCodeReg(String g2CustomsCodeReg) {
        this.g2CustomsCodeReg = g2CustomsCodeReg;
    }

    public Long getG3TotalSheetNumber() {
        return g3TotalSheetNumber;
    }

    public void setG3TotalSheetNumber(Long g3TotalSheetNumber) {
        this.g3TotalSheetNumber = g3TotalSheetNumber;
    }

    public Long getG4TotalGoodsNumber() {
        return g4TotalGoodsNumber;
    }

    public void setG4TotalGoodsNumber(Long g4TotalGoodsNumber) {
        this.g4TotalGoodsNumber = g4TotalGoodsNumber;
    }

    public String getG6TradeCountryCode() {
        return g6TradeCountryCode;
    }

    public void setG6TradeCountryCode(String g6TradeCountryCode) {
        this.g6TradeCountryCode = g6TradeCountryCode;
    }

    public String getG6RbCountryCode() {
        return g6RbCountryCode;
    }

    public void setG6RbCountryCode(String g6RbCountryCode) {
        this.g6RbCountryCode = g6RbCountryCode;
    }

    public String getG8ContractCurrencyCode() {
        return g8ContractCurrencyCode;
    }

    public void setG8ContractCurrencyCode(String g8ContractCurrencyCode) {
        this.g8ContractCurrencyCode = g8ContractCurrencyCode;
    }

    public BigDecimal getG8TotalInvoiceAmount() {
        return g8TotalInvoiceAmount;
    }

    public void setG8TotalInvoiceAmount(BigDecimal g8TotalInvoiceAmount) {
        this.g8TotalInvoiceAmount = g8TotalInvoiceAmount;
    }

    public String getG7DealNatureCode() {
        return g7DealNatureCode;
    }

    public void setG7DealNatureCode(String g7DealNatureCode) {
        this.g7DealNatureCode = g7DealNatureCode;
    }

    public String getG7DealFeatureCode() {
        return g7DealFeatureCode;
    }

    public void setG7DealFeatureCode(String g7DealFeatureCode) {
        this.g7DealFeatureCode = g7DealFeatureCode;
    }

    public String getG7DeliveryTermsRbCode() {
        return g7DeliveryTermsRbCode;
    }

    public void setG7DeliveryTermsRbCode(String g7DeliveryTermsRbCode) {
        this.g7DeliveryTermsRbCode = g7DeliveryTermsRbCode;
    }

    public LocalDateTime getG23ExecutionDate() {
        return g23ExecutionDate;
    }

    public void setG23ExecutionDate(LocalDateTime g23ExecutionDate) {
        this.g23ExecutionDate = g23ExecutionDate;
    }

    public String getG23RegNumberDoc() {
        return g23RegNumberDoc;
    }

    public void setG23RegNumberDoc(String g23RegNumberDoc) {
        this.g23RegNumberDoc = g23RegNumberDoc;
    }

    public String getG5PrecedingCustomsCode() {
        return g5PrecedingCustomsCode;
    }

    public void setG5PrecedingCustomsCode(String g5PrecedingCustomsCode) {
        this.g5PrecedingCustomsCode = g5PrecedingCustomsCode;
    }

    public LocalDateTime getG5PrecedingRegistrationDate() {
        return g5PrecedingRegistrationDate;
    }

    public void setG5PrecedingRegistrationDate(LocalDateTime g5PrecedingRegistrationDate) {
        this.g5PrecedingRegistrationDate = g5PrecedingRegistrationDate;
    }

    public String getG5PrecedingGtdNumber() {
        return g5PrecedingGtdNumber;
    }

    public void setG5PrecedingGtdNumber(String g5PrecedingGtdNumber) {
        this.g5PrecedingGtdNumber = g5PrecedingGtdNumber;
    }

    public String getNomPrin() {
        return nomPrin;
    }

    public void setNomPrin(String nomPrin) {
        this.nomPrin = nomPrin;
    }

    public LocalDateTime getDatePrin() {
        return datePrin;
    }

    public void setDatePrin(LocalDateTime datePrin) {
        this.datePrin = datePrin;
    }

    public String getFlagRazr() {
        return flagRazr;
    }

    public void setFlagRazr(String flagRazr) {
        this.flagRazr = flagRazr;
    }

    public String getTypeDecl() {
        return typeDecl;
    }

    public void setTypeDecl(String typeDecl) {
        this.typeDecl = typeDecl;
    }

    public SdaFilledPersonDto getSdaFilledPerson() {
        return sdaFilledPerson;
    }

    public void setSdaFilledPerson(SdaFilledPersonDto sdaFilledPerson) {
        this.sdaFilledPerson = sdaFilledPerson;
    }

    public SdaSubjectDto getSdaSubject() {
        return sdaSubject;
    }

    public void setSdaSubject(SdaSubjectDto sdaSubject) {
        this.sdaSubject = sdaSubject;
    }

    public Long getnRed() {
        return nRed;
    }

    public void setnRed(Long nRed) {
        this.nRed = nRed;
    }

    public String getPriznakAbd() {
        return priznakAbd;
    }

    public void setPriznakAbd(String priznakAbd) {
        this.priznakAbd = priznakAbd;
    }

    public String getIdPred() {
        return idPred;
    }

    public void setIdPred(String idPred) {
        this.idPred = idPred;
    }

    public String getToMessagesLogId() {
        return toMessagesLogId;
    }

    public void setToMessagesLogId(String toMessagesLogId) {
        this.toMessagesLogId = toMessagesLogId;
    }

    public String getChangeLog() {
        return changeLog;
    }

    public void setChangeLog(String changeLog) {
        this.changeLog = changeLog;
    }

    public List<SdaGoodDto> getSdaGoods() {
        return sdaGoods;
    }

    public void setSdaGoods(List<SdaGoodDto> sdaGoods) {
        this.sdaGoods = sdaGoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SdaMainDto that = (SdaMainDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(yearReg, that.yearReg) &&
                Objects.equals(custom, that.custom) &&
                Objects.equals(pto, that.pto) &&
                Objects.equals(typeDoc, that.typeDoc) &&
                Objects.equals(nomReg, that.nomReg) &&
                Objects.equals(dateReg, that.dateReg) &&
                Objects.equals(status, that.status) &&
                Objects.equals(documentId, that.documentId) &&
                Objects.equals(g1CustomsProcedure, that.g1CustomsProcedure) &&
                Objects.equals(g1DocumentType, that.g1DocumentType) &&
                Objects.equals(g1DeclKind, that.g1DeclKind) &&
                Objects.equals(g1CorrectionReasonCode, that.g1CorrectionReasonCode) &&
                Objects.equals(g2CustomsCodeReg, that.g2CustomsCodeReg) &&
                Objects.equals(g3TotalSheetNumber, that.g3TotalSheetNumber) &&
                Objects.equals(g4TotalGoodsNumber, that.g4TotalGoodsNumber) &&
                Objects.equals(g6TradeCountryCode, that.g6TradeCountryCode) &&
                Objects.equals(g6RbCountryCode, that.g6RbCountryCode) &&
                Objects.equals(g8ContractCurrencyCode, that.g8ContractCurrencyCode) &&
                Objects.equals(g8TotalInvoiceAmount, that.g8TotalInvoiceAmount) &&
                Objects.equals(g7DealNatureCode, that.g7DealNatureCode) &&
                Objects.equals(g7DealFeatureCode, that.g7DealFeatureCode) &&
                Objects.equals(g7DeliveryTermsRbCode, that.g7DeliveryTermsRbCode) &&
                Objects.equals(g23ExecutionDate, that.g23ExecutionDate) &&
                Objects.equals(g23RegNumberDoc, that.g23RegNumberDoc) &&
                Objects.equals(g5PrecedingCustomsCode, that.g5PrecedingCustomsCode) &&
                Objects.equals(g5PrecedingRegistrationDate, that.g5PrecedingRegistrationDate) &&
                Objects.equals(g5PrecedingGtdNumber, that.g5PrecedingGtdNumber) &&
                Objects.equals(nomPrin, that.nomPrin) &&
                Objects.equals(datePrin, that.datePrin) &&
                Objects.equals(flagRazr, that.flagRazr) &&
                Objects.equals(typeDecl, that.typeDecl) &&
                Objects.equals(sdaFilledPerson, that.sdaFilledPerson) &&
                Objects.equals(sdaSubject, that.sdaSubject) &&
                Objects.equals(nRed, that.nRed) &&
                Objects.equals(priznakAbd, that.priznakAbd) &&
                Objects.equals(idPred, that.idPred) &&
                Objects.equals(toMessagesLogId, that.toMessagesLogId) &&
                Objects.equals(changeLog, that.changeLog) &&
                Objects.equals(sdaGoods, that.sdaGoods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yearReg, custom, pto, typeDoc, nomReg, dateReg, status, documentId, g1CustomsProcedure, g1DocumentType, g1DeclKind, g1CorrectionReasonCode, g2CustomsCodeReg, g3TotalSheetNumber, g4TotalGoodsNumber, g6TradeCountryCode, g6RbCountryCode, g8ContractCurrencyCode, g8TotalInvoiceAmount, g7DealNatureCode, g7DealFeatureCode, g7DeliveryTermsRbCode, g23ExecutionDate, g23RegNumberDoc, g5PrecedingCustomsCode, g5PrecedingRegistrationDate, g5PrecedingGtdNumber, nomPrin, datePrin, flagRazr, typeDecl, sdaFilledPerson, sdaSubject, nRed, priznakAbd, idPred, toMessagesLogId, changeLog, sdaGoods);
    }
}
