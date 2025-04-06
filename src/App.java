public class App {
    public static void main(String[] args) throws Exception {

        Menu menu = new Menu();
    
        GestorJugadores gestor = new GestorJugadores();
        gestor.agregarJugador(1, "Neymar Jr.", 6, 4);
        gestor.agregarJugador(2, "Kylian Mbappé", 7, 3);
        gestor.agregarJugador(3, "Lionel Messi", 8, 5);
        gestor.agregarJugador(4, "Cristiano Ronaldo", 10, 6);
        gestor.agregarJugador(5, "Kevin De Bruyne", 3, 4);
        gestor.agregarJugador(6, "Robert Lewandowski", 9, 5);
        gestor.agregarJugador(7, "Mohamed Salah", 5, 4);
        gestor.agregarJugador(8, "Virgil van Dijk", 1, 5);
        gestor.agregarJugador(9, "Luka Modrić", 4, 4);
        gestor.agregarJugador(10, "Sergio Ramos", 2, 5);

        Team team_1 = new Team("Los Java", gestor.getJugadores().subList(0, 5));
        Team team_2 = new Team("Los Springboot", gestor.getJugadores().subList(5, 10));

        Match match = new Match(team_1,team_2,0,0);
        menu.executeOption(match, gestor);

    }
 
}
