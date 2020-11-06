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
@Table(name = "SDA_MAIN", schema = "TTS_DCLR_STATISTIC")
public class SdaMain extends IdMainForEntities {

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
    @Size(message = "CUSTOM{SdaMain.size}", max = 2)
    private String custom;

    /**
     * Код подразделения ПТО таможенного органа.
     */
    @Column(name = "PTO")
    @Size(message = "PTO{SdaMain.size}", max = 3)
    private String pto;

    /**
     * Идентификатор вида документа (код документа внутренний список BCM_01).
     */
    @Column(name = "TYPE_DOC")
    @Size(message = "TYPE_DOC{SdaMain.size}", max = 5)
    private String typeDoc;

    /**
     * Регистрационный номер.
     */
    @Column(name = "NOM_REG")
    @Size(message = "NOM_REG{SdaMain.size}", max = 20)
    private String nomReg;

    /**
     * Дата/время регистрации (формируется в приложении)
     *
     * Системная дата: ДДММГГ и время ЧЧ:ММ
     */
    @Column(name = "DATE_REG")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime dateReg;

    /**
     * Код статуса.
     */
    @Column(name = "STATUS")
    @Size(message = "STATUS{SdaMain.size}", max = 2)
    private String status;

    /**
     * Внешний ключ на таблицу MASSAGESLOG (ссылка на ID ,базы данных ЭД и ЭКД).
     */
    @Column(name = "DOCUMENTID", nullable = false)
    @Size(message = "DOCUMENTID{SdaMain.size}", max = 32)
    private String documentId;

    /**
     * Код типа декларации:ИМ – импортная статистическая декларация;ЭК – экспортная статистическая декларация. Поле 1.1.
     */
    @Column(name = "G1_CUSTOMSPROCEDURE")
    @Size(message = "G1_CUSTOMSPROCEDURE{SdaMain.size}", max = 2)
    private String g1CustomsProcedure;

    /**
     * Код статистической декларации: СД – статистическая декларация, ПД – периодическая статистическая декларация  Поле 1.2.
     */
    @Column(name = "G1_DOCUMENTTYPE")
    @Size(message = "G1_DOCUMENTTYPE{SdaMain.size}", max = 2)
    private String g1DocumentType;

    /**
     * Поле 1.3. Признак корректировки (КС) или аннулирования (АН) статистической декларации.
     */
    @Column(name = "G1_DECLKIND")
    @Size(message = "G1_DECLKIND{SdaMain.size}", max = 2)
    private String g1DeclKind;

    /**
     * Цифровой код основания аннулирования в соответствии с Классификатором оснований для аннулирования, цифровой код основания для внесения изменений в соответствии с Классификатором оснований для внесения изменений. Поле 1-4.
     */
    @Column(name = "G1_CORRECTIONREASONCODE")
    @Size(message = "G1_CORRECTIONREASONCODE{SdaMain.size}", max = 2)
    private String g1CorrectionReasonCode;

    /**
     * Код таможенного органа, в регионе деятельности которого зарегистрировано заинтересованное лицо.
     */
    @Column(name = "G2_CUSTOMSCODEREG")
    @Size(message = "G2_CUSTOMSCODEREG{SdaMain.size}", max = 2)
    private String g2CustomsCodeReg;

    /**
     * Формы. Общее количество форм.
     */
    @Column(name = "G3_TOTALSHEETNUMBER")
    private Long g3TotalSheetNumber;

    /**
     * Всего товаров.
     */
    @Column(name = "G4_TOTALGOODSNUMBER")
    private Long g4TotalGoodsNumber;

    /**
     * Торгующая страна. Буквенный код. Код страны alpha-2 (две буквы латинского алфавита).
     */
    @Column(name = "G6_TRADECOUNTRYCODE")
    @Size(message = "G6_TRADECOUNTRYCODE{SdaMain.size}", max = 2)
    private String g6TradeCountryCode;

    /**
     * Торгующая страна. Код административно-территориального деления страны в соответствии с Классификатором административно-территориального деления стран, применяемым в Республике Беларусь или «000». Поле 6.2.
     */
    @Column(name = "G6_RBCOUNTRYCODE")
    @Size(message = "G6_RBCOUNTRYCODE{SdaMain.size}", max = 3)
    private String g6RbCountryCode;

    /**
     * Буквенный код валюты платежа (оценки) в соответствии с Классификатором валют. Поле 8.1.
     */
    @Column(name = "G8_CONTRACTCURRENCYCODE")
    @Size(message = "G8_CONTRACTCURRENCYCODE{SdaMain.size}", max = 3)
    private String g8ContractCurrencyCode;

    /**
     * Общая стоимость товаров. Поле 8.2.
     */
    @Column(name = "G8_TOTALINVOICEAMOUNT")
    private BigDecimal g8TotalInvoiceAmount;

    /**
     * Код характера сделки в соответствии с Классификатором характера сделки. Поле 7.1.
     */
    @Column(name = "G7_DEALNATURECODE")
    @Size(message = "G7_DEALNATURECODE{SdaMain.size}", max = 3)
    private String g7DealNatureCode;

    /**
     * Код особенности сделки . В соответствии с Классификатором особенности внешнеэкоКод особенности сделки в соответствии с Классификатором особенности внешнеэкономической сделки. Поле 7.2.
     */
    @Column(name = "G7_DEALFEATURECODE")
    @Size(message = "G7_DEALFEATURECODE{SdaMain.size}", max = 2)
    private String g7DealFeatureCode;

    /**
     * Код вида поставки товаров в соответствии с Классификатором видов поставок товаров, подлежащих учету при осуществлении экспортных операций. Поле 7.3.
     */
    @Column(name = "G7_DELIVERYTERMSRBCODE")
    @Size(message = "G7_DELIVERYTERMSRBCODE{SdaMain.size}", max = 2)
    private String g7DeliveryTermsRbCode;

    /**
     * Дата заполнения статистической декларации. Поле 23.
     */
    @Column(name = "G23_EXECUTIONDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime g23ExecutionDate;

    /**
     * Исходящий номер регистрации документов в соответствии с системой учета исходящих документов лица, заполнившего статистическую декларацию. Поле 23.
     */
    @Column(name = "G23_REGNUMBERDOC")
    @Size(message = "G23_REGNUMBERDOC{SdaMain.size}", max = 50)
    private String g23RegNumberDoc;

    /**
     * Код таможенного органа, зарегистрировавшего предшествующий документ.
     */
    @Column(name = "G5_PRECEDINGCUSTOMSCODE")
    @Size(message = "G5_PRECEDINGCUSTOMSCODE{SdaMain.size}", max = 8)
    private String g5PrecedingCustomsCode;

    /**
     * Дата регистрации документа в формате DD-MM-YYYY.
     */
    @Column(name = "G5_PRECEDINGREGISTRATIONDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime g5PrecedingRegistrationDate;

    /**
     * Номер СД. Порядковый номер документа по журналу регистрации.
     */
    @Column(name = "G5_PRECEDINGGTDNUMBER")
    @Size(message = "G5_PRECEDINGGTDNUMBER{SdaMain.size}", max = 7)
    private String g5PrecedingGtdNumber;

    /**
     * Регистрационный номер принятия.
     */
    @Column(name = "NOM_PRIN")
    @Size(message = "NOM_PRIN{SdaMain.size}", max = 20)
    private String nomPrin;

    /**
     * Дата регистрационного номера принятия.
     */
    @Column(name = "DATE_PRIN")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime datePrin;

    /**
     * Уточнить что за флаг. РЕЗЕРВ.
     */
    @Column(name = "FLAG_RAZR")
    @Size(message = "FLAG_RAZR{SdaMain.size}", max = 2)
    private String flagRazr;

    /**
     * Тип документа. S1 – экспорт.S2 – импорт.
     */
    @Column(name = "TYPE_DECL")
    @Size(message = "TYPE_DECL{SdaMain.size}", max = 2)
    private String typeDecl;

    /**
     * Внешний ключ на таблицу SD_FILLEDPERSON.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TO_PERSON_ID", referencedColumnName = "ID")
    private SdaFilledPerson sdaFilledPerson;

    /**
     * Внешний ключ на таблицу SD_EXIMPORTER.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TO_EXIMP_ID", referencedColumnName = "ID")
    private SdaSubject sdaSubject;

    /**
     * Номер редакции записи.
     */
    @Column(name = "N_RED")
    private Long nRed;

    /**
     * Служебный признак.
     */
    @Column(name = "PRIZNAK_ABD")
    @Size(message = "PRIZNAK_ABD{SdaMain.size}", max = 2)
    private String priznakAbd;

    /**
     * Служебное поле (ID предыдущей записи).
     */
    @Column(name = "ID_PRED")
    @Size(message = "ID_PRED{SdaMain.size}", max = 32)
    private String idPred;

    @Column(name = "TO_MESSAGESLOG_ID")
    @Size(message = "TO_MESSAGESLOG_ID{SdaMain.size}", max = 32)
    private String toMessagesLogId;

    @Column(name = "CHANGE_LOG")
    @Size(message = "CHANGE_LOG{SdaMain.size}", max = 1000)
    private String changeLog;

    @OneToMany(mappedBy = "sdaMain", orphanRemoval = true,cascade = CascadeType.ALL)
    private List<SdaGood> sdaGoods;

    public SdaMain() {super();}

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

    public SdaSubject getSdaSubject() {
        return sdaSubject;
    }

    public void setSdaSubject(SdaSubject sdaExImporter) {
        this.sdaSubject = sdaExImporter;
    }

    public SdaFilledPerson getSdaFilledPerson() {
        return sdaFilledPerson;
    }

    public void setSdaFilledPerson(SdaFilledPerson sdaFilledPerson) {
        this.sdaFilledPerson = sdaFilledPerson;
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

    public List<SdaGood> getSdaGoods() {
        return sdaGoods;
    }

    public void setSdaGoods(List<SdaGood> sdaGoods) {
        this.sdaGoods = sdaGoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SdaMain sdaMain = (SdaMain) o;
        return Objects.equals(yearReg, sdaMain.yearReg) &&
                Objects.equals(custom, sdaMain.custom) &&
                Objects.equals(pto, sdaMain.pto) &&
                Objects.equals(typeDoc, sdaMain.typeDoc) &&
                Objects.equals(nomReg, sdaMain.nomReg) &&
                Objects.equals(dateReg, sdaMain.dateReg) &&
                Objects.equals(status, sdaMain.status) &&
                Objects.equals(documentId, sdaMain.documentId) &&
                Objects.equals(g1CustomsProcedure, sdaMain.g1CustomsProcedure) &&
                Objects.equals(g1DocumentType, sdaMain.g1DocumentType) &&
                Objects.equals(g1DeclKind, sdaMain.g1DeclKind) &&
                Objects.equals(g1CorrectionReasonCode, sdaMain.g1CorrectionReasonCode) &&
                Objects.equals(g2CustomsCodeReg, sdaMain.g2CustomsCodeReg) &&
                Objects.equals(g3TotalSheetNumber, sdaMain.g3TotalSheetNumber) &&
                Objects.equals(g4TotalGoodsNumber, sdaMain.g4TotalGoodsNumber) &&
                Objects.equals(g6TradeCountryCode, sdaMain.g6TradeCountryCode) &&
                Objects.equals(g6RbCountryCode, sdaMain.g6RbCountryCode) &&
                Objects.equals(g8ContractCurrencyCode, sdaMain.g8ContractCurrencyCode) &&
                Objects.equals(g8TotalInvoiceAmount, sdaMain.g8TotalInvoiceAmount) &&
                Objects.equals(g7DealNatureCode, sdaMain.g7DealNatureCode) &&
                Objects.equals(g7DealFeatureCode, sdaMain.g7DealFeatureCode) &&
                Objects.equals(g7DeliveryTermsRbCode, sdaMain.g7DeliveryTermsRbCode) &&
                Objects.equals(g23ExecutionDate, sdaMain.g23ExecutionDate) &&
                Objects.equals(g23RegNumberDoc, sdaMain.g23RegNumberDoc) &&
                Objects.equals(g5PrecedingCustomsCode, sdaMain.g5PrecedingCustomsCode) &&
                Objects.equals(g5PrecedingRegistrationDate, sdaMain.g5PrecedingRegistrationDate) &&
                Objects.equals(g5PrecedingGtdNumber, sdaMain.g5PrecedingGtdNumber) &&
                Objects.equals(nomPrin, sdaMain.nomPrin) &&
                Objects.equals(datePrin, sdaMain.datePrin) &&
                Objects.equals(flagRazr, sdaMain.flagRazr) &&
                Objects.equals(typeDecl, sdaMain.typeDecl) &&
                Objects.equals(sdaFilledPerson, sdaMain.sdaFilledPerson) &&
                Objects.equals(sdaSubject, sdaMain.sdaSubject) &&
                Objects.equals(nRed, sdaMain.nRed) &&
                Objects.equals(priznakAbd, sdaMain.priznakAbd) &&
                Objects.equals(idPred, sdaMain.idPred) &&
                Objects.equals(toMessagesLogId, sdaMain.toMessagesLogId) &&
                Objects.equals(changeLog, sdaMain.changeLog) &&
                Objects.equals(sdaGoods, sdaMain.sdaGoods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearReg, custom, pto, typeDoc, nomReg, dateReg, status, documentId, g1CustomsProcedure, g1DocumentType, g1DeclKind, g1CorrectionReasonCode, g2CustomsCodeReg, g3TotalSheetNumber, g4TotalGoodsNumber, g6TradeCountryCode, g6RbCountryCode, g8ContractCurrencyCode, g8TotalInvoiceAmount, g7DealNatureCode, g7DealFeatureCode, g7DeliveryTermsRbCode, g23ExecutionDate, g23RegNumberDoc, g5PrecedingCustomsCode, g5PrecedingRegistrationDate, g5PrecedingGtdNumber, nomPrin, datePrin, flagRazr, typeDecl, sdaFilledPerson, sdaSubject, nRed, priznakAbd, idPred, toMessagesLogId, changeLog, sdaGoods);
    }
}
