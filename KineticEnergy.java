import java.util.Scanner;
public class KineticEnergy {
    
    public static void main(String[] args){
        double m, v;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Object's Mass in Kilograms: ");
        m = input.nextDouble();
        System.out.print("Enter the Object's Velocity in Meters per Second: ");
        v = input.nextDouble();
        double KE = kineticEnergy(m, v);
        System.out.printf("The Calculated Kinetic Energy for your object is: %.2f%n", KE);

    }
    public static double kineticEnergy(double m, double v){
        double KE = (0.5)*(m)*Math.pow((v), (2));
        return KE;
    }
}
