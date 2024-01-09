import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];

        Random random = new Random();

        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(size) + 1;
        }

        long startTime, endTime, execTime;
        startTime = System.currentTimeMillis();

        sort(array);

        endTime = System.currentTimeMillis();
        execTime = endTime - startTime;

        System.out.println(execTime);

    }

    public static int[] sort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int min_index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min_index]){
                    min_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        return array;
    }
}
