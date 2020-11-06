package by.btslogistics.fklservice.dao.model.sddeclscheme;

import by.btslogistics.fklservice.dao.model.IdMainForEntities;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "SDA_FILLEDPERSON", schema = "TTS_DCLR_STATISTIC")
public class SdaFilledPerson extends IdMainForEntities {

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
    @Size(message = "CUSTOM{SdaFilledPerson.size}", max = 2)
    private String custom;

    /**
     * Фамилия.
     */
    @Column(name = "G23_PERSONSURNAME")
    @Size(message = "G23_PERSONSURNAME{SdaFilledPerson.size}", max = 150)
    private String g23PersonSurname;

    /**
     * Имя.
     */
    @Column(name = "G23_PERSONNAME")
    @Size(message = "G23_PERSONNAME{SdaFilledPerson.size}", max = 150)
    private String g23PersonName;

    /**
     * Отчество.
     */
    @Column(name = "G23_PERSONMIDDLENAME")
    @Size(message = "G23_PERSONMIDDLENAME{SdaFilledPerson.size}", max = 150)
    private String g23PersonMiddleName;

    /**
     * Должность.
     */
    @Column(name = "G23_PERSONPOST")
    @Size(message = "G23_PERSONPOST{SdaFilledPerson.size}", max = 250)
    private String g23PersonPost;

    /**
     * Номер телефона.
     */
    @Column(name = "G23_CONTACTPHONE")
    @Size(message = "G23_CONTACTPHONE{SdaFilledPerson.size}", max = 24)
    private String g23ContactPhone;

    /**
     * Номер квалификационного аттестата специалиста по таможенному оформлению. Поле 23.
     */
    @Column(name = "G23_DECLARANTCERTIFICATE")
    @Size(message = "G23_DECLARANTCERTIFICATE{SdaFilledPerson.size}", max = 50)
    private String g23DeclarantCertificate;

    /**
     * Наименование документа.
     */
    @Column(name = "G23_AU_PRDOCUMENTNAME")
    @Size(message = "G23_AU_PRDOCUMENTNAME{SdaFilledPerson.size}", max = 250)
    private String g23AuPrDocumentName;

    /**
     * Номер документа.
     */
    @Column(name = "G23_AU_PRDOCUMENTNUMBER")
    @Size(message = "G23_AU_PRDOCUMENTNUMBER{SdaFilledPerson.size}", max = 50)
    private String g23AuPrDocumentNumber;

    /**
     * Дата документа.
     */
    @Column(name = "G23_AU_PRDOCUMENTDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime g23AuPrDocumentDate;

    /**
     * Дата окончания полномочий.
     */
    @Column(name = "G23_AU_COMPLATIONAUTHORITYDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime g23AuComplationAuthorityDate;

    /**
     * Наименование документа.
     */
    @Column(name = "G23_CU_PRDOCUMENTNAME")
    @Size(message = "G23_CU_PRDOCUMENTNAME{SdaFilledPerson.size}", max = 250)
    private String g23CuPrDocumentName;

    /**
     * Номер документа.
     */
    @Column(name = "G23_CU_PRDOCUMENTNUMBER")
    @Size(message = "G23_CU_PRDOCUMENTNUMBER{SdaFilledPerson.size}", max = 50)
    private String g23CuPrDocumentNumber;

    /**
     * Дата документа.
     */
    @Column(name = "G23_CU_PRDOCUMENTDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime g23CuPrDocumentDate;

    /**
     * Наименование документа.
     */
    @Column(name = "G23_CO_PRDOCUMENTNAME")
    @Size(message = "G23_CO_PRDOCUMENTNAME{SdaFilledPerson.size}", max = 250)
    private String g23CoPrDocumentName;

    /**
     * Номер документа.
     */
    @Column(name = "G23_CO_PRDOCUMENTNUMBER")
    @Size(message = "G23_CO_PRDOCUMENTNUMBER{SdaFilledPerson.size}", max = 50)
    private String g23CoPrDocumentNumber;

    /**
     * Дата документа.
     */
    @Column(name = "G23_CO_PRDOCUMENTDATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime g23CoPrDocumentDate;

    /**
     * ???
     */
    @Column(name = "G23_SHORTNAME")
    @Size(message = "G23_SHORTNAME{SdaFilledPerson.size}", max = 350)
    private String g23ShortName;

    /**
     * ???
     */
    @Column(name = "G23_NAMEPERSON")
    @Size(message = "G23_NAMEPERSON{SdaFilledPerson.size}", max = 350)
    private String g23NamePerson;

    /**
     * ???
     */
    @Column(name = "G23_UNP", nullable = false)
    @Size(message = "G23_UNP{SdaFilledPerson.size}", max = 9)
    private String g23Unp;

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

    public String getG23PersonSurname() {
        return g23PersonSurname;
    }

    public void setG23PersonSurname(String g23PersonSurname) {
        this.g23PersonSurname = g23PersonSurname;
    }

    public String getG23PersonName() {
        return g23PersonName;
    }

    public void setG23PersonName(String g23PersonName) {
        this.g23PersonName = g23PersonName;
    }

    public String getG23PersonMiddleName() {
        return g23PersonMiddleName;
    }

    public void setG23PersonMiddleName(String g23PersonMiddleName) {
        this.g23PersonMiddleName = g23PersonMiddleName;
    }

    public String getG23PersonPost() {
        return g23PersonPost;
    }

    public void setG23PersonPost(String g23PersonPost) {
        this.g23PersonPost = g23PersonPost;
    }

    public String getG23ContactPhone() {
        return g23ContactPhone;
    }

    public void setG23ContactPhone(String g23ContactPhone) {
        this.g23ContactPhone = g23ContactPhone;
    }

    public String getG23DeclarantCertificate() {
        return g23DeclarantCertificate;
    }

    public void setG23DeclarantCertificate(String g23DeclarantCertificate) {
        this.g23DeclarantCertificate = g23DeclarantCertificate;
    }

    public String getG23AuPrDocumentName() {
        return g23AuPrDocumentName;
    }

    public void setG23AuPrDocumentName(String g23AuPrDocumentName) {
        this.g23AuPrDocumentName = g23AuPrDocumentName;
    }

    public String getG23AuPrDocumentNumber() {
        return g23AuPrDocumentNumber;
    }

    public void setG23AuPrDocumentNumber(String g23AuPrDocumentNumber) {
        this.g23AuPrDocumentNumber = g23AuPrDocumentNumber;
    }

    public LocalDateTime getG23AuPrDocumentDate() {
        return g23AuPrDocumentDate;
    }

    public void setG23AuPrDocumentDate(LocalDateTime g23AuPrDocumentDate) {
        this.g23AuPrDocumentDate = g23AuPrDocumentDate;
    }

    public LocalDateTime getG23AuComplationAuthorityDate() {
        return g23AuComplationAuthorityDate;
    }

    public void setG23AuComplationAuthorityDate(LocalDateTime g23AuComplationAuthorityDate) {
        this.g23AuComplationAuthorityDate = g23AuComplationAuthorityDate;
    }

    public String getG23CuPrDocumentName() {
        return g23CuPrDocumentName;
    }

    public void setG23CuPrDocumentName(String g23CuPrDocumentName) {
        this.g23CuPrDocumentName = g23CuPrDocumentName;
    }

    public String getG23CuPrDocumentNumber() {
        return g23CuPrDocumentNumber;
    }

    public void setG23CuPrDocumentNumber(String g23CuPrDocumentNumber) {
        this.g23CuPrDocumentNumber = g23CuPrDocumentNumber;
    }

    public LocalDateTime getG23CuPrDocumentDate() {
        return g23CuPrDocumentDate;
    }

    public void setG23CuPrDocumentDate(LocalDateTime g23CuPrDocumentDate) {
        this.g23CuPrDocumentDate = g23CuPrDocumentDate;
    }

    public String getG23CoPrDocumentName() {
        return g23CoPrDocumentName;
    }

    public void setG23CoPrDocumentName(String g23CoPrDocumentName) {
        this.g23CoPrDocumentName = g23CoPrDocumentName;
    }

    public String getG23CoPrDocumentNumber() {
        return g23CoPrDocumentNumber;
    }

    public void setG23CoPrDocumentNumber(String g23CoPrDocumentNumber) {
        this.g23CoPrDocumentNumber = g23CoPrDocumentNumber;
    }

    public LocalDateTime getG23CoPrDocumentDate() {
        return g23CoPrDocumentDate;
    }

    public void setG23CoPrDocumentDate(LocalDateTime g23CoPrDocumentDate) {
        this.g23CoPrDocumentDate = g23CoPrDocumentDate;
    }

    public String getG23ShortName() {
        return g23ShortName;
    }

    public void setG23ShortName(String g23ShortName) {
        this.g23ShortName = g23ShortName;
    }

    public String getG23NamePerson() {
        return g23NamePerson;
    }

    public void setG23NamePerson(String g23NamePerson) {
        this.g23NamePerson = g23NamePerson;
    }

    public String getG23Unp() {
        return g23Unp;
    }

    public void setG23Unp(String g23Unp) {
        this.g23Unp = g23Unp;
    }

    @Override
    public String toString() {
        return "SdaFilledPerson{" +
                "yearReg='" + yearReg + '\'' +
                ", custom='" + custom + '\'' +
                ", g23PersonSurname='" + g23PersonSurname + '\'' +
                ", g23PersonName='" + g23PersonName + '\'' +
                ", g23PersonMiddleName='" + g23PersonMiddleName + '\'' +
                ", g23PersonPost='" + g23PersonPost + '\'' +
                ", g23ContactPhone='" + g23ContactPhone + '\'' +
                ", g23DeclarantCertificate='" + g23DeclarantCertificate + '\'' +
                ", g23AuPrDocumentName='" + g23AuPrDocumentName + '\'' +
                ", g23AuPrDocumentNumber='" + g23AuPrDocumentNumber + '\'' +
                ", g23AuPrDocumentDate=" + g23AuPrDocumentDate +
                ", g23AuComplationAuthorityDate=" + g23AuComplationAuthorityDate +
                ", g23CuPrDocumentName='" + g23CuPrDocumentName + '\'' +
                ", g23CuPrDocumentNumber='" + g23CuPrDocumentNumber + '\'' +
                ", g23CuPrDocumentDate=" + g23CuPrDocumentDate +
                ", g23CoPrDocumentName='" + g23CoPrDocumentName + '\'' +
                ", g23CoPrDocumentNumber='" + g23CoPrDocumentNumber + '\'' +
                ", g23CoPrDocumentDate=" + g23CoPrDocumentDate +
                ", g23ShortName='" + g23ShortName + '\'' +
                ", g23NamePerson='" + g23NamePerson + '\'' +
                ", g23Unp='" + g23Unp + '\'' +
                '}';
    }
}
