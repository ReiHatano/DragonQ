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
public interface ICharactor {

    boolean isAlive();

    int getDamage();

    void doNo1(ICharactor opponent);
    void doNo2(ICharactor opponent);
    void doNo3(ICharactor opponent);
    void doNo4(ICharactor opponent);
    void doNo5(ICharactor opponent);
    void doNo6(ICharactor opponent);

    void takeDamage(int i);

    String getName();
    int getHp();

    public void doAction(ICharactor charactor);
}
