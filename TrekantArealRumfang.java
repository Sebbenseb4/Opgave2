package Projekt2;
import java.util.Scanner;
public class TrekantArealRumfang {

    /*
    Indlæs længde på ligesidet trekant
    Beregn areal og rumfang
    Vis resultat
     */
    public static void main(String[] args) {

        //Scanner + tekst
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast længde på ligesidet trekant ");

        //Variabler
        double længde=input.nextDouble();
        double areal;
        double rumfang;

        //Beregning af areal og rumfang
        areal=(Math.sqrt(3)/4)*(længde)*(længde);
        rumfang=areal*længde;

        System.out.println("Areal = "+areal);
        System.out.println("Rumfang = " +rumfang);
        //Får ikke samme resultat som i bogen
    }
}
