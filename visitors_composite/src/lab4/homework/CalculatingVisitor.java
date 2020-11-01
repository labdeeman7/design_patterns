package lab4.homework;

import java.util.List;
import java.util.stream.Collectors;

public class CalculatingVisitor implements Visitor {
    public String result;

    public String visit(NumericOperand operandNode){
        return String.valueOf(operandNode.value);
    }
    public String visit(AddOperator addNode){
        int childCalc = addNode.children.stream().map(e -> Integer.parseInt(e.iterate(this)) )
                .reduce(0, (a, b) -> a + b);
        return Integer.toString(childCalc);
    }
    public String visit(MultOperator multNode){
        int childCalc = multNode.children.stream().map(e -> Integer.parseInt(e.iterate(this)))
                .reduce(1, (a, b) -> a * b);
        return Integer.toString(childCalc) ;
    }

    public void setResult(String result) {
        this.result = result;
    }
    public void printResult(){
        System.out.println("evaluate the expression  = " + result);
    };

}
