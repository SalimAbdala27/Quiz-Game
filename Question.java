package com.company;

import java.util.Locale;

public class Question {
    private String questionPrompt;
    private int questionDifficulty;
    private String answer;

    public Question(String questionPrompt, String answer, int questionDifficulty) {
        this.questionPrompt = questionPrompt;
        this.answer = answer;
        this.questionDifficulty = questionDifficulty;
    }

    public int getQuestionDifficulty() {
        return questionDifficulty;
    }

    public void setQuestionDifficulty(int questionDifficulty) {
        this.questionDifficulty = questionDifficulty;
    }

    public String getquestionPrompt() {
        return questionPrompt;
    }

    public void setPrompt(String questionPrompt) {
        this.questionPrompt = questionPrompt;
    }

    public String getAnswer() {
        return answer.toLowerCase(Locale.ROOT);
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
