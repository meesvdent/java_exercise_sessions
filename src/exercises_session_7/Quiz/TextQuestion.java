package exercises_session_7.Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TextQuestion extends AbstractQuestion{
    private final String type = "text";

    public TextQuestion(String question, String answer){
        super(question, answer);
    }

    @Override
    public String getType(){
        return this.type;
    }

    public static TextQuestion parseQuestionString(String line){
        Scanner lineScan = new Scanner(line);
        lineScan.useDelimiter(", ");
        String question = lineScan.next();
        String answer = lineScan.next().toLowerCase();
        TextQuestion newQuestion = new TextQuestion(question, answer);
        return newQuestion;
    }

    public boolean askQuestion(Scanner scan){
        System.out.println("hello");
        try{
            System.out.println(this.question);
            String userAnswer = scan.next();
            return this.answer.equals(userAnswer);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: you did not enter an answer!");
        }
        return this.askQuestion(scan);
    }
}
