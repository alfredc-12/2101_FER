/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Extras;

public class Package {
    private int packageID;
    private String packageName;
    private byte[] packageImage;

    public Package(int packageID, String packageName, byte[] packageImage) {
        this.packageID = packageID;
        this.packageName = packageName;
        this.packageImage = packageImage;
    }

    public int getPackageID() {
        return packageID;
    }

    public String getPackageName() {
        return packageName;
    }

    public byte[] getPackageImage() {
        return packageImage;
    }
}