/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h202;

import java.util.Scanner;

/**
 *
 * @author banhdung
 */
public class J1SH202 {

    /**
     * @param args the command line arguments
     */
    
    public static String Reverse(String S) {
        String result = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            result += S.charAt(i);
        }
        return result;
    
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String  str = sc.nextLine();
        if(str.trim().isEmpty()){
            return ;
        }
        System.out.println(Reverse(str));
    }
    
  
}
