import java.util.*;
class FuleConsuptionCalculation{
    
    private static void fuleConsuptionCalculation(double liter, double km){
        double gallon = liter * 0.2642;
        double mile = km * 0.6214;

        double literPerKm = (liter / km) * 100.0;
        double gallonPerKm = (mile / gallon);

        System.out.println("Liters/100KM");
        System.out.printf("%.2f",literPerKm);
        // System.out.println(decimalFormat.format(literPerKm));
        System.out.println();
        System.out.println("Miles/gallons");
        // System.out.println(decimalFormat.format(gallonPerKm));
        System.out.printf("%.2f",gallonPerKm);
    }

    private static void check(double val){
        if(val <= 0){
            System.out.println((int)val + " is an Invalid Input");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double liter = sc.nextDouble();
        check(liter);
        System.out.println("Enter the distance covered");
        double km = sc.nextDouble();
        check(km);
        fuleConsuptionCalculation(liter, km);
    }
}