package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.FlkCheckExpressionVisitor;

public interface IfThenFlkCheckOperator<T> extends FlkCheckOperator<T>{

    FlkCheckOperator<T> ifOperator();

    FlkCheckOperator<T> thenOperator();

    @Override
    default T accept(FlkCheckExpressionVisitor<T> visitor) {
        return visitor.visitIfThen(this);
    }
}
