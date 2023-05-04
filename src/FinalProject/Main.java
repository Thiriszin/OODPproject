package FinalProject;

import static FinalProject.LoginInfo.Signup;
import static FinalProject.LoginInfo.login;
import static FinalProject.RentalInfo.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Sign up your account. ");
        Signup();
        System.out.println("You Sign up successfully.\nTry to log in with your account.");
        login();
        rule();

    }
}
