import java.util.Scanner;
public class task3070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, col = 0, res = 0;
        int max = Integer.MIN_VALUE;
        do {
            a = sc.nextInt();
            if (a > max) {
                res = max;
                max = a;
            }
            if (a < max && a > res) {
                res = a;
            }
        } while (a != 0);
        System.out.println(res);
    }
}