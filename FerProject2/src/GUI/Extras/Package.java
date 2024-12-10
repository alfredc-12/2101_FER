/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Extras;
public class Package {
    private int packageID;
    private String packageName;
    private double rentedPrice;
    private String packageDesc;
    private byte[] packageImage;

    public Package(int packageID, String packageName, double rentedPrice, String packageDesc, byte[] packageImage) {
        this.packageID = packageID;
        this.packageName = packageName;
        this.rentedPrice = rentedPrice;
        this.packageDesc = packageDesc;
        this.packageImage = packageImage;
    }

    public int getPackageID() {
        return packageID;
    }

    public String getPackageName() {
        return packageName;
    }

    public double getRentedPrice() {
        return rentedPrice;
    }

    public String getPackageDesc() {
        return packageDesc;
    }

    public byte[] getPackageImage() {
        return packageImage;
    }
}