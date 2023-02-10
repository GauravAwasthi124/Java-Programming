import java.util.Scanner;
public class Arrays_in_Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* System.out.println("Enter the size of an array");
        int size = input.nextInt();
        int[] marks = new int[size];
        System.out.println("Enter the marks of students");
        for (int i = 0;i<size;i++){
            marks[i] = input.nextInt();
        }
        for (int i = 0;i< marks.length;i++){
            System.out.println((i+1) +"- Roll number " +marks[i]);
        }*/


        /*Take an array of names as input from the user and print them on the screen.
        System.out.println("Enter the size of an array");
        int size = input.nextInt();
        String[] name = new String[size];
        System.out.println("Enter the students name");
        for (int i = 0; i<size;i++){
            name[i] = input.nextLine();
        }

        System.out.println("Your entered names are");
        for (int i = 0;i< name.length;i++){
            System.out.println(name[i]);
        }*/


        /*Find the maximum & minimum number in an array of integers.
        [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
        System.out.println("Enter the size of an array");
        int size = input.nextInt();
        int[] number  = new int[size];
        System.out.println("Enter the numbers");
        for (int i = 0;i<size;i++){
            number[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< number.length;i++){
            if (number[i] < min){
                min = number[i];
            }if (number[i] > max){
                max = number[i];
            }
        }
        System.out.println("Maximum value "+max);
        System.out.println("Maximum value "+min);*/

        /*Take an array of numbers as input and check if it is an array sorted in ascending order.
        Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        {3, 4, 6, 2} is not sorted in ascending order.*/
        System.out.println("Enter the size of an array");
        int size = input.nextInt();
        int[] ascending = new int[size];
        System.out.println("Enter the numbers");
        for (int i = 0;i<size;i++){
            ascending[i] = input.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i< ascending.length-1;i++){
            if (ascending[i]<ascending[i+1]){
                isAscending = false;
            }
        }
        if (isAscending){
            System.out.println("Ascending Order");
        }else {
            System.out.println("Not ascending order");
        }

    }
}
