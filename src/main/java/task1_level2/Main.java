package task1_level2;

public class Main {
    public static void main(String[] args) {


        Broker broker = new Broker();

        StockAgency agency1 = new StockAgency("Agency 1");
        StockAgency agency2 = new StockAgency("Agency 2");
        StockAgency agency3 = new StockAgency("Agency 3");
        StockAgency agency4 = new StockAgency("Agency 4");

        broker.addObserver(agency1);
        broker.addObserver(agency2);
        broker.addObserver(agency3);
        broker.addObserver(agency4);


        broker.removeObserver(agency4);

        broker.showObservers();

        broker.setMarketStatus("Up", "Stock prices are rising");
        broker.setMarketStatus("Down", "Stock prices are falling");
    }
}
