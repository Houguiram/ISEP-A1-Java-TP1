import java.util.Scanner;
public class SecondDegre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Création du scanner
		System.out.println("Entrez les coefficients (a*x^2+b*x+c) :" );
		System.out.println("a = ?");
		double a = scan.nextDouble();
		System.out.println("b = ?");
		double b = scan.nextDouble();
		System.out.println("c = ?");
		double c = scan.nextDouble();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		if (delta>0)
		{
			double x = (-b-Math.sqrt(delta))/(2*a);
			double y = (-b+Math.sqrt(delta))/(2*a);
			System.out.println("Première solution : "+x);
			System.out.println("Seconde solution : "+y);
		}
		else if (delta==0)
		{
			double x = (-b)/(2*a);
			System.out.println("Solution unique : "+x);
		}
		else
		{
			System.out.println("Pas de solution.");
		}

	}

}
