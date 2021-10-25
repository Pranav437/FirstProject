import java.util.Scanner;

public class CompGuess {
    public static void main(String[] args) {
        int Computer = (int) (Math.random() * 100);
        int a = 0;
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b == true) {
            System.out.println("Enter the value between 1 to 100");
            a = sc.nextInt();
            if (Computer == a) {
                System.out.println("Correct");
                b = false;
            } else if (Computer > a) {
                System.out.println("Your number is smaller");
            } else {
                System.out.println("Your number is bigger");
            }
        }
        System.out.println("Congrats");

    }
}
