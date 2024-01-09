import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];

        //filling the array with randomly generated integers between 1 and size
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
        for(int k = 1; k < array.length; k++){
            for(int i = 0; i < array.length - k; i++){
                if(array[i] > array[i + 1]){
                    int tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;
                }
            }
        }
        return array;
    }

}
