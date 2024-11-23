package GUI.Extras;

public class CustomerOrder {
    private String name;
    private String email;
    private String phone;
    private String address;
    private int userId;

    public CustomerOrder(String name, String email, String phone, String address, int userId) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getUserId() {
        return userId;
    }
}