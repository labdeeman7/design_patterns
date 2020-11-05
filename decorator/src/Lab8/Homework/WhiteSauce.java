package Lab8.Homework;

public class WhiteSauce extends ToppingOrSauceDecorator {
    String itemName = "WhiteSauce";
    int itemPrice = 20;

    public WhiteSauce(Item item){
        super(item);
    }

    public String getFullDescription(){
        String description = super.getFullDescription();
        String totalDescription = addCurrentItemDescription(description);
        return totalDescription;
    }

    private String addCurrentItemDescription(String description){
        String totalDescription = description + " + " + this.itemName;
        return totalDescription;
    }

    public int getFinalPrice(){
        int price = super.getFinalPrice();
        int totalPrice = addCurrentItemPrice(price);
        return totalPrice;
    }

    private int addCurrentItemPrice(int price){
        int totalPrice = price + this.itemPrice;
        return totalPrice;
    }

}
