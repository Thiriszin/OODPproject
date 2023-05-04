package FinalProject;

import java.util.*;
import static FinalProject.CarFile.*;
import static FinalProject.RentalInfo.back;
public class CarInMain {
    public static class carInMain {
        public static Hashtable<String,String> login = new Hashtable<>();
        static String password ;
        static String username ;

        public static void HinMain() {
            HondaCarList h = new HondaCarList("", 0, 0);
            h.HondaI();
            h.hondaCar();
        }

        public static void TinMain() {
            ToyotaCarList t = new ToyotaCarList("", 0, 0.00);
            t.ToyotaI();
            t.ToyotaCar();
        }

        public static void SinMain() {
            SuzukiCarList s = new SuzukiCarList("", 0, 0.00);
            s.SuzukiI();
            s.SuzukiCar();
        }
        public static void BinMain() {
            BMWCarList n = new BMWCarList("", 0, 0.00);
            n.BMWI();
            n.BMWCar();
        }

        public static void MinMain() {
            MitsubishiCarList m = new MitsubishiCarList("", 0, 0.00);
             m.MitsubishiI();
            m.MitsubishiCar();

        }

       public static void BrandChoice(int choice){

            if( choice == 1){
                HinMain();
            }else if(choice == 2){
                TinMain();
            } else if (choice == 3) {
                SinMain();
            } else if (choice == 4) {
                BinMain();
            }else if (choice == 5){
                MinMain();
            }else{
                    back();
            }

        }

        public static void CinMain() {

            ArrayList<String> c = new ArrayList<>();
            c.add("Honda");
            c.add("Toyota");
            c.add("Suzuki");
            c.add("BMW");
            c.add("Mitsubishi");
            for (int i = 0; i < c.size(); i++) {
                System.out.println(i + 1 + " " + c.get(i));
            }

        }
        public static void CarChoose(int C,int back){

            switch(C){
                case 1:
                    HondaFile(back);
                    break;
                case 2:
                    ToyotaFile(back);
                    break;
                case 3:
                    SuzukiFile(back);
                    break;
                case 4:
                    BMWFile(back);
                    break;
                case 5:
                    MitsubishiFile(back);
                    break;

            }
        }

    }
}
