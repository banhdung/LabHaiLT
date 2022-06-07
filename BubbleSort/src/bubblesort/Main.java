package bubblesort;

import jdk.internal.util.xml.impl.Input;

public class Main {

    public static void main(String[] args) {
        BubbleSort B = new BubbleSort();
        int size_array = B.getInput("Enter number of array: ");
        int[] array = B.CreateArray(size_array);
        // Test = true mean test Algorithm
        //boolean test = true
        boolean test = false;
        //int []array = {5 , 1 , 12 ,-5, 16}; //test case
        //Display before sort
        B.Display(array, "Unsorted array: ");
        //Sort array
        B.BubbleSort(array, test);
        //Display after sort
        B.Display(array, "Sorted array: ");

    }
}
