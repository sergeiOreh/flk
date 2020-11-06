package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.FlkCheckExpressionVisitor;

public interface FlkCheckOperator<T> {
    T accept(FlkCheckExpressionVisitor<T> visitor);
}
