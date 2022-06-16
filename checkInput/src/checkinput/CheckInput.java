package checkinput;

import java.util.Scanner;
import javax.script.ScriptEngine;

public class CheckInput {

    public static void main(String[] args) {
        String name = getString();
        System.out.println(name);
       
    }
    
    public  static  String getString(){
        String name;
        Scanner sc = new Scanner(System.in);
       
        while (true) {            
            System.out.print("input name : ");
            name = sc.nextLine();
            if(!name.trim().isEmpty()){
                break;
            }else{
                System.out.println("Name must not empty");
            }
        }
        return name;
    }
    
    public static int getInt(){
        int a = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("input a : ");
                a = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid number,pls input again");
            }
        }
        return a;
    }
    

}
