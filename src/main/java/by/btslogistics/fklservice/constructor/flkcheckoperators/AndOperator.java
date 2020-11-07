package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.Visitor;

import java.util.List;

public interface AndOperator<T> extends Operator<T> {

    List<Operator<T>> children();

    @Override
    default T accept(Visitor<T> visitor) {
        return visitor.process(this);
    }
}
