package by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory;

import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;
import by.btslogistics.fklservice.constructor.visitor.Visitor;

import java.util.List;

public class Condition implements Operator<Boolean> {

    List<Operator<Boolean>> operators;

    public Condition() {
        operators = null;
    }

    @Override
    public Boolean accept(Visitor<Boolean> visitor) {
        for (Operator<Boolean> operator : operators){
            operator.accept(visitor);
        }
        return true;
    }
}
