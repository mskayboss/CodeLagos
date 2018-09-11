/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;

import  java.util.Scanner;

/**
 *
 * @author Kema
 */
public class Addition {
    public void add() {
    int a = 5;
            int b = 6;
                    int answer = a + b;
                    
         System.out.println( "The sum is " + answer );
         
         
             
     
       
    }     
   

public void quad() {
        
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

 
     public void SM(String Name){
         System.out.println("Hello " + Name);
         
     }
 public void quad1(double a, double b, double c) {
        
//    Solve for x1 and x2 in order to solve the quadratic equation
    
    double x1 = (((- b + (Math.sqrt((Math.pow(b,2))-(4*a*c)))))/(2*a));
    
    
    double x2 = ((-b - Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a));
        
    System.out.println("x1 is : " + x1);
    System.out.println("x2 is : " + x2);
    
    
    
    
}
 
 public void quad2 (){
    Scanner num = new Scanner (System.in);
     
     System.out.println("Enter the coefficient of the x2 parameter: ");
    
    int a = num.nextInt();
    
    System.out.println("Enter the coefficient of the x parameter: ");
    
    int b = num.nextInt();
    
    System.out.println("Enter the constant value: ");
    
    int c = num.nextInt();
     
    
     double discriminant = ((Math.pow(b, 2)) - 4 * a *c);
     if ( discriminant == 0){
          System.out.println("This quadratic equation has one real root ");
     }
          else if(discriminant > 0){
                  
          System.out.println("This quadratic equation has two real roots ");
          }
          else  {
     
     System.out.println("This quadratic equation has complex roots ");
     }
     
 }
}


