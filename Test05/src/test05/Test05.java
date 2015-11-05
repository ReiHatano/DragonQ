/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test05;

/**
 *
 * @author logostron10
 */
public class Test05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fujisan fuji = new Fujisan();
        Asosan aso = new Asosan();
        IMountain[] mountains = new IMountain[]{fuji, aso};
        for (int i = 0; i < mountains.length; i++) {
            System.out.println(mountains[i].getName() + mountains[i].getHeight() + "m");
        }
    }
}
