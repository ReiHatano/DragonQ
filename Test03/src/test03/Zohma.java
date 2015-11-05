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
public class Zohma extends Charactor {

    public Zohma(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    @Override
    public void doNo1(ICharactor opponent) {
        hp -= 10;
        System.out.println("❏" + name + "は、いきりたって" + opponent.getName() + "に突進した！");
        System.out.println("しかし、" + opponent.getName() + "はひらりと攻撃をかわし、反撃した！");
        System.out.println(opponent.getName() + "は" + name + "に10ポイントのダメージを与えた！");
    }

    @Override
    public void doNo2(ICharactor opponent) {
        System.out.println("❏" + name + "は燃え盛る火炎を吐いた！しかし、" + opponent.getName() + "はひらりと攻撃をかわした！");
    }

    @Override
    public void doNo3(ICharactor opponent) {
        int damage = getDamage();
        opponent.takeDamage(damage);
        System.out.println("❏" + name + "は" + opponent.getName() + "に向かって両腕を叩きつけた！" + opponent.getName() + "は" + damage + "ポイントのダメージを受けた！");
    }

    @Override
    public void doNo4(ICharactor opponent) {
        doNo3(opponent);
    }

    @Override
    public void doNo5(ICharactor opponent) {
        System.out.println("❏" + name + "は破壊の呪文を唱えた！");
        System.out.println("しかし！" + opponent.getName() + "は呪文の効果を無効化した！");
    }

    @Override
    public void doNo6(ICharactor opponent) {
        int damage = getDamage() * 3;
        opponent.takeDamage(damage);
        System.out.println("❏" + name + "はすべての魔力を解き放った！");
        System.out.println(opponent.getName() + "は攻撃を避けることはできなかった！");
        System.out.println(opponent.getName() + "は" + damage + "ポイントのダメージを受けた！");         //16%くらいの発生率だけど、ダメージ３倍という一発逆転仕様
    }
}
