import java.util.*;
import java.util.stream.Collectors;

public class Jugador {


//Atributos
    private int id;
    private String nombreJugador;
    private int cantidadGolesMarcados;
    private int cantidadPartidosJugados;


//Constructor
public Jugador(int id, String nombreJugador, int cantidadGolesMarcados, int cantidadPartidosJugados){
    this.id = id;
    this.nombreJugador = nombreJugador;
    this.cantidadGolesMarcados = cantidadGolesMarcados;
    this.cantidadPartidosJugados = cantidadPartidosJugados;
    
}

//getters
public int getId(){
    return id;
}

public String getnombreJugador(){
    return nombreJugador;
}

public int getcantidadGolesMarcados(){
    return cantidadGolesMarcados;
}

public int getcantidadPartidosJugados(){
    return cantidadPartidosJugados;
}

//setters
public void setId(int id){
    this.id = id;
}

public void setnombreJugador(String nombreJugador){
    this.nombreJugador = nombreJugador;
}

public void setcantidadGolesMarcados(int cantidadGolesMarcados){
    this.cantidadGolesMarcados= cantidadGolesMarcados;
}

public void setcantidadPartidosJugadosd(int cantidadPartidosJugados){
    this.cantidadPartidosJugados = cantidadPartidosJugados;
}



@Override
public String toString() {
    return "INFORMACION DEL JUGADOR '" +'\'' +
      "nombreJugador :'" + nombreJugador + '\'' +
      "goles Marcados: '" + cantidadGolesMarcados + '\'' + 
      "Numero de Partidos Jugados: '" + cantidadPartidosJugados + '\'';
}


}
