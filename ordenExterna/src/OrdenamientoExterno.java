
import static javax.swing.JOptionPane.*;

public class OrdenamientoExterno {

    public static int[] MezclaDirecta(int F[]) {
        int n = F.length;
        int tam = 0;
        for (int i = 0; (tam = (int) Math.pow(2, i)) <= n; i++) {
            int F1[] = new int[n], F2[] = new int[n];
            int f = 0, f1 = 0, f2 = 0;//sub indices  
            do {
                for (int a = 0; a < tam && f < n; a++) {
                    F1[f1++] = F[f++];
                }
                for (int a = 0; a < tam && f < n; a++) {
                    F2[f2++] = F[f++];
                }
            } while (f < n);// comparamos si la sub-indice f es menor que la longitud del tamaño
            verArray(F, f);
            verArray(F1, f1);
            verArray(F2, f2);
            int x1 = 0, x2 = 0, l = 0; //sub indices de los arreglos
            for (int r = 0; r < tam && x1 < f1; r++) {
                int no = tam;
                for (; x2 < f2;) {
                    if (F1[x1] > F2[x2]) {//comparara las sublistas
                        F[l++] = F2[x2++];
                        if (x2 >= no) {
                            do {
                                F[l++] = F1[x1++];
                            } while (x1 < no);
                            no = no + tam;
                        }
                    } else {
                        F[l++] = F1[x1++];
                        if (x1 >= no) {
                            do {
                                F[l++] = F2[x2++];
                            } while (x2 < no);
                            no = no + tam;
                        }
                    }
                }
                if (x2 == f2 && x1 < f1) {
                    showMessageDialog(null, "Arreglo");
                    do {
                        F[l++] = F1[x1++];
                    } while (x1 < f1);
                }
            }
        } //for para elevar a la potencia segun los elementos que pasara a las sublistas   
        return F;
    }//meetodo de mezcla directa*/

    public static void MezclaDirecta2(int F[]) {
        int n = F.length;
        int tam = 0;
        for (int i = 0; (tam = (int) Math.pow(2, i)) <= n; i++) {
            int F1[] = new int[n], F2[] = new int[n];
            int f = 0, f1 = 0, f2 = 0;//sub indices  
            do {
                for (int a = 0; a < tam && f < n; a++) {
                    F1[f1++] = F[f++];
                }
                for (int a = 0; a < tam && f < n; a++) {
                    F2[f2++] = F[f++];
                }
            } while (f < n);// comparamos si la sub-indice f es menor que la longitud del tamaño
            verArray(F, f);
            verArray(F1, f1);
            verArray(F2, f2);
            int x1 = 0, x2 = 0, l = 0; //sub indices de los arreglos
            for (int r = 0; r < tam && x1 < f1; r++) {
                int no = tam;
                for (; x2 < f2;) {
                    if (F1[x1] > F2[x2]) {//comparara las sublistas
                        F[l++] = F2[x2++];
                        if (x2 >= no) {
                            do {
                                F[l++] = F1[x1++];
                            } while (x1 < no);
                            no = no + tam;
                        }
                    } else {
                        F[l++] = F1[x1++];
                        if (x1 >= no) {
                            do {
                                F[l++] = F2[x2++];
                            } while (x2 < no);
                            no = no + tam;
                        }
                    }
                }
                if (x2 == f2 && x1 < f1) {
                    showMessageDialog(null, "Arreglo");
                    do {
                        F[l++] = F1[x1++];
                    } while (x1 < f1);
                }

            }
        } //for para elevar a la potencia segun los elementos que pasara a las sublistas   
        // return F;
    }//metodo de mezcla directa

    public void mezclaNatural(int F[]) {
        int inferior = 0, izq = 0, superior = F.length - 1, der = superior;
        boolean EstaOrdenado = false;
        do {
            EstaOrdenado = true;
            inferior = 0;
            while (inferior < superior) {
                izq = inferior;
                while (izq < superior && F[izq] <= F[izq + 1]) {
                    izq++;
                }
                der = izq + 1;
                while (der == superior - 1 || der < superior && F[der] <= F[der + 1]) {
                    der++;
                }
                if (der <= superior) {
                    MezclaDirecta2(F);
                    EstaOrdenado = false;
                }
                inferior = izq;
            }
        } while (!EstaOrdenado);
    }//metodo mezcla natural

    public static void verArray(int A[], int n) { //hasta donde tiene datos
        String cad = "";
        for (int i = 0; i < n; i++) {
            cad = cad + A[i] + ",";
        }
        //showMessageDialog(null,"El arreglo esta ordeador por mezcla natural:\n "+ cad);
        showMessageDialog(null, cad);
    }//ver array

    public static void mostrararreglo(int F[]) {
        String cad = "";
        for (int k = 0; k < F.length; k++) {
            cad = cad + F[k] + ",";
            // System.out.print("[" + F[k] + "]");
        }
        showMessageDialog(null, "Ordenamiento de mezcla directa es: \n " + cad);

    }

    public static void mostrararregloNatural(int F[]) {
        String cad = "";
        for (int k = 0; k < F.length; k++) {
            cad = cad + F[k] + ",";
            // System.out.print("[" + F[k] + "]");
        }
        showMessageDialog(null, "Ordenamiento de mezcla natural es: \n " + cad);

    }

    public static void main(String[] args) {
        OrdenamientoExterno or = new OrdenamientoExterno();
        
        int opt=0;
        opt=Integer.parseInt(showInputDialog("Seleccione el metodo a ejecutar\n\n0 = Mezcla directa\n1 = Mezcla natural"));
        
        switch(opt){
            
            case 0://****MEZCLA DIRECTA
                int A[] = {9, 8, 5, 3, 4, 7, 6, 2, 0, 1};
                MezclaDirecta(A);
                mostrararreglo(A);
                break;
            case 1://****MEZCLA NATURAL
                int B[] = {5, 22, 4, 77, 1, 8};

                String cad = "";
                for (int i : B) {
                    cad += i + "-";
                }
                or.mezclaNatural(B);
                mostrararregloNatural(B);
                break;
        }
        
        


        
        
         
    }

} //class
