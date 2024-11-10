import java.util.Scanner;
public class task3077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, col = 0, el = 0;
        int max = 0;
        do {
            a = sc.nextInt();
            if (a != el) {
                el = a;
                if (col > max) {
                    max = col;
                }
                col = 0;
            }
            if (a == el) {
                col++;
                if (col > max) {
                    max = col;
                }
            }

        } while (a != 0);
        System.out.println(max);
    }
}