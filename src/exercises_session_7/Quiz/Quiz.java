package exercises_session_7.Quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Quiz {

    ArrayList<AbstractQuestion> questions;

    public Quiz(String questionFolder){
        ArrayList<String> questionFiles = this.listQuestionFiles(questionFolder, new ArrayList<>());
        this.questions = new ArrayList<>(this.parseQuestions(questionFiles));
    }

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

    public ArrayList<AbstractQuestion> parseQuestions(ArrayList<String> questionFiles){

        ArrayList<AbstractQuestion> questions = new ArrayList<>();

        for(String file : questionFiles){
            try(Scanner questionScanner = new Scanner(new FileReader(file))) {
                questionScanner.nextLine();
                while(questionScanner.hasNextLine()){
                    questionScanner.useDelimiter(", ");
                    String questionType = questionScanner.next();
                    String currentLine = questionScanner.nextLine();

                    if(questionType.equals("multiplechoice")){
                        try{
                            questions.add(MultiplechoiceQuestion.parseQuestion(currentLine));
                        } catch(NullPointerException e){
                            e.printStackTrace();
                        }
                    }
                    if(questionType.equals("text")){
                        try{
                            questions.add(TextQuestion.parseQuestionString(currentLine));
                        } catch (NullPointerException e){
                            e.printStackTrace();
                        }
                    }
                    if(questionType.equals("numeric")){
                        try{
                            questions.add(NumericQuestion.parseQuestionString(currentLine));
                        } catch(NullPointerException e){
                            e.printStackTrace();
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } ;
        }
        System.out.println(questions.size());

        for(AbstractQuestion question : questions){
            System.out.println(question.getQuestion());
            if(question.getType().equals("multiplechoice")){
                System.out.println(((MultiplechoiceQuestion) (question)).getOptions());
            }
        }

        return questions;
    }

    public void quiz(){
        int score = 0;
        System.out.println("Welcome to my Java quiz! Here is your first question:");
        try(Scanner scan = new Scanner(System.in)) {
            scan.useLocale(Locale.US);
            for (AbstractQuestion question : this.questions) {
                boolean correct = question.askQuestion(scan);
                if (correct) {
                    System.out.println("Your answer is correct!");
                    score++;
                } else {
                    System.out.println("Your answer is not correct :(");
                }
            }
        }
        System.out.println("Final score: " + score);
    }

    public static void main(String[] args) {
        Quiz testQuiz = new Quiz("src/exercises_session_7/Quiz/Questions");
        testQuiz.quiz();
    }
}
