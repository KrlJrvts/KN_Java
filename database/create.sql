CREATE TABLE Question (
    id INT PRIMARY KEY,
    topic VARCHAR(255),
    difficulty INT,
    content VARCHAR(255)
);

CREATE TABLE Response (
    id INT PRIMARY KEY,
    question_id INT,
    text VARCHAR(255),
    is_correct BOOLEAN,
    FOREIGN KEY (question_id) REFERENCES Question(id)
)