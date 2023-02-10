import java.util.Scanner;
public class Advance_Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        for (int i = 1; i<=4;i++){
//
//            for (int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            for (int j = 1;j<=2*(4-i);j++){
//                System.out.print(" ");
//            }
//            for (int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 4; i>=1;i--){
//            for (int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            for (int j = 1;j<=2*(4-i);j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i = 1;i<=5;i++){
//            for (int j = 1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//            for (int j = 1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//
//            System.out.println();
//        }


        for (int i = 1; i<=5;i++){
            for (int j = 1; j<=5-i;j++){
                System.out.print(" ");
            }
            for (int j = i;j>=1;j--){
                System.out.print(j+" ");
            }
            for (int j = 2; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
