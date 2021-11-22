package exercises_session_7.Quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Quiz {

    public ArrayList<String> listQuestionFiles(String questionFolder, ArrayList<String> questionFileList){
        final File folder = new File(questionFolder);
        for(final File fileEntry : Objects.requireNonNull(folder.listFiles())){
            if(fileEntry.isDirectory()){
                questionFileList.addAll(listQuestionFiles(fileEntry.getPath(), questionFileList));
            } else{
                questionFileList.add(fileEntry.getPath());
            }
        }
        return questionFileList;
    }

    public void ParseQuestions(ArrayList<String> questionFiles){

        ArrayList<AbstractQuestion> questions = new ArrayList<>();

        for(String file : questionFiles){
            try(Scanner questionScanner = new Scanner(new FileReader(file))) {
                questionScanner.nextLine();
                while(questionScanner.hasNextLine()){
                    questionScanner.useDelimiter(", ");
                    String questionType = questionScanner.next();
                    System.out.println(questionType);
                    String currentLine = questionScanner.nextLine();
                    System.out.println(currentLine);

                    if(questionType.equals("multiplechoice")){
                        try{questions.add(MultiplechoiceQuestion.parseQuestionString(currentLine));
                        } catch(NullPointerException e){
                            e.printStackTrace();
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } ;
        }

        System.out.println("Length: " + questions.size());
        for(AbstractQuestion question : questions){
            System.out.println(question.getQuestion());
            if(question.getType().equals("multiplechoice")){
                System.out.println(((MultiplechoiceQuestion) (question)).getOptions());
            }
        }
    }

    public static void main(String[] args) {
        Quiz testQuiz = new Quiz();
        ArrayList<String> fileList = testQuiz.listQuestionFiles("src/exercises_session_7/Quiz/Questions", new ArrayList<String>());
        System.out.println(fileList);
        testQuiz.ParseQuestions(fileList);
    }
}
