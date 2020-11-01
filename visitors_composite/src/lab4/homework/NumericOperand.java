package lab4.homework;

public class NumericOperand implements Node{
    char value;

    NumericOperand(char value){
        this.value = value;
    }

    public String iterate(Visitor v){
        return v.visit(this);
    }
}
