package task1_level2;

import java.util.ArrayList;
import java.util.List;

public class Broker implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private MarketStatus marketStatus;


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(marketStatus);
        }
    }

    public void setMarketStatus(String status, String description) {
        this.marketStatus = new MarketStatus(status, description);
        notifyObservers();
    }

    public void showObservers() {
        System.out.println("Current observers:");
        for (Observer o : observers) {
            if (o instanceof StockAgency) {
                System.out.println(((StockAgency) o).getName());
            } else {
                System.out.println(o);
            }
        }
    }
}
