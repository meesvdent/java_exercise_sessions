package exercises_session_7.Quiz;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiplechoiceQuestion extends AbstractQuestion{

    private final String type = "multiplechoice";
    ArrayList<String> options;

    public MultiplechoiceQuestion(String question, String answer, ArrayList<String> options){
        super(question, answer);
        this.options = options;
    }

    public static MultiplechoiceQuestion parseQuestion(String line){
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter(", ");
        String question = lineScanner.next();
        String answer = lineScanner.next().toLowerCase();

        // Loop through multiple choice options at end of line
        ArrayList<String> options = new ArrayList<String>();
        while(lineScanner.hasNext()){
            options.add(lineScanner.next());
        }

        MultiplechoiceQuestion newQuestion = new MultiplechoiceQuestion(question, answer, options);

        return newQuestion;

    }

    @Override
    public String getType() {
        return type;
    }

    public ArrayList<String> getOptions(){
        return this.options;
    }

    public boolean askQuestion(Scanner scan){
        System.out.println(this.getQuestion());
        System.out.println("Your options are:");
        System.out.println(this.getOptions());
        System.out.println("Which answer do you choose?");
        String userAnswer = scan.next();
        return this.checkAnswer(userAnswer);
    }

}
