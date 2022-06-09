/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsh208;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author banhdung
 */
public class JSH208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = inputInt("Enter an positive number: ", 1, Integer.MAX_VALUE);
        System.out.println(SwapDigitPair(number));
    }

    public static int inputInt(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int ret = 0;
        String input = "";
        System.out.print(msg);
        do {
            try {
                input = sc.nextLine();
                ret = Integer.parseInt(input.trim());
                if (ret >= min && ret <= max) {
                    break;
                }
                System.out.println("Out of range, please enter in range: " + "(" + min + " - " + max + ")");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number input, please enter an integer number only");
            }
        } while (true);
        return ret;
    }

    // lẻ 34526 35462  chẵn 345621 -> 436512
    public static int SwapDigitPair(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 10);
            n = n / 10;
        }
        // 1234567 7 6 5 4 3 2 1
        for (int i = 0; i < list.size() - 1; i += 2) {
            int tg = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, tg);
        }
         // 6 7 4 5 2 3 1 
        int x = 1;
        for (Integer item : list) {
            n += item * x;
            x *= 10;
        }
        // 6 7 4 5 2 3 1
        // 6
        // 76
        // 476
        // 1325476
        // 1325476
        return n;
    }

}
