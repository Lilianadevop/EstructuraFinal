/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alondriwis
 */
public class Libro {
   private String ISBN,titulo, autor,ed;
   private int precio;
private Metodo m;
    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, String ed, int precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ed = ed;
        this.precio = precio;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }   

    @Override
    public String toString() {
        return   "["+ISBN +"-"+ titulo+"-"  + autor +"-"+ ed +"-"+ precio +"]";
    }
   
}// class
