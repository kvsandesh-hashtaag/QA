package march272019;

public class Trycatch1 {
	
	 public static void main(String args[])
	 {
	  int a,b,c;
	  try
	  {
	   a=0;
	   b=10;
	   c=b/a;
	  }
	  catch(ArithmeticException e)
	  {
	   System.out.println("Divided by zero");
	  }
	 }
	}

