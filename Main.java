//Opgave 2.16
package Projekt2;
import java.util.Scanner;
public class Main {
/*
1 Indtast siden af en sekskant
2 beregn areal
3 visresultat
 */
    public static void main(String[] args) {
	//Indlæs scanner + tekst
        Scanner input = new Scanner(System.in);
        System.out.print("Angiv længden på sekskantens side ");

        //Beregner areal
        double længde=input.nextDouble();
        double areal;
        areal = (((3 * Math.sqrt(3)) / (2)) * (længde * længde));

        //Vis Resultat
        System.out.print("Arealet på sekskanten er "+areal);
    }
}
