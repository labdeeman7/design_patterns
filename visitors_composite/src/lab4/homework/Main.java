package lab4.homework;

public class Main {
    public static void main(String[] args) {
        CompositeTree tree = new CompositeTree();
        Visitor printer = new PrintingVisitor();
        tree.iterate(printer);
        printer.printResult();
        Visitor calculator = new CalculatingVisitor();
        tree.iterate(calculator);
        calculator.printResult();
    }
}
