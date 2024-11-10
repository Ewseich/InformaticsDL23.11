import java.util.Scanner;
public class task3072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, col = 0, res = 0;
        int max = Integer.MIN_VALUE;
        do {
            a = sc.nextInt();
            if (a > max) {
                max = a;
                col = 0;
            }
            if (a == max) {
                col++;
            }

        } while (a != 0);
        System.out.println(col);
    }
}