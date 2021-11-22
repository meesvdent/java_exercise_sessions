package exercises_session_7.Quiz;

public class TextQuestion extends AbstractQuestion{
    private final String type = "text";

    public TextQuestion(String question, String answer){
        super(question, answer);
    }

    @Override
    public String getType(){
        return this.type;
    }

}
