/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author banhdung
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter search value:");
        int search = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-length, length);
        }
        System.out.print("The array: ");
        displayArray(array);

        int foundIndex = linerSearch(array, search);
        System.out.println("\nFound " + search + " at index: " + foundIndex);
    }
    

    public static void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static int linerSearch(int[] arr, int key) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
