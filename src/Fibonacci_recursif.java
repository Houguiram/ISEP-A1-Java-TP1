import java.util.Scanner;

public class Fibonacci_recursif {
	public static long fib(int rank)
	{
		if (rank < 2)
		{
			return rank;
		}
		else
		{
			return fib(rank - 1) + fib(rank - 2);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Création du scanner
		System.out.println("Quel rang de la suite de Fibonacci cherchez-vous ?");
		int rank = scan.nextInt();
		System.out.println(fib(rank));
	}
}
