package lab4.homework;

public class CompositeTree {
    AddOperator root = new AddOperator();

    CompositeTree(){
        MultOperator mult1 = new MultOperator();
        NumericOperand val1 = new NumericOperand('3');
        NumericOperand val2 = new NumericOperand('5');
        NumericOperand val3 = new NumericOperand('6');
        mult1.addChild(val2);
        mult1.addChild(val3);
        root.addChild(val1);
        root.addChild(mult1);

//        check if my answer works for a more complicated solution
//        MultOperator mult1 = new MultOperator();
//        NumericOperand val1 = new NumericOperand('2');
//        NumericOperand val2 = new NumericOperand('8');
//        NumericOperand val3 = new NumericOperand('9');
//        NumericOperand val4 = new NumericOperand('3');
//        AddOperator add1 = new AddOperator();
//
//        mult1.addChild(val1);
//        mult1.addChild(val2);
//        add1.addChild(val3);
//        add1.addChild(mult1);
//
//
//        root.addChild(add1);
//        root.addChild(val4);
    }

    public void iterate(Visitor v){
        String result = v.visit(root);
        v.setResult(result);
    }
}
