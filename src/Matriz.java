import java.util.Scanner;
import java.util.Set;

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

}
