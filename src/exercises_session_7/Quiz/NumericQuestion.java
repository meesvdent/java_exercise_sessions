package exercises_session_7.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static NumericQuestion parseQuestionString(String line){
        Scanner lineScanner = new Scanner(line);
        String question = lineScanner.next();
        double answer = lineScanner.nextDouble();
        return new NumericQuestion(question, answer);
    }
}
