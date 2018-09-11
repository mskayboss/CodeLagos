/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import java.util.Scanner;
/**
 *
 * @author Kema
 */
public class newQuad1 {
    public void quad(){
        
         int a = 5;
        int b =7;
        int Answer = a + b;
     System.out.println ("This is the answer is : " + Answer);
        
    }
    
    void subtract(){
    
    
    int a = 5;
        int b =7;
        int Answer = a - b;
        System.out.println ("This is the answer is : " + Answer);
        
    }
       
    void Eqn(){
        
        
       Scanner num = new Scanner(System.in);
    
    System.out.println("Enter the coefficient of the x2 parameter: ");
    
    int a = num.nextInt();
    
    System.out.println("Enter the coefficient of the x parameter: ");
    
    int b = num.nextInt();
    
    System.out.println("Enter the constant value: ");
    
    int c = num.nextInt();
//    Solve for x1 and x2 in order to solve the quadratic equation
    
    double x1 = (((- b + (Math.sqrt((Math.pow(b,2))-(4*a*c)))))/(2*a));
    
    
    double x2 = ((-b - Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a));
        
    System.out.println("x1 is : " + x1);
    System.out.println("x2 is : " + x2);
       

}
    }     
   
        