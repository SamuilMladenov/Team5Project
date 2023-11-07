/**

 * File: PhoneNumberCheck.java

 * Author: Samuil Mladenov; Kaloyan Dimitrov; Diana Evtimova; Maxim Marshall, Stelyan Vasilev

 * Date: 10/4/2023

 */


import java.util.Scanner; //import the scanner class

public class PhoneNumberCheck {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); //initiallize the scanner

        System.out.println("Enter phone number: ");
        String num = input.nextLine();                  //Ask the user for imput


        //Logical check
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
        input.close(); //close the scanner
    }
}