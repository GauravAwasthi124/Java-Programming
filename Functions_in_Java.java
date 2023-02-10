import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Functions_in_Java {

//    Find the factorial of a function
    public static int Factorial(int number){
        if (number == 1|| number == 0){
            return 1;
        } else {
          return number * Factorial(number-1);
        }
    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Number");
    int num = input.nextInt();
    int answer = Factorial(num);
    System.out.println(answer);
}


//    Make a function to add 2 numbers and return the sum
//    public static int sum(int a,int b){
//        int sum = a+b;
//        System.out.println("Sum is "+sum);
//        return sum;
//    }
//public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    System.out.println("Enter the first number");
//    int num1 = input.nextInt();
//    System.out.println("Enter the second number");
//    int num2 = input.nextInt();
//    sum(num1,num2);
//}



//    public static void Print_Name(String name){
//        System.out.println("Hello "+ name +" How are you");
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        Print_Name(name);
//    }
}
