package org.hiperDino.elementos;

public class Cliente {
  private String nombre; 
  private Cesta cesta;
  private int contadorArticulos = 0;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
}
