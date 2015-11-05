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
class Fujisan implements IMountain {

    public Fujisan() {
    }

    @Override
    public String getName() {
        return "富士山";
    }

    @Override
    public int getHeight() {
        return 3776;
    }
    
    public void nipponichi() {
        System.out.println("日本一！");
    }
}
