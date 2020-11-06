package by.btslogistics.fklservice.constructor.flkcheckoperators;

import by.btslogistics.fklservice.constructor.visitor.FlkCheckExpressionVisitor;

import java.util.List;

public interface XmlEqualFlkCheckOperator<T> extends FlkCheckOperator<T> {

    String pathToElement();
    List<String> valueToCompare();
    @Override
    default T accept(FlkCheckExpressionVisitor<T> visitor) {
        return visitor.visitXmlEqual(this);
    }
}
