import java.util.Scanner;

 

public class myFirstExercise {

 

 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);

   

  System.out.print("Input first number: ");

     double num1 = in.nextDouble();

   

  System.out.print("Input second number: ");

     double num2 = in.nextDouble();

   

 

  System.out.println(num1 + " + " + num2 + " = " + 

  (num1 + num2));

   

  System.out.println(num1 + " - " + num2 + " = " + 

  (num1 - num2));

   

  System.out.println(num1 + " x " + num2 + " = " + 

  (num1 * num2));

   

  System.out.println(num1 + " / " + num2 + " = " + 

  (num1 / num2));

 

  System.out.println(num1 + " mod " + num2 + " = " + 

  (num1 % num2));

 }

 

}
