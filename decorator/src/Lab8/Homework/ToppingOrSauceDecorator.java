package Lab8.Homework;

//Decorator
public abstract class ToppingOrSauceDecorator implements Item {
    Item wrappedItem;

    ToppingOrSauceDecorator(Item item){
        this.wrappedItem = item;
    }

    public String getFullDescription(){
        return wrappedItem.getFullDescription();
    }

    public int getFinalPrice(){
        return wrappedItem.getFinalPrice();
    }
}
