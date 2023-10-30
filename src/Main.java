// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        while (a < 20 && b > 0) {
            a++;
            b--;
            if (b > 5) {
                b /= 2;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}