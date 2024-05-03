package org.hiperDino.elementos;

import java.util.LinkedList;
import java.util.Queue;

import org.hiperDino.gestor.Gestor;

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

  public static void aniadirCliente(String cliente){
    if (Gestor.cajaAbierta) {
      filaClientes.add(cliente);
      contadorClientes++;
      System.out.println("Cliente "+ cliente + " añadido a la cola");
    } else {
      System.out.println("Caja Cerrada ;( ");
    }
  }
  
  public static void clienteAtendido(){
    System.out.println("Cliente Atendido: " + filaClientes.poll());
    contadorClientes--;
  }

  public static void mostrarClientes(){
    System.out.println("Caja numero: " + id);
    System.out.println(filaClientes);
  }

  @Override
  public String toString() {
    return "* Numero de caja: "+ id +"\n"+
    "* Total Clientes: "+ contadorClientes +"\n"+
    "* Clientes en la fila: "+ "\n" + filaClientes;
  }

}
