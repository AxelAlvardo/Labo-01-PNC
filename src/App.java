
public class App {
    public static void main(String[] args) throws Exception {

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



        System.out.println("Lista de Jugadores:");
        for (Jugador jugador : gestor.getJugadores()) {
            System.out.println(jugador);
        }
        System.out.println("\nJugadores con más de 5 goles:");
        for (Jugador jugador : gestor.jugadoresConMasDe5Goles()) {
            System.out.println(jugador);
        }


        



    }
}
