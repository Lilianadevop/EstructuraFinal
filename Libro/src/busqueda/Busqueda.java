/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import main.Libro;

/**
 *
 * @author SG-A1
 */
public class Busqueda {
    
    //Secuencial
    public static int secuencial(int[] A, int e){
        for(int i=0;i<A.length;i++)
            if(e==A[i])
                return i;
            
        return -1;
    }
    
    //Binaria
    public static int binaria(int[] arreglo, int valor){
        return binariaRecur(arreglo,valor,0,arreglo.length-1);
    }
    
    private static int binariaRecur(int[] arreglo, int valor, int inf,int sup){
        int mitad=(inf+sup)/2;
        if((inf>=sup)&&(arreglo[inf]!=valor))return -1;
        else if(arreglo[mitad]==valor)return mitad;
        else if(valor>arreglo[mitad])return binariaRecur(arreglo,valor,mitad+1,sup);
        return binariaRecur(arreglo,valor,inf,mitad-1);
    }
    
    public static int binaria(Libro[] arreglo, String valor, int pos){
        return binariaRecur(arreglo,valor,0,arreglo.length-1,pos);
    }
    
    private static int binariaRecur(Libro[] arreglo, String valor, int inf,int sup, int pos){
        switch(pos){
            case 0:
                int mitad=(inf+sup)/2;
                if((inf>=sup)&&(arreglo[inf].getISBN().equals(valor)))return -1;
                else if(arreglo[mitad].getISBN().equals(valor))return mitad;
                else if(valor.compareToIgnoreCase(arreglo[mitad].getISBN())>0)return binariaRecur(arreglo,valor,mitad+1,sup,pos);
                return binariaRecur(arreglo,valor,inf,mitad-1,pos);
                //break;
            case 1:
                int mitad=(inf+sup)/2;
                if((inf>=sup)&&(arreglo[inf].getISBN().equals(valor)))return -1;
                else if(arreglo[mitad].getISBN().equals(valor))return mitad;
                else if(valor.compareToIgnoreCase(arreglo[mitad].getISBN())>0)return binariaRecur(arreglo,valor,mitad+1,sup,pos);
                return binariaRecur(arreglo,valor,inf,mitad-1,pos);
                
                break;
                
            case 2:
                int mitad=(inf+sup)/2;
                if((inf>=sup)&&(arreglo[inf].getISBN().equals(valor)))return -1;
                else if(arreglo[mitad].getISBN().equals(valor))return mitad;
                else if(valor.compareToIgnoreCase(arreglo[mitad].getISBN())>0)return binariaRecur(arreglo,valor,mitad+1,sup,pos);
                return binariaRecur(arreglo,valor,inf,mitad-1,pos);
                
                break;
                
            case 3:
                int mitad=(inf+sup)/2;
                if((inf>=sup)&&(arreglo[inf].getISBN().equals(valor)))return -1;
                else if(arreglo[mitad].getISBN().equals(valor))return mitad;
                else if(valor.compareToIgnoreCase(arreglo[mitad].getISBN())>0)return binariaRecur(arreglo,valor,mitad+1,sup,pos);
                return binariaRecur(arreglo,valor,inf,mitad-1,pos);
                
                break;
            case 4:
                break;
            case 5:
                break;
        }
        
    }
    
    //Hash
    private static int posHash(String nc){
        char[] chars=nc.toCharArray();
        String t="";
        int tt=0;
        for(int i=0;i<chars.length;i++){
            if((int)chars[i++]==0){
                t=chars[i]+""+chars[i+1];
            }else
                t=chars[i]+"";
            
            tt+=Integer.parseInt(t);
        }
        return tt%11;
    }
    
    public static int hash(String nc){
        return posHash(nc);
    }
    
    
    
    
    
    
}
