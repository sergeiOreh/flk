package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.FlkCheckExpressionVisitor;

import java.util.List;

public interface RootFlkCheckOperator<T> extends FlkCheckOperator<T> {
    @Override
    default T accept(FlkCheckExpressionVisitor<T> visitor) {
        return visitor.visitRoot(this);
    }

    List<FlkCheckOperator<T>> childs();
}
