package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator.my;

import by.btslogistics.fklservice.constructor.flkcheckoperators.NotOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.OperatorFactory;

import java.util.HashMap;

public class NotOperatorImpl<T> implements NotOperator<T> {

    private OperatorFactory<T> operatorFactory;
    private HashMap<String, Object> operators;

    @Override
    public Operator<T> operator() {
        return null;
    }
}
