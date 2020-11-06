package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator;

import by.btslogistics.fklservice.constructor.flkcheckoperators.XmlEqualFlkCheckOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.OperatorFactory;

import java.util.HashMap;
import java.util.List;

public class HMXmlEqualOperator<T> implements XmlEqualFlkCheckOperator {

    private OperatorFactory<T> operatorFactory;
    private HashMap<String, Object> operator;

    public HMXmlEqualOperator(OperatorFactory<T> operatorFactory, HashMap<String,Object> operator) {
        this.operatorFactory = operatorFactory;
        this.operator = operator;
    }

    @Override
    public String pathToElement() {
        String element = (String) operator.get("element");
        return element;
    }

    @Override
    public List<String> valueToCompare() {
        List<String> value = (List<String>) operator.get("values");
        return value;
    }
}
