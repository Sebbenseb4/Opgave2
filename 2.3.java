package Projekt2;
import java.util.Scanner;

public class MeterTilFod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Indtast en værdi i meter ");

        double meter=input.nextDouble();
        double feet;

        feet=meter*3.2786;

        System.out.print("= "+feet+" fod");
    }
}
