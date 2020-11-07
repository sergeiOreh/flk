package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.Visitor;

public interface Operator<T> {
    T accept(Visitor<T> visitor);
}
