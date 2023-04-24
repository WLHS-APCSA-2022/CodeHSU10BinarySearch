import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumList = new int[10000];
        long start = System.nanoTime();
        for(int i = 0; i < myNumList.length; i++){
            myNumList[i] = (int)(Math.random()*(99+1)+1); //rand ints between 1 and 100
        }
        long duration = System.nanoTime() - start;
        System.out.println(duration + " ns");

        Arrays.sort(myNumList);
        int randIndex = (int)(Math.random()*(myNumList.length));
        int randNumToFind = myNumList[randIndex];

        //linear search
        long start1 = System.nanoTime();
        int location = linearSearch(myNumList,randNumToFind);
        long end1 = System.nanoTime();
        System.out.println();
        System.out.println("Location: " + location);
        System.out.println("Elapsed time in ns: " + (end1 - start1));

        //binary search
        long start2 = System.nanoTime();
        int location2 = binarySearch(myNumList,randNumToFind,0,myNumList.length-1);
        long end2 = System.nanoTime();
        System.out.println();
        System.out.println("Location: " + location2);
        System.out.println("Elapsed time in ns: " + (end2 - start2));



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