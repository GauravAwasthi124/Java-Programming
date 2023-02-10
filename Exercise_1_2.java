import java.util.Scanner;
public class Exercise_1_2 {


 /*   public static int Infinite(int number){
        int i = 1;
        do {
            System.out.println(i);
        }while(i<=number);
        return i;
    }*/
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        int first = 0 , second = 1, fact = 1;
        while(fact <=number){
            System.out.println(fact);
            first = second;
            second =fact;
            fact = first+second;
        }
    }



}
