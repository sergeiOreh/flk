package by.btslogistics.fklservice.constructor.visitor;

import by.btslogistics.fklservice.constructor.flkcheckoperators.*;

public interface Visitor<T> {
    T process(RootOperator<T> operator);
    T process(AndOperator<T> operator);
    T process(IfThenOperator<T> operator);
    T process(NotOperator<T> operator);
    T process(OrOperator<T> operator);
    T process(EqualOperator<T> operator);
}
