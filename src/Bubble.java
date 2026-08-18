import java.util.Scanner;
import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        int [] ventas = new int[10];
        capturaVentas(ventas);
        mostrarArreglo(ventas);
    }

public static void capturaVentas(int [] ventas) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < ventas.length; i++) {
        System.out.println("Ingrese la venta " + (i + 1) + " / 10 en $: ");
        ventas[i] = sc.nextInt();
    }
}

public static void mostrarArreglo(int [] ventas) {
    System.out.println("Ventas capturadas: ");
    for (int i = 0; i < ventas.length; i++) {
        System.out.print(ventas[i] + " ");
    }
}

}
