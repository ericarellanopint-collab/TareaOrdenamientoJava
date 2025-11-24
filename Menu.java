import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ ");
            System.out.println("1. Ordenar números");
            System.out.println("2. Ordenar cadenas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ordenarNumeros(sc);
                    break;
                case 2:
                    ordenarCadenas(sc);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 3);
        sc.close();
    }
    public static void ordenarNumeros(Scanner sc) {
        System.out.print("\n¿Cuántos elementos tendrá el arreglo de números? ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el valor para el elemento " + i + ": ");
            arreglo[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("\nNúmeros ordenados:");
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);
        }
    }
    public static void ordenarCadenas(Scanner sc) {
        System.out.print("\n¿Cuántos elementos tendrá el arreglo de cadenas? ");
        int n = sc.nextInt();
        String[] arreglo = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la cadena para el elemento " + i + ": ");
            arreglo[i] = sc.nextLine();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) {
                    String aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("Cadenas ordenadas:");
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);
        }
    }
}