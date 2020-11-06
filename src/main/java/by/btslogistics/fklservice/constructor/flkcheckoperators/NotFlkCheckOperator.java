package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.FlkCheckExpressionVisitor;

public interface NotFlkCheckOperator<T> extends FlkCheckOperator<T> {

    FlkCheckOperator<T> operator();

    @Override
    default T accept(FlkCheckExpressionVisitor<T> visitor) {
        return visitor.visitNot(this);
    }
}
