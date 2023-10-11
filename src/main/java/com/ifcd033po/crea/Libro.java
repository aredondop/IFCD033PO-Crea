/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifcd033po.crea;

/**
 *
 * @author Ángel Redondo
 */
public class Libro {
    private String fechaPublicacion, isbn;
    
    public Libro(){    
    }
    
    public Libro ( String isbn){
        this.isbn = isbn;
    }
    
    public Libro ( String fechaPublicacion, String isbn){
        this.fechaPublicacion = fechaPublicacion;
        this.isbn = isbn;
    }
    
    public String getFechaPublicacion(){
        return this.fechaPublicacion;
    }
    
    public String getIsbn(){
        return this.isbn;
    }
    
    public void setIsbn( String isbn){
        this.isbn = isbn;
    }
    
    public void setFechaPublicacion( String fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public String getInfoLibro(){
        return "Fecha de Publicacion: "+this.fechaPublicacion + ". Isbn: "+this.isbn;
    }
}
