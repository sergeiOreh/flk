package by.btslogistics.fklservice.dao.model.flk.model.flkchecks;


import by.btslogistics.fklservice.dao.model.flk.model.flkgrafa.FlkGrafa;
import by.btslogistics.fklservice.dao.model.flk.model.flktypecontrol.FlkTypeControl;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "FLK_CHECKS", schema = "TTS_FORMAT_LOGICAL_CONTROL")
public class FlkChecks {

    @SequenceGenerator(name = "jpaSequence.FlkChecks",
            sequenceName = "TTS_FORMAT_LOGICAL_CONTROL.SEQ_FLK_CHECKS",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "jpaSequence.FlkChecks")
    @Id
    private Long id;

    /**
     * Ссылка на таблицу FLK_GRAFA, которая хранит информацию
     * о всех графах(пронумерованных полях на бланке декларации) и их соответствие полям в БД
     */
    @Column(name = "ID_GRAFA")
    private Integer idGrafa;

    /**
     * Ссылка на таблицу FLK_TYPE_CONTROL, которая хранит информацию
     * о типах контроля по каждому виду документа (СД-->ПД,СД аннулированная, ДТ, КДТ)
     */
//    @Column(name = "ID_TYPE_CONTROL")
//    private Long idTypeControl;

    /**
     * Ссылка на таблицу FLK_CATEGORY_ERROR, которая хранит информацию
     * 1 - Ошибка
     * 2 - Предупреждение
     * 3-  Информирование
     */
    @Column(name = "ID_CATEGORY")
    private Integer idCategory;

    /**
     * Ссылка на таблицу FLK_
     * Уровни проверки, начиная с обычной проверки на заполнение и заканчивая проверкой
     * конкретных значений
     */
    @Column(name = "ID_LVL_FLK")
    private Integer idLvlFlk;

    /**
     * Ссылка на таблицу FLK_LIST_PROCEDURES, которая хранит информацию
     * о имени вызываемой процедуры Oracle и кол-ве входных, выходных параметров
     */
    @Column(name = "ID_PROC")
    private Integer idProc;

    /**
     * Код проверки формата XXX.XXX.XXX.XX.X
     * Код проверки согласно документации, предоставляемой (ГТК) вместе с xsd-описанием
     * структуры документа
     * Пример - ESD.001.003.04.1
     */
    @Column(name = "CODE_CHECK")
    @Size(message = "CODE_CHECK{FlkChecks.size}", max = 16)
    private String codeCheck;

    /**
     * Описание проверки
     */
    @Column(name = "DESCRIPTION_CHECK")
    @Size(message = "DESCRIPTION_CHECK{FlkChecks.size}", max = 600)
    private String descriptionCheck;

    /**
     * Описание ошибки, отправляемой клиенту
     */
    @Column(name = "DESCRIPTION_ERROR")
    @Size(message = "DESCRIPTION_ERROR{FlkChecks.size}", max = 600)
    private String descriptionError;

    /**
     * Параметр в процедуру
     */
    @Column(name = "PAR2")
    @Size(message = "PAR2{FlkChecks.size}", max = 300)
    private String par2;

    /**
     * Параметр в процедуру
     */
    @Column(name = "PAR3")
    @Size(message = "PAR3{FlkChecks.size}", max = 300)
    private String par3;

    /**
     * Параметр в процедуру
     */
    @Column(name = "PAR4")
    @Size(message = "PAR4{FlkChecks.size}", max = 300)
    private String par4;

    /**
     * Признак активности проверки
     * 0 - неактивна
     * 1 - активна
     */
    @Column(name = "IS_ACTIVE")
    @Size(message = "IS_ACTIVE{FlkChecks.size}", max = 1)
    private String active;

    /**
     * Вид процедуры (действия)
     */
    @Column(name = "VID_PROC")
    @Size(message = "VID_PROC{FlkChecks.size}", max = 1)
    private String vidProc;

    /**
     * Код процедуры (функции)
     */
    @Column(name = "PROC_NAME")
    @Size(message = "PROC_NAME{FlkChecks.size}", max = 20)
    private String procName;

    /**
     * Признак
     */
    @Column(name = "PRIZNAK")
    @Size(message = "PRIZNAK{FlkChecks.size}", max = 1)
    private String priznak;

    /**
     * Ссылка на текст сообщения (резервное поле)
     */
    @Column(name = "TEXT_ID")
    @Size(message = "TEXT_ID{FlkChecks.size}", max = 32)
    private String textId;


    /**
     * признак исключения (резервное поле)
     */
    @Column(name = "PR_ISKLUCH")
    @Size(message = "PR_ISKLUCH{FlkChecks.size}", max = 32)
    private String prIskluch;

    /**
     * Дата актуализации процедуры
     */
    @Column(name = "D_ON")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime d_On;

    /**
     *  Дата деактуализации процедуры
     */
    @Column(name = "D_OFF")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime d_Off;

    @Column(name = "RULES_IN_JSON")
    @Size(message = "RULES_IN_JSON{FlkChecks.size}", max = 4000)
    private String rulesInJson;

    @ManyToOne
    @JoinColumn(name = "ID_GRAFA",insertable = false, updatable = false)
    private FlkGrafa flkGrafa;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_TYPE_CONTROL",referencedColumnName = "id")
    private FlkTypeControl flkTypeControl;

    public FlkChecks() {
     }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdGrafa() {
        return idGrafa;
    }

    public void setIdGrafa(Integer idGrafa) {
        this.idGrafa = idGrafa;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Integer getIdLvlFlk() {
        return idLvlFlk;
    }

    public void setIdLvlFlk(Integer idLvlFlk) {
        this.idLvlFlk = idLvlFlk;
    }

    public Integer getIdProc() {
        return idProc;
    }

    public void setIdProc(Integer idProc) {
        this.idProc = idProc;
    }

    public String getCodeCheck() {
        return codeCheck;
    }

    public void setCodeCheck(String codeCheck) {
        this.codeCheck = codeCheck;
    }

    public String getDescriptionCheck() {
        return descriptionCheck;
    }

    public void setDescriptionCheck(String descriptionCheck) {
        this.descriptionCheck = descriptionCheck;
    }

    public String getDescriptionError() {
        return descriptionError;
    }

    public void setDescriptionError(String descriptionError) {
        this.descriptionError = descriptionError;
    }

    public String getPar2() {
        return par2;
    }

    public void setPar2(String par2) {
        this.par2 = par2;
    }

    public String getPar3() {
        return par3;
    }

    public void setPar3(String par3) {
        this.par3 = par3;
    }

    public String getPar4() {
        return par4;
    }

    public void setPar4(String par4) {
        this.par4 = par4;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getVidProc() {
        return vidProc;
    }

    public void setVidProc(String vidProc) {
        this.vidProc = vidProc;
    }

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName;
    }

    public String getPriznak() {
        return priznak;
    }

    public void setPriznak(String priznak) {
        this.priznak = priznak;
    }

    public String getTextId() {
        return textId;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }

    public String getPrIskluch() {
        return prIskluch;
    }

    public void setPrIskluch(String prIskluch) {
        this.prIskluch = prIskluch;
    }

    public LocalDateTime getD_On() {
        return d_On;
    }

    public void setD_On(LocalDateTime d_On) {
        this.d_On = d_On;
    }

    public LocalDateTime getD_Off() {
        return d_Off;
    }

    public void setD_Off(LocalDateTime d_Off) {
        this.d_Off = d_Off;
    }

    public FlkGrafa getFlkGrafa() {
        return flkGrafa;
    }

    public void setFlkGrafa(FlkGrafa flkGrafa) {
        this.flkGrafa = flkGrafa;
    }

    public String getRulesInJson() {
        return rulesInJson;
    }

    public void setRulesInJson(String rulesInJson) {
        this.rulesInJson = rulesInJson;
    }

    public FlkTypeControl getFlkTypeControl() {
        return flkTypeControl;
    }

    public void setFlkTypeControl(FlkTypeControl flkTypeControl) {
        this.flkTypeControl = flkTypeControl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkChecks flkChecks = (FlkChecks) o;
        return Objects.equals(id, flkChecks.id) &&
                Objects.equals(idGrafa, flkChecks.idGrafa) &&
                Objects.equals(idCategory, flkChecks.idCategory) &&
                Objects.equals(idLvlFlk, flkChecks.idLvlFlk) &&
                Objects.equals(idProc, flkChecks.idProc) &&
                Objects.equals(codeCheck, flkChecks.codeCheck) &&
                Objects.equals(descriptionCheck, flkChecks.descriptionCheck) &&
                Objects.equals(descriptionError, flkChecks.descriptionError) &&
                Objects.equals(par2, flkChecks.par2) &&
                Objects.equals(par3, flkChecks.par3) &&
                Objects.equals(par4, flkChecks.par4) &&
                Objects.equals(active, flkChecks.active) &&
                Objects.equals(vidProc, flkChecks.vidProc) &&
                Objects.equals(procName, flkChecks.procName) &&
                Objects.equals(priznak, flkChecks.priznak) &&
                Objects.equals(textId, flkChecks.textId) &&
                Objects.equals(prIskluch, flkChecks.prIskluch) &&
                Objects.equals(d_On, flkChecks.d_On) &&
                Objects.equals(d_Off, flkChecks.d_Off) &&
                Objects.equals(rulesInJson, flkChecks.rulesInJson) &&
                Objects.equals(flkGrafa, flkChecks.flkGrafa) &&
                Objects.equals(flkTypeControl, flkChecks.flkTypeControl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idGrafa, idCategory, idLvlFlk, idProc, codeCheck, descriptionCheck, descriptionError, par2, par3, par4, active, vidProc, procName, priznak, textId, prIskluch, d_On, d_Off, rulesInJson, flkGrafa, flkTypeControl);
    }
}
