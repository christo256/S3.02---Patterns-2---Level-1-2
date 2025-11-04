package task1_level1;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public VegetarianPizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public VegetarianPizzaBuilder setDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public VegetarianPizzaBuilder addToppings(String topping) {
        pizza.addToppings(topping);
        return this;
    }

    @Override
    public Pizza Build() {
        return pizza;
    }
}
