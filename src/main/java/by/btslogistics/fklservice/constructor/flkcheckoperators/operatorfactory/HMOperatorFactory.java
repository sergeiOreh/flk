package by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory;

import by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator.IfThenOperatorImpl;
import by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator.EqualOperatorImpl;
import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;

import java.util.HashMap;

public class HMOperatorFactory<T> implements OperatorFactory<T> {

    @Override
    public Operator<T> create(String operatorName, Object context) {
        if (operatorName.equals("->")) {
            return new IfThenOperatorImpl<T>(this, (HashMap<String, HashMap<String, Object>>) context);
        }
        if (operatorName.equals("xmlEqual")) {
            return new EqualOperatorImpl(this, (HashMap<String, HashMap<String, Object>>) context);
        }
        throw new IllegalArgumentException("Неизвестный тип оператора [" + operatorName + "]");

    }
}
