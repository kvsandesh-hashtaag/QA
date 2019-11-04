package march272019;

import java.util.Scanner;

public class big {

	public static void main(String[] args) 
	{
		
		//int a,b,c;
		Scanner sc = new Scanner(System.in); 
		  
        // String input 
        int  a1 = sc.nextInt(); 
        int  b1 = sc.nextInt(); 
        int  c1 = sc.nextInt(); 
        
        if (a1>=b1&&a1>=c1)
        {
        	System.out.println("a is greater" +a1);
        }
        else if(b1>a1&&b1>c1)
        
        {
        	
        	System.out.println("b is greater" +b1);
        }
        else
        {
        	System.out.println("c is greater" +c1);
        }
        
		
		// TODO Auto-generated method stub

	}

}
