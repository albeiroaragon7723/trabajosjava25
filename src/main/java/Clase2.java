import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite su nombre");
        String nombre=scanner.next();
        System.out.println("buen dia, su nombre es "+ nombre);
        System.out.println("digite su edad");
        int edad = scanner.nextInt();
        System.out.println("su edad es "+ edad );
        scanner.close();
    }
}
