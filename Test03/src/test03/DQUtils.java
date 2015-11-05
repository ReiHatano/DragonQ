/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test03;

/**
 *
 * @author logostron10
 */
public class DQUtils {

    public static int rollDice() {
        return new java.util.Random().nextInt(6) + 1; //サイコロをふる
    }
}
