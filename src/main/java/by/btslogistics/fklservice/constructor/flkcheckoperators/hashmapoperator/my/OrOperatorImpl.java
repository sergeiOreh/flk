package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator.my;

import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.OrOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.OperatorFactory;

import java.util.HashMap;
import java.util.List;

public class OrOperatorImpl<T> implements OrOperator<T> {

    private OperatorFactory<T> operatorFactory;
    private HashMap<String, Object> operators;

    public OrOperatorImpl(OperatorFactory<T> operatorFactory, HashMap<String, Object> operators) {
        this.operatorFactory = operatorFactory;
        this.operators = operators;
    }

    @Override
    public List<Operator<T>> children() {
        return null;
    }
}
