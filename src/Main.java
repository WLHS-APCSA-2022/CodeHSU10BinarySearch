import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumList = new int[100];
        for(int i = 0; i < myNumList.length; i++){
            myNumList[i] = (int)(Math.random()*(99+1)+1); //rand ints between 1 and 100
        }

        Arrays.sort(myNumList);
        int randIndex = (int)(Math.random()*(myNumList.length));
        int randNumToFind = myNumList[randIndex];

        //linear search


        //binary search

        long start1 = System.currentTimeMillis();
        long end1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Elapsed time in ms: " + (end1 - start1));
    }

    public static int linearSearch(int[] array, int target){
        for(int i = 0; i<array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int binarySearch(int[] array, int target,
                                       int start, int end){
        int mid = (start+end)/2;

        if(target == array[mid]){ //base case
            return mid;
        }
        if(target < array[mid]){
            return binarySearch(array,target, start, mid-1);
        }
        if(target > array[mid]){
            return binarySearch(array,target, mid+1, end);
        }
        return Integer.MAX_VALUE;
    }
}