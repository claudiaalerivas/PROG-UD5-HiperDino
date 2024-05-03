package org.hiperDino.elementos;

import java.util.Stack;

import org.hiperDino.utiles.Aleatorio;

public class Cesta {
  private static Stack<Producto> pilaProductos = new Stack<>();

  public Cesta(Stack<Producto> pilaProductos) {
    this.pilaProductos = pilaProductos;
  }

  public static void aniadirProducto(){
    pilaProductos.add(Aleatorio.productoAleatorio());
    System.out.println("Producto: "+ pilaProductos + " añadido");
  }
  public static void eliminarProducto(){
    pilaProductos.pop();
  }

  @Override
  public String toString() {
    String producto = "";
    for (Producto productos : this.pilaProductos) {
      producto += productos;
      producto += " \n ";
      
    }
    return producto;
  }

}

