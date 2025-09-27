# 🎓 Sistema de Gestión de Estudiantes (Java + MySQL)

Este proyecto es una aplicación **CRUD** en Java para la gestión de estudiantes, conectada a una base de datos MySQL mediante **JDBC**.
El objetivo es demostrar la implementación de las operaciones básicas (crear, leer, actualizar y eliminar) siguiendo buenas prácticas de **Programación Orientada a Objetos** y aplicando el patrón **DAO (Data Access Object)**.

---
## Contacto
- LinkedIn: [www.linkedin.com/in/josem-garcia-](https://www.linkedin.com/in/josem-garcia-)

---

## 🚀 Características principales

* 📋 **Listar** estudiantes.
* 🔎 **Buscar** estudiante por ID.
* ➕ **Agregar** un nuevo estudiante.
* ✏️ **Modificar** los datos de un estudiante existente.
* ❌ **Eliminar** un estudiante de la base de datos.
* 🛠️ Arquitectura en capas:

  * `presentacion` → Lógica de la aplicación y menú de interacción con el usuario.
  * `dominio` → Clase `Estudiante` como entidad del sistema.
  * `datos` → Clase `EstudianteDAO` para la comunicación con la base de datos.
  * `conexion` → Clase `Conexion` para la gestión de la conexión con MySQL.

---

## 🗂️ Tecnologías utilizadas

* ☕ **Java 21**
* 🗄️ **MySQL 8**
* 🔌 **JDBC (Java Database Connectivity)**
* 🧱 Patrón **DAO**

---

## 📂 Estructura del proyecto

```
src/
 └── com/elionc/
     ├── presentacion/
     │   └── SistemaDeEstudiantesApp.java
     ├── dominio/
     │   └── Estudiante.java
     ├── datos/
     │   └── EstudianteDAO.java
     └── conexion/
         └── Conexion.java
```

---

## ⚙️ Requisitos previos

1. Tener instalado **Java JDK 21** o superior.
2. Instalar y configurar **MySQL**.
3. Crear la base de datos y la tabla con la siguiente estructura:

```sql
CREATE DATABASE estudiantes_db;

USE estudiantes_db;

CREATE TABLE estudiante (
    id_estudiante INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    telefono VARCHAR(20),
    email VARCHAR(100)
);
```

4. Configurar el archivo de conexión (`Conexion.java`) con tus credenciales de MySQL:

```java
var usuario = "root";
var password = "12345";
```

---

## ▶️ Ejecución

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tu-usuario/sistema-estudiantes-java.git
   ```
2. Compila el proyecto en tu IDE o desde la terminal:

   ```bash
   javac -d bin src/com/elionc/**/*.java
   ```
3. Ejecuta la aplicación:

   ```bash
   java -cp bin com.elionc.presentacion.SistemaDeEstudiantesApp
   ```

El sistema mostrará un menú interactivo en consola para gestionar los estudiantes.

---

## 📸 Vista previa (menú en consola)

```
*** Sistema de Estudiantes ***
1. Lista Estudiantes
2. Buscar Estudiantes
3. Agregar Estudiantes
4. Modificar Estudiantes
5. Eliminar Estudiantes
6. Salir
Elige una opcion:
```

---

## 🎯 Valor para el mercado laboral

Este proyecto refleja:

* Experiencia práctica con **CRUDs y JDBC**.
* Manejo de **Java OOP** y patrones de diseño como **DAO**.
* Conexión y manipulación de datos en **MySQL**.
* Buenas prácticas de organización en capas y manejo de excepciones.

Es una base sólida que puede escalarse fácilmente hacia frameworks más avanzados como **Spring Boot**.

---

## 📌 Próximos pasos

* Migración a **Spring Boot** con JPA/Hibernate.
* Implementar validaciones más robustas.
* Agregar pruebas unitarias con **JUnit**.
* Crear una interfaz gráfica o API REST para el sistema.

---

✍️ Desarrollado por **Elion C.**
