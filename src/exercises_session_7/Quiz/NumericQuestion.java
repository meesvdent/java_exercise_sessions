package exercises_session_7.Quiz;

public class NumericQuestion extends AbstractQuestion{

    double answer;
    String type = "numeric";

    public NumericQuestion(String question, double answer){
        super(question);
        this.question = question;
        this.answer = answer;
    }

    public String getType(){
        return this.type;
    }

    public boolean checkAnswer(double input){
        return this.answer == input;
    }
}
