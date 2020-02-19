package com.mouli.clean_code;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.format("%s","Enter your principle=");
        double principle=sc.nextDouble();
        double compound_interest,simple_interest,time;
        System.out.format("%s","Enter time in year=");
        time=sc.nextDouble();
        System.out.format("%s","Enter the rate of interest=");
        double rate_of_interest=sc.nextDouble();
        simple_interest=(principle*time*rate_of_interest)/100;
        compound_interest=principle*Math.pow(1.0+(rate_of_interest/100.0), time)-principle;
        System.out.format("%s","Simple interest="+simple_interest+"\n");
        System.out.format("%s","Compound interest="+compound_interest);
        
    }
}
