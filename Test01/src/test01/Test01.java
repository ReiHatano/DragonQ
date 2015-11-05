package test01;

import java.util.InputMismatchException;

public class Test01 {

    private static int point = 0;


    public static void main(String[] args) {
//        question(1, "最も人口の多い国はどれでしょうか。", new String[]{"アメリカ合衆国", "ネパール王国", "フランス公国", "中華人民共和国"}, 3);

//        Question q = new Question();
//        q.setQuestionNo(1);
//        q.setQuestion("最も人口の多い国はどれでしょうか。");
//        q.setChoice( new String[]{"アメリカ合衆国", "ネパール王国", "フランス公国", "中華人民共和国"});
//        q.setAnswer(3);

        // String[] strArray = new String[4];
        // strArray[0] = "アメリカ合衆国";
        // strArray[1] = "ネパール王国";
        // strArray[2] = "フランス公国";
        // strArray[3] = "中華人民共和国";
        Question q = new Question(1, "最も人口の多い国はどれでしょうか。", new String[]{"アメリカ合衆国", "ネパール王国", "フランス公国", "中華人民共和国"}, 3);
        question(q);
        question(new Question(2, "最もGDPが高い国はどれでしょうか。", new String[]{"アメリカ合衆国", "ネパール王国", "フランス公国", "中華人民共和国"}, 0));
        System.out.println("あなたの合計正解数は" + point + "です。");

    }

    private static void question(Question q) {
        System.out.println(q.createQuestinString());
        System.out.println(q.getQuestion() + "以下の選択肢から回答と思う番号を入力してEnterキーを押して下さい。");
//        System.out.println(createChoiceString(choice));
        System.out.println(q.createChoiceString());
        try {
            int input = new java.util.Scanner(System.in).nextInt();
            if (q.isCorrectAnswer(input)) {
                System.out.println("正解です！");
                point += 1;
            } else if (q.getChoice().length < input) {
                System.out.println("不適切なキー入力です");
                question(q);
            } else {
                System.out.println("違います。正解は" + (q.getAnswer() + 1) + "." + (q.getChoice()[q.getAnswer()]));
            }
        } catch (InputMismatchException e) {
            System.out.println("不適切なキー入力です");
            question(q);
        }

    }

    // -- -- -- -- -- -- -- -- -- -- 

    /**
     * 質問を処理する
     *
     * @param questionNo 質問番号
     * @param question　質問
     * @param choice　選択肢の配列
     * @param answer 答え(index)
     */
    private static void question(int questionNo, String question, String[] choice, int answer) {
        System.out.println("問題" + questionNo);
        System.out.println(question + "以下の選択肢から回答と思う番号を入力してEnterキーを押して下さい。");
        System.out.println(createChoiceString(choice));
        try {
            int input = new java.util.Scanner(System.in).nextInt();
            if (input - 1 == answer) {
                System.out.println("正解です！");
                point += 1;
            } else if (choice.length < input) {
                System.out.println("不適切なキー入力です");
                question(questionNo, question, choice, answer);
            } else {
                System.out.println("違います。正解は" + (answer + 1) + "." + choice[answer]);
            }
        } catch (InputMismatchException e) {
            System.out.println("不適切なキー入力です");
            question(questionNo, question, choice, answer);
        }

    }

    public static void ques01() {

        System.out.println("問題1");
        System.out.println("最も人口の多い国はどれでしょうか。以下の選択肢から回答と思う番号を入力してEnterキーを押して下さい。");
        System.out.println("1.アメリカ合衆国　2.ネパール王国　3.フランス公国　4.中華人民共和国");
        try {
            int input01 = new java.util.Scanner(System.in).nextInt();

            switch (input01) {
                case 1:
                case 2:
                case 3:
                    System.out.println("違います。正解は4.中華人民共和国です");
                    break;

                case 4:
                    System.out.println("正解です！");
                    point += 1;
                    break;

                default:
                    System.out.println("不適切なキー入力です");
                    ques01();

            }
        } catch (InputMismatchException e) {
            System.out.println("不適切なキー入力です");
            ques01();

        }

    }

    public static void ques02() {

        System.out.println("");
        System.out.println("問題2");
        System.out.println("最もGDPが高い国はどれでしょうか。以下の選択肢から回答と思う番号を入力してEnterキーを押して下さい。");
        System.out.println("1.アメリカ合衆国　2.ネパール王国　3.フランス公国　4.中華人民共和国");
        try {
            int input02 = new java.util.Scanner(System.in).nextInt();
            switch (input02) {
                case 4:
                case 2:
                case 3:
                    System.out.println("違います。正解は1.アメリカ合衆国です");
                    break;

                case 1:
                    System.out.println("正解です！");
                    point += 1;
                    break;

                default:
                    System.out.println("不適切なキー入力です");
                    ques02();
            }
        } catch (InputMismatchException e) {
            System.out.println("不適切なキー入力です");
            ques02();
        }
    }

}
