import java.util.Scanner;
public class FutureValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double P, i;
        int t;
        System.out.print("Enter Account's Present Value: ");
        P = input.nextDouble();
        System.out.print("Enter Monthly Interest Rate as a decimal: ");
        i = input.nextDouble();
        System.out.print("Enter the amount of Months the money will stay in the account for: ");
        t = input.nextInt();
        double F = futureValue(P, i, t);
        System.out.printf("The expected Future Value is: %.2f%n", F);
    }
    public static double futureValue(double P, double i, int t){
        double F = P * Math.pow((1 + i), t);
        return F;
    }
}
