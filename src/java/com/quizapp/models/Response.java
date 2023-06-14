package com.quizapp.models;

public class Response {

    private Integer id;
    private Integer questionId;
    private String text;
    private boolean correct;

    public Response(Integer id, Integer questionId, String text, boolean correct) {
        this.id = id;
        this.questionId = questionId;
        this.text = text;
        this.correct = correct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
