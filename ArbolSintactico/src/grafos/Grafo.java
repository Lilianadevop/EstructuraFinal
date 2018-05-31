/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author SB-C3
 */
public class Grafo {
                                 // az,_,09,otro
    private static final int M[][]={{1,1, 1,-1},
                                    {1,1, 1,-1}};
    
    //Op puede contener:
    //az,09,_,(,),*-+/
    
                                  // az,_,09,otro, ) , math, otro
    private static final int M2[][]={{1,1, 1, 1  , -1, -1  ,  -1 },
                                     {1,1, 1, 1  ,  1,  1  ,  -1 }};
    
    //1 fila, 3 columnas, 
    //(o sea, 
    //2 filas, 4 columnas
    
    
    
    public static boolean esexp(String exp){
        if(!exp.contains("="))
            return false;
        
        String[] pre, pos, temp;
        //Divide entre identificador y el resto de la expresion
        temp = exp.split("=");
        //Antes del '='
        pre = temp[0].split("");
        //Despues del '='
        pos = temp[1].split("");
        
        for (String palabra : pre)
            if (!eside(palabra))
                return false;
        
        for (String palabra : pos)
            if (!esop(palabra))
                return false;
        
        return true;
    }
    
    
    public static boolean eside(String p){
        int edo=0,ent;
        for(int i=0;i<p.length();i++){
            int c=p.charAt(i);
            if(c=='_')
                ent=1;
            else if(c>=65 && c<=90 | c>=97 && c<=122)
                ent=0;
            else if(c>=48 && c<=57)
                ent=2;
            else 
                ent=3;
            
            edo=M[edo][ent];
            if(edo==-1)
                return false;
        }
        return true;
    }
    
    
    public static boolean esop(String op){
        int edo=0,ent;
        for(int i=0;i<op.length();i++){
            int c=op.charAt(i);
            if(c=='_')
                ent=1;
            else if(c>=65 && c<=90 | c>=97 && c<=122)
                ent=0;
            else if(c>=48 && c<=57)
                ent=2;
            else 
                ent=3;
            
            edo=M2[edo][ent];
            if(edo==-1)
                return false;
        }
        return true;
    }
    
    
}

/*
    Examen de unidad 3, estructuras de datos lineales
    Cola doble 
*/
