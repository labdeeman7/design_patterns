package Lab8.Homework;

public abstract class Pizza implements Item {
    String itemName;
    int itemPrice;
    public String getFullDescription(){
        return itemName;
    }

    public int getFinalPrice(){
        return itemPrice;
    }
}
