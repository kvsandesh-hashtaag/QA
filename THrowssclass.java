package march272019;

import java.io.IOException;

 class Uncheckexcep 
 {

	void myMethod(int num)throws IOException, ClassNotFoundException
		  { 
		     if(num==1)
		        throw new IOException("IOException Occurred");
		     else
		        throw new ClassNotFoundException("ClassNotFoundException");
		  } 
		} 

		 public class THrowssclass
		{ 
		  public static void main(String args[])
		  { 
		   try{ 
			   Uncheckexcep obj=new Uncheckexcep(); 
		     obj.myMethod(1); 
		   }catch(Exception ex){
		     System.out.println(ex);
		    } 
		  }
}
		
