package exercises_session_7.Quiz;

import java.util.ArrayList;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class NumericQuestion extends AbstractQuestion{

    double answer;
    String type = "numeric";

    public NumericQuestion(String question, double answer){
        super(question);
        this.question = question;
        this.answer = answer;
        System.out.println("Answer: "+ this.answer);
    }

    public String getType(){
        return this.type;
    }

    public boolean checkAnswer(double input){
        System.out.println("Your answer: " + input + " Correct answer: " + this.answer);
        System.out.println(this.answer == input);
        return this.answer == input;
    }

    public static NumericQuestion parseQuestionString(String line){
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter(", ");
        String question = lineScanner.next();
        double answer = lineScanner.nextDouble();
        return new NumericQuestion(question, answer);
    }

    public boolean askQuestion(Scanner scan){
        try{
            scan.useLocale(Locale.US);
            System.out.println(this.question);
            double userAnswer = scan.nextDouble();
            return this.checkAnswer(userAnswer);
        }
        catch (NoSuchElementException e){
            System.out.println("Error: you did not enter an answer!");
        }
        return this.askQuestion(scan);
    }
}
