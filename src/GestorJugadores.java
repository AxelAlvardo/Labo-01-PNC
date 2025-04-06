import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorJugadores {
    private List<Jugador> jugadores;

    public GestorJugadores() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(int id, String nombreJugador, int cantidadGolesMarcados, int cantidadPartidosJugados) {
        jugadores.add(new Jugador(id, nombreJugador, cantidadGolesMarcados, cantidadPartidosJugados));
    }
    
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public List<Jugador> jugadoresConMasDe5Goles() {
        return jugadores.stream()
                        .filter(jugador -> jugador.getcantidadGolesMarcados() > 5)
                        .collect(Collectors.toList());
    }
    
    public Jugador topJugadoresPorTemporada() {
        if (jugadores.isEmpty()) return null;
        Jugador top = jugadores.get(0);
        for (Jugador j : jugadores) {
            if (j.getcantidadGolesMarcados() > top.getcantidadGolesMarcados()) {
                top = j;
            }
        }
        return top;
    }
    
    public Jugador buscarJugadorPorId(int id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                return jugador;
            }
        }
        return null;
    }
}
