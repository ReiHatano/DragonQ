/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

/**
 * 質問を表すclass
 * @author logostron10
 */
public class Question {
    private int questionNo;
    private String question;
    private String[] choice;
    private int answer;

    public Question(int questionNo, String question, String[] choice, int answer) {
        this.questionNo = questionNo;
        this.question = question;
        this.choice = choice;
        this.answer = answer;
    }
    
    /**
     * @return the questionNo
     */
    public int getQuestionNo() {
        return questionNo;
    }

    /**
     * @param questionNo the questionNo to set
     */
    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the choice
     */
    public String[] getChoice() {
        return choice;
    }

    /**
     * @param choice the choice to set
     */
    public void setChoice(String[] choice) {
        this.choice = choice;
    }

    /**
     * @return the answer
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    /**
     * 選択肢の文字列を構築する
     *
     * @param choice 選択肢の配列
     * @return
     */
    public String createChoiceString() {
        String str = ""; // StringBuilder sb = new StringBuilder()
        for (int i = 0; i < choice.length; i++) {
            str += (i + 1); // str = str + (i + 1) // sb.append(i + 1)
            str += ".";
            str += choice[i];
        }
        return str; // sb.toString()
    }

    public String createQuestinString() {
        return "問題" + questionNo;
    }

    public boolean isCorrectAnswer(int input) {
        return input - 1 == answer;
    }
}
