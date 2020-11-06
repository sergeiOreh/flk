package by.btslogistics.fklservice.service.flk.dto.flk.flktypecontrol;

import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksCopyDto;
import by.btslogistics.fklservice.service.flk.dto.flk.flkchecks.FlkChecksDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlkTypeControlCopyDto extends FlkTypeControlDto {

    private List<FlkChecksCopyDto> flkChecks = new ArrayList<>();

    public List<FlkChecksCopyDto> getFlkChecks() {
        return flkChecks;
    }

    public void setFlkChecks(List<FlkChecksCopyDto> flkChecks) {
        this.flkChecks = flkChecks;
    }

    public void cloneFlkChecks(List<FlkChecksDto> flkChecks, FlkTypeControlCopyDto flkTypeControlCopyDto){
        flkChecks.forEach(x->this.flkChecks.add(new FlkChecksCopyDto(x, flkTypeControlCopyDto)));
    }

    public FlkTypeControlCopyDto(){

    }

    // copy constructor
    public FlkTypeControlCopyDto(FlkTypeControlCopyDto dto) {
        super.setId(dto.getId());
        super.setNameType(dto.getNameType());
        super.setDescription(dto.getDescription());
        super.setdOn(dto.getdOn());
        super.setdOff(dto.getdOff());
        super.setActive(dto.getActive());
        super.setDefaultControl(dto.getDefaultControl());
        super.setDateCreate(dto.getDateCreate());
        super.setDateUpdate(dto.getDateUpdate());
        super.setIdTypeDocument(dto.getIdTypeDocument());

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlkTypeControlCopyDto that = (FlkTypeControlCopyDto) o;
        return Objects.equals(flkChecks, that.flkChecks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flkChecks);
    }
}
