import java.util.Scanner;
public class For_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<10;i++){
            System.out.println("Jai shree ram " + i);
        }
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.println("Answer");
        for (int i = 1;i<=number;i = i+1){
            System.out.println(i + " Hello World");

        }
    }
}
