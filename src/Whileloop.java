import java.util.Scanner;

public class Whileloop {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        int b;
        int i = 1;

        while (i <= 10) {

b = a*i;
            System.out.println(a + "x" + i + "=" + b);
            i++;
        }
    }
}