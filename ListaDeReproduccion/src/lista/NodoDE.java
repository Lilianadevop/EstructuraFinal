/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author SB-C3
 */
public class NodoDE {
    private Cancion cancion;
    private NodoDE ant, sig;

    public NodoDE() {
    }

    public NodoDE(Cancion dato) {
        this.cancion = dato;
        ant=sig=null;
    }
    
    //Setters

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public void setAnt(NodoDE ant) {
        this.ant = ant;
    }

    public void setSig(NodoDE sig) {
        this.sig = sig;
    }
    
    //Getters

    public Cancion getCancion() {
        return cancion;
    }

    public NodoDE getAnt() {
        return ant;
    }

    public NodoDE getSig() {
        return sig;
    }
    
    
    
    
}
