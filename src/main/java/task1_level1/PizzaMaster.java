package task1_level1;

public class PizzaMaster {
    private PizzaBuilder builder;

    public PizzaMaster(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makeHawaiianPizza() {
        return builder
                .setSize("Largue")
                .setDough("Thick")
                .addToppings("Ham")
                .addToppings("Tomato")
                .addToppings("Cheese")
                .addToppings("Pineapple")
                .Build();
    }

    public Pizza makeVegetarianPizza() {
        return builder
                .setSize("Large")
                .setDough("Thick")
                .addToppings("Tomato")
                .addToppings("Cheese")
                .addToppings("Mushrooms")
                .addToppings("Pepper")
                .Build();
    }
}