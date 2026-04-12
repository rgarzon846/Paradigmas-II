
import java.util.*;

/**
 * Gestiona el desarrollo de la competencia, coordinando las rondas, 
 * los emparejamientos aleatorios y la determinación del ganador final.
 * * @author Sanchez Solano Juan Cruz 
 * @version 1.0
 */
public class Competencia {
    private ArrayList<Jugador> jugadores;
    private HashMap<Integer, Jugador> partidas;
    private String nombre_juego;

    /**
     * Constructor del objeto Competencia.
     * @param nombre_juego Nombre del juego o torneo.
     * @param jugadores Lista inicial de participantes.
     */
    public Competencia(String nombre_juego, ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.partidas = new HashMap<>();
        this.nombre_juego = nombre_juego;
    }

    /**
     * Ejecuta la lógica de las partidas por rondas hasta hallar un ganador.
     */
    public void realizarPartidas() {
        Random random = new Random();
        Sistema sistema = new Sistema(); // Asumo que esta clase maneja la config inicial
        int contPartidas = 0;
        boolean fin = false;

        int rondas = sistema.getRondas();
        int cantJugadores = jugadores.size(); // Mejor usar el tamaño real de la lista

        do { 
            // Se asume que rondas-1 es la cantidad de emparejamientos necesarios
            for (int i = 0; i < rondas; i++) {
                int indice1 = random.nextInt(cantJugadores);
                int indice2 = random.nextInt(cantJugadores);

                while (indice1 == indice2) {
                    indice2 = random.nextInt(cantJugadores);
                }

                Jugador j1 = jugadores.get(indice1);
                Jugador j2 = jugadores.get(indice2);

                if (verificarPartida(j1, j2)) {
                    contPartidas++;
                    j1.setEmparejado(true);
                    j2.setEmparejado(true);
                    
                    Partida p = new Partida(j1, j2, nombre_juego);
                    p.asignarPuntajes();
                    partidas.put(contPartidas, p.getGanador());
                } else {
                    // Si los índices elegidos no están disponibles, reintentamos el ciclo
                    i--; 
                }
            }

            if (rondas <= 1) fin = true;
            rondas = rondas / 2;
            reiniciarEmparejamiento();
        } while (!fin);

        System.out.println("Ganador de " + nombre_juego + ": " + getGanadorCompetencia().getNombre());
    }

    /**
     * Verifica si dos jugadores están aptos para enfrentarse.
     * @param j1 Primer participante.
     * @param j2 Segundo participante.
     * @return {@code true} si ambos están activos y sin pareja; {@code false} de lo contrario.
     */
    private boolean verificarPartida(Jugador j1, Jugador j2) {
        return (!j1.getEliminado() && !j1.getEmparejado()) && 
               (!j2.getEliminado() && !j2.getEmparejado());
    }

    /**
     * Restablece el estado de emparejamiento de todos los jugadores.
     */
    private void reiniciarEmparejamiento() {
        for (Jugador j : jugadores) {
            j.setEmparejado(false);
        }
    }
    
    /**
     * Busca en la lista al único jugador que no ha sido eliminado.
     * @return El objeto {@link Jugador} ganador.
     */
    public Jugador getGanadorCompetencia() {
        for (Jugador p : jugadores) {
            if (!p.getEliminado()) {
                return p; // Retornamos apenas lo encontramos
            }
        }
        return null; 
    }

    /**
     * Retorna el historial de partidas disputadas.
     * @return Un {@code HashMap} con el ID de partida y el ganador correspondiente.
     */
    public HashMap<Integer, Jugador> getPartidas() {
        return partidas;
    }
    public String getNombre_juego(){
        return nombre_juego;
    }
}