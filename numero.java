import java.security.DrbgParameters;
import java.util.Scanner;
public class numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos elementos tendrá el arreglo? ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el valor para el elemento " + i + ": ");
            arreglo[i] = sc.nextInt();
        }
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < (n - 1); j++) {
                if (arreglo[j] > arreglo[j + 1])
                {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;

                }
            }
        }
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println();
    }
}
