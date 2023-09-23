/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prisontest;

/**
 *
 * @author hp
 */
public class PrisonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cell c01 = new Cell("A01", false, "1234");

        Prisoner p01 = new Prisoner("Bubba", 2.08, 4, c01);

        p01.display(true);
        c01.openDoor("cwreetve");
        c01.openDoor("1234");
        c01.openDoor("1234");
    }

}
