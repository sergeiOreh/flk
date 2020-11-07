package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator;

import by.btslogistics.fklservice.constructor.flkcheckoperators.AndOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;

import java.util.List;

public class AndOperatorImpl<T> implements AndOperator<T> {
    @Override
    public List<Operator<T>> children() {
        return null;
    }
}
