package org.hiperDino.elementos;

import java.util.Stack;

public class Cesta {
  private static Stack<Producto> pilaProductos = new Stack<>();

  public Cesta(Stack<Producto> pilaProductos) {
    this.pilaProductos = pilaProductos;
  }

}
