/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        mostrarTablero(tablero);

        char jugadorActual = 'X';
        boolean juegoEnCurso = true;

        while (juegoEnCurso) {
            realizarJugada(tablero, jugadorActual);
            mostrarTablero(tablero);

            if (haGanado(tablero, jugadorActual)) {
                System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                juegoEnCurso = false;
            } else if (tableroCompleto(tablero)) {
                System.out.println("¡Empate! El tablero está completo.");
                juegoEnCurso = false;
            } else {
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }
    }

    static void mostrarTablero(char[][] tablero) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
        System.out.println();
    }

    static void realizarJugada(char[][] tablero, char jugador) {
        Scanner scanner = new Scanner(System.in);

        int fila, columna;
        do {
            System.out.print("Jugador " + jugador + ", ingresa la fila (0-2): ");
            fila = scanner.nextInt();
            System.out.print("Jugador " + jugador + ", ingresa la columna (0-2): ");
            columna = scanner.nextInt();
        } while (!esJugadaValida(tablero, fila, columna));

        tablero[fila][columna] = jugador;
    }

    static boolean esJugadaValida(char[][] tablero, int fila, int columna) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ') {
            System.out.println("¡Jugada no válida! Inténtalo de nuevo.");
            return false;
        }
        return true;
    }

    static boolean haGanado(char[][] tablero, char jugador) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }

        // Verificar diagonales
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
               (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }

    static boolean tableroCompleto(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
