package bubblesort;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    public static int getInput(String msg) {
        Scanner sc = new Scanner(System.in);
        double size_array;
        String input;
        do {
            System.out.print(msg);
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input could not be empty.Pls enter positive integer number");
            }
            try {
                size_array = Double.parseDouble(input);
                if (size_array <= 0) {
                    throw new Exception();
                }
                if ((int) size_array != size_array) {
                    throw new Error();
                } else {
                    break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Input could not be a string.Pls enter positive integer number");
                continue;
            } catch (Exception NegaException) {
                System.out.println("Input could not be less than or equal 0.Pls enter positive integer number");
                continue;
            } catch (Error RealNumberError) {
                System.out.println("Input could not be integer..Pls enter positive integer number");
                continue;
            }

        } while (true);
        return (int) size_array;
    }

    public static int[] CreateArray(int size_array) {
        int[] array = new int[size_array];
        Random random = new Random();
        ////Loop use to random each element of array
        for (int i = 0; i < size_array; i++) {
            array[i] = random.nextInt(size_array);
        }
        return array;
    }

    public static void Display(int[] array, String msg) {
        System.out.print(msg);
        System.out.print("[");
        // //Loop use to accessed each element of array and display
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        if (msg.equals("Unsorted array: ")) {
            System.out.println("]");
        } else {
            System.out.print("]");
        }
    }

    public static void BubbleSort(int[] array, boolean test) {
        /*Loop use to accessed from the first to last element of array, 
        after each loop, one element is sorted*/
        for (int i = 0; i < array.length; i++) {
            /*Loop use to accessed first unsorted element to the element 
            stand before the last unsorted element*/
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    if (test == true) {
                        Display(array, "");
                        System.out.println("    " + array[j] + ">" + array[j + 1] + " swap");
                    }
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else {
                    if (test == true) {
                        Display(array, "");
                        if (array[j] == array[j + 1]) {
                            System.out.println("    " + array[j] + "=" + array[j + 1] + " ok");
                        } else {
                            System.out.println("    " + array[j] + "<" + array[j + 1] + " ok");
                        }
                    }

                }

            }
        }
    }
}
