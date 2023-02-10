import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;
public class Loop_Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        Write a program to print numbers from 1 to 10.
//        System.out.println("Enter the number");
//        int number = input.nextInt();
//        System.out.println("Answer");
//        for (int i = 1;i<=number;i++){
//            System.out.println(i);
//        }


//        Write a program to calculate the sum of first 10 natural number.
//         int number = input.nextInt();
//         int sum = 0;
//         for (int i = 1;i <=number;i++){
//             sum = sum+i;
//
//         }
//        System.out.println("the sum of first " + number + " number is "+sum);



//        Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
//        int number = input.nextInt();
//        for (int i = 1; i<=10;i++){
//            System.out.println(number + " X "+i+" = "+number*i);
//        }



//        Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321
//        System.out.println("Enter the number");
//        int number = input.nextInt();
//        System.out.println("Your entered number is "+number);
//        int temp = number;
//        int reminder;
//        int reverse  = 0;
//        while (temp>0){
//            reminder = temp%10;
//            temp = temp/10;
//            reverse = (reverse * 10)+reminder;
//        }
//        System.out.println("Reverse Number is " + reverse);



//        Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//        System.out.println("Enter the number");
//        int number = input.nextInt();
//        int sum = 0;
          // For even number
//        for (int i = 1;i<=number;i++){
//            if (i%2==0){
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);
        //For odd number
//        for (int i = 1;i<=number;i++){
//            if (i%2!=0){
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);




//        Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
//        System.out.println("Enter the number");
//        int number = input.nextInt();
//        boolean flag = true;
//        for (int i = 2; i<number;i++){
//            if (number%i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if (flag && number>1){
//            System.out.println("Prime number");
//        } else{
//            System.out.println("Not a prime number");
//        }



//        Write a program to calculate HCF of Two given number.
//        System.out.println("Enter the a");
//        int a = input.nextInt();
//        System.out.println("Enter the b");
//        int b = input.nextInt();
//        int reminder , hcf = 0;
//        do {
//            reminder = a%b;
//            if (reminder == 0){
//                hcf = reminder;
//            }else {
//                a = b;
//                b = reminder;
//            }
//        }while (reminder != 0);
//        System.out.println(hcf);


//        Write a do-while loop that asks the user to enter two numbers.
//        The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again.
//        If so, the loop should repeat; otherwise it should terminate.
//        int choice;
//        do {
//            System.out.println("Enter the first number");
//            int num1 = input.nextInt();
//            System.out.println("Enter the second number");
//            int num2 = input.nextInt();
//            int answer = num1 + num2;
//            System.out.println("Sum of two numbers is " + answer);
//            System.out.println("Press 1 for enter the number again and press 0 for out of the loop");
//            choice = input.nextInt();
//        }while (choice == 1);


//        Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        int count_positive = 0,count_negative = 0,count_zero = 0,choice;
        do {
            System.out.println("Enter the number");
            int number = input.nextInt();

            if (number == 0){
                count_zero++;
            } else if (number > 0) {
                count_positive++;
            }else {
                count_negative++;
            }
            choice = input.nextInt();
        }while(choice == 1);
        System.out.println("Positive number "+ count_positive);
        System.out.println("Negative number "+ count_negative);
        System.out.println("Zero number "+ count_zero);
    }
}
