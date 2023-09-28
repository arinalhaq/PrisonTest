/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisontest;

/**
 *
 * @author hp
 */
public class Cell {

    private String name;
    private boolean isOpen;
    private int securityCode;

    public Cell(String name, boolean isOpen, int securityCode) {
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }

    public String getName() {
        return name;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(int securityCode) {
        String status = this.isOpen ? "Opened" : "Closed";
        System.out.println("The Cell " + this.name + " is " + status);

        if (this.securityCode != securityCode) {
            System.out.println("Security Code is Incorrect\n");
            return;
        }

        // open/close the door
        this.isOpen = !this.isOpen;
        
        status = this.isOpen ? "Opened" : "Closed";
        System.out.println("Now, The Cell" + this.name + " is " + status + "\n");
    }
}
