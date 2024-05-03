package org.hiperDino.utiles;

import java.util.Random;
import java.util.Stack;
import org.hiperDino.elementos.Cesta;
import org.hiperDino.elementos.Producto;

public class Aleatorio {
    private static String[] listaProductos = {"leche", "papas", "arroz", "pollo", "pan", "cereales", "chocokrispis","chocoflakes","Cereales Rellenos de avellana *.* ","frootloops :O","CHOCAPIC 10/10", "leche sin lactosa"};
  private static String[] listaClientes = {"Fernado", "Sita", "Dario", "Kenia", "Clara", "Hector","Adan","Adrian","Claudia","Kevin", "Ramiro", "Lara", "Maria", "Omar", "Zeben", "Saul", "Paula", "Irene", "Irina", "Lidia", "Alejandro", "Andres"};
  
  public static Producto productoAleatorio(){
    Random random = new Random();
    int indiceRandom = random.nextInt(listaProductos.length);
    return new Producto(listaProductos[indiceRandom]);
  }

  public static String clienteAletorio(){
    Random random = new Random();
    int indiceRandom = random.nextInt(listaClientes.length);
    String nombreAleatorio = listaClientes[indiceRandom];
    return nombreAleatorio;
  }
  public static Cesta cestaAleatoria(){
    Random random = new Random();
    Stack<Producto> pilaProductos = new Stack<>();
    int indiceRandom = random.nextInt(listaClientes.length);
    for (int i = 0; i < indiceRandom; i++) {
      pilaProductos.add(productoAleatorio());
    }
    return new Cesta(pilaProductos);
  }
}
