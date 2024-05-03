package org.hiperDino.menu;

import java.util.Scanner;

import org.hiperDino.elementos.Cajero;
import org.hiperDino.gestor.Gestor;
import org.hiperDino.utiles.Aleatorio;

public class Menu {
  Scanner scanner = new Scanner(System.in);

  private int opcionUsuario = 0;
  private boolean repetir = true;
  public void mostrarMenu(){
    while (repetir) {
      System.out.println("""
        1. Abrir Caja
        2. Añadir un nuevo Cliente a la cola
        3. Atender un cliente
        4. Ver clientes pendientes
        5. Cerrar Supermercado
        6. Salir
        """);
      opcionUsuario = scanner.nextInt();
      casoUsuario(opcionUsuario);
    }
    if (opcionUsuario == 6){
      repetir = false;
    }
  }

  public void casoUsuario(int opcionUsuario){
    switch (opcionUsuario) {
      case 1:
        Gestor.abrirCaja();
        break;
      case 2:
        Cajero.aniadirCliente(Aleatorio.clienteAletorio());
        break;
      case 3:
        Cajero.clienteAtendido();
        break;
      case 4:
        Gestor.clientesPendientes();
        break;
      case 5:
        if (Gestor.cajaAbierta == false) {
          System.out.println("Cerrando cajas...");
          repetir = false;
          break;
        }
        if (Gestor.cajaAbierta && Cajero.contadorClientes == 0 ) {
          Gestor.cerrarCaja();
          System.out.println("SuperMercado Cerrado");
          repetir = false;
        } else {
          System.out.println("Error! quedan clientes por atender o hay problemas con la caja");
        }
        break;
      case 6:
        repetir = false;
        break;
    }
  }
}
