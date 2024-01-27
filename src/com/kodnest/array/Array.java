package com.kodnest.array;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
	Scanner scan= new Scanner (System.in);
	System.out.println("User! Please enter the size of an Array");
	  int size = scan.nextInt();
	  int[] a = new int[size];
	  System.out.println("User!Please enter "+size+ " elements");
	  for (int i=0; i<size; i++) 
	  {
		  a[i]=scan.nextInt();
	}	
	   System.out.println("The elements are:");
	    for (int i =0;i<size; i++ ) 
	    {
	    	System.out.println(a[i]);
	    }

	}
	

}
