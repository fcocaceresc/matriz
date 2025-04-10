import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class Matriz {
    private static final Set<Integer> VALID_OPTIONS = Set.of(1, 2, 3, 4, 5);
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int option;
        do {
            mostrarMenu();
            option = obtenerOpcion();
        } while (option != 5);
    }

    public static void mostrarMenu() {
        System.out.println("[1] Crear matriz");
        System.out.println("[2] Llenar matriz");
        System.out.println("[3] Mostrar fila");
        System.out.println("[4] Verificar si la matriz es tipo cero");
        System.out.println("[5] Salir");
    }

    public static int obtenerOpcion() {
        while (true) {
            boolean isAnInt = SCANNER.hasNextInt();
            if (isAnInt) {
                int option = SCANNER.nextInt();
                SCANNER.nextLine();
                if (VALID_OPTIONS.contains(option)) {
                    return option;
                }
                System.out.println("Ingrese un número entero del 1 al 5");
            } else {
                System.out.println("Ingrese un número entero");
                SCANNER.nextLine();
            }
        }
    }

    public static boolean validarDimensiones(int filas, int cols) {
        return 0 < filas && 0 < cols;
    }

    public static int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt(10);
            }
        }
        return matriz;
    }

    public static void mostrarFila(int[][] matriz, int fila) {
        if (fila < 0 || fila >= matriz.length) {
            System.out.println("La fila no es válida");
        }
        System.out.println(Arrays.toString(matriz[fila]));
    }

    public static boolean matrizCero(int[][] matriz) {
        double totalElements = matriz.length + matriz[0].length;
        double zeroCount = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    zeroCount++;
                }
            }
        }
        return zeroCount / totalElements > 0.5;
    }

}
