package org.hiperDino.elementos;

import java.util.LinkedList;
import java.util.Queue;


public class Cajero {
  private static int id = 1;
  public static Queue<String> filaClientes = new LinkedList<>();
  public static int contadorClientes = 0;
  
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Cajero(int id) {
    this.id = id;
  }


  public static void clienteAtendido(){
    System.out.println("Cliente Atendido: " + filaClientes.poll());
    contadorClientes--;
  }

  public static void mostrarClientes(){
    System.out.println("Caja numero: " + id);
    System.out.println(filaClientes);
  }


}