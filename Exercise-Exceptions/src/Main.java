import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Lab-1



        Scanner in = new Scanner(System.in);
//
        try {
            /* 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
two numbers , takes two numbers as input */

//            System.out.println("Enter the first number :");
//            int num1 = in.nextInt();
//
//            System.out.println("Enter the second number :");
//            int num2 = in.nextInt();
//
//            int sum = num1 + num2;
//            int sub = num1 - num2;
//            int multiply = num1 * num2;
//            int divide = num1 / num2;
//            int mod = num1 % num2;
//
//            System.out.println(num1 + " + " + num2 + " = " + sum);
//            System.out.println(num1 + " - " + num2 + " = " + sub);
//            System.out.println(num1 + " x " + num2 + " = " + multiply);
//            System.out.println(num1 + " / " + num2 + " = " + divide);
//            System.out.println(num1 + " % " + num2 + " = " + mod);
//------------------------------------------------

        /* 4. Java program to find out the average of a set of integers*/

//                System.out.println("Enter the count of numbers: ");
//                int count = in.nextInt();
//
//                double sum = 0;
//
//                for (int i = 0; i < count; i++) {
//                    System.out.println("Enter an integer: ");
//                    int number = in.nextInt();
//                    sum += number;
//                }
//                double average =  sum / count;
//
//                System.out.printf(" Average = " + average);
            //-----------------------------------------------------------------------------------
            /* 3.Write a Java program to print the area and perimeter of a circle.*/

//        System.out.println("enter the radius of the circle :");
//        double r = in.nextDouble();
//        double pi = Math.PI;
//
//        double area = pi*Math.pow(r,2);
//        double  perimeter = 2 * pi * r;
//
//        System.out.println("Area is :" + area);
//        System.out.println("Perimeter is :" + perimeter);

// -----------------------------------------------------------------------------------
            /* 7 - Java program to check whether the given number is even or odd */

//        System.out.println("Enter a number to check whether it's even or odd");
//        int num = in.nextInt();

//         if (num %2 == 0){
//            System.out.println( num + " Is even number");
//        } else System.out.println(num + " Is odd number");

//        String evenOdd = (num%2==0)? "even" : "odd";
//        System.out.println(num + " is " + evenOdd);
// -----------------------------------------------------------------------------------
            /* 8.Java program to convert the temperature in Centigrade to Fahrenheit */

            // To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 and add 32.
//        System.out.println("Enter the temperature in Centigrade : ");
//        double centigradeT = in.nextDouble();
//
//        double fahrenheitTem = (centigradeT * (1.8))+32;
//        System.out.println("Fahrenheit temperature is :" + fahrenheitTem);
            //-----------------------------------------------------------------------------------
            /* 10. Write a Java program to print the area and perimeter of a rectangle. */

//        System.out.println("enter the width : ");
//        double width = in.nextDouble();
//
//        System.out.println("enter the height : ");
//        double height = in.nextDouble();
//
//        double rectangleArea = width * height;
//        double  rectanglePerimeter =  (width + height) * 2;
//
//        System.out.println("Area is :" + rectangleArea);
//       System.out.println("Perimeter is :" + rectanglePerimeter);

//-----------------------------------------------------------------------------------
            /* 11. Write a Java program to compare two numbers.  */

            // < less then
            //> greater then

//        System.out.println("Enter first number :");
//        int num1 = in.nextInt();
//
//        System.out.println("enter second number :");
//        int num2 = in.nextInt();
//
//        if (num1 == num2){
//            System.out.println(num1 + " == " + num2);
//        }
//        if (num1 != num2) {
//            System.out.println(num1 + " != " + num2);
//        }
//        if (num1 < num2) {
//            System.out.println(num1 + " < " + num2);
//        }
//        if (num1 <= num2) {
//            System.out.println(num1 + " <= " + num2);
//        }
//        if (num1 > num2){
//            System.out.println(num1 + " > " + num2);
//        }
//        if (num1 >= num2){
//            System.out.println(num1 + " >= " + num2);
//        }

//-----------------------------------------------------------------------------------
            /* 12. Write a Java program to convert seconds to hours, minutes and seconds */

//        System.out.println("enter the seconds : ");
//        int seconds = in.nextInt();
//
//        int sec = seconds %60;
//        int hours = seconds /3600 ;
//        int minutes = (seconds % 3600)/ 60;
//
//        System.out.println( hours + ":" +  minutes + ":" + sec );

//-----------------------------------------------------------------------------------
        /* 13. Write a Java program that accepts four integers from the user and prints equal if all
four are equal, and not equal otherwise.*/

//        System.out.println("Enter first number :");
//        int int1 = in.nextInt();
//
//        System.out.println("enter second number :");
//        int int2 = in.nextInt();
//
//        System.out.println("Enter third number :");
//        int int3 = in.nextInt();
//
//        System.out.println("enter four number :");
//        int int4 = in.nextInt();
//
//
//        if (int1 == int2 && int2 == int3 && int3 == int4){
//            System.out.println("equal");
//        } else System.out.println("not equal");

//-----------------------------------------------------------------------------------
        /* 14.Write a Java program that reads an integer and check whether it is negative, zero, or
positive. */

//        System.out.println("Enter a number :");
//        int num = in.nextInt();
//
//        if (num == 0 ){
//            System.out.println("The is a Zero!!");
//        } else if (num >= 0){
//            System.out.println(" Number is Positive!");
//        } else  System.out.println("Number is Negative !");

//-----------------------------------------------------------------------------------
        /* 15.Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered (End loop use -1 ,
Don’t count -1).*/


//                System.out.println("Enter a number or -1 to quit: ");
//                int number = in.nextInt();
//
//                int positive = 0;
//                int negative = 0;
//                int zeros = 0;
//
//                while (true) {
//                    System.out.println("Enter a number or -1 to quit: ");
//                     number = in.nextInt();
//
//                    if (number == -1) {
//                        break;
//                    }
//
//                    if (number > 0) {
//                        positive++;
//                    } else if (number < 0) {
//                        negative++;
//                    } else {
//                        zeros++;
//                    }
//                }
//
//                System.out.println(positive + " positives");
//                System.out.println(negative + " negative");
//                System.out.println(zeros + " Zeros");


//-----------------------------------------------------------------------------------
       /* 17.Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered.*/

//                System.out.print("Enter a number: ");
//                int number = in.nextInt();
//
//                int max = number;
//                int min = number;
//
//                String choice;
//
//                do {
//                    System.out.print("Enter a number: ");
//                    number = in.nextInt();
//
//                    if (number > max) {
//                        max = number;
//                    }
//                    if (number < min) {
//                        min = number;
//                    }
//
//                    System.out.print("Do you want to enter another number? yes/no");
//                    choice = in.next();
//                } while (choice.equalsIgnoreCase("yes"));
//
//                System.out.println("The largest number: " + max);
//                System.out.println("The smallest number: " + min);
            //-----------------------------------------------------------------------------------
        /* 18.Determine and print the number of times the character ‘a’ appears in the input
entered by the user.*/


//        System.out.println(" enter a name or word ");
//        String enter = in.nextLine();
//
//        int count = 0;
//        for (int i = 0; i < enter.length() ; i++) {
//            if (enter.charAt(i) == 'a')
//                count++;
//        }
//        System.out.println("Number of a's :" + count);

        } catch (InputMismatchException e){
            System.out.println("Please enter a valid number");
        } catch (ArithmeticException e){
            System.out.println("divide by 0 !");
        } catch (Exception e){
            System.out.println("An exception occurred: " + e.getMessage());
        }
//-----------------------------------------------------------------------------------
        /* 2.Write a Java program that takes a number as input and prints its multiplication table up to */

//        try {
//            System.out.println(" Enter a number :");
//            int number = Integer.parseInt(in.next());
//
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(number + "x" + (i) + "=" + (number * i));
//            }
//        } catch (NumberFormatException e){
//            System.out.println("Please enter a valid number");
//        } catch (Exception e){
//            System.out.println("An exception occurred: " + e.getMessage());
//        }

////-----------------------------------------------------------------------------------
        /* 5.Write a Java program that accepts three integers as input, adds the first two integers
together, and then determines whether the sum is equal to the third integer. */
////
//        try {
//            System.out.println("Enter the first number");
//            int input1 = in.nextInt();
//
//            System.out.println("Enter the second number");
//            int input2 = in.nextInt();
//
//            System.out.println("Enter the third number");
//            int input3 = in.nextInt();
//
//            int sum = input1 + input2;
//            boolean isEqual = (sum == input3);
//
//            System.out.println("Sum of first two numbers equals third number: " + isEqual);
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter valid integers.");
//            in.nextLine();
//        } catch (Exception e) {
//            System.out.println("An exception occurred: "+ e.getMessage());
//        }

//-----------------------------------------------------------------------------------
       /* 6. Write a Java program to reverse a word.
  Sample Output:
  Input a word: dsaf
  Reverse word: fasd*/

//        try {
//
//            System.out.println("Enter a word:");
//            String word = in.next();
//
//            if (word.equalsIgnoreCase("null")) {
//                throw new NullPointerException("Input cannot be null.");
//            }
//
//            StringBuilder s = new StringBuilder(word);
//            System.out.println("Reverse word: " + s.reverse());
//        } catch (NullPointerException e) {
//            System.out.println("An exception occurred: " + e.getMessage());
//        }
//-----------------------------------------------------------------------------------
        /* 9.Write a Java program that takes a string and a number from the user,then prints the
character in the given index. */

//        try {
//
//            System.out.println("Enter the String : ");
//            String str = in.nextLine();
//
//            System.out.println("Enter the number :");
//            int indexNumber = in.nextInt();
//
//            System.out.println(str.charAt(indexNumber));
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//------------------------------------------------------------
         /* 16 - Write a program that prompts the user to input an integer and then outputs the
number with the digits reversed. */

//        try {
//            System.out.println("Enter a numbers :");
//            int digit = in.nextInt();
//
//            int reversed = reverseDigit(digit);
//            System.out.println("Reversed number: " + reversed);
//        }catch (Exception e){
//            System.out.println("An exception occurred: " + e.getMessage());
//        }

    } // main method

//    public static int reverseDigit(int digit) throws Exception {
//        if (digit < 0) {
//            throw new Exception("Negative numbers are not allowed.");
//        }
//        int reverse = 0;
//        while (digit != 0) {
//            int remainder = digit % 10;
//            reverse = reverse * 10 + remainder;
//            digit = digit / 10;
//        }
//        return reverse;
//    }


}