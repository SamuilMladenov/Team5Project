package GroupProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionDataLoader {
    public static List<QuestionAnswer> loadQuestions(String filePath) {
        List<QuestionAnswer> questions = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Split CSV line by comma
                String questionText = data[0];
                String imagePath = data[1];
                String correctAnswer = data[2];
                String wrongAnswer1 = data[3];
                String wrongAnswer2 = data[4];
                String wrongAnswer3 = data[5];

                QuestionAnswer question = new QuestionAnswer(questionText, imagePath, correctAnswer, wrongAnswer1, wrongAnswer2, wrongAnswer3);
                questions.add(question);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questions;
    }
}
