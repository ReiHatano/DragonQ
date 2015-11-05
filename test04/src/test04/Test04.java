/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test04;

/**
 *
 * @author logostron10
 */
public class Test04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Test04 test04_1 = new Test04("a");
//        Test04 test04_2 = new Test04("b");
//        Test04 test04_3 = new Test04("c");
//        test04_2.hoge();

        int x = 5; // 組み込み型
        String y = "hoge";
        Test04 z = new Test04("sugoi");
        function1(x, y, z);
        System.out.println("function1の後" + x + ", " + y + ", " + z);
    }

    private static void function1(int x, String y, Test04 z) {
        System.out.println("function1の最初" + x + ", " + y + ", " + z);
        x = 6;
        y = "fuga";
        z.setStr("hidoi");
//        z = new Test04("hidoi");
        System.out.println("function1の最後" + x + ", " + y + ", " + z);
    }

    private String str;

    public Test04(String str) {
        this.str = str;
    }

    private void hoge() {
        System.out.println(str);
    }

    private void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "[" + str + "]";
    }
}
