package exercises_session_3;
import java.util.Arrays;

public class PlayerAnalyser {

    public static int minGoalsScored(int[] nbGoalsScored){
        int min = Integer.MAX_VALUE;
        for(int goals : nbGoalsScored){
            if(goals < min){
                min = goals;
            }
        }
        return min;
    }

    public static int maxGoalsScored(int[] nbGoalsScored){
        int max = Integer.MIN_VALUE;
        for(int goals : nbGoalsScored){
            if(goals > max){
                max = goals;
            }
        }
        return max;
    }

    public static double meanGoalsScored(int[] nbGoalsScored){
        double total = 0;
        double n = 0;
        for(int goals : nbGoalsScored){
            total = total + goals;
            n ++;
        }
        double mean;
        if(n>0){
            mean = total / n;
            return mean;
        } else{
            System.out.println("No goals");
            mean = 0;
            return mean;
        }
    }

    public static double medianGoalsScored(int[] nbGoalsScored){
        //Arrays.sort sorts a given list in ascending order
        Arrays.sort(nbGoalsScored);

        //Add code here
        int halfLength = nbGoalsScored.length / 2;
        double median;
        if((halfLength % 2) == 1){
            median = (double) (nbGoalsScored[halfLength] + nbGoalsScored[halfLength + 1]) / 2;
        } else{
            median = (double) nbGoalsScored[Math.round(halfLength)];
        }
        return median;
    }

    public static void main(String[] args){
        int[] testSet1 = {0,10,2,3,0,1};
        int[] testSet2 = {1,3,2,8,0};

        int min = PlayerAnalyser.minGoalsScored(testSet1);
        System.out.println("Min: " + min);
        int max = PlayerAnalyser.maxGoalsScored(testSet1);
        System.out.println("Max: " + max);
        double mean = PlayerAnalyser.meanGoalsScored(testSet1);
        System.out.println("Mean: " + mean);
        double median = PlayerAnalyser.medianGoalsScored(testSet1);
        System.out.println("Median: " + median);


        min = PlayerAnalyser.minGoalsScored(testSet2);
        System.out.println("Min: " + min);
        max = PlayerAnalyser.maxGoalsScored(testSet2);
        System.out.println("Max: " + max);
        mean = PlayerAnalyser.meanGoalsScored(testSet2);
        System.out.println("Mean: " + mean);
        median = PlayerAnalyser.medianGoalsScored(testSet2);
        System.out.println("Median: " + median);
    }

}
