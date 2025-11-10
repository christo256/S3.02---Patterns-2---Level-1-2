package task1_level2;

public class MarketStatus {
    private String status;
    private String description;

    public MarketStatus(String status, String description) {
        this.status = status;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Market Status: " + status + " - " + description;
    }
}
