📋 Listado de Personas App

Aplicación de consola en Java que permite gestionar un listado de personas de manera sencilla.
El programa funciona con un menú interactivo que ofrece tres opciones principales: agregar, listar y salir.

🚀 Funcionalidades

Agregar persona
Permite ingresar los datos de una persona (nombre, teléfono y correo electrónico) y los guarda en una lista.

Listar personas
Muestra todas las personas registradas con sus datos en consola.

Salir
Finaliza la ejecución del programa.

📂 Estructura del proyecto

ListadoDePersonasApp.java → Clase principal que contiene el menú y la lógica de la aplicación.

Persona.java → Clase que representa a una persona con atributos nombre, teléfono y email.

🖥️ Ejemplo de uso
**** Listado de Personas App
1. Agregar
2. Listar
3. Salir
Selecciona una opcion: 1
Agrega el nombre: Ana
Agrega el telefono: 654321987
Agrega el Email: ana@mail.com
La lista tiene: 1 elementos.

**** Listado de Personas App
1. Agregar
2. Listar
3. Salir
Selecciona una opcion: 2
Lista de Personas: 
Persona{nombre='Ana', telefono='654321987', email='ana@mail.com'}

⚙️ Requisitos

Java 17 o superior

Consola o terminal para ejecutar el programa

▶️ Ejecución

Compilar los archivos Java:

javac org/example/*.java


Ejecutar la aplicación:

java org.example.ListadoDePersonasApp

📌 Notas

Este proyecto es no visual (interacción únicamente por consola).

El manejo de errores se realiza con un bloque try-catch para evitar fallos en la ejecución si el usuario introduce datos inválidos.