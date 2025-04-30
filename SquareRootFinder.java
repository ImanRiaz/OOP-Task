/*1.	1. Square Root Finder
Write a Java program that takes a number as input and prints its square root.
 */

 import java.util.Scanner;

 public class SquareRootFinder{
     public static void main(String[] args) {
         Scanner num=new Scanner(System.in);
         System.out.println("Enter your Number: ");
         int number=num.nextInt();
         double squareroot=Math.sqrt(number);
         System.out.println("The square root of "+number+" is "+squareroot);
 
            
     }
 }
 