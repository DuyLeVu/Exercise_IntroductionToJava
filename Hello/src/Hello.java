import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your name:");
        String str = sc.nextLine();

        System.out.printf("Hello: %s", str);
    }
}
