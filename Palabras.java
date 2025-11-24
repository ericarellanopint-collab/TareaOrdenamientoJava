import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos elementos tendrá el arreglo? ");
        int n = sc.nextInt();
        sc.nextLine();

        char[] arreglo = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el caracter para el elemento " + i + ": ");
            arreglo[i] = sc.nextLine().charAt(0);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 ; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    char aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);
        }
    }
}