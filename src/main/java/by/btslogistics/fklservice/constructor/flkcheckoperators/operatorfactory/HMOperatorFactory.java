package by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory;

import by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator.HMIfThenOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator.HMXmlEqualOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.FlkCheckOperator;

import java.util.HashMap;

public class HMOperatorFactory<T> implements OperatorFactory<T> {

    @Override
    public FlkCheckOperator<T> create(String operatorName, Object context) {
        if (operatorName.equals("->")) {
            return new HMIfThenOperator<T>(this, (HashMap<String, HashMap<String, Object>>) context);
        }
        if (operatorName.equals("xmlEqual")) {
            return new HMXmlEqualOperator(this, (HashMap<String, HashMap<String, Object>>) context);
        }
        throw new IllegalArgumentException("Неизвестный тип оператора [" + operatorName + "]");

    }
}
