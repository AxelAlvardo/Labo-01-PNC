import java.util.List;

public class Team {
    private String name;
    private List<Jugador> players;

    public Team(String name, List<Jugador> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public List<Jugador> getPlayers() {
        return players;
    }
}
