/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ifcd033po.crea;

/**
 *
 * @author Ángel Redondo
 */
public class Crea {

    public static void main(String[] args) {
        
        Libro primerLibro = new Libro("20 de Enero de 2003", "200-321-123");
        System.out.println( "Informacion del Primer Libro");
        System.out.println( primerLibro.getInfoLibro() );
        
        Libro segundoLibro = new Libro("20 de Abril de 1990", "100-123-123");
        System.out.println( "Informacion del Segundo Libro");
        System.out.println( segundoLibro.getInfoLibro() );
    }
}
