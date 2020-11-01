package lab4.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddOperator implements Node {

    private List<Node> children = new ArrayList<>();

    char value;

    AddOperator(){
        this.value = '+';
    }

    public String iterate(Visitor v){
        return v.visit(this);
    }
    public void addChild(Node child)
    {
        children.add(child);
    }
    public void removeChild(Node child)
    {
        children.remove(child);
    }
}
