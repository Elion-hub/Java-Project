🖥️ Venta de Ordenadores

Este proyecto es una aplicación en Java que simula la creación y gestión de ordenadores dentro de una orden de compra. El código aplica Programación Orientada a Objetos (POO) con conceptos como herencia, encapsulamiento y composición de objetos.

📂 Estructura del proyecto

El proyecto está dividido en tres paquetes principales:

mundopc.modelo → Contiene las clases que representan los distintos dispositivos:

DispositivoEntrada (clase base)

Raton (hereda de DispositivoEntrada)

Teclado (hereda de DispositivoEntrada)

Monitor

Ordenador (compuesto por monitor, teclado y ratón)

mundopc.servicio → Contiene la lógica para gestionar órdenes:

Orden (permite agregar varios ordenadores y mostrarlos en consola)

mundopc → Contiene la clase principal:

VentaOrdenadoresApp (punto de entrada del programa)

⚙️ Funcionamiento

Se crean instancias de dispositivos de entrada (Raton, Teclado) y monitores.

Se ensamblan estos dispositivos en objetos de tipo Ordenador.

Los ordenadores se agregan a una Orden.

Se muestra en consola el detalle de la orden:

Número de orden.

Cantidad de ordenadores.

Información detallada de cada ordenador y sus componentes.

🛠️ Ejemplo de ejecución
Orden #: 1
Total Ordenadores: 2
Ordenador{
 idOrdenador=1,  nombre='ordenadorlenovo',
   monitor=Monitor{idMonitor=1, marca='samsung', tamanio=49.0},
   teclado=Teclado{idTeclado=1}DispositivoEntrada{tipoDeEntrada='usb', marca='lenovo'},
   raton=Raton{idRaton=1}DispositivoEntrada{tipoDeEntrada='usb', marca='lenovo'}
}
Ordenador{
 idOrdenador=2,  nombre='OrdenadorDell',
   monitor=Monitor{idMonitor=2, marca='Dell', tamanio=28.0},
   teclado=Teclado{idTeclado=2}DispositivoEntrada{tipoDeEntrada='usb', marca='Dell'},
   raton=Raton{idRaton=2}DispositivoEntrada{tipoDeEntrada='Usb', marca='Dell'}
}

🚀 Conceptos aplicados

Encapsulamiento → Uso de atributos privados con getters y setters.

Herencia → Raton y Teclado heredan de DispositivoEntrada.

Composición → Ordenador está formado por Monitor, Teclado y Raton.

Polimorfismo → Uso de toString() sobrescrito para mostrar información personalizada.

Colecciones en Java → Uso de ArrayList en la clase Orden para almacenar múltiples ordenadores.

Contadores estáticos → Generación automática de IDs únicos para cada objeto.

▶️ Ejecución del programa

Compila las clases:

javac mundopc/**/*.java


Ejecuta el programa:

java mundopc.VentaOrdenadoresApp

📌 Objetivo educativo

Este proyecto es un ejemplo práctico de cómo estructurar un sistema en Java usando POO, útil para entender:

Cómo dividir un proyecto en paquetes y clases.

Cómo aplicar relaciones entre clases (herencia, composición).

Cómo trabajar con colecciones y métodos sobrescritos en Java.