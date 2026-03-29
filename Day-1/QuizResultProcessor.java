import java.util.ArrayList;
import java.util.List;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

public class QuizResultProcessor {
    private List<Integer> scores = new ArrayList<>();

    public int compareAnswers(String[] correctAnswers, String[] userAnswers) throws InvalidQuizSubmissionException {
        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch");
        }
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equals(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    public String calculateGrade(int score, int total) {
        double percentage = (double) score / total * 100;
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public static void main(String[] args) {
        QuizResultProcessor processor = new QuizResultProcessor();
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        String[] user1Answers = {"A", "B", "C", "D", "A"};
        String[] user2Answers = {"A", "B", "D", "D", "A"};
        try {
            int score1 = processor.compareAnswers(correctAnswers, user1Answers);
            processor.addScore(score1);
            System.out.println("User 1 Score: " + score1);
            System.out.println("User 1 Grade: " + processor.calculateGrade(score1, correctAnswers.length));

            int score2 = processor.compareAnswers(correctAnswers, user2Answers);
            processor.addScore(score2);
            System.out.println("User 2 Score: " + score2);
            System.out.println("User 2 Grade: " + processor.calculateGrade(score2, correctAnswers.length));
        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}