/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21_libreria;

import java.util.Scanner;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin21_libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
        int op = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1://añadir libro

                    break;
                case 2:// vender

                    break;
                case 3://mostrar catalogo

                    break;
                case 4:
                    op = menuDisponibilidad();
                    submenu(op);
                    break;
                default:
                    System.out.println("La opcion no está disponible");
                    break;
            }

        } while (opcion != 0);
    }

    private static int menu() {
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("****** GESTOR DE  LA LIBRERIA ******"
                    + "\n1=> Añadir un nuevo libro."
                    + "\n2=> Vender un libro."
                    + "\n3=> Mostrar catalogo de libros"
                    + "\n4=> Consultar diponibilidad de un libro."
                    + "\n0=>SALIR.");
            try {
                op = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Debes escoger un valor entre 0 y 4.");
                op = -1;
            }

        } while (op < 0 || op > 4);
        return op;
    }

    private static int menuDisponibilidad() {
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("****** DISPONIBILIDAD LIBRO******"
                    + "\n1=> Consultar por ISBN."
                    + "\n2=> Consultar por titulo."
                    + "\n0=>SALIR.");
            try {
                op = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Debes escoger un valor entre 0 y 2.");
                op = -1;
            }

        } while (op < 0 || op > 2);
        return op;
    }

    private static void submenu(int op) {
        do {
            switch (op) {
                case 1://isbn
                    break;
                case 2://titulo
                    break;
                default:
                    System.out.println("Esta opción no está disponible");
                    break;
            }
        } while (op != 0);
    }
}
