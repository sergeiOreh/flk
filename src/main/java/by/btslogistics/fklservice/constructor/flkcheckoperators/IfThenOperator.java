package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.Visitor;

public interface IfThenOperator<T> extends Operator<T> {

    Operator<T> ifOperator();

    Operator<T> thenOperator();

    @Override
    default T accept(Visitor<T> visitor) {
        return visitor.process(this);
    }
}
