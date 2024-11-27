package GUI.Extras;
public class EquipmentCount {
    private int id;
    private String name;
    private double price;
    private int totalCount;
    private int availableCount;
    private int categoryID;
    private String description;
    private byte[] image;
    private boolean availability;

    public EquipmentCount(String name, double price, int totalCount, int availableCount, int categoryID, String description) {
        this.name = name;
        this.price = price;
        this.totalCount = totalCount;
        this.availableCount = availableCount;
        this.categoryID = categoryID;
        this.description = description;
    }

    // Getter and setter for ID
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    // Getter and setter for image
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for totalCount
    public int getTotalCount() {
        return totalCount;
    }

    // Getter and setter for availableCount
    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    // Getter for categoryID
    public int getCategoryID() {
        return categoryID;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter and setter for availability
    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}