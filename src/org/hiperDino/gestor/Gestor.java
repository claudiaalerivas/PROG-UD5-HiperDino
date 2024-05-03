package org.hiperDino.gestor;

import org.hiperDino.elementos.Cajero;

public class Gestor {
  public static boolean cajaAbierta = false;

  public static boolean abrirCaja(){
    cajaAbierta = true;
    System.out.println("Caja Abierta ;)");
    return true;
  }
  public static boolean cerrarCaja(){
    cajaAbierta = false;
    System.out.println("Caja Cerrada");
    return false;
  }
  public static void clientesPendientes(){
    if (Cajero.filaClientes.isEmpty()) {
      System.out.println("No hay clientes en la fila");
    } else {
      Cajero.mostrarClientes();

    }
  }
}
