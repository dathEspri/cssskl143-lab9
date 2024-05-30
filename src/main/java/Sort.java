import java.util.Arrays;

/**
 * This class implements multiple sort algorithms.
 *
 * @author (Milene)
 * @version (CSSSKL 143)
 */

public class Sort {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] bubbleArray = new int[SIZE];
        int[] selectionArray = new int[SIZE];
        int[] insertionArray = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            bubbleArray[i] = (int) (Math.random() * 52);
            selectionArray[i] = (int) (Math.random() * 52);
            insertionArray[i] = (int) (Math.random() * 52);
        }

        String[] bubbleSortStringArray = {"rocky" , "dog" , "ghibli", "perplexed"};

        System.out.println("Array before bubble sort:");
        System.out.println(Arrays.toString(bubbleArray));
        bubbleSort(bubbleArray);
        System.out.println("Array after bubble sort:");
        System.out.println(Arrays.toString(bubbleArray));
        System.out.println();

        System.out.println("Array before selection sort:");
        System.out.println(Arrays.toString(selectionArray));
        selectionSort(selectionArray);
        System.out.println("Array after selection sort:");
        System.out.println(Arrays.toString(selectionArray));
        System.out.println();
//
        System.out.println("Array before insertion sort:");
        System.out.println(Arrays.toString(insertionArray));
        insertionSort(insertionArray);
        System.out.println("Array after insertion sort:");
        System.out.println(Arrays.toString(insertionArray));
        System.out.println();

        // TODO Test your string sort here
        System.out.println("Array before bubble sort:");
        System.out.println(Arrays.toString(bubbleSortStringArray));
        bubbleSortString(bubbleSortStringArray);
        System.out.println("Array after bubble sort");
        System.out.println(Arrays.toString(bubbleSortStringArray));
    }

    /**
     *
     * @param numbers
     */
    //some code used from geeks for geeks
    public static void bubbleSort(int[] numbers) {
        // Implement your sort, call a helper swap method
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++){
            for (int j = 0; j < length - i; j++){
                if (numbers[j] > numbers[j + 1]){
                    swap(numbers, j, i);
                }
            }
        }
    }

    public static void bubbleSortString(String[] strings){
        int length = strings.length;
        for (int i = 0; i < length - 1; i++){
            for (int j = 0; j < length - 1; j++){
                if (strings[j].compareTo(strings[i]) == -1){
                    swapStrings(strings, j, i);
                }
            }
        }
    }

    /**
     *
     *
     * @param numbers
     * @param indexA
     * @param indexB
     */
    public static void swap(int[] numbers, int indexA, int indexB) {
        // swap the elements at indexA and indexB
        int temp = numbers[indexA];
        numbers[indexA] = numbers[indexB];
        numbers[indexA + 1] = temp;
    }

    public static void swapStrings(String[] strings, int indexA, int indexB){
        String temp = strings[indexA];
        strings[indexA] = strings[indexB];
        strings[indexA + 1] = temp;
    }
    // selection sort for ints
    //code from geeks for geeks
    public static void selectionSort(int[] numbers) {
        // Implement your sort, call swapSelection(int[] intList, int i, int nextMin)
        int length = numbers.length;
        int minValue = 0;
        for (int i = 0; i < length - 1; i++){
            for (int j = 1; j < length; j++){
                //starts at 1 so it doesn't go out of bounds
                if (numbers[j] < numbers[i]){
                    minValue = numbers[j];
                }
            }
            swap(numbers, findSmallest(numbers, minValue, i), i);
        }
    }

    public static int findSmallest(int[] arr, int begin, int end) {
        int minIndex = begin;
        int minValue = arr[begin];
        for (int i = begin + 1; i < end; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    /**
     *
     * @param numbers
     */
    public static void insertionSort(int[] numbers) {
        // Implement your insertion sort
        for (int i = 0; i < numbers.length - 1; i++){
            int key = numbers[i];
            int hole = i - 1;
            while (hole >= 0 && numbers[hole] > key){
                numbers[hole + 1] = numbers[hole];
                hole++;
            }
            numbers[hole + 1] = key;
        }
    }
}
