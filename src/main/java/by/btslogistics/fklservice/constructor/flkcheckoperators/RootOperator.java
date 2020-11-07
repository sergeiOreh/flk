package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.Visitor;

import java.util.List;

public interface RootOperator<T> extends Operator<T> {

    @Override
    default T accept(Visitor<T> visitor) {
        return visitor.process(this);
    }

    List<Operator<T>> children();
}
