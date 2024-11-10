import java.util.Scanner;
public class task3078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, col = 0, el = sc.nextInt(), up = 1, down = 1;
        int max = 1;
        do {
            a = sc.nextInt();
            if (a == 0) {
                break;
            }
            if (a > el) {
                el = a;
                up++;
                if (up > max) {
                    max = up;
                }
                down = 1;
            }
            else if (a < el) {
                el = a;
                down++;
                if (down > max) {
                    max = down;
                }
                up = 1;
            }
            else {
                up = 1;
                down = 1;
                el = a;
            }

        } while (a != 0);
        System.out.println(max);
    }
}
