
public class Match {

    private Team team_1;
    private Team team_2;
    private int goal_team_1;
    private int goal_team_2;
    
    public Match(Team team_1, Team team_2, int goal_team_1, int goal_team_2) {
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
        System.out.println("Goles del equipo "  +  team_1.getName() + " :" + goals_team_1);
        System.out.println("Goles del equipo "  + team_2.getName() + " :" + goals_team_2);
        System.out.println("Total de goles en el partido: " + totalGoals);
        System.out.println("\n-------------------------");
    }

    public String winTeam(){
        System.out.println("\n-------------------------");
        if (goal_team_1 > goal_team_2){
            return "Equipo " + team_1.getName() + " :" + "es el ganador";
        }else if(goal_team_2 > goal_team_1){
            return "Equipo " + team_2.getName() + " :" + "es el ganador";
        }else{
            return "Hubo un empate";
        }
    }

    public void showDetails() {
        System.out.println("\n--- Detalles del Partido ---");
        System.out.println("Equipo" + team_1.getName());
        System.out.println("Goles Equipo" + team_1.getName() + " :" + goal_team_1);
        System.out.println("Equipo" + team_2.getName());
        System.out.println("Goles Equipo"  + team_2.getName() + " :" + goal_team_2);
        System.out.println("Resultado: " + winTeam());
        System.out.println("\n-------------------------");
    }
}
