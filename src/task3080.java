import java.util.Scanner;
public class task3080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), col = 0, el, el1 = Integer.MAX_VALUE, step = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        do {
            if (step != Integer.MAX_VALUE) step++;
            el = sc.nextInt();
            if (el == 0) break;
            if (a > el1 && el < a) {
                if (step < min) {
                    min = step;
                }
                step = 0;
            }
            el1 = a;
            a = el;

        } while (el != 0);
        if (min == Integer.MAX_VALUE) min = 0;
        System.out.println(min);
    }
}
