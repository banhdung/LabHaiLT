import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        do {
            int fromRadix = Convert.inputRadix("Input from radix: ");
            int toRadix = Convert.inputRadix("Input to radix: ");
            // Enter the number do u want to covert
            String number = Convert.inputNumber("Input number: ", fromRadix);
            System.out.println("Output number: " + Convert.convertBignumber(number, fromRadix, toRadix));
        } while (inputYesNo("Continue? (Y/N): "));
    }

    public static boolean inputYesNo(String message) {
        String check;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        check = sc.nextLine();
        if (check.equalsIgnoreCase("y") || check.equalsIgnoreCase("yes")) {
            return true;
        } else if (check.equalsIgnoreCase("n") || check.equalsIgnoreCase("no")) {
            return false;
        } else {
            System.out.println("Please input Y or N!");
            return inputYesNo(message);
        }
    }
    
}