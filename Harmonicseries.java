/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonicseries;

/**
 *
 * @author ELCOT
 */
public class Harmonicseries {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("Enter the number of terms to be generated and computed");
         int a = Integer.parseInt(args[0]);
         series(a);
         
        // TODO code application logic here
    }
     public static void series(int num){
      
        double result= 0.0;
         System.out.println("The harmonic series is : ");
        while(num > 0)
          {
               result = result + (double) 1 / num;
               num--;
               System.out.print(result +"  ");
          }
        System.out.println("");
        System.out.println("Output of Harmonic Series is "+result);
    }
}
