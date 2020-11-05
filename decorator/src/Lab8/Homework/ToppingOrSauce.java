package Lab8.Homework;

public abstract class ToppingOrSauce extends ToppingOrSauceDecorator {
    String itemName;
    int itemPrice;

    public ToppingOrSauce(Item item){
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
