import java.util.Scanner;
public class task3066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, summ = 0, col = 0;
        do {
            a = sc.nextInt();
            if (a != 0) {
                summ += a;
                col++;
            }
        } while (a != 0);
        System.out.println(summ/(double) col);
    }
}
