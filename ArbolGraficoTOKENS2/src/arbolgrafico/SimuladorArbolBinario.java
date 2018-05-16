
package arbolgrafico;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Digital Monster
 */
public class SimuladorArbolBinario {
     ArbodeExpresiones miArbol = new ArbodeExpresiones();

    public SimuladorArbolBinario() {
    }

    public boolean insertar(String dato) {
      return (this.miArbol.contruir(dato));
    }

    public String borrar(Integer dato) {
            return ("No existe el dato en el arbol");
    }


    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }

}
