package exercises_session_7.Quiz;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

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
        return this.answer.equals(input);
    }


}
