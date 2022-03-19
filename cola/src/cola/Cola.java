/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

/**
 *
 * @author Usuario
 */

public class Cola {

    
    class Nodo {
        String info;
        int prioridad;
        Nodo sig;
    }
    
    private Nodo raiz,fondo;
    
    Cola() {
        raiz=null;
        fondo=null;
    }
    
    boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar (String info)
    {
        Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    String extraer ()
    {
        if (!vacia ())
        {
            String informacion = raiz.info;
            if (raiz.equals(fondo)){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else
            return "fallo";
    }
    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola1=new Cola();
        cola1.insertar("a");
        cola1.insertar("n");
        cola1.insertar("vv");
        cola1.imprimir();
        System.out.println("Extraemos uno de la cola:"+cola1.extraer());
        cola1.imprimir(); 
    }
    
}
