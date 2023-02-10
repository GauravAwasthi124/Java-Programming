import java.io.*;
public class Java_input1 {
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int num = Integer.parseInt(input.readLine());
        System.out.println("Entered String is " + str);
        System.out.println("Entered number is " + num);
    }
}

