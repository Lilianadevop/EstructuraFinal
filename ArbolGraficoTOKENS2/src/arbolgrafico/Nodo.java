
package arbolgrafico;

/**
 *
 * @author Digital Monster
 */
public class Nodo {
    
    private String informacion;
    private Nodo padre;
    private Nodo nodoIzquierdo;
    private Nodo nodoDerecho;
    
    public Nodo(){
    this.informacion="";
    this.nodoIzquierdo=null;
    this.nodoDerecho=null;  
    this.padre=null;
    }
    public Nodo(String informacion){
    this.informacion=informacion;
    this.nodoIzquierdo=null;
    this.nodoDerecho=null;
    this.padre=null;    
    }

  public  Nodo(Nodo op1, String pop, Nodo op2) {
      this.nodoDerecho=op1;
      this.informacion=pop;
      this.nodoIzquierdo=op2;
      this.padre=null; 
    }
  
    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public Nodo getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
    
    
}
