import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Création du scanner
		System.out.println("Quel rang de la suite de Fibonacci cherchez-vous ?");
		int rank = scan.nextInt();
		if (rank<=0)
		{
			System.out.println("Veuillez entrer un rang valide.");
			System.exit(0);
		}
		else if (rank < 2)
		{
			System.out.println(rank);
		}
		else
		{
			int a = 0; // Initialisation de la suite
			int b = 1;
			int c;
			for (int i = 2; i<=rank; i++)
			{
				c = a + b; //Pivot			
				a = b;
				b = c;
				
			}
			System.out.println(b);
		}
	}
}
