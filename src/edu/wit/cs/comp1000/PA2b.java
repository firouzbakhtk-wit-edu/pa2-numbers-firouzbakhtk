package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input = new Scanner(System.in);
		double a, b, c;
		double delta;
		double root1, root2, temp_root;
		
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		delta = b * b - 4 * a * c;
	
		// delta < 0 ***>
		
		if (delta < 0) {
			// no real roots
			System.out.printf("Roots: imaginary%n");
			
		} else if (delta == 0) {
			// only one real root
			root1 =  1.0 * (- b / (2 * a));
			System.out.printf("Root: %.2f%n", root1);
			
		} else {
			// two real roots
			
			root1  = (-b + Math.sqrt(delta))/(2 * a);
			root2  = (-b - Math.sqrt(delta))/(2 * a);
			
			if (root2 < root1) {
				temp_root 	= root1;
				root1 		= root2;
				root2 		= temp_root;
				
				System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
				
			}
			
		}
			
		
		
	}
}
