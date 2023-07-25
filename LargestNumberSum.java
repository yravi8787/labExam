
import java.util.Scanner;

public class LargestNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest = findLargest(num1, num2, num3);
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("The largest number is: " + largest);
        System.out.println("The sum of the three numbers is: " + sum);
        System.out.println("The average of the three numbers is: " + average);

        scanner.close();
    }

    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

