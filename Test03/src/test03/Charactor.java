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
public abstract class Charactor implements ICharactor {

    protected String name;
    protected int hp;
    protected int strength;

    public boolean isAlive() {
        return 0 < hp;
    }

    public int getDamage() {
        return strength + DQUtils.rollDice();
    }

    public void takeDamage(int damage
    ) {
        if (hp < damage) {
            hp = 0;
        } else {
            hp -= damage;
        }
    }

    public void doAction(ICharactor opponent) {
        //サイコロを振って攻撃判定。
        switch (DQUtils.rollDice()) {
            case 1:
                doNo1(opponent);
                return;
            case 2:
                doNo2(opponent);
                return;
            case 3:
                doNo3(opponent);
                return;
            case 4:
                doNo4(opponent);
                return;
            case 5:
                doNo5(opponent);
                return;
            case 6:
                doNo6(opponent);
                return;
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }
}
