package by.btslogistics.fklservice.dao.model.flk.model.jsonmodel;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "priority",
        "rulesType",
        "rules"
})
public class Conditions {

    @JsonProperty("priority")
    private String priority;
    @JsonProperty("rulesType")
    private String rulesType;
    @JsonProperty("rules")
    private List<Rule> rules = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("conditionsType")
    public String getRulesType() {
        return rulesType;
    }

    @JsonProperty("conditionsType")
    public void setRulesType(String rulesType) {
        this.rulesType = rulesType;
    }

    @JsonProperty("rules")
    public List<Rule> getRules() {
        return rules;
    }

    @JsonProperty("rules")
    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}