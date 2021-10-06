import java.util.Scanner;
public class Nam {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a* x + b = 0', please enter constants: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("a :");
        a = sc.nextDouble();
        System.out.println("b :");
        b = sc.nextDouble();
        System.out.println("c :");
        c = sc.nextDouble();

        if (a!=0){
            double answer = (c-b) / a;
            System.out.printf("The solution is: %f", answer);
        } else {
            if (b==0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No Solution! ");
            }
        }
    }
}
