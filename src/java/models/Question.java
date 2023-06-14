package java.models;

import java.util.List;

public class Question {
    private Integer id;
    private Integer difficulty;
    private String content;
    private List<Response> responses;

    public Question(Integer id, Integer difficulty, String content, List<Response> responses) {
        this.id = id;
        this.difficulty = difficulty;
        this.content = content;
        this.responses = responses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }
}
