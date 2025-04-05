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


}
