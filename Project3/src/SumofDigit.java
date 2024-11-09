import java.util.Scanner;

public class SumofDigit {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // To read input from the user
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // user input

        // Call method
        int result = sumOfDigits(number);

        // Output the result
        System.out.println("Sum of digits: " + result);
    }
}
        


	
		




	


