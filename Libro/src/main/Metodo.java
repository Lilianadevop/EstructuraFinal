package main;

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

public class Metodo {
    // private Libro L;

    public static boolean bSec(Libro L[], String nombre, int tam, int opt) {
        switch (opt) {
            case 1:
                boolean buscar = false;
                for (int i = 0; i < tam && buscar == false; i++) {
                    if (nombre.equalsIgnoreCase(L[i].getISBN())) {
                        showMessageDialog(null, " Se ha encontrado" + "\n" + L[i].toString());
                        return buscar = true;
                    }//if

                }//for

                break;
            case 2:
                buscar = false;
                for (int i = 0; i < tam && buscar == false; i++) {
                    if (nombre.equalsIgnoreCase(L[i].getTitulo())) {

                        showMessageDialog(null, " Se ha encontrado" + "\n" + L[i].toString());
                        return buscar = true;
                    }//if
                }//for
                break;
            case 3:
                buscar = false;
                for (int i = 0; i < tam && buscar == false; i++) {
                    if (nombre.equalsIgnoreCase(L[i].getAutor())) {
                        showMessageDialog(null, " Se ha encontrado" + "\n" + L[i].toString());
                        return buscar = true;
                    }//if
                }//for
                break;
            case 4:
                buscar = false;
                for (int i = 0; i < tam && buscar == false; i++) {
                    if (nombre.equalsIgnoreCase(L[i].getEd())) {
                        showMessageDialog(null, " Se ha encontrado" + "\n" + L[i].toString());
                        return buscar = true;
                    }//if
                }//for
                break;
            case 5:
                buscar = false;
                for (int i = 0; i < tam && buscar == false; i++) {
                    if (Integer.parseInt(nombre) == L[i].getPrecio()) {
                        showMessageDialog(null, " Se ha encontrado" + "\n" + L[i].toString());
                        return buscar = true;
                    }//if
                }//for
                break;

            default:

                break;
        }

        return false;
    }//busqueda secuencial

    public static void ordBurbujaAlmno(Libro M[], boolean asc, int e) {

        for (int p = 1; p <= M.length; p++) {
            for (int i = 0; i < M.length - p; i++) {
                switch (e) {
                    case 0:

                        if (asc) {
                            if (M[i].getISBN().compareToIgnoreCase(M[i + 1].getISBN()) > 0) {
                                String aux = M[i].getISBN();
                                M[i].setISBN(M[i + 1].getISBN());

                                M[i + 1].setISBN(aux);
                            } //fin if

                        } else {
                            if (M[i].getISBN().compareToIgnoreCase(M[i + 1].getISBN()) <= 0) {
                                String aux = M[i].getISBN();
                                M[i].setISBN(M[i + 1].getISBN());

                                M[i + 1].setISBN(aux);
                            } //fin if
                        }

                        break;

                    case 1:
                        if (asc) {
                            if (M[i].getTitulo().compareToIgnoreCase(M[i + 1].getTitulo()) > 0) {
                                String aux = M[i].getTitulo();
                                M[i].setTitulo(M[i + 1].getTitulo());

                                M[i + 1].setTitulo(aux);
                            } //fin if

                        } else {
                            if (M[i].getTitulo().compareToIgnoreCase(M[i + 1].getTitulo()) < 0) {
                                String aux = M[i].getTitulo();
                                M[i].setTitulo(M[i + 1].getTitulo());

                                M[i + 1].setTitulo(aux);
                            } //fin if
                        }

                        break;

                    case 2:

                        if (asc) {
                            if (M[i].getAutor().compareToIgnoreCase(M[i + 1].getAutor()) > 0) {
                                String aux = M[i].getAutor();
                                M[i].setAutor(M[i + 1].getAutor());

                                M[i + 1].setAutor(aux);
                            } //fin if
                        } else {
                            if (M[i].getAutor().compareToIgnoreCase(M[i + 1].getAutor()) < 0) {
                                String aux = M[i].getAutor();
                                M[i].setAutor(M[i + 1].getAutor());

                                M[i + 1].setAutor(aux);
                            } //fin if
                        }

                        break;

                    case 3:
                        if (asc) {
                            if (M[i].getEd().compareToIgnoreCase(M[i + 1].getEd()) > 0) {
                                String aux = M[i].getEd();
                                M[i].setEd(M[i + 1].getEd());

                                M[i + 1].setEd(aux);
                            } //fin if
                        } else {
                            if (M[i].getEd().compareToIgnoreCase(M[i + 1].getEd()) < 0) {
                                String aux = M[i].getEd();
                                M[i].setEd(M[i + 1].getEd());

                                M[i + 1].setEd(aux);
                            } //fin if
                        }

                        break;

                    case 4:
                        if (asc) {
                            if (M[i].getPrecio() > M[i + 1].getPrecio()) {
                                int aux = M[i].getPrecio();
                                M[i].setPrecio(M[i + 1].getPrecio());
                                M[i + 1].setPrecio(aux);
                            } //segundo if
                        } else {
                            if (M[i].getPrecio() < M[i + 1].getPrecio()) {
                                int aux = M[i].getPrecio();
                                M[i].setPrecio(M[i + 1].getPrecio());
                                M[i + 1].setPrecio(aux);
                            } //segundo if
                        }

                        break;
                }//switch
            }//segundo for
        }//primer for
    }//metodo burbuja alumno

    public static void quicksortLibro(Libro[] A, int izq, boolean asc, int der, int c) {
        switch (c) {
            case 0://Nombre
                String pivote;
                int i,
                 j;
                String aux;
                pivote = A[izq].getISBN();
                i = izq;
                j = der;
                while (i < j) {
                    if (asc) {
                        while (A[i].getISBN().compareToIgnoreCase(pivote) <= 0 && i < j) {
                            i++;
                        }
                        while (A[j].getISBN().compareToIgnoreCase(pivote) > 0) {
                            j--;
                        }
                    } else {

                        while (A[i].getISBN().compareToIgnoreCase(pivote) >= 0 && i < j) {
                            i++;
                        }
                        while (A[j].getISBN().compareToIgnoreCase(pivote) < 0) {
                            j--;
                        }
                    }//else

                    if (i < j) {
                        aux = A[i].getISBN();
                        A[i].setISBN(A[j].getISBN());
                        A[j].setISBN(aux);
                    }
                }
                A[izq].setISBN(A[j].getISBN());
                A[j].setISBN(pivote);
                if (izq < j - 1) {
                    quicksortLibro(A, izq, asc, j - 1, 0);
                }
                if (j + 1 < der) {
                    quicksortLibro(A, j + 1, asc, der, 0);
                }
                break;

            case 1:
                aux = "";
                pivote = A[izq].getTitulo();
                i = izq;
                j = der;
                while (i < j) {
                    if (asc) {
                        while (A[i].getTitulo().compareToIgnoreCase(pivote) <= 0 && i < j) {
                            i++;
                        }
                        while (A[j].getTitulo().compareToIgnoreCase(pivote) > 0) {
                            j--;
                        }
                    } else {

                        while (A[i].getTitulo().compareToIgnoreCase(pivote) >= 0 && i < j) {
                            i++;
                        }
                        while (A[j].getTitulo().compareToIgnoreCase(pivote) < 0) {
                            j--;
                        }
                    }//else

                    if (i < j) {
                        aux = A[i].getTitulo();
                        A[i].setTitulo(A[j].getTitulo());
                        A[j].setTitulo(aux);
                    }
                }
                A[izq].setTitulo(A[j].getTitulo());
                A[j].setTitulo(pivote);
                if (izq < j - 1) {
                    quicksortLibro(A, izq, asc, j - 1, 0);
                }
                if (j + 1 < der) {
                    quicksortLibro(A, j + 1, asc, der, 0);
                }
                break;
            case 2:
                aux = "";
                pivote = A[izq].getAutor();
                i = izq;
                j = der;
                while (i < j) {
                    if (asc) {
                        while (A[i].getAutor().compareToIgnoreCase(pivote) <= 0 && i < j) {
                            i++;
                        }
                        while (A[j].getAutor().compareToIgnoreCase(pivote) > 0) {
                            j--;
                        }
                    } else {

                        while (A[i].getAutor().compareToIgnoreCase(pivote) >= 0 && i < j) {
                            i++;
                        }
                        while (A[j].getAutor().compareToIgnoreCase(pivote) < 0) {
                            j--;
                        }
                    }//else

                    if (i < j) {
                        aux = A[i].getAutor();
                        A[i].setAutor(A[j].getAutor());
                        A[j].setAutor(aux);
                    }
                }
                A[izq].setAutor(A[j].getAutor());
                A[j].setAutor(pivote);
                if (izq < j - 1) {
                    quicksortLibro(A, izq, asc, j - 1, 0);
                }
                if (j + 1 < der) {
                    quicksortLibro(A, j + 1, asc, der, 0);
                }
                break;
            case 3:
                aux = "";
                pivote = A[izq].getEd();
                i = izq;
                j = der;
                while (i < j) {
                    if (asc) {
                        while (A[i].getEd().compareToIgnoreCase(pivote) <= 0 && i < j) {
                            i++;
                        }
                        while (A[j].getEd().compareToIgnoreCase(pivote) > 0) {
                            j--;
                        }
                    } else {

                        while (A[i].getEd().compareToIgnoreCase(pivote) >= 0 && i < j) {
                            i++;
                        }
                        while (A[j].getEd().compareToIgnoreCase(pivote) < 0) {
                            j--;
                        }
                    }//else

                    if (i < j) {
                        aux = A[i].getEd();
                        A[i].setEd(A[j].getEd());
                        A[j].setEd(aux);
                    }
                }
                A[izq].setEd(A[j].getEd());
                A[j].setEd(pivote);
                if (izq < j - 1) {
                    quicksortLibro(A, izq, asc, j - 1, 0);
                }
                if (j + 1 < der) {
                    quicksortLibro(A, j + 1, asc, der, 0);
                }
                break;
            case 4://Calificacion
                int piv = A[izq].getPrecio(),
                 auxx;
                i = izq;
                j = der;
                while (i < j) {
                    if (asc) {
                        while (A[i].getPrecio() <= piv && i < j) {
                            i++;
                        }

                        while (A[j].getPrecio() > piv) {
                            j--;
                        }
                    } else {
                        while (A[i].getPrecio() >= piv && i < j) {
                            i++;
                        }
                        while (A[j].getPrecio() < piv) {
                            j--;
                        }
                    }
                    if (i < j) {
                        auxx = A[i].getPrecio();
                        A[i].setPrecio(A[j].getPrecio());
                        A[j].setPrecio(auxx);
                    }//if
                }//while
                A[izq].setPrecio(A[j].getPrecio());
                A[j].setPrecio(piv);
                if (izq < j - 1) {
                    quicksortLibro(A, izq, asc, j - 1, 1);
                }
                if (j + 1 < der) {
                    quicksortLibro(A, j + 1, asc, der, 1);
                }
                break;
        }
    }//quicksort materia

    public static void shellasc(Libro[] A, boolean asc, int c) {
        switch (c) {
            case 0:
                int n = A.length;
                int cc = n / 2;
                boolean cambios = true;
                n = A.length;
                cc = n / 2;
                cambios = true;
                while (cambios) {
                    cambios = false;
                    for (int i = 0; i < n - cc; i++) {
                        if(asc){
                            
                        }else{
                            
                        }
                        if (asc && A[i].getISBN().compareToIgnoreCase(A[i + cc].getISBN()) > 0) {
                            String aux = A[i].getISBN();
                            A[i].setISBN(A[i + cc].getISBN());
                            A[i + cc].setISBN(aux);
                            cambios = true;
                        } else {
                            if (!asc && A[i].getISBN().compareToIgnoreCase(A[i + cc].getISBN()) < 0) {
                                String aux = A[i].getISBN();
                                A[i].setISBN(A[i + cc].getISBN());
                                A[i + cc].setISBN(aux);
                                cambios = true;
                            }

                        }
                    }
                    if (cc != 1) {
                        cc = cc / 2;
                    }
                }//while
                break;

            case 1:
                int nn = A.length;
                int ccc = nn / 2;
                boolean cambios1 = true;
                nn = A.length;
                ccc = nn / 2;
                cambios1 = true;
                while (cambios1) {
                    cambios1 = false;
                    for (int i = 0; i < nn - ccc; i++) {
                        if (asc && A[i].getTitulo().compareToIgnoreCase(A[i + ccc].getTitulo()) > 0) {
                            String aux = A[i].getTitulo();
                            A[i].setTitulo(A[i + ccc].getTitulo());
                            A[i + ccc].setTitulo(aux);
                            cambios1 = true;
                        } else {
                            if (!asc && A[i].getTitulo().compareToIgnoreCase(A[i + ccc].getTitulo()) < 0) {
                                String aux = A[i].getTitulo();
                                A[i].setTitulo(A[i + ccc].getTitulo());
                                A[i + ccc].setTitulo(aux);
                                cambios1 = true;
                            }

                        }
                    }
                    if (ccc != 1) {
                        ccc = ccc / 2;
                    }
                }//while
                break;
            case 2:
                int nnnn = A.length;
                int cccc = nnnn / 2;
                boolean cambios11 = true;
                nnnn = A.length;
                cccc = nnnn / 2;
                cambios11 = true;
                while (cambios11) {
                    cambios11 = false;
                    for (int i = 0; i < nnnn - cccc; i++) {
                        if (asc && A[i].getAutor().compareToIgnoreCase(A[i + cccc].getAutor()) > 0) {
                            String aux = A[i].getAutor();
                            A[i].setAutor(A[i + cccc].getAutor());
                            A[i + cccc].setAutor(aux);
                            cambios11 = true;
                        } else {
                            if (!asc && A[i].getAutor().compareToIgnoreCase(A[i + cccc].getAutor()) < 0) {
                                String aux = A[i].getAutor();
                                A[i].setAutor(A[i + cccc].getAutor());
                                A[i + cccc].setAutor(aux);
                                cambios11 = true;
                            }

                        }
                    }
                    if (cccc != 1) {
                        cccc = cccc / 2;
                    }
                }//while
                break;
            case 3:
                int nnnnn = A.length;
                int ccccc = nnnnn / 2;
                boolean cambios111 = true;
                nnnnn = A.length;
                ccccc = nnnnn / 2;
                cambios111 = true;
                while (cambios111) {
                    cambios111 = false;
                    for (int i = 0; i < nnnnn - ccccc; i++) {
                        if (asc && A[i].getEd().compareToIgnoreCase(A[i + ccccc].getEd()) > 0) {
                            String aux = A[i].getEd();
                            A[i].setEd(A[i + ccccc].getEd());
                            A[i + ccccc].setEd(aux);
                            cambios111 = true;
                        } else {
                            if (!asc && A[i].getEd().compareToIgnoreCase(A[i + ccccc].getEd()) < 0) {
                                String aux = A[i].getEd();
                                A[i].setAutor(A[i + ccccc].getEd());
                                A[i + ccccc].setEd(aux);
                                cambios111 = true;
                            }

                        }
                    }
                    if (ccccc != 1) {
                        ccccc = ccccc / 2;
                    }
                }//while
                break;

            case 4:
                int z,
                 x;
                z = A.length;
                x = z / 2;
                cambios = true;
                while (cambios) {
                    cambios = false;
                    for (int i = 0; i < z - x; i++) {
                        if (asc && A[i].getPrecio() > A[i + x].getPrecio()) {
                            int aux = A[i].getPrecio();
                            A[i].setPrecio(A[i + x].getPrecio());
                            A[i + x].setPrecio(aux);
                            cambios = true;
                        } else if (!asc && A[i].getPrecio() < A[i + x].getPrecio()) {
                            int aux = A[i].getPrecio();
                            A[i].setPrecio(A[i + x].getPrecio());
                            A[i + x].setPrecio(aux);
                            cambios = true;
                        }
                    }
                    if (x != 1) {
                        x = x / 2;
                    }
                }
                break;
        }//switch
    }//metodo shell materia

    public static Libro[] radixSort(Libro L[], boolean asc, int c) {
        switch (c) {
            case 0:
                showMessageDialog(null, "NO SE PUEDE ORDENAR CON STRING");
                break;
            case 1:
                showMessageDialog(null, "NO SE PUEDE ORDENAR CON STRING");
                break;
            case 2:
                showMessageDialog(null, "NO SE PUEDE ORDENAR CON STRING");
                break;
            case 3:
                showMessageDialog(null, "NO SE PUEDE ORDENAR CON STRING");
                break;
            case 4:
                int tam = L.length,
                 mayor = L[0].getPrecio();
                for (int i = 1; i < tam; i++) {
                    if (L[i].getPrecio() > mayor) {
                        mayor = L[i].getPrecio();
                    }
                }
                int d = (mayor + "").length();

                ColaSimple M[] = new ColaSimple[10];
                for (int i = 0; i < 10; i++) {
                    M[i] = new ColaSimple(tam);
                }

                for (int dig = 1; dig <= d; dig++) {
                    for (int j = 0; j < tam; j++) {
                        String num = L[j].getPrecio() + "";
                        int inicio = num.length() - dig, fin = inicio + 1, pos;
                        if (inicio < 0) {
                            pos = 0;
                        } else {
                            pos = Integer.parseInt(num.substring(inicio, fin));
                        }
                        M[pos].meter(L[j].getPrecio());
                    }//for
                    if (asc) {
                        int a = 0;
                        for (int z = 0; z < 10; z++) {
                            while (!M[z].vacia()) {
                                L[a++].setPrecio(M[z].sacar());
                            }
                        }
                    } else {
                        int a = 0;
                        for (int z = 9; z >= 0; z--) {
                            while (!M[z].vacia()) {
                                L[a++].setPrecio(M[z].sacar());
                            }
                        }
                    }
                }//for
        }//switch
        return L;
    }//radix  
}//clase
