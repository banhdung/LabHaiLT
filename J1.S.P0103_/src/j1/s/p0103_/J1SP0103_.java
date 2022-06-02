/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0103_;

import java.util.Date;

/**
 *
 * @author banhdung
 */
public class J1SP0103_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validate date = new Validate();

        Date firstdate = date.CheckDate("Please enter the first date: ", "MMM/dd/yyyy");
        Date senconddate = date.CheckDate("Please enter the sencond date: ", "dd/MM/yyyy");

        if (firstdate.compareTo(senconddate) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (firstdate.compareTo(senconddate) < 0) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("Date1 is equal to Date 2");
        }
    }
    
}
    

