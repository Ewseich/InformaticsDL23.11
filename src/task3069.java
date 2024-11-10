import java.util.Scanner;
public class task3069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, col = 0, b = sc.nextInt();
        do {
            a = sc.nextInt();
            if (a > b) {
                col++;
            }
            b = a;
        } while (a != 0);
        System.out.println(col);
    }
}