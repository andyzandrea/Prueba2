/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneda;

import java.util.Random;

/**
 *
 * @author Andrea
 */
public class Moneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
 int lanza = rnd.nextInt(2);
 if (lanza == 1) {
 System.out.println("Cayó águila");
 } else {
 System.out.println("Cayó sol");
 }
    }
    
}
