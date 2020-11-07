package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator.my;

import by.btslogistics.fklservice.constructor.flkcheckoperators.AndOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.OperatorFactory;

import java.util.HashMap;
import java.util.List;

public class AndOperatorImpl<T> implements AndOperator<T> {

    @Override
    public List<Operator<T>> children() {
        return null;
    }
}
