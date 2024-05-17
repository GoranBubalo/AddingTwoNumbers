import java.util.Scanner;

public class Main {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        //Adding two numbers using Scanner class for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        System.out.println();

        //Adding two numbers with a method
        Main addTwoNumbers = new Main();
        int res = addTwoNumbers.sum(20, 20);
        System.out.println("The other way of adding two numbers: " + res);


    }
}