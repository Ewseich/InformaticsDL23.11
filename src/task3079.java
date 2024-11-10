import java.util.Scanner;
public class task3079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), col = 0, el, el1 = Integer.MAX_VALUE;
        do {
            el = sc.nextInt();
            if (el == 0) break;
            if (a > el1 && el < a) {
                col++;
            }
            el1 = a;
            a = el;

        } while (el != 0);
        System.out.println(col);
    }
}