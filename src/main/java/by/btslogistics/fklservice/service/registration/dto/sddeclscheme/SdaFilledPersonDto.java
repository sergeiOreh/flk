package by.btslogistics.fklservice.service.registration.dto.sddeclscheme;

import java.time.LocalDateTime;
import java.util.Objects;

public class SdaFilledPersonDto {

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
     * Фамилия.
     */
    private String g23PersonSurname;

    /**
     * Имя.
     */
    private String g23PersonName;

    /**
     * Отчество.
     */
    private String g23PersonMiddleName;

    /**
     * Должность.
     */
    private String g23PersonPost;

    /**
     * Номер телефона.
     */
    private String g23ContactPhone;

    /**
     * Номер квалификационного аттестата специалиста по таможенному оформлению. Поле 23.
     */
    private String g23DeclarantCertificate;

    /**
     * Наименование документа.
     */
    private String g23AuPrDocumentName;

    /**
     * Номер документа.
     */
    private String g23AuPrDocumentNumber;

    /**
     * Дата документа.
     */
    private LocalDateTime g23AuPrDocumentDate;

    /**
     * Дата окончания полномочий.
     */
    private LocalDateTime g23AuComplationAuthorityDate;

    /**
     * Наименование документа.
     */
    private String g23CuPrDocumentName;

    /**
     * Номер документа.
     */
    private String g23CuPrDocumentNumber;

    /**
     * Дата документа.
     */
    private LocalDateTime g23CuPrDocumentDate;

    /**
     * Наименование документа.
     */
    private String g23CoPrDocumentName;

    /**
     * Номер документа.
     */
    private String g23CoPrDocumentNumber;

    /**
     * Дата документа.
     */
    private LocalDateTime g23CoPrDocumentDate;

    /**
     * ???
     */
    private String g23ShortName;

    /**
     * ???
     */
    private String g23NamePerson;

    /**
     * ???
     */
    private String g23Unp;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SdaFilledPersonDto that = (SdaFilledPersonDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(yearReg, that.yearReg) &&
                Objects.equals(custom, that.custom) &&
                Objects.equals(g23PersonSurname, that.g23PersonSurname) &&
                Objects.equals(g23PersonName, that.g23PersonName) &&
                Objects.equals(g23PersonMiddleName, that.g23PersonMiddleName) &&
                Objects.equals(g23PersonPost, that.g23PersonPost) &&
                Objects.equals(g23ContactPhone, that.g23ContactPhone) &&
                Objects.equals(g23DeclarantCertificate, that.g23DeclarantCertificate) &&
                Objects.equals(g23AuPrDocumentName, that.g23AuPrDocumentName) &&
                Objects.equals(g23AuPrDocumentNumber, that.g23AuPrDocumentNumber) &&
                Objects.equals(g23AuPrDocumentDate, that.g23AuPrDocumentDate) &&
                Objects.equals(g23AuComplationAuthorityDate, that.g23AuComplationAuthorityDate) &&
                Objects.equals(g23CuPrDocumentName, that.g23CuPrDocumentName) &&
                Objects.equals(g23CuPrDocumentNumber, that.g23CuPrDocumentNumber) &&
                Objects.equals(g23CuPrDocumentDate, that.g23CuPrDocumentDate) &&
                Objects.equals(g23CoPrDocumentName, that.g23CoPrDocumentName) &&
                Objects.equals(g23CoPrDocumentNumber, that.g23CoPrDocumentNumber) &&
                Objects.equals(g23CoPrDocumentDate, that.g23CoPrDocumentDate) &&
                Objects.equals(g23ShortName, that.g23ShortName) &&
                Objects.equals(g23NamePerson, that.g23NamePerson) &&
                Objects.equals(g23Unp, that.g23Unp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yearReg, custom, g23PersonSurname, g23PersonName, g23PersonMiddleName, g23PersonPost, g23ContactPhone, g23DeclarantCertificate, g23AuPrDocumentName, g23AuPrDocumentNumber, g23AuPrDocumentDate, g23AuComplationAuthorityDate, g23CuPrDocumentName, g23CuPrDocumentNumber, g23CuPrDocumentDate, g23CoPrDocumentName, g23CoPrDocumentNumber, g23CoPrDocumentDate, g23ShortName, g23NamePerson, g23Unp);
    }

    @Override
    public String toString() {
        return "SdFilledPersonDto{" +
                "id='" + id + '\'' +
                ", yearReg='" + yearReg + '\'' +
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
