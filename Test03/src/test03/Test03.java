package test03;

public class Test03 {

    public static void main(String[] args) {
        openning();
        ICharactor ortega = new Ortega("勇者オルテガ", 50, 7);
        ICharactor zohma = new Zohma("大魔王ゾーマ", 70, 8);
        battle(new ICharactor[]{ortega, zohma});   //名前、HP、ちから
    }

    public static void openning() {
        System.out.println("大魔王ゾーマが現れた！");
        System.out.println("大魔王ゾーマとの戦いが始まった！");
        System.out.println("");
    }

    private static void battle(ICharactor[] charactors) {
        int turn = 0;
        while (charactors[0].isAlive() && charactors[1].isAlive()) {

            System.out.println("【" + charactors[turn].getName() + "のターン】");
            System.out.println("");

            charactors[turn].doAction(charactors[1-turn]);

            System.out.println("--------------------------");
            for (int i = 0; i < 2; i++) {
                System.out.println(charactors[i].getName() + "のHPは" + charactors[i].getHp());           // それぞれのHPを表示
            }
            System.out.println("--------------------------");
            System.out.println("エンターキーを押して下さい");
            new java.util.Scanner(System.in).nextLine();
            System.out.println("");
            turn = 1 - turn;
        }

        if (!charactors[0].isAlive()) {                                                                                          //勇者のHPが０以下になってしまったときのエンディング
            System.out.println(charactors[0].getName() + "は戦いに敗れた。");
            System.out.println("世界は破滅した・・。");
        } else if (!charactors[1].isAlive()) {                                                                                  //大魔王のHPが0以下になったときのエンディング
            System.out.println(charactors[1].getName() + "を倒した！");
            System.out.println("ふたたび世界に平和が訪れた。");
        }
    }
}
