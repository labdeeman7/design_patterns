package lab4.homework;

import java.util.List;
import java.util.stream.Collectors;

public class PrintingVisitor implements Visitor {
    String result;

    public String visit(NumericOperand operandNode){
        return String.valueOf(operandNode.value);
    }

    public String visit(AddOperator addNode){
        List<String> childInfixList =
                addNode.children.stream().map(e -> e.iterate(this) ).collect(Collectors.toList());
        String childInfix = childInfixList.get(0) + addNode.value +  childInfixList.get(1);
        return  childInfix ;
    }

    public String visit(MultOperator multNode){
        List<String> childInfixList =
                multNode.children.stream().map(e -> e.iterate(this) ).collect(Collectors.toList());
        String childInfix = childInfixList.get(0) + multNode.value +  childInfixList.get(1);
        return childInfix ;
    }

    public void setResult(String result) {
        this.result = result;
    }
    public void printResult(){
        System.out.println("print the expression  = " + result);
    };
}
