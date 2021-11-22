package exercises_session_7.Quiz;

public class MultiplechoiceQuestion extends AbstractQuestion{
    private final String type = "multiplechoice";
    String[] options;

    public MultiplechoiceQuestion(String question, String answer, String[] options){
        super(question, answer);
        this.options = options;
    }

    @Override
    public String getType() {
        return type;
    }

    public String[] getOptions(){
        return this.options;
    }
}
