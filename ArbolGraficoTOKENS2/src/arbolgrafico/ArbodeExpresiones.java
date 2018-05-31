
package arbolgrafico;

import java.util.*;
import javax.swing.JPanel;


public class ArbodeExpresiones {
    //Pila de operandos
    Stack < Nodo > pilaOperandos;
    
    
    //Pila de operadores
    Stack < String > pilaOperadores;
 
    final String espacios;           // Cadena de espacios en espacios
    final String operadores;       // Cadena con operadores para expresiones

   
    public ArbodeExpresiones() {
        this.pilaOperandos = new Stack <> ();
        this.pilaOperadores = new Stack <> ();
        
	espacios = " \t";
	operadores = ")=+-*/%^(";  //acomodados por precedencia;
    }

 
    private Nodo raiz;
    
    public Nodo getRaiz() {
        return this.raiz;
    }

    public void setRaiz(Nodo r) {
        this.raiz = r;
    }
    
    public boolean construir (String con){
        construirArbol(con);
        return true;
    }
    
    public Nodo construirArbol(String expresion) {
       	StringTokenizer tokenizer;
	String token;
	//Nodo1 raiz = null
        
                         //String a pasar a token, caracteres validos, convertir los valores validos a tokens?
	tokenizer = new StringTokenizer(expresion, espacios+operadores, true);
        
	while (tokenizer.hasMoreTokens()) {//Mientras haya mas tokens
            
	    token = tokenizer.nextToken();//Recorre el token
            
            //Si es espacio en espacios
	    if (espacios.contains(token)) //Si el token esta contenido en espacios en espacios
		;               // Es un espacio en espacios, se ignora
            
            //Si es operador valido
	    else if (!operadores.contains(token)) {//Si el token esta contenido en los operadores validos
                
                Nodo a;// Es operando y lo guarda como nodo del arbol
		pilaOperandos.push(new Nodo(token));
                
                //Si es parentesis
	    } else if(token.equals(")")) { // Saca elementos hasta encontrar (
		while (!pilaOperadores.empty() && !pilaOperadores.peek().equals("(")) {
		    guardarSubArbol();
		}
		pilaOperadores.pop();  // Saca el parentesis izquierdo
                
                //Si no es ninguno de ellos
	    } else {
		if (!token.equals("(") && !pilaOperadores.empty()) {
		           //operador diferente de cualquier parentesis
		    String op = (String) pilaOperadores.peek();//Se saca el ultimo
                    
                    //Mientras sea diferente de '(', y la pila de operadores no este vacia, y el operador es mayor o igual al token
		    while (!op.equals("(") && !pilaOperadores.empty() && operadores.indexOf(op) >= operadores.indexOf(token)) {
			guardarSubArbol();
			if (!pilaOperadores.empty()) 
			    op = (String)pilaOperadores.peek();
		    }
		}
		pilaOperadores.push(token);  //Guarda el operador
	    }
	}
	//Sacar todo lo que queda
        
	raiz = (Nodo)pilaOperandos.peek();
	while (!pilaOperadores.empty()) {
            
	    if (pilaOperadores.peek().equals("(")) 
		pilaOperadores.pop();
	    else {
	    guardarSubArbol();
	    raiz = (Nodo) pilaOperandos.peek() ;
	    }
	}
	return raiz;
    }
  
    private void guardarSubArbol() {
	Nodo op2 = (Nodo) pilaOperandos.pop();
	Nodo op1 = (Nodo)pilaOperandos.pop();
	pilaOperandos.push(new Nodo(op2, pilaOperadores.pop(), op1));

    }

  
    public void imprime(Nodo n) {//inOrden
	if (n != null) { 
	    imprime(n.getNodoDerecho());
            System.out.print(n.getInformacion()+" ");
             imprime(n.getNodoIzquierdo());
	}
    }


    public void imprimePos(Nodo n) {//posOrden
	if (n != null) {
	    imprimePos(n.getNodoIzquierdo());
	    imprimePos(n.getNodoDerecho());
	    System.out.print(n.getInformacion()+" ");
	}
    }

 
    public void imprimePre(Nodo n) {//preOrden
	if (n != null) {
	    System.out.print(n.getInformacion()+" ");
              imprimePre(n.getNodoDerecho());
               imprimePre(n.getNodoIzquierdo());
	}
    }
    
 public JPanel getdibujo() {
       return new ArbolExpresionGrafico(this);      
    }
 
    public static void main (String[] pps) {
        ArbodeExpresiones expr= new  ArbodeExpresiones();
        
        String expresion=javax.swing.JOptionPane.showInputDialog("Ingrese la expresion");
        
        Nodo raiz = expr.construirArbol(expresion);
        System.out.print("El arbol es ");
        expr.imprime(raiz);
        expr.imprimePre(raiz);
	  
    }
}

