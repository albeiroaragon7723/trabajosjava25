import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tasaDeCambio = 4000;
        System.out.print("Ingrese la cantidad de pesos colombianos a convertir a dólares: ");
        double pesosColombianos = scanner.nextDouble();

        // Conversión de pesos colombianos a dólares
        double dolares = pesosColombianos / tasaDeCambio;

        System.out.println(pesosColombianos + " pesos colombianos equivalen a " + dolares + " dólares.");

    }
}
