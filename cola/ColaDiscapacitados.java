package cola ; 


public class ColaDiscapacitados {
    
    public Nodo cabeza;
    public Nodo fincola;

    public void encolarNodo_dis(Cliente i) { // esta funcion es para poner un cliente delante de una cola

        /* lo inicio localmente y verfico si esta vacio */
        Nodo nuevoNodo = new Nodo(i);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            fincola = nuevoNodo;
        } else {
            fincola.seguirNodo = nuevoNodo;
        }
        fincola = nuevoNodo;
    }



    public void eliminarNodo_dis() {
        if (cabeza != null) {
            Nodo eliminarNodo = cabeza; 
            cabeza = cabeza.seguirNodo; 
            eliminarNodo.seguirNodo = null; 
            if (cabeza == null) {
                fincola = null; 
            }
        }
        
    }



    public Cliente obtenerNodo_dis() {
        if (cabeza == null) {
            return null; 
            
        } else {
            return cabeza.cliente; 
        }
        
    }
}
