

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        boolean trip = true;
        while(trip == true){

        
        System.out.println("Calculator Time No cap");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What operation do you want to use. +,-,*,/");
        String operation = scanner.next();
        System.out.println("Enter in your first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter next number");
        double num2 = scanner.nextDouble();
        System.out.println(num1 + operation + num2);
        System.out.println("Calculating!");


        double result = 0;
        
        switch (operation){
            case "+":
            result = num1 + num2;
            break;
            case "-":
             result = num1 - num2;
            break;
            case "*":
             result = num1 * num2;
            break;
            case "/":
            if(num1 ==0){
                System.out.println("cant divide by 0");
                System.exit(1);
            
            continue;
            }
            else  if(num2 ==0){
                System.out.println("cant divide by 0");
                System.exit(1);
            }
            else{

            
            result = num1 / num2;
            }
            break;


        }

        System.out.println("result:" + result);
        System.out.println("do you wanna go again? 1 for yes, 2 for no");
        int blimp = scanner.nextInt();
        if(blimp == 1){
            trip = true;
        }
        else{
            trip = false;
        }


    }

    }
}