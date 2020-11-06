package by.btslogistics.fklservice.service.flk.dto.flk.flkchecks;

import by.btslogistics.fklservice.dao.model.flk.model.jsonmodel.BlockRules;
import by.btslogistics.fklservice.service.flk.dto.flk.flkgrafa.FlkGrafaDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class FlkChecksDto {

    private Long id;

    /**
     * Ссылка на таблицу FLK_GRAFA, которая хранит информацию
     * о всех графах(пронумерованных полях на бланке декларации) и их соответствие полям в БД
     */
    private Integer idGrafa;

    /**
     * Ссылка на таблицу FLK_CATEGORY_ERROR, которая хранит информацию
     * 1 - Ошибка
     * 2 - Предупреждение
     * 3-  Информирование
     */
    private Integer idCategory;

    /**
     * Ссылка на таблицу FLK_
     * Уровни проверки, начиная с обычной проверки на заполнение и заканчивая проверкой
     * конкретных значений
     */
    private Integer idLvlFlk;

    /**
     * Ссылка на таблицу FLK_LIST_PROCEDURES, которая хранит информацию
     * о имени вызываемой процедуры Oracle и кол-ве входных, выходных параметров
     */
    private Integer idProc;

    /**
     * Код проверки формата XXX.XXX.XXX.XX.X
     * Код проверки согласно документации, предоставляемой (ГТК) вместе с xsd-описанием
     * структуры документа
     * Пример - ESD.001.003.04.1
     */
    private String codeCheck;

    /**
     * Описание проверки
     */
    private String descriptionCheck;

    /**
     * Описание ошибки, отправляемой клиенту
     */
    private String descriptionError;

    /**
     * Параметр в процедуру
     */
    private String par2;

    /**
     * Параметр в процедуру
     */
    private String par3;

    /**
     * Параметр в процедуру
     */
    private String par4;

    /**
     * Признак активности проверки
     * 0 - неактивна
     * 1 - активна
     */
    private String active;

    /**
     * Вид процедуры (действия)
     */
    private String vidProc;

    /**
     * Код процедуры (функции)
     */
    private String procName;

    /**
     * Признак
     */
    private String priznak;

    /**
     * Ссылка на текст сообщения (резервное поле)
     */
    private String textId;


    /**
     * признак исключения (резервное поле)
     */
    private String prIskluch;

    /**
     * Дата актуализации процедуры
     */
    private LocalDateTime d_On;

    /**
     *  Дата деактуализации процедуры
     */
    private LocalDateTime d_Off;

    /*  @JsonIgnoreProperties(value = {"flkChecks"})*/

    // имя поля должно совпадать с названием сушности.
    private FlkGrafaDto flkGrafa;

    private String rulesInJson;

    private List<BlockRules> blockRules;

    public FlkChecksDto() {
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

    public FlkGrafaDto getFlkGrafa() {
        return flkGrafa;
    }

    public void setFlkGrafa(FlkGrafaDto flkGrafa) {
        this.flkGrafa = flkGrafa;
    }

    public String getRulesInJson() {
        return rulesInJson;
    }

    public void setRulesInJson(String rulesInJson) {
        this.rulesInJson = rulesInJson;
    }

    public List<BlockRules> getBlockRules() {
        return blockRules;
    }

    public void setBlockRules(List<BlockRules> blockRules) {
        this.blockRules = blockRules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlkChecksDto that = (FlkChecksDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idGrafa, that.idGrafa) &&
                Objects.equals(idCategory, that.idCategory) &&
                Objects.equals(idLvlFlk, that.idLvlFlk) &&
                Objects.equals(idProc, that.idProc) &&
                Objects.equals(codeCheck, that.codeCheck) &&
                Objects.equals(descriptionCheck, that.descriptionCheck) &&
                Objects.equals(descriptionError, that.descriptionError) &&
                Objects.equals(par2, that.par2) &&
                Objects.equals(par3, that.par3) &&
                Objects.equals(par4, that.par4) &&
                Objects.equals(active, that.active) &&
                Objects.equals(vidProc, that.vidProc) &&
                Objects.equals(procName, that.procName) &&
                Objects.equals(priznak, that.priznak) &&
                Objects.equals(textId, that.textId) &&
                Objects.equals(prIskluch, that.prIskluch) &&
                Objects.equals(d_On, that.d_On) &&
                Objects.equals(d_Off, that.d_Off) &&
                Objects.equals(flkGrafa, that.flkGrafa) &&
                Objects.equals(rulesInJson, that.rulesInJson) &&
                Objects.equals(blockRules, that.blockRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idGrafa, idCategory, idLvlFlk, idProc, codeCheck, descriptionCheck, descriptionError, par2, par3, par4, active, vidProc, procName, priznak, textId, prIskluch, d_On, d_Off, flkGrafa, rulesInJson, blockRules);
    }
}
