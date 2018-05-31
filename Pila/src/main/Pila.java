package main;


public class Pila {
    private int tam, tope;
    private Object[] Pila;
    
    public Pila(int tam) {
        this.tam = tam;
        tope = 0;
        Pila = new Object[tam];
    }
    
    public boolean estaLlena() {
        return tope == Pila.length;
    }
    
    public boolean estaVacia() {
        return tope == 0;
    }
    
    public void meter(Object obj) {
        if (!estaLlena()) {
            Pila[tope++] = obj;
        } else throw new IllegalStateException("Pila llena");
    }
    
    public void sacar() {
        if (!estaVacia()) {
          tope--;  
        } else throw new IllegalStateException("pila vacia");
        
    }
    
    public Object[] obtenerArreglo() {
        return Pila;
    }
    
    public Object[] getPila() {
        Object[] temp = new Object[tope];
        for (int i = 0; i < tope; i++) temp[i] = Pila[i];
        return temp;
    }
    
    public int getTope() {
        return tope;
    }
}
