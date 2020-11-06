package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.FlkCheckExpressionVisitor;

import java.util.List;

public interface AndFlkCheckOperator<T> extends FlkCheckOperator<T> {

    List<FlkCheckOperator<T>> children();

    @Override
    default T accept(FlkCheckExpressionVisitor<T> visitor) {
        return visitor.visitAnd(this);
    }
}
