import java.util.Scanner;

public class MovimientosAlfil {

    public static void main(String[] args) {
        char[][] tablero = {
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'},
            {'8', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'7', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'6', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'5', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'4', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'3', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'2', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'1', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        mostrarTablero(tablero);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la posición del alfil (por ejemplo, E4):");
        String posicionAlfil = scanner.nextLine();

        int filaAlfil = 8 - Character.getNumericValue(posicionAlfil.charAt(1));
        int columnaAlfil = posicionAlfil.charAt(0) - 'A';

        if (esMovimientoValido(filaAlfil, columnaAlfil)) {
            System.out.println("Movimiento válido para el alfil.");
        } else {
            System.out.println("Movimiento no válido para el alfil.");
        }
    }

    static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean esMovimientoValido(int fila, int columna) {
        // Verificar si la posición es válida en el tablero
        if (fila < 1 || fila > 8 || columna < 0 || columna >= 8) {
            return false;
        }

        // Verificar si el movimiento es diagonal
        if (Math.abs(fila - 4) == Math.abs(columna - 4)) {
            return true;
        }

        return false;
    }
}