import java.util.*;
import java.util.stream.Collectors;

public class Jugador {


//Atributos
    private int id;
    private String nombre;
    private int golesMarcados;
    private int partidosJugados;


//Constructor
public Jugador(int id, String nombre, int golesMarcados, int partidosJugados){
    this.id = id;
    this.nombre = nombre;
    this.golesMarcados = golesMarcados;
    this.partidosJugados = partidosJugados;
    
}

//getters
public int getId(){
    return id;
}

public String getNombre(){
    return nombre;
}

public int golesMarcados(){
    return golesMarcados;
}

public int partidosJugados(){
    return partidosJugados;
}

//setters
public void setId(int id){
    this.id = id;
}

public void Nombre(String nombre){
    this.nombre = nombre;
}

public void golesMarcados(int golesMarcados){
    this.golesMarcados= golesMarcados;
}

public void partidosJugadosd(int partidosJugados){
    this.partidosJugados = partidosJugados;
}

//Imprimir info jugador (to string)


@Override
public String toString() {
    return "INFORMACION DEL JUGADOR '" +'\'' +
      "Nombre :'" + nombre + '\'' +
      "goles Marcados: '" + golesMarcados + '\'' + 
      "Numero de Partidos Jugados: '" + partidosJugados + '\'';
}

private ArrayList<Jugador> jugador;

public void nuevoJugador(int id,String nombre, int golesMarcados, int partidosJugados){
jugador.add(new Jugador(id, nombre, golesMarcados, partidosJugados));
}

//

}

