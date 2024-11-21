package GUI.Extras;

public class EquipmentCount {
    private String name;
    private double price;
    private int totalCount;
    private int availableCount;
    private int categoryID; // New field for category ID
    private String description; // New field for description

    public EquipmentCount(String name, double price, int totalCount, int availableCount, int categoryID, String description) {
        this.name = name;
        this.price = price;
        this.totalCount = totalCount;
        this.availableCount = availableCount;
        this.categoryID = categoryID;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getDescription() {
        return description;
    }
}