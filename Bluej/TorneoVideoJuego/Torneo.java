
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Torneo
{
    private ArrayList<Jugador> jugadores;
    private ArrayList<Partida> historial;
    private String nombre_juego;
    Scanner teclado;


    public Torneo(){
        jugadores = new ArrayList<>();
        historial = new ArrayList<>();   
    }

    public void AgregarJugadores(){
        String nombre = " ";
        int dni = 0;
        
        Jugador jugador = new Jugador(nombre, dni);
        jugadores.add(jugador);   
    }

    public void listarJugadores(){
        System.out.println(" Nombre " + " Dni " + " Puntaje ");
        for(Jugador j : jugadores){
            System.out.println(" " + j.getNombre() + " " + j.getDni());
        }
    }



    public void mostrarRanking(){
    int n = jugadores.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++){
                if (jugadores.get(j).getPuntaje() < jugadores.get(j + 1).getPuntaje()) {
                    Jugador temp = jugadores.get(j);
                    jugadores.set(j, jugadores.get(j + 1));
                    jugadores.set(j + 1, temp);
                }
            }
        }

        int cont = 0;
        System.out.println(" Nombre " + " Dni " + " Puntaje ");
        for(Jugador j : jugadores){
            cont++;
            System.out.println(cont + ")" + " " + j.getNombre() + " " + j.getDni());
        }
    }


    public void iniciarPartida(){
        int n = jugadores.size();
        Random random = new Random();

        int jugador1 = random.nextInt(n);
        int jugador2 = random.nextInt(n);
        while(jugador1 == jugador2) jugador2 = random.nextInt(n);

        historial.add(new Partida(jugadores.get(jugador1), jugadores.get(jugador2)));
        historial.get(historial.size()).seleccionarGanador();
    }   


    public void mostrarHistorial(){
        System.out.println(" Jugador1 " + "vs" + "Jugador2" + " Ganador ");
        for(Partida p : historial){
            System.out.println(p.jugador1.getNombre() + "vs" + p.jugador2.getNombre() + p.getGanador());
        }
    }

    
    public void buscarJugador(){
        teclado = new Scanner(System.in);
        Jugador jugador_encontrado = null;
        System.out.println("Nombre del jugador que desea buscar: ");
        String buscar = teclado.nextLine();
        buscar = buscar.toLowerCase().trim();
        for(Jugador j : jugadores){
            if(j.getNombre().equals(buscar)){
                jugador_encontrado = j;
            }
        }
        if(jugador_encontrado == null) System.out.println("No se encontro el jugador");
        else System.out.println(jugador_encontrado.getNombre() + jugador_encontrado.getDni() + "puntaje: " + jugador_encontrado.puntaje);
    }


    public void ganadorTorneo(){
    int n = jugadores.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++){
            if (jugadores.get(j).getPuntaje() < jugadores.get(j + 1).getPuntaje()) {
                    Jugador temp = jugadores.get(j);
                    jugadores.set(j, jugadores.get(j + 1));
                    jugadores.set(j + 1, temp);
                }
            }
        }
        System.out.println("El ganador es: " + jugadores.get(0).getNombre() + " con " + jugadores.get(0).getPuntaje() + " puntos");
    }
}