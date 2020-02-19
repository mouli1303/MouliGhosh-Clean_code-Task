package com.mouli.clean_code;

import java.util.Scanner;

public class house_construction {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		estimate_cost customer=new estimate_cost();
		System.out.format("%s","Please fill up the Clint Application:\n ");
		System.out.format("%s","Enter Clint name=");
		String name=sc.nextLine();
		System.out.format("%s","Enter total area of the house=");
		int area=sc.nextInt();
		System.out.format("%s","Enter material quality. Please follow the input instruction.\n");
		System.out.format("%s","Enter 1 for standard material.\nEnter 2 for above standard material. \nEnter 3 for high standard material.\nEnter 4 for high standard material and fully automated home.");
		int choice=sc.nextInt();
		
		customer.estimate(name,choice,area);
		
	}

}
