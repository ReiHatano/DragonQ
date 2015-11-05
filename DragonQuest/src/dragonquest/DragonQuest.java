package dragonquest;

public class DragonQuest {

    public static void main(String[] args) {
        makecharacter(0,0,0);
        
    }
    private static void makecharacter(int strength, int agility, int toughness){
        System.out.println("勇者の名前を入力してください");
        String nameH = new java.util.Scanner(System.in).nextLine();
        
        System.out.println("勇者のステータスを入力してください。各ステータスの合計が20になるように設定してください");
        
        do{  
        System.out.print("ちから");
        strength = new java.util.Scanner(System.in).nextInt();
        System.out.print("すばやさ");
        agility = new java.util.Scanner(System.in).nextInt();
        System.out.print("たいりょく");
        toughness = new java.util.Scanner(System.in).nextInt();
        System.out.println("--------------------------------------");
        System.out.println(nameH + "のステータス");
        System.out.println("ちから"+strength+"    すばやさ"+agility+"   たいりょく"+toughness);
        System.out.println("--------------------------------------");
        }while((strength+agility+toughness) != 20);
    }
}