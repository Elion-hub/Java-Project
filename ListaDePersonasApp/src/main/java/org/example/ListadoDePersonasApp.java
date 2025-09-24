package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoDePersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Persona> personas =  new ArrayList<>();
        var salir=false;
        while (!salir){
            mostrarmenu();
            try {
                ejecutarOperacion(consola, personas);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());;
            }
            System.out.println();
        }
    }

    private static void mostrarmenu(){
        System.out.print("""
                **** Listado de Personas App
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Selecciona una opcion");
    }
    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1 ->{
                System.out.print("Agrega el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Agrega el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Agrega el Email: ");
                var email = consola.nextLine();
                var persona = new Persona(nombre,tel,email);
                personas.add(persona);
                System.out.print("La lista tiene: "+ personas.size() + " elementos.");
            }
            case 2 ->{
                System.out.println("Lista de Personas: ");
                //personas.forEach((persona -> System.out.println(persona)));
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }
        return salir;

    }
}