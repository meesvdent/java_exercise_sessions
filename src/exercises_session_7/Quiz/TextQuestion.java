package exercises_session_7.Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

    public static ArrayList<String> parseQuestionString(String line){
        Scanner lineScan = new Scanner(line);
        String question = lineScan.next();
        String answer = lineScan.next();
        ArrayList<String> questionElements = new ArrayList<>();
        questionElements.add(question);
        questionElements.add(answer);
        return questionElements;
    }

}
