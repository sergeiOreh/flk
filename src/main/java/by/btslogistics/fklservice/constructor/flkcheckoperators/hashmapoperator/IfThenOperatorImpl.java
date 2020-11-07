package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator;

import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.IfThenOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.OperatorFactory;

import java.util.HashMap;

public class IfThenOperatorImpl<T> implements IfThenOperator<T> {

    private OperatorFactory<T> operatorFactory;
    private HashMap<String, HashMap<String, Object>> operator;

    public IfThenOperatorImpl(OperatorFactory<T> operatorFactory, HashMap<String, HashMap<String, Object>> operator) {
        this.operatorFactory = operatorFactory;
        this.operator = operator;
    }

    @Override
    public Operator<T> ifOperator() {
        HashMap<String, Object> ifOperator = (HashMap<String, Object>) operator.get("if");
        String operatorName = (String) ifOperator.get("operator");
        return operatorFactory.create(operatorName, ifOperator);
    }

    @Override
    public Operator<T> thenOperator() {
        HashMap<String, Object> ifOperator = (HashMap<String, Object>) operator.get("then");
        String operatorName = (String) ifOperator.get("operator");
        return operatorFactory.create(operatorName, ifOperator);
    }
}
