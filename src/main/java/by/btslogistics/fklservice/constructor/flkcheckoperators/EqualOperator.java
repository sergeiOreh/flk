package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.Visitor;

import java.util.List;

public interface EqualOperator<T> extends Operator<T> {

    String pathToElement();

    List<String> valueToCompare();

    @Override
    default T accept(Visitor<T> visitor) {
        return visitor.process(this);
    }
}
