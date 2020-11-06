package by.btslogistics.fklservice.constructor.visitor;

import by.btslogistics.fklservice.constructor.flkcheckoperators.*;

public interface  FlkCheckExpressionVisitor<T> {
    T visitRoot(RootFlkCheckOperator<T> root);

    T visitAnd(AndFlkCheckOperator<T> and);
    T visitIfThen(IfThenFlkCheckOperator<T> ifThen);
    T visitNot(NotFlkCheckOperator<T> not);
    T visitOr(OrFlkCheckOperator<T> or);
    T visitXmlEqual(XmlEqualFlkCheckOperator<T> xmlEqual);
}
