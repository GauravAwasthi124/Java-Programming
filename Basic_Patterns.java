import java.util.Scanner;
public class Basic_Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        //        Hollow Rectangular
//        int n = 4,m = 5;
//        for (int i = 1; i<=n;i++){
//            for (int j = 1;j <=m;j++){
//                if (i ==1 ||j ==1||i ==n|| j==m) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }



//        Solid Rectangular
//        for (int i = 1;i<=4;i++){
//            for (int j = 1; j <=5 ;j++) {
//                System.out.print("*\t");
//            }
//            System.out.print("\n");
//        }



//          Half Pyramid
//        for (int i = 1;i<=4;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Inverted Half Pyramid
//        for (int i = 4;i>=1;i--){
//            for (int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Inverted Half Pyramid (Rotated by 180 degree)
//        for (int i = 1;i<=4;i++){
//                for (int j = 1; j<=4-i;j++){
//                    System.out.print(" ");
//                }
//            for (int j = 1;j <=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1;i<=5;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }



//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=5-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        int number = 1;
//        for(int i = 1;i<=5;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print(number+"\t");
//                number++;
//            }
//            System.out.println();
//        }


//        for (int i = 1; i<=5;i++){
//            for(int j = 1; j<=i;j++){
//                int sum = i+j;
//                if (sum %2 ==0){
//                    System.out.print("1 ");
//                }else {
//                    System.out.print("0 ");
//                }
//
//            }
//            System.out.println();
//        }

        for (int i = 1; i<=5;i++){
            for (int j = 1; j<=5-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 1;i<=5;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int j = 1;j<=5;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


    }
}
