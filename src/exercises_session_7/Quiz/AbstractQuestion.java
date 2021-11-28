package exercises_session_7.Quiz;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public abstract class AbstractQuestion implements Question{

    protected String question;
    protected String answer;

    public AbstractQuestion(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public AbstractQuestion(String question) {
        this.question = question;
    }

    public abstract String getType();

    public String getQuestion(){
        return this.question;
    }

    public boolean checkAnswer(String input){
        return this.answer.equals(input.toLowerCase());
    }


    public boolean askQuestion(Scanner scan){
        try{
            System.out.println(this.question);
            String userAnswer = scan.next();
            return this.checkAnswer(userAnswer);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: you did not enter an answer!");
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        return this.askQuestion(scan);
    }
}
