import java.util.Scanner;

public class NumberTo100 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n =0;
        int sum = n++ ;

        while (n> 0 && n<=100) {
            sum += n;
            System.out.printf("+%d", sum);
        }
        System.out.printf(" = %d%n", sum);
    }
}
