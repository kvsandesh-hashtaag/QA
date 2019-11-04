package march272019;

public class Paraconstr {

	int id;  
    String name;  
    
    Paraconstr(int i,String n)
    {  
    id = i;  
    name = n;  
    }  
 
    void disp(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
  
    	Paraconstr s1 = new Paraconstr(256546,"venkat");  
    	Paraconstr s2 = new Paraconstr(886258,"jyoti");  
   
    s1.disp();  
    s2.disp();  
   }  
}
