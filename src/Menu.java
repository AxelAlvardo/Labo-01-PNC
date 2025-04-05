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

    public void executeOption(Match match) {
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
                    System.out.println("En proceso...");
                    break;
    
                case 5:
                    System.out.println("En proceso...");
                    break;
    
                case 6:
                    System.out.println("En proceso...");
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
