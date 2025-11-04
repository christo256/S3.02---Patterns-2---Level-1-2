package task1_level1;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public HawaiianPizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public HawaiianPizzaBuilder setDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public HawaiianPizzaBuilder addToppings(String topping) {
        pizza.addToppings(topping);
        return this;
    }

    @Override
    public Pizza Build() {
        return pizza;
    }
}
