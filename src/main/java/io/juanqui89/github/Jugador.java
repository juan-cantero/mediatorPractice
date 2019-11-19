package io.juanqui89.github;

public class Jugador extends College {
  private String nombre;
  private int intentos;

  public Jugador(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public int getIntentos() {
    return intentos;
  }



  public void jugar(int numero) {
    if ( juez != null) {
      intentos++;
      juez.nuevoIntento(this,numero);
    }
  }
}
