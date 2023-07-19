import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int output = findFactorial(number);
        System.out.println("Output : " + output);
    }

    private static int findFactorial(int number) {
        if (number == 1){
            return 1;
        }
        if (number == 0){
            return 1;
        }
        return findFactorial(number - 1) * number;
    }
}
