import java.util.Scanner;
public class Factorial {
    public static void main(String[] agr)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int fact = 1;
        for(int i = 1; i < num + 1; i++)
        {
            fact *= i;
        }
        System.out.printf("Factorial: %d \n", fact);
        in.close();
    }
}
