package cola; 
public class ColaGeneral {
    Cliente [] clientes;
    public Nodo cabeza;
    public Nodo fincola;
    int tamaño=0;
    public void encolarNodo_ge(Cliente i) { // esta funcion es para poner un cliente delante de una cola

        /* lo inicio localmente y verfico si esta vacio */
        
        Nodo nuevoNodo = new Nodo(i);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
            fincola = nuevoNodo;
        } else {
            fincola.seguirNodo = nuevoNodo;
        }
        fincola = nuevoNodo;
        tamaño++;
    }



    public void eliminarNodo_ge() {
        if (cabeza != null) {
            Nodo eliminarNodo = cabeza; 
            cabeza = cabeza.seguirNodo; 
            eliminarNodo.seguirNodo = null; 
            if (cabeza == null) {
                fincola = null; 
            }
        }
        
    }



    public Cliente obtenerNodo_ge() {
        if (cabeza == null) {
            return null; 
            
        } else {
            return cabeza.cliente; 
        }
        
    }
}
