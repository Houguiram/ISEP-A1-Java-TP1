import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Cr�ation du scanner pour lire les longueurs du pav� droit		
		System.out.println("Quelle est la longueur du premier c�t� ?");
		double a = scan.nextDouble(); //Premi�re longueur
		System.out.println("Quelle est la longueur du deuxi�me c�t� ?");
		double b = scan.nextDouble(); //Deuxi�me longueur
		System.out.println("Quelle est la longueur du troisi�me c�t� ?");
		double c = scan.nextDouble(); //Troisi�me longueur
		double result; //D�claration de la variable �gale au volume
		result = a * b * c; //Calcul du volume
		System.out.println("Le pav� droit a un volume de "+result+" .");

	}

}
