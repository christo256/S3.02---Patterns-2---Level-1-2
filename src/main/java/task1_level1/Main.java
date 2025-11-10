package task1_level1;

public class Main {
    public static void main(String[] args) {

        var hawaiianBuilder = new HawaiianPizzaBuilder();
        var Master = new PizzaMaster(hawaiianBuilder);

        Pizza hawaiianPizza = Master.makeHawaiianPizza();
        System.out.println("Hawaiian Pizza: " + hawaiianPizza);

        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        var Master2 = new PizzaMaster(vegetarianBuilder);
        Pizza vegetarianPizza = Master2.makeVegetarianPizza();
        System.out.println("Vegetarian Pizza: " + vegetarianPizza);

    }
}