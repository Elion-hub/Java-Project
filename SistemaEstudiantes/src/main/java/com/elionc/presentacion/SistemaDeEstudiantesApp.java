package com.elionc.presentacion;


import com.elionc.datos.EstudianteDAO;
import com.elionc.dominio.Estudiante;

import java.util.Scanner;

public class SistemaDeEstudiantesApp {
    public static void main(String[] args) {

        var salir=false;
        Scanner consola = new Scanner(System.in);
        var estudianteDao= new EstudianteDAO();
        while(!salir){
            try {
                mostrarMenu();
                salir = ejecutarOpciones(consola,estudianteDao);
            } catch (Exception e) {
                System.out.println("Ocurrio un error al ejecutar la operacion: " + e.getMessage());
            }
            System.out.println();
        }
    }
    private static void mostrarMenu(){
        System.out.println("""
                *** Sistema de Estudiantes ***
                1. Lista Estudiantes
                2. Buscar Estudiantes
                3. Agregar Estudiantes
                4. Modificar Estudiantes
                5. Eliminar Estudiantes
                6. salir
                Elige una opcion""");

    }
    private static boolean ejecutarOpciones(Scanner consola,EstudianteDAO estudianteDAO){

        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1 -> {
                System.out.println("Listado de estudiantes..");
                var estudiantes = estudianteDAO.listarEstudiantes();
                estudiantes.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("Introduce el id_estudiante a buscar: ");
                var idEstudiante =Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantesPorId(estudiante);
                if (encontrado) System.out.println("Estudiante encontrado: " + estudiante);
                else System.out.println("Estudiante no encontrado");
            }

            case 3 -> {
                System.out.println("Agregar Estudiante: ");
                System.out.print("Nombre: ");
                var nombre=consola.nextLine();
                System.out.print("Apellido: ");
                var apellido=consola.nextLine();
                System.out.print("Telefono: ");
                var telefono=consola.nextLine();
                System.out.print("Email: ");
                var email=consola.nextLine();
                 var estudiante = new Estudiante(nombre, apellido, telefono, email);
                 var agregado = estudianteDAO.agregarEstudiante(estudiante);
                 if (agregado) System.out.println("Estudiante agregado: " +  estudiante);
                 else System.out.println("Estudiante NO agregado: " +  estudiante);
            }

            case 4 ->{
                System.out.println("Modificar Estudiante: ");
                System.out.println("id Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.print("Nombre: ");
                var nombre=consola.nextLine();
                System.out.print("Apellido: ");
                var apellido=consola.nextLine();
                System.out.print("Telefono: ");
                var telefono=consola.nextLine();
                System.out.print("Email: ");
                var email=consola.nextLine();
                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);

                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if (modificado) System.out.println("Estudiante modificado: " + estudiante);
                else System.out.println("Estudiante no modificado: " +  estudiante);

            }

            case 5 ->{
                System.out.println("Eliminar Estudiante: ");
                System.out.println("Id Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                if (eliminado) System.out.println("Estudiante eliminado: " + estudiante);
                else System.out.println("Estudiante NO eliminado: " + estudiante);
            }
            case 6 ->{
                System.out.println("Hasta pronto!");
                salir= true;

            }
            default -> System.out.println("Opcion no reconocida");
        }
        return salir;
    }
}