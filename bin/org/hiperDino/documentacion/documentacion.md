# Funcionalidad Menu

## Opción 1: Abrir Caja

![Imagen Menu](/src/org/hiperDino/documentacion/imagenes/menuPrincipal.png)

Esta opción ejecuta el método abrirCaja(), ubicado en la clase Gestor, el cual se encarga de abrir la caja para comenzar a atender a los clientes.

## Opción 2: Añadir Nuevo Cliente a la Cola

![Imagen Menu](/src/org/hiperDino/documentacion/imagenes/aniadirClienteCola().png)

Al seleccionar esta opción, se ejecuta el método añadirCliente() de la clase Cajero, el cual añade un cliente aleatorio con una cesta aleatoria a la fila de clientes, siempre y cuando la caja esté abierta. En caso contrario, se mostrará un mensaje indicando que la caja está cerrada.


## Opción 3: Atender Cliente

![Imagen Menu](/src/org/hiperDino/documentacion/imagenes/clienteAtendido.png)

Esta opción ejecuta el método clienteAtendido() de la clase Cajero, el cual atiende al cliente que se encuentra primero en la fila. Este cliente es retirado de la cola y se reduce el contador de clientes.

Opción 4: Mostrar Lista de Clientes en la Cola

Si hay clientes en la fila, se mostrará la lista de clientes en espera de ser atendidos.

![Imagen Menu](/src/org/hiperDino/documentacion/imagenes/colaClinetes.png)

En caso de que todos los clientes hayan sido atendidos, se mostrará un mensaje indicando que no hay clientes en la fila.


![Imagen Menu](/src/org/hiperDino/documentacion/imagenes/clientesAtendidos.png)


## Opción 5: Cerrar Supermercado

![Imagen Menu](/src/org/hiperDino/documentacion/imagenes/supermercadoCerradopng.png)

Esta opción permite cerrar el supermercado. Si no hay clientes en la fila, la caja se cierra sin problemas. Sin embargo, si hay clientes en la fila, se mostrará un mensaje de error indicando que no es posible cerrar el supermercado debido a que aún quedan clientes por atender o porque la caja no ha sido abierta.
![Imagen Menu](/src/org/hiperDino/documentacion/imagenes/clinetesenfilaerror.png)