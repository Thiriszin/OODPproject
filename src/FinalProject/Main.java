package FinalProject;
import javafx.scene.paint.PhongMaterial;

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static FinalProject.CarInMain.carInMain.*;

public class Main {

    public static void Continue(){

        String Date = String.valueOf(LocalDate.now());
        System.out.println(Date);
        Scanner scanner = new Scanner(System.in);
        Object[][] obj = new Object[5][4];
        int i = 0;
        System.out.println("Thank you for trusting us.");
        System.out.println("We have many car brands and you can choose one of them.They are ");
        back();
        String license = "";
        String l = validLicense(license);
        String address = "";
        String a = validAddress(address);

        String phone = "";boolean isvalid = false;
        do{
            System.out.print("Enter your phone number : ");
           phone =  scanner.next();

            try {

                Long.parseLong(phone);
                isvalid = true;
            }catch(InputMismatchException e){
                System.out.println("Your input must be in number.");

            }catch(NumberFormatException e){
                System.out.println("Your input should be in number.");
            }

        }while(!isvalid);

        System.out.println();
        System.out.println("How many days do you want to rent?");
        int days = 0;
        try {
            days = scanner.nextInt();
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        double totalPrice = days*p;
        System.out.println("Total price : " + totalPrice);
        long receipt = password.hashCode() + username.hashCode();
        System.out.println("Here is the receipt.");

        System.out.println("\t\t\tCar Rental Receipt");
        Random random = new Random();
        System.out.println("Date : " + Date);
        System.out.println("Receipt# " + receipt);
        System.out.println();
        System.out.println("Name: " + username);
        System.out.println("License No. " + l);
        System.out.println("Address : " + a);
        System.out.println("Phone No. : " + phone);
        System.out.println();
        System.out.println("Car Info =>  " + GetLine);
        System.out.println("Total price : " + totalPrice);

        System.out.println("\tThank you");
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Object[][] obj = new Object[5][4];
        int i = 0;

        System.out.println("Sign up your account. ");
        Signup();
        System.out.println("You Sign up successfully.\nTry to log in with your account.");
        login();
        rule();

    }


    private static String validLicense(String license) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your license number : ");
        license = scanner.nextLine();
        if (license.length() != 8) {
            validLicense(license);
        } else {
            return license;
        }
        return "";
    }
    public static String validAddress(String address){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your address : ");
        // scanner.next();
        address = scanner.nextLine();
        return address;
    }

}
