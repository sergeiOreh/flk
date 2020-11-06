package by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator;

import by.btslogistics.fklservice.constructor.flkcheckoperators.RootFlkCheckOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.OperatorFactory;
import by.btslogistics.fklservice.constructor.flkcheckoperators.FlkCheckOperator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HMRootOperator<T> implements RootFlkCheckOperator<T> {
    private OperatorFactory<T> operatorFactory;
    private List<Object> tree;

    public HMRootOperator(OperatorFactory<T> operatorFactory, List<Object> tree) {
        this.operatorFactory = operatorFactory;
        this.tree = tree;
    }

    @Override
    public List<FlkCheckOperator<T>> childs() {
        ArrayList<FlkCheckOperator<T>> children = new ArrayList<>();
        for (Object child : tree) {
            HashMap<String, Object> castedChild = (HashMap<String, Object>) child;
            String operatorName = (String) castedChild.get("operator");
            FlkCheckOperator<T> childOperator = operatorFactory.create(operatorName, castedChild);
            children.add(childOperator);
        }
        return children;
    }
}
