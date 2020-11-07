package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator;

import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.OrOperator;

import java.util.List;

public class OrOperatorImpl<T> implements OrOperator<T> {
    @Override
    public List<Operator<T>> children() {
        return null;
    }
}
