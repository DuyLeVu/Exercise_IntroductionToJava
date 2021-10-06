import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double weight;
        double height;

        System.out.println("Enter your weight (in kilogram): ");
        weight = sc.nextFloat();
        System.out.println("Enter your height (in meter): ");
        height = sc.nextFloat();

        double bmi = weight / Math.pow(height,2);
        if (bmi >= 30) {
            System.out.println("Obese");
        } else { if (bmi >= 25) {
            System.out.println("Overweight");
        }
            else {if (bmi >= 18.5) {
                System.out.println("Normal");
            }
            else {
            System.out.println("Underweight");
        }
            }
        }
        }
    }
