/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

/**
 *
 * @author Usuario
 */
 class Pila {
    
    private Nodop inicio;
    private int tamanio;
  
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
     
    public boolean esVacia(){
        return inicio == null;
    }
    public void apilar(String valor){      
        Nodop nuevo = new Nodop();      
        nuevo.setValor(valor);        
        if (esVacia()) {            
            inicio = nuevo;
        }       
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
       
        tamanio++;
    }
    public boolean buscar(String referencia){       
        Nodop aux = inicio;       
        boolean existe = false;     
        while(existe != true && aux != null){
            
            if (referencia.equals(aux.getValor())) {               
                existe = true;
            }
            else{              
                aux = aux.getSiguiente();
            }
        }
       
        return existe;
    }
    public void retirar(){
        if (!esVacia()) {          
            inicio = inicio.getSiguiente();
            tamanio--;
        }
    }
    public void remover(String referencia){
        
        if (buscar(referencia)) {
            Nodop pilaAux = null;           
            while(referencia != inicio.getValor()){
                Nodop temp = new Nodop();                
                temp.setValor(inicio.getValor());               
                if(pilaAux == null){
                    pilaAux = temp;
                }
                else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirar();
            }
            
            retirar();
            while(pilaAux != null){
                apilar(pilaAux.getValor());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    }    
    public void listar(){
        Nodop aux = inicio;
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
        
    }
    public void InvertirPila(){
      Nodop Temporal = inicio;
      Pila cc = new Pila();
      while (!esVacia()) {
          cc.apilar(inicio.valor);
          inicio = inicio.siguiente;
      }
      inicio = Temporal;
      
    }
}
