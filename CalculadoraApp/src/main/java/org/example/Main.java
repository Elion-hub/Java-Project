package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            mostraMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);

                } else if (operacion == 5) {
                    System.out.println("Hasta pronto");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    private static void mostraMenu() {
        System.out.println("**** Aplicacion Calculadora ****");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir""");
        System.out.println("¿Que operacion quieres realizar?");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.println("Introduce el valor del primer operando:");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Introduce el valor del segundo operando:");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la Suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado de la Resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado de la division: " + resultado);

            }
            default -> {
                System.out.println("Opcion erronea: " + operacion);
            }
        }
    }
}

