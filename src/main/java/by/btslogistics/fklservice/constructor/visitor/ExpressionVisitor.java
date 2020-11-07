package by.btslogistics.fklservice.constructor.visitor;

import by.btslogistics.fklservice.constructor.flkcheckoperators.*;
import by.btslogistics.fklservice.dao.model.flk.model.flkresult.FlkResult;

import java.util.ArrayList;
import java.util.List;

public class ExpressionVisitor implements Visitor<Boolean> {

    private SdXml xml;
    List<FlkResult> results = new ArrayList<>();

    public ExpressionVisitor(SdXml xml) {
        this.xml = xml;
    }

    @Override
    public Boolean process(RootOperator<Boolean> root) {
        for (Operator<Boolean> child : root.children()) {
            child.accept(this);
        }
        return true;
    }

    @Override
    public Boolean process(AndOperator<Boolean> and) {
        for (Operator<Boolean> child : and.children()) {
            if (!child.accept(this)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean process(IfThenOperator<Boolean> ifThen) {
        if (ifThen.ifOperator().accept(this)) {
            return ifThen.thenOperator().accept(this);
        }
        return true;
    }

    @Override
    public Boolean process(NotOperator<Boolean> not) {
        return !not.operator().accept(this);
    }

    @Override
    public Boolean process(OrOperator<Boolean> or) {
        for (Operator<Boolean> child : or.children()) {
            if (child.accept(this)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean process(EqualOperator<Boolean> xmlEqual) {
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
