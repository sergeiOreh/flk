package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.Visitor;

public interface NotOperator<T> extends Operator<T> {

    Operator<T> operator();

    @Override
    default T accept(Visitor<T> visitor) {
        return visitor.process(this);
    }
}
