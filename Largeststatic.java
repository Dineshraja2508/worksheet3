/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeststatic;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class Largeststatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
       System.out.println("enter the first int data type element");
       int x = input.nextInt();
       System.out.println("enter the second int data type element");
       int y = input.nextInt();
       System.out.println("enter the third int data type element");
       int z = input.nextInt();
        max3(x,y,z);
       System.out.println("enter the first double data type element");
       double p = input.nextInt();
       System.out.println("enter the second double data type element");
       double q = input.nextInt();
       System.out.println("enter the third double data type element");
       double r = input.nextInt();
       
      
       max3(p,q,r);
    }
     public  static void max3(int a,int b, int c){
         
         if(a>b && a>c){
            System.out.println(a+ "is greatest");
         }
         else if(b>a && b>c){
              System.out.println(b + "is greatest");
         }   
         else{
              System.out.println(c+ "is greatest");
         }
     }
     public  static void max3(double a,double b, double c){
         
         if(a>b && a>c){
            System.out.println(a+ "is greatest");
         }
         else if(b>a && b>c){
              System.out.println(b + "is greatest");
         }   
         else{
              System.out.println(c+ "is greatest");
         }
    }
    
}
