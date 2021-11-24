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

    public static ArrayList<String> parseQuestion(String line){
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter(", ");
        String question = lineScanner.next();
        String answer = lineScanner.next();

        // Loop through multiple choice options at end of line
        ArrayList<String> options = new ArrayList<String>();
        while(lineScanner.hasNext()){
            options.add(lineScanner.next());
        }

        ArrayList<String> questionElements = new ArrayList<>();
        questionElements.add(question);
        questionElements.add(answer);
        questionElements.addAll(options);

        return questionElements;

    }

    @Override
    public String getType() {
        return type;
    }

    public ArrayList<String> getOptions(){
        return this.options;
    }

}
