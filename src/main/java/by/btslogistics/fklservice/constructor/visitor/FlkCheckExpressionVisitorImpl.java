package by.btslogistics.fklservice.constructor.visitor;

import by.btslogistics.fklservice.constructor.flkcheckoperators.*;
import by.btslogistics.fklservice.dao.model.flk.model.flkresult.FlkResult;

import java.util.ArrayList;
import java.util.List;

public class FlkCheckExpressionVisitorImpl implements FlkCheckExpressionVisitor<Boolean> {

    private SdXml xml;
    List<FlkResult> results = new ArrayList<>();

    public FlkCheckExpressionVisitorImpl(SdXml xml) {
        this.xml = xml;
    }


    @Override
    public Boolean visitRoot(RootFlkCheckOperator<Boolean> root) {
        for (FlkCheckOperator<Boolean> child : root.childs()) {
            child.accept(this);
        }
        return true;
    }

    @Override
    public Boolean visitAnd(AndFlkCheckOperator<Boolean> and) {
        for (FlkCheckOperator<Boolean> child : and.children()) {
            if (!child.accept(this)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean visitIfThen(IfThenFlkCheckOperator<Boolean> ifThen) {
        if (ifThen.ifOperator().accept(this)) {
            return ifThen.thenOperator().accept(this);
        }
        return true;
    }

    @Override
    public Boolean visitNot(NotFlkCheckOperator<Boolean> not) {
        return !not.operator().accept(this);
    }

    @Override
    public Boolean visitOr(OrFlkCheckOperator<Boolean> or) {
        for (FlkCheckOperator<Boolean> child : or.children()) {
            if (child.accept(this)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean visitXmlEqual(XmlEqualFlkCheckOperator<Boolean> xmlEqual) {
        String pathToElement = xmlEqual.pathToElement();
        String value = xml.getValue(pathToElement);
        return value.equals(xmlEqual.valueToCompare());
    }

//    public boolean visitCheck(CheckFlkOperator<Boolean> check){
//        if(!check.isValid().accept(this)){
//            results.add(new FlkResult(check.errorCode()));
//        }
//        return true;
//    }
}
