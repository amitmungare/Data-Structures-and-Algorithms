package oops1;

import java.util.Scanner;

public class StudentUse {

//	public static void main(String[] args) {
//		
//		Student s = new Student(12, "amit");
//		
//		
//		System.out.println(s.name);
//
//	}
	
	
	
//		static void fun() throws Exception 
//		{ 
//		    throw new Exception(); 
//		} 
//		public static void main(String args[]) 
//		{   
//		    try { 
//		        fun(); 
//		    } 
//		    catch (Exception e) { 
//		        System.out.print("caught in main."); 
//		    }
//		    System.out.print("All is well"); 
//		} 
		
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
	    int n=s.nextInt();
	    
	    boolean isprime=true;
	    
	    if(n%2==0)
	        isprime=false;
	    int i=3;
	    while(isprime&&i<n)
	    {
	        isprime=!(n%i==0);
	        i+=2;
	    }
	    if(isprime)
	    {
	        System.out.println("Prime");
	    }
	    else
	    {
	        System.out.println("Composite");
	    }
	}
    
	
	
}



