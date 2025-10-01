import java.util.ArrayList;
import java.util.Scanner;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            int num = Integer.parseInt(token);
            numbers.add(num);
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
