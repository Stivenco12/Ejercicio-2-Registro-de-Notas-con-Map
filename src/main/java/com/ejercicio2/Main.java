package com.ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String menu = "1";
            do{
                Map<String, Double> estudiantes = new HashMap<>();
                System.out.println("Ingrese la cantidad de estudiantes que desea registrar");
                int cantidad = sc.nextInt();
                sc.nextLine();
                for(int i = 1; i <= cantidad; i++){
                    System.out.println("ingresa el nombre del estudiante "+i);
                    String nombre = sc.nextLine();
                    System.out.println("ingresa la nota del estudiante "+i);
                    Double nota = sc.nextDouble();
                    sc.nextLine();
                    estudiantes.put(nombre, nota);
                }
                System.out.println("Contenido del mapa:");
                for (Map.Entry<String, Double> entry : estudiantes.entrySet()) {
                    System.out.println("la nota de "+entry.getKey() + " es = " + entry.getValue());
                }
                
            }while(!menu.equals("2"));
        }catch (Exception e) {
            System.out.println("error por favor vuelve a ejecutrar el programa");
        }
    }
}