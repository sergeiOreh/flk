package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator;

import by.btslogistics.fklservice.constructor.flkcheckoperators.RootOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.OperatorFactory;
import by.btslogistics.fklservice.constructor.flkcheckoperators.Operator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RootOperatorImpl<T> implements RootOperator<T> {
    private OperatorFactory<T> operatorFactory;
    private List<Object> tree;

    public RootOperatorImpl(OperatorFactory<T> operatorFactory, List<Object> tree) {
        this.operatorFactory = operatorFactory;
        this.tree = tree;
    }

    @Override
    public List<Operator<T>> children() {
        ArrayList<Operator<T>> children = new ArrayList<>();
        for (Object child : tree) {
            HashMap<String, Object> castedChild = (HashMap<String, Object>) child;
            String operatorName = (String) castedChild.get("operator");
            Operator<T> childOperator = operatorFactory.create(operatorName, castedChild);
            children.add(childOperator);
        }
        return children;
    }
}
