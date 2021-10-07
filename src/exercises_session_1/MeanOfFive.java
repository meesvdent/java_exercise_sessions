package exercises_session_1;

public class MeanOfFive {

    float[] floatArray;

    public MeanOfFive(){
        floatArray = new float[] {1.0F, 3.56F, 2F, 8F, 99.9F};
    }

    public float meanOfArray(float[] floatArray) {
        float total = 0;
        int n = 0;
        for(int i=0; i<5; i++){
            total += floatArray[i];
            n += 1;
        }

        return total / n;
    }

    public static void main(String[] args){
        MeanOfFive meanOfFive;
        meanOfFive = new MeanOfFive();

        System.out.println(meanOfFive.meanOfArray(meanOfFive.floatArray));

    }
}
