import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void displayMenu() {
        System.out.println("FOOTBALL SYSTEMA");
        System.out.println("1. Registrar goles");
        System.out.println("2. Mostrar detalles del partido");
        System.out.println("3. Ver el ganador del partido");
        System.out.println("4. Calcular el jugador con más goles");
        System.out.println("5. Filtrar jugadores con más de 5 goles");
        System.out.println("6. Actualizar estadísticas de jugadores");
        System.out.println("7. Salir");
        System.out.print("Elige una opcion: ");
    }

    public void executeOption(Match match,GestorJugadores gestor) {
        while (true) {
            System.out.println("\nFOOTBALL SYSTEMA");
            System.out.println("1. Registrar goles");
            System.out.println("2. Mostrar detalles del partido");
            System.out.println("3. Ver el ganador del partido");
            System.out.println("4. Calcular el jugador con más goles");
            System.out.println("5. Filtrar jugadores con más de 5 goles");
            System.out.println("6. Actualizar estadísticas de jugadores");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();
    
            switch (option) {
                case 1:
                    System.out.print("Ingrese goles del equipo 1: ");
                    int goalsTeam1 = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese goles del equipo 2: ");
                    int goalsTeam2 = scanner.nextInt();
                    scanner.nextLine();
                    match.goals_register(goalsTeam1, goalsTeam2);
                    break;
    
                case 2:
                    match.showDetails();
                    break;
    
                case 3:
                    System.out.println("Ganador del partido: " + match.winTeam());
                    break;
    
                case 4:
                Jugador topScorer = gestor.topJugadoresPorTemporada();
                if (topScorer != null) {
                    System.out.println("El jugador con más goles es:");
                    System.out.println(topScorer);
                } else {
                    System.out.println("No hay jugadores registrados.");
                }
                 break;
    
                case 5:
                System.out.println("Jugadores con más de 5 goles:");
                if (gestor.jugadoresConMasDe5Goles().isEmpty()) {
                    System.out.println("No se encontraron jugadores con más de 5 goles.");
                } else {
                    gestor.jugadoresConMasDe5Goles().forEach(System.out::println);
                }
                    break;
    
                case 6:
                System.out.print("Ingrese el ID del jugador a actualizar: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                Jugador jugador = gestor.buscarJugadorPorId(id);
                if (jugador == null) {
                    System.out.println("Jugador no encontrado.");
                } else {
                    System.out.print("Ingrese los goles adicionales anotados: ");
                    int golesAdicionales = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese los partidos jugados adicionales: ");
                    int partidosAdicionales = scanner.nextInt();
                    scanner.nextLine();

                    jugador.setcantidadGolesMarcados(jugador.getcantidadGolesMarcados() + golesAdicionales);
                    jugador.setcantidadPartidosJugadosd(jugador.getcantidadPartidosJugados() + partidosAdicionales);

                    System.out.println("Estadísticas actualizadas para " + jugador.getnombreJugador() + ":");
                    System.out.println("Goles totales: " + jugador.getcantidadGolesMarcados());
                    System.out.println("Partidos jugados totales: " + jugador.getcantidadPartidosJugados());
                }
                    break;
    
                case 7:
                    System.out.println("Has salido del sistema");
                    break;
    
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
    
}
