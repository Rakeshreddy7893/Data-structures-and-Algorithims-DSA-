import java.util.Scanner;

public class PrintFiboSeries {
    public static void main(String args[]) {
        System.out.println("Enter number to print number of fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0, second = 1;
        for (int i = 0; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(first + " ");
        }
        sc.close();
    }
}
