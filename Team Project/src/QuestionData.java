package GroupProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class QuestionData {
    private static List<QuestionAnswer> questions = new ArrayList<>();
    private static List<QuestionAnswer> usedQuestions = new ArrayList<>();

    static {
        initializeQuestions();
    }

    private static void initializeQuestions() {
        String filePath = "Team Project/src/EasyQuestionData.csv";
        questions.addAll(QuestionDataLoader.loadQuestions(filePath));
    }


    public static QuestionAnswer getRandomQuestion() {
        if (questions.isEmpty()) {
            throw new IllegalStateException("No more questions available."); // Throw an exception
        }

        Random random = new Random();
        int randomIndex = random.nextInt(questions.size());
        QuestionAnswer randomQuestion = questions.get(randomIndex);

        // Move the used question from questions to usedQuestions list
        usedQuestions.add(randomQuestion);
        questions.remove(randomIndex);

        return randomQuestion;
    }
}
