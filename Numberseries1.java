package gani.assignments;

import java.util.Scanner;

public class Numberseries1 {

	public static void main(String[] args) {
		// print number series addition of 3 
		System.out.print("enter the series length :");
		int n,m=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.print(m+" ");
			m+=3;
		}

	}

}
