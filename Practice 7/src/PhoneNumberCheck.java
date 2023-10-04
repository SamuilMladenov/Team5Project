import java.util.Scanner;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter phone number: ");
        String num = input.nextLine();

        if (num.length() != 4) {
            System.out.println("Invalid phone number");
            System.exit(0);
        }

        if ((num.charAt(0) == '8' || num.charAt(0) == '9') && (num.charAt(3) == '8' || num.charAt(3) == '9') && num.charAt(1) == num.charAt(2)) {
            System.out.println("This number belongs to a telemarketer. You do not have to pick up.");
        }
        else {
            System.out.println("This number does not belong to a telemarketer. You should pick up.");
        }
        input.close();
    }
}