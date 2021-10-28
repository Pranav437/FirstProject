import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 3, 6, 5, 66};
        System.out.println(contains (arr, 6));

    }

    public static int contains(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
             return i;
            }
        }
        System.out.println("Not given");
        System.out.println("Hello");
    return 0;
    }
}