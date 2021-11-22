package exercises_session_7.Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiplechoiceQuestion extends AbstractQuestion{
    private final String type = "multiplechoice";
    ArrayList<String> options;

    public MultiplechoiceQuestion(String question, String answer, ArrayList<String> options){
        super(question, answer);
        this.options = options;
    }

    @Override
    public String getType() {
        return type;
    }

    public ArrayList<String> getOptions(){
        return this.options;
    }

    public static MultiplechoiceQuestion parseQuestionString(String line){
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter(", ");
        String question = lineScanner.next();
        String answer = lineScanner.next();

        // Loop through multiple choice options at end of line
        ArrayList<String> options = new ArrayList<String>();
        while(lineScanner.hasNext()){
            options.add(lineScanner.next());
        }

        MultiplechoiceQuestion currentQuestion = new MultiplechoiceQuestion(question, answer, options);

        return currentQuestion;
    }
}
