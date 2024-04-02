import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca un número cualquiera: ");
        System.out.println("Número introducido: " + scanner.nextInt());
        
        scanner.close();
    }
}