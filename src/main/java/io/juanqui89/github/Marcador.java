package io.juanqui89.github;

import java.util.List;

public class Marcador extends College {

    public void actualizarMarcador(List<Jugador> jugadores) {
      jugadores.forEach(jugador ->
              System.out.println("Intentos fallidos de " + jugador.getNombre()
                      + " " + jugador.getIntentos()));
    }

    public void mostrarGanador(Jugador jugador) {
      System.out.println("El jugador" + jugador.getNombre() + " ha ganado la partida");
    }

}
