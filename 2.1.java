package Opgave2;
import java.util.Scanner;

public class MileToKilometres {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Indtast mil ");

        double mil=input.nextDouble();
        double kilometer;

        kilometer=mil*1.6;
                System.out.print("= "+kilometer+" km");


    }
}
