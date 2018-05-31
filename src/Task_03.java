import java.util.Random;
import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ievadi skaitli no 1 lidz 10");
		int sk = sc.nextInt();

		Random rnd = new Random();
		int randomInt = rnd.nextInt(11);
		System.out.println("randomInt" + randomInt);
		
		if (sk == randomInt) {

			System.out.println(sk + " ok");

	    
	    } else {

	        System.out.println("Wrong room number, please enter the  number.");
	        sk = sc.nextInt();
	    }

		 return randomInt;

	   

	}
		
		
}	