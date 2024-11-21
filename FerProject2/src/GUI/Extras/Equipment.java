package GUI.Extras;

public class Equipment {
    private String name;
    private int categoryID;
    private double price;
    private String description;
    private boolean availability;

    public Equipment(String name, int categoryID, double price, String description, boolean availability) {
        this.name = name;
        this.categoryID = categoryID;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailability() {
        return availability;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}