package contact;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author trinh
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);
    private static final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";

    public void menu() {
        System.out.println("1. Add a contact");
        System.out.println("2. Display all contacts");
        System.out.println("3. Delete a contact");
        System.out.println("4. Exit");
    }

    public static int inputInt(String msg, int min, int max) {
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
                if (input.matches("\\-?\\d+")) {
                    System.out.println("Out of range of integer number");
                } else {
                    System.out.println("Invalid number input, please enter an integer number only");
                }
            }
        } while (true);
        return ret;
    }

    public static int getChoice() {
        return inputInt("Enter your choice : ", 1, 4);

    }

    public static int getIdToDelete() {
        return inputInt("Enter your id: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int getIdToAdd(ArrayList<Contact> list) {
        if (list.isEmpty()) {
            return 1;
        } else {
            int lastIndex = list.size() - 1;
            int lastId = list.get(lastIndex).getId();
            int newId = lastId + 1;
            return newId;
        }
    }

    public static String checkInputString(String msg) {
        //loop until user input correct
        while (true) {
            System.out.print(msg);
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static String getPhone() {
        //loop until user input correct
        while (true) {
            String result = checkInputString("Enter phone number");
            if (result.matches(VALID_PHONE)) {
                return result;
            }
            System.err.println("Please input Phone flow\n"
                    + "• 1234567890\n"
                    + "• 123-456-7890 \n"
                    + "• 123-456-7890 x1234\n"
                    + "• 123-456-7890 ext1234\n"
                    + "• (123)-456-7890\n"
                    + "• 123.456.7890\n"
                    + "• 123 456 7890");
            System.out.print("Enter again: ");
        }
    }
}
