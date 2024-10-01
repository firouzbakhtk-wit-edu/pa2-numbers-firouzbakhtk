package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: document this class
/**
 * 
 * JavaDoc goes here!
 * 
 */

public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
Scanner input = new Scanner(System.in);
		
		int sum_pos = 0;
		int sum_no_pos = 0;
		int sum_all = 0;
		
		int n_pos = 0;
		int n_no_pos = 0;
		
		int temp;
		
		double ave_pos;
		double ave_no_pos;
		double ave_all;
		
		
		System.out.printf("Enter five whole numbers: ");
		
		// get #1
		temp = input.nextInt();
		sum_all = sum_all + temp;
		if (temp > 0) {
			sum_pos = sum_pos + temp;
			n_pos = n_pos + 1;
		} 
		else {
			sum_no_pos = sum_no_pos + temp;
			n_no_pos = n_no_pos + 1;
		}
		// get #2
		temp = input.nextInt();
		sum_all = sum_all + temp;
		if (temp > 0) {
			sum_pos = sum_pos + temp;
			n_pos = n_pos + 1;
		} 
		else {
			sum_no_pos = sum_no_pos + temp;
			n_no_pos = n_no_pos + 1;
		}
		// get #3
		temp = input.nextInt();
		sum_all = sum_all + temp;
		if (temp > 0) {
			sum_pos = sum_pos + temp;
			n_pos = n_pos + 1;
		} 
		else {
			sum_no_pos = sum_no_pos + temp;
			n_no_pos = n_no_pos + 1;
		}
		// get #4
		temp = input.nextInt();
		sum_all = sum_all + temp;
		if (temp > 0) {
			sum_pos = sum_pos + temp;
			n_pos = n_pos + 1;
		} 
		else {
			sum_no_pos = sum_no_pos + temp;
			n_no_pos = n_no_pos + 1;
		}
		// get #5
		temp = input.nextInt();
		sum_all = sum_all + temp;
		if (temp > 0) {
			sum_pos = sum_pos + temp;
			n_pos = n_pos + 1;
		} 
		else {
			sum_no_pos = sum_no_pos + temp;
			n_no_pos = n_no_pos + 1;
		}
		
		ave_all 	= 1.0*sum_all / 5;	
		if (n_pos == 0) {
			ave_pos = 0;
		} else {
			ave_pos 	= 1.0*sum_pos / n_pos;			
		}
		if (n_no_pos == 0) {
			ave_no_pos = 0;
		} else {
			ave_no_pos 	= 1.0*sum_no_pos / n_no_pos;			
		}
		input.close();
		
		if (n_pos == 1) {
			System.out.printf("The sum of the %d positive number: %d%n", n_pos, sum_pos);
		} else {
			System.out.printf("The sum of the %d positive numbers: %d%n", n_pos, sum_pos);			
		}
		if (n_no_pos == 1) {
			System.out.printf("The sum of the %d non-positive number: %d%n", n_no_pos, sum_no_pos);
		} else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", n_no_pos, sum_no_pos);			
		}
		
		
		System.out.printf("The sum of the 5 numbers: %d%n", sum_all);
		
		
		if (n_pos == 1) {
			System.out.printf("The average of the %d positive number: %.2f%n", n_pos, ave_pos);
		} else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", n_pos, ave_pos);	
		}
		if (n_no_pos == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f%n",n_no_pos,  ave_no_pos);
		} else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n",n_no_pos,  ave_no_pos);	
		}
		
		
//		System.out.printf("The average of the %d positive numbers: %.2f%n", n_pos, ave_pos);
//		System.out.printf("The average of the %d non-positive numbers: %.2f%n",n_no_pos,  ave_no_pos);
		System.out.printf("The average of the 5 numbers: %.2f%n", ave_all);
	}

}
