package lab4.homework;
import java.util.ArrayList;
import java.util.List;

public class MultOperator implements Node {
    private List<Node> children = new ArrayList<>();

    char value;

    MultOperator(){
        this.value = '*';
    }

    public String iterate(Visitor v){
        //overwrite
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
