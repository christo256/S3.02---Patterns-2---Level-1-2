package task1_level2;

public class StockAgency implements Observer {
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(MarketStatus marketStatus) {
        System.out.println(name + " received notification: " + marketStatus);
    }
}

