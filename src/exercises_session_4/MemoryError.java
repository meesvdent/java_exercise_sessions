package exercises_session_4;

import java.util.ArrayList;

public class MemoryError {
    public static void main(String[] args) {
        String[] array = {};
        boolean infinite = true;
        int i = 0;
        ArrayList<String> stringArrayList = new ArrayList<String>();

        stringArrayList.add("This string will be copied many times.");

        while(infinite){
            System.out.println(i);
            try{
                stringArrayList.addAll(stringArrayList);
            } catch (OutOfMemoryError oome){
                System.out.println("Memory error");
                infinite = false;
                continue;
            }
            i ++;
        }
    }
}
