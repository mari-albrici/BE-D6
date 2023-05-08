package exerciseTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int km;
		int lt;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many km?");
		km = input.nextInt();
		System.out.println(km + "km");
		
		System.out.println("How many lt?");
		lt = input.nextInt();
		System.out.println(lt + "lt");
		
		consumi(km, lt);
		
		
		input.close();
		
	}
	
	public static void consumi(int km, int lt) {
		
		try {
			
			int consumi = km/lt;
			System.out.println("Consumption:" + consumi);
			
		} catch(ArithmeticException e) {
			
			System.out.println("SOMETHING HAPPENED HERE: " + e.getMessage());
			
		}
		
		
	}

}
