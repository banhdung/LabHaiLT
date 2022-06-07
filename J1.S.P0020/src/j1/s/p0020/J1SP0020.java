/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0020;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author banhdung
 */
public class J1SP0020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter number of array: ");
        int size = CheckInt(1, Integer.MAX_VALUE);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(-size, size);
        }
        System.out.println("Unsorted: " + Arrays.toString(arr));
        System.out.println("Sorted array: ");
        selectionSort(arr, size);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[], int size) {
        int i, j, min_idx, temp;
        for (i = 0; i < size - 1; i++) {
            // Find smallest element in unsorted array
            min_idx = i;
            for (j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // 7 5 4 2
            // 2 5 4 7
            // 2 5 4| 7
            // 2 4 5| 7
            // 2 4 5 7|
            // Swap the smallest element with the first element
            if (min_idx != i) {
                temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    static int CheckInt(int Min, int Max) {
        Scanner sc = new Scanner(System.in);
        int ret = 0;
        String input = "";
        do {
            try {
                input = sc.nextLine();
                ret = Integer.parseInt(input);
                if (ret >= Min && ret <= Max) {
                    break;
                }
                System.out.println("Out of range, please enter in range: " + Min + " - " + Max + ")");
            } catch (Exception e) {
                System.out.println("Invalid number input, please enter an integer number only");
            }
        } while (true);
        return ret;
    }

}
