import java.util.Scanner;

public class Dowhileloop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        int i = 1;
        int b;

        do {
            b = a * i;
            System.out.println(a + "x" + i + "=" + b);
            i++;

        } while (i <= 10);
    }
}