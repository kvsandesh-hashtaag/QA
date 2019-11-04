package march272019;

public class Mulcatch {
	
	public static void main(String[] args) {  
        
        try{    
             int a[]=new int[3];    
             a[3]=30/0;    
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of of the code");    
 }  

}
