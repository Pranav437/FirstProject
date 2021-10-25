import java.util.Locale;

public class ReverseString {
    public static void main(String[] args) {
        String a = "Hello";
        String b;
        System.out.println("You have entered");
        System.out.println(a);
        char c[] = new char[5];
        char d[] = new char[5];
        c = a.toCharArray();
        int j = 4;
        for (int i = 0; i < 5; i++) {
            d[j] = c[i];
            j--;
        }
        b = d.toString();
        System.out.println("Reverse output is");
        System.out.println(d);
    }
}



