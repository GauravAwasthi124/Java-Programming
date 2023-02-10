import java.util.Scanner;
public class Arrays_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and colums");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] number = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = input.nextInt();
            }
        }
//        System.out.println("Output");
//        for (int i=0;i< number.length;i++){
//            for (int j=0;j< number.length;j++){
//                System.out.print(number[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println("Enter the number for location search");
        int x = input.nextInt();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[i][j] == x) {
                    System.out.println("Location " + i + "," + j);
                }
            }
        }
    }
}

