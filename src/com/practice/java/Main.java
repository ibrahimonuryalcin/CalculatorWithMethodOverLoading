
package com.practice.java;

import java.util.Scanner;

public class Main {
    public static int addition(int number1, int number2){
        return (number1 + number2); 
    }
    public static int addition(int number1, int number2, int number3){
        return (number1 + number2 + number3); 
    }
    public static int subtract(int number1, int number2){
        return (number1 - number2); 
    }
    public static int multiplication(int number1, int number2){
        return (number1 * number2); 
    }
    public static int multiplication(int number1, int number2, int number3){
        return (number1 * number2 * number3); 
    }
    public static int division(int number1, int number2){
        return (number1 / number2); 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operations = "1 - Addition\n"
                          + "2 - Subtract\n"
                          + "3 - Multiplication\n"
                          + "4 - Division\n"
                          + "q - Quit";
        System.out.println("*****CALCULATOR*****");
        
        while (true) {
            
            System.out.println("--------------------");
            System.out.println(operations);
            System.out.println("--------------------");
            
            System.out.print("Please Select an operation : ");
            String operation = scanner.nextLine();
            
            if(operation.equals("q")){
                
                System.out.println("The calculator is shutting down");
                break;
            
            } else if(operation.equals("1")){
                System.out.print("How many numbers do you want to add?(2 or 3) : ");
                int count = scanner.nextInt();
                scanner.nextLine();
                
                if(count == 2){
                    System.out.print("number 1 : ");
                    int number1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("number 2 : ");
                    int number2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("RESULT : " + addition(number1, number2));
                    continue;
                    
                } else if(count == 3){
                    System.out.print("number 1 : ");
                    int number1 = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("number 2 : ");
                    int number2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("number 3 : ");
                    int number3 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("RESULT : " + addition(number1, number2,number3));
                    continue;
                } 
            
            } else if(operation.equals("2")){
                System.out.print("number 1 : ");
                int number1 = scanner.nextInt();
                scanner.nextLine();
                    
                System.out.print("number 2 : ");
                int number2 = scanner.nextInt();
                scanner.nextLine();
                    
               System.out.println("RESULT : " + subtract(number1, number2)); 
               continue;
            
            } else if(operation.equals("3")){
                System.out.print("How many numbers do you want to multiply?(2 or 3) : ");
                int count = scanner.nextInt();
                scanner.nextLine();
                
                if(count == 2){
                    System.out.print("number 1 : ");
                    int number1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("number 2 : ");
                    int number2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("RESULT : " + multiplication(number1, number2));
                    continue;
                } else if(count == 3){
                    System.out.print("number 1 : ");
                    int number1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("number 2 : ");
                    int number2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("number 3 : ");
                    int number3 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("RESULT : " + multiplication(number1, number2, number3));
                    continue;
                } 
            
            
            } else if(operation.equals("4")){
                System.out.print("number 1 : ");
                int number1 = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("number 2 : ");
                int number2 = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("RESULT : " + division(number1, number2));
                continue;
            
            } else{
                System.out.println("Invalid Operation");
                continue;
            }
            
        }
    }
}
