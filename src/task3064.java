import java.util.Scanner;
public class task3064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, col = 0;
        do {
            a = sc.nextInt();
            if (a != 0) {
                col++;
            }
        } while (a != 0);
        System.out.println(col);
    }
}
