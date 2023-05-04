package FinalProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static FinalProject.LoginInfo.GetName;
import static FinalProject.LoginInfo.GetPrice;

public class CarFile {
    public static String GetLine = "";
    public static double p;

    public static void HondaFile(int choose){

        try {
            File f = new File("D:\\FinalProject\\OODP Project\\src\\FinalProject\\Honda.txt");
            BufferedReader file = new BufferedReader(new FileReader("f"));
            int i = 0;String line = "line";
            while( i < choose){
                line = file.readLine();
                i++;
            }
            GetLine = line;
            System.out.println(line);
            GetPrice(line);
            GetName(line);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void ToyotaFile(int choose){

        try {
            BufferedReader file = new BufferedReader(new FileReader("D:\\FinalProject\\OODP Project\\src\\FinalProject\\Toyota.txt"));
            int i = 0;String line = "line";
            while( i < choose){
                line = file.readLine();
                i++;
            }
            GetLine = line;
            System.out.println(line);
            GetPrice(line);
            GetName(line);
        }catch(Exception e){

            System.out.println(e.getMessage());
        }
    }
    public static void SuzukiFile(int choose){

        try {
            BufferedReader file = new BufferedReader(new FileReader("D:\\FinalProject\\OODP Project\\src\\FinalProject\\Suzuki.txt"));
            int i = 0;String line = "line";
            while( i < choose){
                line = file.readLine();
                i++;
            }
            GetLine = line;
            System.out.println(line);
            GetPrice(line);
            GetName(line);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void BMWFile(int choose){
        try {
            BufferedReader file = new BufferedReader(new FileReader("D:\\FinalProject\\OODP Project\\src\\FinalProject\\BMW.txt"));
            int i = 0;String line = "";
            while( i < choose){
                line = file.readLine();
                i++;
            }
            GetLine = line;
            System.out.println(line);
            GetPrice(line);
            GetName(line);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void MitsubishiFile(int choose){

        try {
            BufferedReader file = new BufferedReader(new FileReader("D:\\FinalProject\\OODP Project\\src\\FinalProject\\Mitsubishi.txt"));
            int i = 0;String line = "line";
            while( i < choose){
                line = file.readLine();
                i++;
            }
            GetLine = line;
            System.out.println(line);
            GetPrice(line);
            GetName(line);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}

