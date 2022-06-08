/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h207;

import java.util.Scanner;

/**
 *
 * @author banhdung
 */
public class J1SH207 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter String : ");
        String str = checkString();
        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if(Character.toLowerCase(str.charAt(i)) >='n' && Character.toLowerCase(str.charAt(i)) <= 'z'){
                count++;
            }
        }
        System.out.println(count);
        
    }
    
    static String checkString(){
        Scanner sc = new Scanner(System.in);
        String ret;
        while (true) {            
            ret = sc.nextLine();
            if(!ret.trim().isEmpty()){
                break;
            }
        }
        return ret;
    }
    
}
   

