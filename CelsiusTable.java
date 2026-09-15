public class CelsiusTable {
    public static void main(String[] args){
        double F;
        String table = "Fahrenheit     Celsius\n-------------------\n";
        for(double i = 0.0; i < 21.0; i++){
            F = i;
            double C = celsius(F);
            table += F + "           " + String.format("%.2f", C);
            table += "\n";
        }
        System.out.print(table);
    }
    public static double celsius(double F){
        double C = (5.0/9.0)*(F - 32);
        return C;
    }
}
