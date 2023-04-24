import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        int[] myNumList = new int[100];
        for(int i = 0; i < myNumList.length; i++){
            myNumList[i] = (int)(Math.random()*(99+1)+1); //rand ints between 1 and 100
        }

        int randIndex = (int)(Math.random()*(myNumList.length));
        int randNumToFind = myNumList[randIndex];

        //linear search


        //binary search

        long start1 = System.currentTimeMillis();
        long end1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Elapsed time in ms: " + (end1 - start1));
    }

    public static boolean linearSearch(int[] array, int target){
        return false;
    }

    public static boolean binarySearch(int[] array, int target){
        return false;
    }
}