package by.btslogistics.fklservice.service.flk.dto.flk.flkchecks;

import by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol.FlkTypeControlCopyDto;

import java.util.Objects;

public class FlkChecksCopyDto  extends FlkChecksDto{

    /**
     * Ссылка на таблицу FLK_TYPE_CONTROL, которая хранит информацию
     * о типах контроля по каждому виду документа (СД-->ПД,СД аннулированная, ДТ, КДТ)
     */
    private FlkTypeControlCopyDto flkTypeControl;

    public FlkChecksCopyDto() {
    }

    public FlkChecksCopyDto(FlkChecksDto dto, FlkTypeControlCopyDto flkTypeControlCopyDto) {
        super.setIdGrafa(dto.getIdGrafa());
        super.setActive(dto.getActive());
        super.setRulesInJson(dto.getRulesInJson());
        super.setIdProc(dto.getIdProc());
        super.setIdLvlFlk(dto.getIdLvlFlk());
        super.setIdCategory(dto.getIdCategory());
        super.setD_Off(dto.getD_Off());
        super.setD_On(dto.getD_On());
        super.setPar2(dto.getPar2());
        super.setPar3(dto.getPar3());
        super.setPar4(dto.getPar4());
        super.setBlockRules(dto.getBlockRules());
        super.setCodeCheck(dto.getCodeCheck());
        super.setDescriptionCheck(dto.getDescriptionCheck());
        super.setDescriptionError(dto.getDescriptionError());
        super.setPrIskluch(dto.getPrIskluch());
        super.setPriznak(dto.getPriznak());
        super.setVidProc(dto.getVidProc());
        super.setTextId(dto.getTextId());
        super.setProcName(dto.getProcName());
        this.setFlkTypeControl(flkTypeControlCopyDto);
    }

    public FlkTypeControlCopyDto getFlkTypeControl() {
        return flkTypeControl;
    }

    public void setFlkTypeControl(FlkTypeControlCopyDto flkTypeControl) {
        this.flkTypeControl = flkTypeControl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlkChecksCopyDto that = (FlkChecksCopyDto) o;
        return Objects.equals(flkTypeControl, that.flkTypeControl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flkTypeControl);
    }
}
