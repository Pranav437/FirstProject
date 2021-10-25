import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int[] a = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the value " + (i + 1));
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.print("You have entered ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println(" ");
        System.out.println("Sum is " + sum);
    }
}
