import java.util.Random;
import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ievadi skaitli no 1 lidz 10");
		int sk = sc.nextInt();

		Random rnd = new Random();
		int randomInt = rnd.nextInt(11);
		System.out.println("randomInt" + randomInt);
		{
			
			do{
			    System.out.println("Nebus pareizs " + sk + " Ievadi skaitli no 1 lidz 10");
			    
			    
			    
				
		}while(sk == randomInt);
			sk = sc.nextInt();
		}
		
		System.out.println("randomInt" + randomInt);
		System.out.println(sk + " ok");
		}
}	