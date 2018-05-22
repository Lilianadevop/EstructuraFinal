/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import excepciones.EstaVaciaException;

/**
 *
 * @author SB-C3
 */
public class ListaDE {
    private NodoDE inicio,fin;

    public ListaDE() {
        inicio=fin=null;
    }
    
    public void insertar(Cancion d){
        if(estaVacia())
            inicio=fin=new NodoDE(d);
        else{
            fin.setSig(new NodoDE(d));
            fin.getSig().setAnt(fin);
            fin=fin.getSig();
        }
    }
    
    public boolean estaVacia(){
        return inicio==null;
    }
    
    public NodoDE existe(Cancion d){
        for(NodoDE i=inicio; i!=null;i=i.getSig())
            if(i.getCancion()==d)
                return i;
        
        
        return null;
    }
    
    public void eliminar(Cancion d){
        if(!estaVacia()){
            NodoDE temp = existe(d);
            if(temp == null)
                javax.swing.JOptionPane.showMessageDialog(null, "No existe.");
            else {
                if (temp == inicio) {
                    inicio = inicio.getSig();
                    inicio.setAnt(null);
                } else if (temp == fin) {
                    fin = fin.getAnt();
                    fin.setSig(null);
                } else {
                    temp.getSig().setSig(temp.getSig());
                    temp.getSig().setAnt(temp.getAnt());
                }
            }
        }else
            javax.swing.JOptionPane.showMessageDialog(null, "Lista vacia.");
        
    }
    
    /*
    public void modificar(Cancion d){
        NodoDE temp=existe(d);
        if(temp==null)
            javax.swing.JOptionPane.showMessageDialog(null, "El dato '"+d+"' no existe");
        else{
            Cancion nv=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el nuevo valor para "+d));
            temp.setCancion(nv);
        }
    }
*/
    
    public String mostrar() throws EstaVaciaException{
        String cad = "";
        if (!estaVacia()) {
            
            for (NodoDE i = inicio; i != null; i=i.getSig()) {
                cad = cad + "(" + i.getCancion() + ")";
            }
        }
        else
            throw new EstaVaciaException("Lista vacia");
        
        return cad;
    }
    
    public Cancion getCancion(){
        if(!estaVacia()){
            
        }
        return new Cancion();
    }
    
    
    
    
    
    
    
}
