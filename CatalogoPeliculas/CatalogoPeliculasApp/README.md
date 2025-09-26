🎬 Catálogo de Películas (Java)

Este proyecto es una aplicación de consola en Java que permite gestionar un catálogo de películas.
El usuario puede agregar, listar y buscar películas, con la opción de persistir la información en un archivo (peliculas.txt) o manejarla en memoria mediante listas.


📂 Estructura del Proyecto
presentacion
CatalogoPeliculasApp.java: Clase principal con el menú interactivo y la lógica de control.
servicio
IServicioPeliculas.java: Interfaz que define las operaciones principales del catálogo.
ServicioPeliculasArchivo.java: Implementación de la interfaz con persistencia en archivo.
ServicioPeliculasLista.java: Implementación de la interfaz usando listas en memoria.
dominio
Pelicula.java: Clase que representa una película con sus métodos equals, hashCode y toString.


⚙️ Funcionalidades
Agregar Película: Permite introducir el nombre de una nueva película y guardarla en el archivo o lista.
Listar Películas: Muestra en consola todas las películas almacenadas.
Buscar Película: Busca una película por su nombre y muestra la posición o si no se encuentra.
Persistencia:
Con ServicioPeliculasArchivo se guarda la información en el archivo peliculas.txt.
Con ServicioPeliculasLista se maneja todo en memoria (útil para pruebas).


🛠️ Tecnologías Utilizadas
Lenguaje: Java 17+
Paradigma: Programación Orientada a Objetos (POO)
Gestión de archivos: File, PrintWriter, BufferedReader

Proyecto desarrollado como práctica de programación orientada a objetos en Java.