package FinalProject;

import java.util.Scanner;

import static FinalProject.CarFile.p;
import static FinalProject.CarInMain.carInMain.*;

public class LoginInfo {
    static void login(){
        Scanner scanner = new Scanner(System.in);
        String user;String pw;
            System.out.print("Enter username : ");
            user = scanner.nextLine();
            System.out.print("Enter your password : ");
            pw = scanner.nextLine();
        if(pw.equals(login.get(user))){
            System.out.println("Log in successful");
        }else{
            System.out.println("Username and password are incorrect.\nTry to log in again");
            login();

        }
    }
    static void Signup(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter username : ");
        username = scanner.nextLine();
        System.out.print("Enter password : ");
        password = scanner.nextLine();
        login.put(username,password);

    }

    public static double GetPrice(String line){
        char[] array = line.toCharArray();
        String price = "";
        int start = array.length;
        int end = array.length;
        price = line.substring(array.length-6, array.length);
        p = Double.parseDouble(price);
        return p;
    }
    public static String GetName(String line){
        String[] parts = line.split("\t");
        String name = parts[0];
        return name;
    }


}
