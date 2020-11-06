package by.btslogistics.fklservice.dao.model.flk.model.jsonmodel;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Блок правил - совокупность всех логических условий
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "blockRulesType",
        "conditionsType",
        "conditions"
})
public class BlockRules {

    @JsonProperty("blockRulesType")
    private String blockRulesType;

    @JsonProperty("conditionsType")
    private String conditionsType;

    @JsonProperty("conditions")
    private List<Conditions> conditions = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("blockRulesType")
    public String getBlockRulesType() {return blockRulesType;}

    @JsonProperty("conditionsType")
    public String getConditionsType() {
        return conditionsType;
    }

    @JsonProperty("conditionsType")
    public void setConditionsType(String conditionsType) {
        this.conditionsType = conditionsType;
    }


    @JsonProperty("conditions")
    public List<Conditions> getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(List<Conditions> conditions) {
        this.conditions = conditions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BlockRules() {
    }
}