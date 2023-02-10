import java.util.Scanner;
public class While_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();
        System.out.println("Answer");
        int i = 1;
        while (i<number){

            System.out.println(i);
            i++;
        }
    }
}
