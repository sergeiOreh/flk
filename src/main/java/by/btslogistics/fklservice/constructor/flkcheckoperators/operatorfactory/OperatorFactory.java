package by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory;

import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;

public interface OperatorFactory<T> {
    Operator<T> create(String operatorName, Object context);
}
