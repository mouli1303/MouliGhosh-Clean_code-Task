package com.mouli.clean_code;

public class estimate_cost {
	
	public void estimate(String name,int choice,int area)
	{
		System.out.format("%s","Clint name=");
		System.out.format("%s",name+"\n");

		
		int cost[]= {(area*1200),(area*1500),(area*1800),(area*2500)};
		System.out.format("%s","Estimated house construction cost=");
		System.out.format("%d",cost[choice-1]);
	}

}
