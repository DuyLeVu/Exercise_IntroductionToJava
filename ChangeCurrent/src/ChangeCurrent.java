import java.util.Scanner;
public class ChangeCurrent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double usd;
        double rate = 23000;
        do {
            System.out.println("Enter USD: ");
            usd = sc.nextDouble();
        } while (usd <= 0);

         double result = usd * rate;
        System.out.printf("'%.2f' USD = %.2f VND ",usd ,result);
    }
}
