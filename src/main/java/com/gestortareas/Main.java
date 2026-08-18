package com.gestortareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Tarea> listaDeTareas = new ArrayList<>();

        boolean opcionSalir = true;

        while (opcionSalir){
            System.out.println("GESTOR DE TAREAS\n" +
                    "1. Agregar tarea\n" +
                    "2. Ver tareas\n" +
                    "3. Marcar tarea como completada\n" +
                    "4. Eliminiar tarea\n" +
                    "5. Salir\n" +
                    "Elige una opcion:");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Cual es el titulo?");
                    String titulo = sc.nextLine();
                    Tarea tarea = new Tarea(titulo);
                    listaDeTareas.add(tarea);
                    break;
                case 2:
                    for(Tarea t:listaDeTareas){
                        System.out.println("- "+ t.getTitulo());
                    }
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo");
                    opcionSalir = false;
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        }
    }
}