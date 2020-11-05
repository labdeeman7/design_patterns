package Lab8.Homework;

public class Main {
    public static void main(String[] args) {

        //Order neapolitan pizza with garlic and Tomato sauce
        Item neatolitanPizza = new NeapolitanPizza();
        Item neatolitanPizzaWithGarlicTopping = new Garlic(neatolitanPizza);
        Item neatolitanPizzaWithGarlicToppingAndTomatoSauce = new TomatoSauce(neatolitanPizzaWithGarlicTopping);

        String fullDescription = neatolitanPizzaWithGarlicToppingAndTomatoSauce.getFullDescription();
        System.out.println("full description is " + fullDescription  );

        int totalPrice = neatolitanPizzaWithGarlicToppingAndTomatoSauce.getFinalPrice();
        System.out.println("Total Price is " + totalPrice  );


        //Order deepdishpizza with mozarella and Basil and Garlic

        Item deepDishPizza = new DeepDishPizza();
        Item deepDishPizzaWithMozzarella = new Mozzarella(deepDishPizza);
        Item deepDishPizzaWithMozzarellaAndBasil = new Basil(deepDishPizzaWithMozzarella);
        Item deepDishPizzaWithMozzarellaAndBasilAndGarlic = new Garlic(deepDishPizzaWithMozzarellaAndBasil);

        String fullDescriptionOrder2 = deepDishPizzaWithMozzarellaAndBasilAndGarlic.getFullDescription();
        System.out.println("full description is " + fullDescriptionOrder2  );

        int totalPriceOrder2 = deepDishPizzaWithMozzarellaAndBasilAndGarlic.getFinalPrice();
        System.out.println("Total Price is " + totalPriceOrder2  );


    }
}
