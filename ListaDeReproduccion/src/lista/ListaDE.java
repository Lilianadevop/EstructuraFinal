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
        if(estaVacia()){
            inicio=fin=new NodoDE(d);
            inicio.setSig(fin);
            fin.setAnt(inicio);
        }else if(fin==inicio){
            inicio.setSig(new NodoDE(d));
            fin=inicio.getSig();
            fin.setSig(inicio);
            fin.setAnt(inicio);
            inicio.setAnt(fin);
        }
        else{
            fin.setSig(new NodoDE(d));
            fin.getSig().setAnt(fin);
            fin=fin.getSig();
            fin.setSig(inicio);
            inicio.setAnt(fin);
        }
    }
    
    public boolean estaVacia(){
        return inicio==null && fin==null;
    }
    
    public NodoDE existe(Cancion d){
        //if(inicio.getCancion()==d)
            //return inicio;
        if(fin.getCancion().equals(d))
                return fin;
        else
            for(NodoDE i=inicio; i!=fin;i=i.getSig())
                if(i.getCancion().equals(d))
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
    
    public Cancion siguiente(Cancion c){
        if(!estaVacia()){
            NodoDE temp = existe(c);
            if (temp != null) 
                if(temp.getSig()!=null)
                    return temp.getSig().getCancion();
                else
                    return null;
        }
        return null;
    }
    
    public Cancion anterior(Cancion c){
        if(!estaVacia()){
            NodoDE temp = existe(c);
            if(temp!=null)
                if(temp.getAnt()!=null)
                    return temp.getAnt().getCancion();
                else
                    return null;
                    
        }
        return null;
    }
    
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
    
    public Cancion getInicio(){
        return inicio.getCancion();
    }
    
    public NodoDE getInicioN(){
        return inicio;
    }
    
    public Cancion getFin(){
        return fin.getCancion();
    }
    
    public NodoDE getFinN(){
        return fin;
    }
    
    public int getTam(){
        int tam=0;
        if (!estaVacia()) 
            for (NodoDE i = inicio; i != fin; i=i.getSig())
                tam++;
        
        return tam;
    }
    
    
    
    
    
    
    
    
}
