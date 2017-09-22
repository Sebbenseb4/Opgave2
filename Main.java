package Projekt2;
import java.util.Scanner;
public class Main {

    /*
    - Indtast vægt i pund og højde i tommer
    - omregn pund til kg og højde til meter
    - beregn bmi
    - vis resultat
     */

    public static void main(String[] args) {

        //Indlæs scanner
        Scanner input = new Scanner(System.in);

        //Scanner til vægt
        System.out.print("Indtast din vægt i pund ");
        double vægt=input.nextDouble();

        //Scannertil højde
        System.out.print("Indtast din højde i tommer ");
        double højde=input.nextDouble();

        //Omregner vægt og højde til hhv kg og meter
        double vægtRes;
        vægtRes=vægt*0.45359297;
        double højdeRes;
        højdeRes=højde*0.0254;

        //Beregner BMI
        double bmi;
        bmi=(vægtRes)/(højdeRes*højdeRes);

        //Viser resultat
        System.out.print("Din BMI er "+bmi);

    }
}
