
package arbolgrafico;

/**
 *
 * @author Digital Monster
 */
public class Nodo1 {
    
    private String informacion;
    private Nodo1 padre;
    private Nodo1 nodoIzquierdo;
    private Nodo1 nodoDerecho;
    
    public Nodo1(){
    this.informacion="";
    this.nodoIzquierdo=null;
    this.nodoDerecho=null;  
    this.padre=null;
    }
    public Nodo1(String informacion){
    this.informacion=informacion;
    this.nodoIzquierdo=null;
    this.nodoDerecho=null;
    this.padre=null;    
    }

  public  Nodo1(Nodo1 op1, String pop, Nodo1 op2) {
      this.nodoDerecho=op1;
      this.informacion=pop;
      this.nodoIzquierdo=op2;
      this.padre=null; 
    }
  
    public Nodo1 getPadre() {
        return padre;
    }

    public void setPadre(Nodo1 padre) {
        this.padre = padre;
    }
    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public Nodo1 getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo1 nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Nodo1 getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo1 nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
    
    
}
