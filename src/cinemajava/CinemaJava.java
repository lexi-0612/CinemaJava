/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinemajava;

import Cine.Espectador;
import Cine.Matriz;
import Cine.Peliculas;

import java.util.Scanner;

public class CinemaJava {

    public static void main(String[] args) {
        Peliculas peliculas = new Peliculas("lol", 23, 4, "Alejandro");
        System.out.println("Nombre de la pelicula = " + peliculas.getTitulo());
        System.out.println("Duracion de la pelicula = " + peliculas.getDuracion() + " Minutos");
        System.out.println("Edad minima = " + peliculas.getEdadMin());
        System.out.println("Director de la pelicula = " + peliculas.getDirector());

        Scanner scanner = new Scanner(System.in);
        Espectador espectador = new Espectador();

        System.out.println("Ingrese su nombre ");
        espectador.setNombre(scanner.nextLine());

        System.out.println("Ingrese su edad ");
        espectador.setEdad(scanner.nextInt());

        System.out.println("Ingrese la cantidad de dinero");
        espectador.setDinero(scanner.nextInt());



        Matriz matriz = new Matriz();
        boolean detener = true;

        mainloop: while (detener) {
            for (int i = 0; i < matriz.getMatriz().length; i++) {
                for (int j = 0; j < matriz.getMatriz().length; j++) {
                    System.out.print(" Deseas asignar este puesto? " + matriz.getMatriz()[i][j]);
                    System.out.println(" ");
                    System.out.println("""
                            1.SI
                            2.NO
                            3.MOSTRAR MATRIZ""");
                    int opc = scanner.nextInt();
                    switch (opc) {
                        case 1:
                            matriz.getMatriz()[i][j] = "0";
                            break;
                        case 2:
                            detener = false;
                            break;
                        case 3:
                            mostrar(matriz);
                            System.out.println("Informacion del espectador");
                            System.out.println("Nombre del espectador = " + espectador.getNombre());
                            System.out.println("Edad del espectador = " + espectador.getEdad());
                            System.out.println("Dinero del espectador = " + espectador.getDinero());
                            System.out.println("salas Asignadas = " + matriz.getMatriz()[i][j]);
                            detener = false;
                            break mainloop;
                    }
                }

            }


        }
    }

    private static void mostrar(Matriz matriz) {
        for (int i = 0; i < matriz.getMatriz().length; i++) {
            for (int j = 0; j < matriz.getMatriz().length; j++) {
                System.out.print(matriz.getMatriz()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
