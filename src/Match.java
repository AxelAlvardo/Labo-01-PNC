import java.util.List;

public class Match {

    private List<String> team_1;
    private List<String> team_2;
    private int goal_team_1;
    private int goal_team_2;
    
    public Match(List<String> team_1, List<String> team_2, int goal_team_1, int goal_team_2) {
        this.team_1 = team_1;
        this.team_2 = team_2;
        this.goal_team_1 = 0;
        this.goal_team_2 = 0;
    }


    public void goals_register(int goals_team_1, int goals_team_2){
        this.goal_team_1 = goals_team_1;
        this.goal_team_2 = goals_team_2;
    
        int totalGoals = goals_team_1 + goals_team_2;

        System.out.println("\n--- Registro de Goles ---");
        System.out.println("Goles del equipo 1: " + goals_team_1);
        System.out.println("Goles del equipo 2: " + goals_team_2);
        System.out.println("Total de goles en el partido: " + totalGoals);
    }

    public String winTeam(){
        if (goal_team_1 > goal_team_2){
            return "Equipo 1 es ganador";
        }else if(goal_team_2 > goal_team_1){
            return "Equipo 1 es ganador";
        }else{
            return "Hubo un empate";
        }
    }

    public void showDetails() {
        System.out.println("\n--- Detalles del Partido ---");
        System.out.println("Equipo 1: " + team_1);
        System.out.println("Goles Equipo 1: " + goal_team_1);
        System.out.println("Equipo 2: " + team_2);
        System.out.println("Goles Equipo 2: " + goal_team_2);
        System.out.println("Resultado: " + winTeam());
    }
}
