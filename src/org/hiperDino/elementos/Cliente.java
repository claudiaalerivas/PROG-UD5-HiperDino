package org.hiperDino.elementos;

import org.hiperDino.utiles.Aleatorio;

public class Cliente {
  private String nombre; 
  private Cesta cesta;
  private int contadorArticulos = 0;

  public Cliente() {
    this.nombre = Aleatorio.clienteAletorio();
    this.cesta = Aleatorio.cestaAleatoria();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void contadorProductos(){
    if (!cesta.equals(null)) {
      contadorArticulos++;
    }
  }
  public void eliminarUltimoProductoCesta(Producto producto){
    Cesta.eliminarProducto();
  }
  
  @Override
  public String toString() {
    return "* Nombre:" + nombre +"\n"+ 
    "* Total de Productos: " + contadorArticulos + "\n" +
    "* Lista articulos en la cesta :" + "\n" + cesta ;
  }
}

