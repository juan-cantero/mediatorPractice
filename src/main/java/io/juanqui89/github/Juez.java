package io.juanqui89.github;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Juez implements Mediator{

  private List<Jugador> jugadores;
  private int numeroSecreto;
  private Marcador marcador;

  public Juez(Marcador marcador) {
    this.marcador = marcador;
    jugadores = new ArrayList<Jugador>();
    numeroSecreto = generaNumeroSecreto();
  }

  public void add(Jugador jugador) {
    jugadores.add(jugador);

  }

  public void setNumeroSecreto() {
    this.numeroSecreto = generaNumeroSecreto();
  }

  private int generaNumeroSecreto() {
    Random random = new Random();
    return random.nextInt(1000);
  }

  public void nuevoIntento(Jugador jugador, int numero) {

      if (numero == numeroSecreto) {
        marcador.mostrarGanador(jugador);

      }
      else {
        marcador.actualizarMarcador(jugadores);

      }
    }
}
