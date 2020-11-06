package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator;

import by.btslogistics.fklservice.constructor.flkcheckoperators.FlkCheckOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.IfThenFlkCheckOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.OperatorFactory;

import java.util.HashMap;

public class HMIfThenOperator<T> implements IfThenFlkCheckOperator<T> {

    private OperatorFactory<T> operatorFactory;
    private HashMap<String, HashMap<String, Object>> operator;

    public HMIfThenOperator(OperatorFactory<T> operatorFactory, HashMap<String, HashMap<String, Object>> operator) {
        this.operatorFactory = operatorFactory;
        this.operator = operator;
    }

    @Override
    public FlkCheckOperator<T> ifOperator() {
        HashMap<String, Object> ifOperator = (HashMap<String, Object>) operator.get("if");
        String operatorName = (String) ifOperator.get("operator");
        return operatorFactory.create(operatorName, ifOperator);
    }

    @Override
    public FlkCheckOperator<T> thenOperator() {
        HashMap<String, Object> ifOperator = (HashMap<String, Object>) operator.get("then");
        String operatorName = (String) ifOperator.get("operator");
        return operatorFactory.create(operatorName, ifOperator);
    }
}
