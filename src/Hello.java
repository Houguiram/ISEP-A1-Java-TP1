import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Création du scanner pour lire les longueurs du pavé droit		
		System.out.println("Quelle est la longueur du premier côté ?");
		double a = scan.nextDouble(); //Première longueur
		System.out.println("Quelle est la longueur du deuxième côté ?");
		double b = scan.nextDouble(); //Deuxième longueur
		System.out.println("Quelle est la longueur du troisième côté ?");
		double c = scan.nextDouble(); //Troisième longueur
		double result; //Déclaration de la variable égale au volume
		result = a * b * c; //Calcul du volume
		System.out.println("Le pavé droit a un volume de "+result+" .");

	}

}
