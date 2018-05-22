/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.io.File;

/**
 *
 * @author Administrator
 */
public class Cancion {
    private String nombre;
    private File archivo;

    public Cancion() {
    }

    public Cancion(String nombre, File archivo) {
        this.nombre = nombre;
        this.archivo = archivo;
    }
    
    public Cancion(File archivo) {
        this.nombre = archivo.getName();
        this.archivo = archivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
