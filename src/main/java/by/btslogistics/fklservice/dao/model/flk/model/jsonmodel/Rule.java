package by.btslogistics.fklservice.dao.model.flk.model.jsonmodel;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "element",
        "sourceOperator",
        "level",
        "logicalOperator",
        "values"
})
public class Rule {

    @JsonProperty("element")
    private String element;
    @JsonProperty("sourceOperator")
    private String sourceOperator;
    @JsonProperty("level")
    private String level;
    @JsonProperty("logicalOperator")
    private String logicalOperator;
    @JsonProperty("values")
    private List<String> values = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("element")
    public String getElement() {
        return element;
    }

    @JsonProperty("element")
    public void setElement(String element) {
        this.element = element;
    }

    @JsonProperty("sourceOperator")
    public String getSourceOperator() {
        return sourceOperator;
    }

    @JsonProperty("sourceOperator")
    public void setSourceOperator(String sourceOperator) {
        this.sourceOperator = sourceOperator;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("logicalOperator")
    public String getLogicalOperator() {
        return logicalOperator;
    }

    @JsonProperty("logicalOperator")
    public void setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    @JsonProperty("values")
    public List<String> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Rule{" +
                "element='" + element + '\'' +
                ", sourceOperator='" + sourceOperator + '\'' +
                ", level='" + level + '\'' +
                ", logicalOperator='" + logicalOperator + '\'' +
                ", values=" + values +
                '}';
    }
}