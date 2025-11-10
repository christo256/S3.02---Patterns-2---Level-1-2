# 📚 Java Design Patterns - Level 1 & Level 2

## 📄 Description

This repository contains Java exercises that demonstrate the implementation of **Design Patterns** in two levels:

- 🧱 **Level 1**: Builder Pattern - Pizza order management system.
- 👀 **Level 2**: Observer Pattern - Stock market notification system.

Each project includes:
- Code implementing design patterns
- Example usage with a `Main` class to demonstrate functionality
- Instructions to compile and run the projects

---

## 🧩 Level 1 - Builder Pattern

### 🍕 Exercise 1 - Pizza Order System

This exercise demonstrates the **Builder pattern** by creating a system to build pizzas with different configurations.

#### Requirements:
- The `Pizza` class has the following attributes: `size`, `dough`, and `toppings`.
- The `PizzaBuilder` interface defines methods to set the size, dough, and toppings of a pizza.
- Concrete builders implement `PizzaBuilder` for different types of pizzas (e.g., Hawaiian, Vegetarian).
- The `PizzaMaster` class receives a `PizzaBuilder` and constructs pizzas using a specific configuration.
- The `Main` class demonstrates building pizzas with different configurations.

#### Main features:
- Build pizzas of different types and sizes
- Add multiple toppings to a pizza
- Demonstrate the use of the Builder pattern

#### Files:
- **Pizza.java**: Represents a pizza with size, dough, and toppings.
- **PizzaBuilder.java**: Interface for pizza builders.
- **HawaiianPizzaBuilder.java**: Concrete builder for Hawaiian pizza.
- **VegetarianPizzaBuilder.java**: Concrete builder for Vegetarian pizza.
- **PizzaMaster.java**: Director class that orchestrates pizza construction.
- **Main.java**: Demonstrates creating different pizzas using the builders.

### Example usage:
```java
public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();

        PizzaMaster master = new PizzaMaster(hawaiianBuilder);
        Pizza hawaiianPizza = master.makeHawaiianPizza();
        System.out.println(hawaiianPizza);

        master = new PizzaMaster(vegetarianBuilder);
        Pizza vegetarianPizza = master.makeVegetarianPizza();
        System.out.println(vegetarianPizza);
    }
}
```

## 🧩 Level 2 - Observer Pattern
### 📈 Exercise 2 - Stock Market Notification System

This exercise demonstrates the Observer pattern by creating a system where a stock broker (observable) notifies multiple stock agencies (observers) when the market changes.

#### Requirements:

- The `Broker` class is the Observable that maintains a list of Observer instances.
- The `StockAgency` class implements Observer and receives notifications when the market status changes.
- The `MarketStatus` class contains information about the market (status and description).
- The `Main` class demonstrates registering observers and updating the market status.

#### Main features:

- Register and remove observers
- Notify all observers when market status changes
- Display updates for each observer

#### Files:

**Broker.java**: Observable class managing the list of observers and notifying them.
**StockAgency.java**: Observer class that receives notifications.
**MarketStatus.java**: Represents the current market status.
**Observable.java**: Interface for observable objects.
**Observer.java**: Interface for observers.
**Main.java**: Demonstrates creating observers, registering them, and updating market status.

### Example usage:
```java
public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();

        StockAgency agency1 = new StockAgency("Agency 1");
        StockAgency agency2 = new StockAgency("Agency 2");
        StockAgency agency3 = new StockAgency("Agency 3");

        broker.addObserver(agency1);
        broker.addObserver(agency2);
        broker.addObserver(agency3);

        broker.setMarketStatus("Up", "Stock prices are rising");
        broker.setMarketStatus("Down", "Stock prices are falling");
    }
}
```

## 💻 Technologies Used
· Java 21+
· Design Patterns: Builder, Observer
· Git & GitHub for version control
· IDE: IntelliJ IDEA

## 📋 Requirements

· JDK 11 or higher

· A Java IDE (such as IntelliJ IDEA or Eclipse)

· Basic knowledge of design patterns (Singleton and Abstract Factory)

· Basic Java knowledge (OOP, classes, interfaces, etc.)

---
## 🛠️ Installation

1. **Clone the repository:**

```bash
https://github.com/christo256/S3.02---Patterns-2---Level-1-2
