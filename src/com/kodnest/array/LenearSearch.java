package com.kodnest.array;

import java.util.Scanner;

public class LenearSearch {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		
		// int  length = scan.nextInt();
		 int[] a = {10,17,40,14,30};
		 int ele= 20;
		 boolean flag=false;
		 for(int i=0; i<= a.length-1;i++)
		 {
			 if(ele==a[i]) {
				 flag=true;break;
				 
			 }
			 else {
				 flag=false;
				 
			 }
		 }
			 if(flag==true) {
				 System.out.println("Element present");
			 }
			 else {
				 System.out.println("Not present");
			 }
		   


	}

	}

