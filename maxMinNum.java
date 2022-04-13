import java.util.Scanner;

public class maxMinNum {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a Value: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }


}
