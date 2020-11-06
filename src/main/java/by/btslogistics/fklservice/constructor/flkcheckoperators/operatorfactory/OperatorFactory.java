package by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory;

import by.btslogistics.fklservice.constructor.flkcheckoperators.FlkCheckOperator;

public interface OperatorFactory<T> {
    FlkCheckOperator<T> create(String operatorName, Object context);
}
