import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();

        Match match = new Match(List.of("Jugador 1", "Jugador 2"), List.of("Jugador 3", "Jugador 4"), 0, 0);
        
        menu.executeOption(match);
    }
}
