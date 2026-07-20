package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x = new Triangle();
        Triangle y = new Triangle();
        
        System.out.println("Entre com as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        // System.out.println("Entre com as medidas do triangulo Y: ");
        // y.a = sc.nextDouble();
        // y.b = sc.nextDouble();
        // y.c = sc.nextDouble();

        x.triangleArea();
        // y.triangleArea();
        
        System.out.print(x);
        // y.print();

        sc.close();
    }
}
