package task1_level1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void addToppings(String topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
