package by.btslogistics.fklservice.service.registration.dto.sddeclscheme;

import java.util.Objects;

public class SdaSubjectDto {

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
     * Краткое наименование организации / таможенного представителя. Поле 2-1.
     */
    private String g02ShortName;

    /**
     * Поле 2-1    Краткое наименование экспортера / импортера или грузоотправителя / грузополучателя или таможенного представителя. Поле 23.
     */
    private String g02NamePerson;

    /**
     * Учетный номер плательщика. 9 символов.Поле 2-2.
     */
    private String g02Unp;

    /**
     * Почтовым индекс введенный почтовом службой для сортировки и доставки корреспонденции. Текстовый. От 1 до 9 символов.
     */
    private String g02PostalCode;

    /**
     * Код страны alpha-2 (две буквы латинского алфавита). Текстовый. 2 символа.
     */
    private String g02CountryCode;

    /**
     * Наименование страны. Текстовый. До 40 символов.
     */
    private String g02CountryName;

    /**
     * Наименование региона Страны (регион, область, штат и т.п.). Текстовый. От 1 до 50   символов).
     */
    private String g02Region;

    /**
     * Название населенного пункта. Текстовый.35 символов.
     */
    private String g02City;

    /**
     * Название улицы и номер дома. Текстовым. До 50 символов.
     */
    private String g02StreetHouse;

    /**
     * Название улицы и номер дома. Текстовым. До 50 символов.
     */
    private String g02Phone;

    public SdaSubjectDto() {
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

    public String getG02ShortName() {
        return g02ShortName;
    }

    public void setG02ShortName(String g02ShortName) {
        this.g02ShortName = g02ShortName;
    }

    public String getG02NamePerson() {
        return g02NamePerson;
    }

    public void setG02NamePerson(String g02NamePerson) {
        this.g02NamePerson = g02NamePerson;
    }

    public String getG02Unp() {
        return g02Unp;
    }

    public void setG02Unp(String g02Unp) {
        this.g02Unp = g02Unp;
    }

    public String getG02PostalCode() {
        return g02PostalCode;
    }

    public void setG02PostalCode(String g02PostalCode) {
        this.g02PostalCode = g02PostalCode;
    }

    public String getG02CountryCode() {
        return g02CountryCode;
    }

    public void setG02CountryCode(String g02CountryCode) {
        this.g02CountryCode = g02CountryCode;
    }

    public String getG02CountryName() {
        return g02CountryName;
    }

    public void setG02CountryName(String g02CountryName) {
        this.g02CountryName = g02CountryName;
    }

    public String getG02Region() {
        return g02Region;
    }

    public void setG02Region(String g02Region) {
        this.g02Region = g02Region;
    }

    public String getG02City() {
        return g02City;
    }

    public void setG02City(String g02City) {
        this.g02City = g02City;
    }

    public String getG02StreetHouse() {
        return g02StreetHouse;
    }

    public void setG02StreetHouse(String g02StreetHouse) {
        this.g02StreetHouse = g02StreetHouse;
    }

    public String getG02Phone() {
        return g02Phone;
    }

    public void setG02Phone(String g02Phone) {
        this.g02Phone = g02Phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SdaSubjectDto that = (SdaSubjectDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(yearReg, that.yearReg) &&
                Objects.equals(custom, that.custom) &&
                Objects.equals(g02ShortName, that.g02ShortName) &&
                Objects.equals(g02NamePerson, that.g02NamePerson) &&
                Objects.equals(g02Unp, that.g02Unp) &&
                Objects.equals(g02PostalCode, that.g02PostalCode) &&
                Objects.equals(g02CountryCode, that.g02CountryCode) &&
                Objects.equals(g02CountryName, that.g02CountryName) &&
                Objects.equals(g02Region, that.g02Region) &&
                Objects.equals(g02City, that.g02City) &&
                Objects.equals(g02StreetHouse, that.g02StreetHouse) &&
                Objects.equals(g02Phone, that.g02Phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yearReg, custom, g02ShortName, g02NamePerson, g02Unp, g02PostalCode, g02CountryCode, g02CountryName, g02Region, g02City, g02StreetHouse, g02Phone);
    }

    @Override
    public String toString() {
        return "SdSubjectDto{" +
                "id='" + id + '\'' +
                ", yearReg='" + yearReg + '\'' +
                ", custom='" + custom + '\'' +
                ", g02ShortName='" + g02ShortName + '\'' +
                ", g02NamePerson='" + g02NamePerson + '\'' +
                ", g02Unp='" + g02Unp + '\'' +
                ", g02PostalCode='" + g02PostalCode + '\'' +
                ", g02CountryCode='" + g02CountryCode + '\'' +
                ", g02CountryName='" + g02CountryName + '\'' +
                ", g02Region='" + g02Region + '\'' +
                ", g02City='" + g02City + '\'' +
                ", g02StreetHouse='" + g02StreetHouse + '\'' +
                ", g02Phone='" + g02Phone + '\'' +
                '}';
    }
}
