import java.util.Scanner;
public class Bubble_sort {
    public static void main(String[] args) {
        int[] file = {7,8,3,2,1};
        for (int i = 0;i< file.length;i++){
            for (int j = 0;j< file.length-i-1;j++){
                if (file[j] >file[j+1]){
                    int temp = file[j];
                    file[j] = file[j+1];
                    file[j+1] = temp;
                }
            }
        }
        for (int i = 0; i< file.length;i++){
            System.out.print(file[i]+" ");
        }
        System.out.println();
    }
}
