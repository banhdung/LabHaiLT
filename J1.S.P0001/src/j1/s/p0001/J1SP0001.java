/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author banhdung
 */
public class J1SP0001 {
    
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int size = CheckInt("Enter number of array : ", 1, Integer.MAX_VALUE);
        int []arr = randomIntArr(size);
        System.out.print("Unsorted array : "+Arrays.toString(arr)+"\n");
        bubbleSort(arr);
        System.out.print("Sorted array : " + Arrays.toString(arr));
    }
    
    
     static int CheckInt(String msg,int Min, int Max) {
        int ret = 0;
        String input = "";
        do {
            System.out.print(msg);
            try {
                input = sc.nextLine();
                ret = Integer.parseInt(input);
                if (ret >= Min && ret <= Max) {
                    break;
                }
                System.out.println("Out of range, please enter in range: " + Min + " - " + Max + "");
            } catch (Exception e) {
                System.out.println("Invalid number input, please enter an integer number only");
            }
        } while (true);
        return ret;
    }
     
     public static int []randomIntArr(int size){
         int []ranNum = new int[size];
         for (int i = 0; i < size; i++) {
             ranNum[i] =ThreadLocalRandom.current().nextInt(-size, size);
             
         }
         return ranNum;
     }
     
     public  static void bubbleSort(int []arr){
         for (int i = 0; i < arr.length - 1; i++) {
            boolean check = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                break;
            }
        }
     }
    
    
    
}
