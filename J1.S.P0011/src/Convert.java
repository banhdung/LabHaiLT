
import java.math.BigInteger;
import java.util.Scanner;

public class Convert {

    public static int inputInt(String msg, int Min, int Max) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print(msg);
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n >= Min && n <= Max) {
                    return n;
                } else {
                    System.out.println("Out of range, pls enter in range " + Min + "-" + Max);
                }
            } catch (Exception e) {
                System.out.println("Invaild input, pls re-enter");
            }
        } while (true);
    }

    public static int inputRadix(String mess) {
        String[] radixs = {"Binary", "Octal", "Decimal", "Hexal"};
        // print (1.Binary 2.Octal 3.Decimal 4.Hexal )
        for (int i = 0; i < radixs.length; i++) {
            System.out.print(i + 1 + ". " + radixs[i] + "  ");
        }
        System.out.println();
        int radix = inputInt(mess, 1, radixs.length);
        switch (radix) {
            case 1:
                radix = 2;
                break;
            case 2:
                radix = 8;
                break;
            case 3:
                radix = 10;
                break;
            case 4:
                radix = 16;
                break;
        }
        return radix;
    }

    private static String getRegex(int radix) {
        switch (radix) {
            case 2:
                return "[0-1]+";
            case 8:
                return "[0-7]+";
            case 10:
                return "[0-9]+";
            case 16:
                return "[0-9A-F]+";
            default:
                System.err.println("Invalid radix!");
                return null;
        }
    }

    public static String inputNumber(String mess, int radix) {
        do {
            System.out.print(mess);
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine().toUpperCase().trim();
            //Check input number is correct to the base system
            if (number.matches(getRegex(radix))) {
                return number;
            } else {
                System.out.println("Re-Enter");
            }
        } while (true);
    }

    public static String convertBignumber(String number, int fromRadix, int toRadix) {
        //Convert Other to Dec
        String s = "0123456789ABCDEF";
        BigInteger decimalNumber = new BigInteger("0");
        BigInteger pow = new BigInteger("1");
        for (int i = number.length() - 1; i >= 0; i--) {
            //Ex : 217 ( HEX) to Dec
            // Dec = 1 * 7 + 16 * 1 + 16^2 * 2 = 535  
            BigInteger value = pow.multiply(new BigInteger("" + s.indexOf(number.charAt(i)))); 
            decimalNumber = decimalNumber.add(value);
            pow = pow.multiply(new BigInteger("" + fromRadix));
            //decimalNumber += s.indexOf(number.charAt(i) * Math.pow(fromRadix , i )
        }

        //Convert Dec to Other
        BigInteger remainder;
        String temp = "";
        String result = "";
        BigInteger toradixBig = new BigInteger("" + toRadix);
        while (decimalNumber.compareTo(new BigInteger("0")) > 0) {
            //Ex : 535(Dec) to Hex
            // remainder = 7 , 1 , 2  ; decimalNumber = 33 , 2 , 0
            // result = 217
            remainder = decimalNumber.mod(toradixBig);
            decimalNumber = decimalNumber.divide(toradixBig);
            result = s.charAt(Integer.parseInt(remainder.toString())) + result;
            //result = s.indexOf(decimalNumber % toRadix ) + result ; 

        }
        return result;
    }
}
