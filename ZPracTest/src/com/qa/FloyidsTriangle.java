package com.qa;

import java.util.Scanner;

class Floyid{
	public static void Ftriangle() {
	int i,j,n,k=1;	
	System.out.println("Enter the Input for Floyed Triangle");
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	System.out.println("Entered Input as... "+n);
	for( i=0;i<=n;i++) {
		for( j=1;j<i;j++) {
			System.out.print(" "+k++);
		}
		System.out.println(" ");
	}
}
}

class FloyidStar{
	public static void Ftriangle() {
	int i,j,n,k=1;	
	System.out.println("Enter the Input for Floyed Triangle");
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	System.out.println("Entered Input as... "+n);
	for( i=0;i<=n;i++) {
		for( j=1;j<i;j++) {
			System.out.print(" * ");
		}
		System.out.println(" ");
	}
}
}

public class FloyidsTriangle {

	public static void main(String[] args) {
		
		Floyid.Ftriangle();
		System.out.println("------------------------------");
		FloyidStar.Ftriangle();
		
	}

}
