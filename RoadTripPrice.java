package Projekt2;
import java.util.Scanner;

/*
Indlæs parametre
beregn resultat
vis resultat
 */
public class RoadTripPrice {

    public static void main(String[] args) {
        //Indlæser scanner og printer tekst
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast distancen angivet i mil ");
        double distance=input.nextDouble();

        System.out.print("Indtast mil/gallon ");
        double milPerGallon=input.nextDouble();

        System.out.print("Angiv pris pr. gallon angivet i $ ");
        double pris=input.nextDouble();

        //Beregner variabler
        double prisRes;
        prisRes=(distance/milPerGallon)*pris;

        //Vis resultat
        System.out.print("Prisen på rejsen er $"+prisRes);
    }
}
