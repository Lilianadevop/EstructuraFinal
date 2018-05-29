/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alondriwis
 */
 import static javax.swing.JOptionPane.*;
public class ColaSimple {
    private int tam,tope, A[];

    public ColaSimple() {
    tam=0;
    tope=-1;
    }

    public ColaSimple(int t) {
        tam=t;
        tope=-1;
        A=new int[tam];
    }//constructor
    
    
    public boolean llena(){
    
    return tope==tam-1;
    }
    public boolean vacia(){
    return tope==-1;
    }
    
    
    

   public void meter(int d){
   if(!llena()){
   A[++tope]=d;
   
   }
   else {
       showMessageDialog(null,"llena");
   }
   } ///fin metodo meter 
    
   
    public int sacar(){
   int s=A[0];
    for(int i=0;i<tam-1;i++)  A[i]=A[i+1];
    tope--;
    return s;
   }
    //}//metodo sacar
    public int getTope(){ 
        return tope;
           }

    public int getTam() {
        return tam;
    }

}
