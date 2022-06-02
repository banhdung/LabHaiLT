/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0103_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author banhdung
 */
public class Validate {
    Scanner sc = new Scanner(System.in);

    Date CheckDate(String Mess, String format) {
        SimpleDateFormat SDF = new SimpleDateFormat(format);
        SDF.setLenient(false);
        Date date = new Date();
        do {
            System.out.print(Mess);
            try {
                date = SDF.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid date input, pls re-enter");
            }
        } while (true);
        return date;
    }
}
