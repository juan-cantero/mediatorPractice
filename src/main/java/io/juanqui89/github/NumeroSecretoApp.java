package io.juanqui89.github;

public class NumeroSecretoApp {
  public static void main(String[] args) {
    Jugador jugador1 = new Jugador("jose");
    Jugador jugador2 = new Jugador("juan");
    Marcador marcador = new Marcador();
    Juez juez = new Juez(marcador);
    juez.add(jugador1);
    juez.add(jugador2);
    jugador1.setJuez(juez);
    jugador2.setJuez(juez);

    jugador1.jugar(200);
    jugador2.jugar(399);
  }
}
