import java.util.Scanner;

public class ArrayName {
    public static void main(String[] args) {
        int b;
        System.out.println("Enter the Total number of characters");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
char [] a = new char [b];
        for (int i = 0; i < b; i++){
            System.out.println("Enter char " +(i+1));
            Scanner sc1 = new Scanner(System.in);
            a[i] = sc1.next().charAt(0);
        }
        System.out.println("Your first name is ");
        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
