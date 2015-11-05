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
public class Ortega extends Charactor {

    Ortega(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    @Override
    public void doNo1(ICharactor opponent) {
        int damage = getDamage() + 15;
        opponent.takeDamage(damage);
        takeDamage(8);
        System.out.println("❏" + name + "は" + opponent.getName() + "に危険をかえりみず斬りかかった！！" + opponent.getName() + "に" + damage + "ポイントのダメージを与えた！");
        System.out.println(name + "は攻撃の反動により8ポイントのダメージを受けた！");
    }

    @Override
    public void doNo2(ICharactor opponent) {
        System.out.println("❏" + name + "は" + opponent.getName() + "に斬りかかった！しかし、攻撃は外れた！");
    }

    @Override
    public void doNo3(ICharactor opponent) {
        strength += 7;
        System.out.println("❏" + name + "は力の呪文を唱えた！");
        System.out.println(name + "のちからが上がった！");
    }

    @Override
    public void doNo4(ICharactor opponent) {
        int damage = getDamage();
        opponent.takeDamage(damage);
        System.out.println("❏" + name + "は" + opponent.getName() + "に斬りかかった！");
        System.out.println("攻撃は命中！" + opponent.getName() + "に" + damage + "ポイントのダメージを与えた！");
    }

    @Override
    public void doNo5(ICharactor opponent) {
        int heal = 15 + new java.util.Random().nextInt(21);
        hp += heal;
        System.out.println("❏" + name + "は回復の呪文を唱えた！" + name + "の傷はみるみるふさがっていく！HPが" + heal + "ポイント回復した！");
    }

    @Override
    public void doNo6(ICharactor opponent) {
        int damage = getDamage() * 2;
        opponent.takeDamage(damage);
        System.out.println("❏" + name + "は" + opponent.getName() + "に激しく斬りかかった！会心の一撃！" + opponent.getName() + "に" + damage + "ポイントのダメージを与えた！");
    }

}
