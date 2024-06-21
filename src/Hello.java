import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("The sum is: " + sum);
    }
}
