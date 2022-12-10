import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please add a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("Fizz");
        }
        if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("BuzzFizz");
        }
        }

    }






