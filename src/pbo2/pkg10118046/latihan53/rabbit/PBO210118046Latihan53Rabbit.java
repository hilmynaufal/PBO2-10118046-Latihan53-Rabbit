/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan53.rabbit;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menggunakan ckonstruktor untuk menginisialisasi value ke variabel class rabbit
 */
public class PBO210118046Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + rabbit.getName());
        System.out.println("Peter is Vegetarian? " + rabbit.isVegetarian());
        System.out.println("Peter has " + rabbit.getNoOfLegs() + " legs.");
        System.out.println("Peter color is " + rabbit.getColor());
    }

}
