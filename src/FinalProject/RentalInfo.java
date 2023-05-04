package FinalProject;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static FinalProject.CarFile.GetLine;
import static FinalProject.CarFile.p;
import static FinalProject.CarInMain.carInMain.*;

public class RentalInfo {
    public static void rule() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rules and regulations.\n1. The renter is responsible for filling the gas tank before returning the car, or may face a surcharge for refueling by the rental company.\n" +
                "2. The rental agreement will specify the terms of use, including mileage limitations and insurance coverage.\n" +
                "3. The renter is responsible for returning the car in the same condition as when it was rented, and may face additional fees or charges for violations of the rental agreement.\nDo you accept our policies.\n1.accept\t2.decline\nChoose 1 or 2 : ");
        int rule = scanner.nextInt();
        try {
            if (rule != 1) {
                System.out.println("We respect your choice ...");
                return ;
            }else{
                Continue();
            }
        } catch (Exception e) {
            System.out.println("Please select 1 or 2 .");
        }
    }

    public static void Continue(){

        String Date = String.valueOf(LocalDate.now());
        System.out.println(Date);
        Scanner scanner = new Scanner(System.in);
        Object[][] obj = new Object[5][4];
        int i = 0;
        System.out.println("Thank you for trusting us.");
        System.out.println("We have many car brands and you can choose one of them.They are ");
        back();
        String license = "";String l = "";
       license =  validLicense(l);
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
        System.out.println("License No. " + license );
        System.out.println("Address : " + a);
        System.out.println("Phone No. : " + phone);
        System.out.println();
        System.out.println("Car Info =>  " + GetLine);
        System.out.println("Total price : " + totalPrice);
        System.out.println("\tThank you");
    }
    private static String validLicense(String l) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("License number should be 8 digit.");
        System.out.print("Enter your license number : ");
        String license = scanner.nextLine();
       if(license.length() == 8){
           return license;
       }

        return validLicense(l);
    }
    public static String validAddress(String address){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your address : ");
        address = scanner.nextLine();
        return address;
    }
    public static void back(){

        Scanner scanner = new Scanner(System.in);
        CinMain();
        System.out.print("Choose the number you want to choose : ");
        int carBrand = scanner.nextInt();
        BrandChoice(carBrand);
        System.out.println("11. Back to menu");
        System.out.println("Which car do you want to choose?");
         int back = scanner.nextInt();
        if (back == 11 ){
            back();
        }else if (back >11 || back < 1){
            System.out.println("You choose invalid.Please select again.");
            back();
        }
        else{
            CarChoose(carBrand,back);
        }
    }

}
