
import java.util.*;
/**
 * Representa una partida entre dos jugadores del torneo.
 * Genera un resultado aleatorio y actualiza las estadísticas.
 *
 * @author Farid
 * @version 1.0
 */
public class Partida {
    private 
    ArrayList<String> jugadores;
    S;

    /**
     * Constructor de Partida. El resultado se inicializa como empate por defecto
     *
     * @param jugador1 Primer jugador de la partida.
     * @param jugador2 Segundo jugador de la partida.
     */
    public Partida(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.ganador = "Empate";
    }

    /**
     * Selecciona aleatoriamente el ganador de la partida.
     * 0 = empate, 1 = jugador1, 2 = jugador2.
     */
    public void seleccionarGanador() {
    Random rand = new Random();
    int resultado = rand.nextInt(3); // 0, 1 o 2
    if (resultado == 1) {
        ganador = jugador1.getNombre();
    } else if (resultado == 2) {
        ganador = jugador2.getNombre();
    }
}

    /**
     * Suma 1 punto al jugador ganador.
     * En caso de empate no se suman puntos.
     */
    public void actualizarPuntos() {
        if (ganador.equals(jugador1.getNombre())) {
            jugador1.modificarPuntaje(1);
        } else if (ganador.equals(jugador2.getNombre())) {
            jugador2.modificarPuntaje(1);
        }
        /**
        * Suma 1 partida jugada a cada jugador
        */
        jugador1.modificarCant_partidas(1);
        jugador2.modificarCant_partidas(1);
    }

    /**
     * Retorna el nombre del ganador o "Empate".
     *
     * @return String con el resultado de la partida.
     */
    public String getGanador() {
        return ganador;
    }

    /**
     * Retorna el primer jugador de la partida.
     *
     * @return jugador1
     */
    public Jugador getJugador1() {
        return jugador1;
    }

    /**
     * Retorna el segundo jugador de la partida.
     *
     * @return jugador2
     */
    public Jugador getJugador2() {
        return jugador2;
    }


}