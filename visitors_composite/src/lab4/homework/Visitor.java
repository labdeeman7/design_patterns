package lab4.homework;

public interface Visitor {
    String visit(NumericOperand operandNode);
    String visit(AddOperator addNode);
    String visit(MultOperator multNode);
    void setResult(String result);
    void printResult();
}
