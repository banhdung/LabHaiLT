package j1.s.p0053;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.util.Arrays;
import java.util.Scanner;

public class J1SP0053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showMenu();
        int size = CheckInt("Enter length of array : ", 1, Integer.MAX_VALUE);
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = CheckInt("Enter number : ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        while (true) {
            int choice = CheckInt("Enter your choice : ", 2, 3);
            switch (choice) {
                case 2:
                    System.out.println("Ascending : "+Arrays.toString(SortAscending(arr)));
                    break;

                case 3:
                    System.out.println("Descending : "+Arrays.toString(SortDescending(arr)));
                    break;
            }
            System.out.print("Continue? (Y is continue , an other is exit) :");
            String ret = sc.nextLine();
            if (!ret.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("1.Input element");
        System.out.println("2.Sort Ascending");
        System.out.println("3.Sort Descending");
    }

    public static int CheckInt(String msg, int Min, int Max) {
        Scanner sc = new Scanner(System.in);
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
                System.out.println("Out of range, please enter in range: " + Min + " - " + Max );
            } catch (Exception e) {
                System.out.println("Please input numberand number is greater than zero");
            }
        } while (true);
        return ret;
    }

    public static int[] SortAscending(int[] arr) {
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
        return arr;
    }

    public static int[] SortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean check = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
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
        return arr;
    }

}
