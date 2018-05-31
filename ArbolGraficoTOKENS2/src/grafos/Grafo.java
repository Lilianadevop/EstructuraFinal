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
    
                                  // az,_,09,otro, ) , math, otro
    private static final int M3[][]={{1,-1,-1,-1,1,-1,-1},
                                     {1,1,1,1,1,1,-1}};
    
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
    
    public static boolean esoperacion(String op){
        if(op.charAt(0)=='=' | op.charAt(op.length()-1)=='=')
            return false;
        
        int edo=0,ent,cont=0;
        for(int i=0;i<op.length();i++){
            int c=op.charAt(i);
            
            if(c>=65 && c<=90 | c>=97 && c<=122)//a-z A-Z
                ent=0;
            else if(c>=48 && c<=57)//0-9
                ent=1;
            else if(c>=42 && c<=43 | c==45 | c==47 | c==94 | c==37)//Operadores
                ent=2;
            else if(c==95 | c==46) // _,.
                ent=3;
            else if(c==40 | c==41 ) // _,.
                ent=4;
            else if( c==61){
                ent=5;
                cont++;
                if(cont>1)
                    return false;                
            }
                
            else
                ent=6;
             
              //javax.swing.JOptionPane.showMessageDialog(null, ""+c+","+edo);  
            edo=M3[edo][ent];
            //javax.swing.JOptionPane.showMessageDialog(null, ""+c+","+edo);
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
