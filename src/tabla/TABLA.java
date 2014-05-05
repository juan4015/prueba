
package tabla;

import java.io.*;
import java.util.Scanner;
public class TABLA {
   

    public  TABLA(){
               System.out.println("´´´´´´´´..Menu..´´´´´´´´");
        System.out.println("   1.numero primo       ");
        System.out.println("   2.numero perfecto    ");
        System.out.println("   3.numero Factorial   ");
        System.out.println("   4.Promedio           ");
        System.out.println("   5.SALIR              ");
        System.out.println("........................");
  Scanner sc = new Scanner(System.in);
  System.out.print("ingrese su opcion :  ");
   int opcion = sc.nextInt();
   
     System.out.println(opcion);
    } 
    
 
 
  
    public static void main(String[] args) {
       
        TABLA op=new TABLA();
        
    }
    
}
