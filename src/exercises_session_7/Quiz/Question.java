package exercises_session_7.Quiz;

public interface Question {
    public String getQuestion();
    public String getType();
    public boolean checkAnswer(String providedAnswer);

}
