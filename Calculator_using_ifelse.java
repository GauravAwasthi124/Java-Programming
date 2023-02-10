import java.util.Scanner;
public class Calculator_using_ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        int choice = input.nextInt();
        System.out.println("Enter the  first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        if (choice ==1){
            int add = num1+num2;
            System.out.println("The Sum of two numbers is " + add);
        } else if (choice == 2) {
            int sub = num1 - num2;
            System.out.println( "The subtraction of two numbers is " + sub);
        } else if (choice == 3) {
            int mul = num1*num2;
            System.out.println("The multiplication of two numbers is " + mul);
        } else if (choice == 4) {
            int div = num1/num2;
            System.out.println("The division of two numbers is " + div);
        }
    }
}
