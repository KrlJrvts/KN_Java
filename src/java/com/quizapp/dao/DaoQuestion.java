package com.quizapp.dao;

import com.quizapp.models.Question;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;
import java.util.List;

public class DaoQuestion {
    private Connection connection;

    public DaoQuestion() {

        Dotenv dotenv = Dotenv.configure()
                .filename(".local.env")
                .ignoreIfMissing().load();

        if (dotenv == null) {
            dotenv = Dotenv.load();
        }

        String url = dotenv.get("DB_URL");
        String username = dotenv.get("DB_USERNAME");
        String password = dotenv.get("DB_PASSWORD");

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void saveQuestion(Question question){

    }

    public void updateQuestion(Question question){

    }

    public void deleteQuestion(Integer questionId) {

    }

    public Question getQuestionById(Integer questionId) {
        return null;
    }

    public List<Question> getQuestionsByTopic(String topic) {
        return null;
    }

}
