import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int count = 0;
        int number = 0;
        int sum = 0;

        while (count < n) {
            if (number % 3 == 0) {
                sum += number;
            }
            number += 2; // Increment by 2 to get the next even number
            count++;
        }

        System.out.println("Sum of all the numbers divisible by 3 from 0 to " + n + " is: " + sum);
    }
}
