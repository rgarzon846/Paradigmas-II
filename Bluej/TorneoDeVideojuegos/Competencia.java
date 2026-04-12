
import java.util.*;

/**
 * Gestiona el desarrollo de la competencia, coordina las rondas, 
 * los emparejamientos aleatorios y la determinación del ganador final.
 * * @author Sanchez Solano Juan Cruz 
 * @version 1.0
 */
public class Competencia {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Partida> partidas;
    private String nombre_juego;
    private Jugador ganador_de_competencia;
    int rondas;

    /**
     * Constructor del objeto Competencia.
     * @param nombre_juego Nombre del juego o torneo.
     * @param jugadores Lista inicial de participantes.
     */
    public Competencia(String nombre_juego, ArrayList<Jugador> jugadores, int rondas) {
        this.jugadores = jugadores;
        this.partidas = new ArrayList<>();
        this.nombre_juego = nombre_juego;
        this.rondas = rondas;
        ganador_de_competencia = new Jugador();
    }

    /**
     * Ejecuta la lógica de las partidas por rondas hasta hallar un ganador.
     */
  public void realizarPartidas(){
        reiniciarEliminado();
        int copia_rondas = rondas;
        Random random = new Random();
        Partida p;
        int indice1;
        int indice2;
        boolean fin = false;
        int cantJugadores = jugadores.size();

        do{ 
        for(int i = 0; i < copia_rondas; i++){
            indice1 = random.nextInt(cantJugadores);
            indice2 = random.nextInt(cantJugadores);
            while(indice1 == indice2) indice2 =random.nextInt(cantJugadores);
            Jugador j1 = jugadores.get(indice1);
            Jugador j2 = jugadores.get(indice2);

            if(verificarPartida(j1, j2)){
                jugadores.get(indice1).setEmparejado(true);
                jugadores.get(indice2).setEmparejado(true);
                p = new Partida(j1, j2, nombre_juego);
                p.asignarPuntajes();
                partidas.add(p);
            }
            else i--;
        }
        if(copia_rondas == 1) fin = true;
        copia_rondas = copia_rondas/2;
        reiniciarEmparejamiento();
        }while(!fin);
        
        setGanadorCompetencia();
        System.out.println("Competencia terminada, ganador: " + getGanadorCompetencia().getNombre());
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
    private void reiniciarEliminado() {
        for (Jugador j : jugadores) {
            j.setEliminado(false);
        }
    } 
    
    /**
     * Busca en la lista al único jugador que no ha sido eliminado.
     * @return El objeto {@link Jugador} ganador.
     */
    private void setGanadorCompetencia() {
        for (Jugador p : jugadores) {
            if (!p.getEliminado()) {
                this.ganador_de_competencia = p; // Retornamos apenas lo encontramos
            }
        }
    }
    public Jugador getGanadorCompetencia(){
        return ganador_de_competencia;
    }

    /**
     * Retorna el historial de partidas disputadas.
     * @return Un {@code HashMap} con el ID de partida y el ganador correspondiente.
     */
    public ArrayList<Partida> getPartidas() {
        return partidas;
    }
    public String getNombre_juego(){
        return nombre_juego;
    }
}