package com.qa;

import java.util.Scanner;

public class FindMissingNum {

	public static void main(String[] args) {
		
		
		int total_num;
		int Num[]= new int[] {1,2,3,4,6,7};
		total_num=7;
		int expected_numSum=  total_num*((total_num+1)/2);
		int num_sum=0;
		for(int i: Num) {
			num_sum +=i;
			
		}
		System.out.println(num_sum);
		System.out.println("missing number is "+(expected_numSum-num_sum));
		FloyidsTriangle();
		FloyidsTriangleStar();
	}
	
	
public static void FloyidsTriangle() {
	
	int n,i,j,k=1; 
	
	Scanner Sc= new Scanner(System.in) ;
	 n= Sc.nextInt();
	 for( i=1;i<=n;i++) {
		 for(j=1;j<=i;j++) {
			 System.out.print(" "+k++);
		 }
		 System.out.println(); 
	 }
	
}

public static void FloyidsTriangleStar() {
	
	int n,i,j,k=1; 
	
	Scanner Sc= new Scanner(System.in) ;
	 n= Sc.nextInt();
	 for( i=1;i<=n;i++) {
		 for(j=1;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println(); 
	 }
	
}

}
