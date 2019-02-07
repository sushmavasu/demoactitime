package com.sample;
import java.util.Scanner;

public class main 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter x value: ");
    String s=sc.next();
    StringBuilder str=new StringBuilder(s);
    str.insert(0, '$');
    System.out.println(str);
    str.append(.00);
    System.out.println(str);
    
    
    
			
}
}
