package task1_level1;

public interface PizzaBuilder {

    PizzaBuilder setSize(String size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder addToppings(String topping);
    Pizza Build();
}
