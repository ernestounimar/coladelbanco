/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alcam
 */
public class operaciones {
    
    Integer tiempo;
    Integer consulta=(1);
    Integer retiro=(4);
    Integer deposito=(3);
    Integer actualizacion=(5);
    Integer pago=(2);
    Integer operacionesarealizar;
    
    public operaciones(){
        
      
    }
    public void sumartiempo(int oper){
         switch(oper){
        case 1: tiempo += consulta; break;
        case 2: tiempo += retiro; break;
        case 3: tiempo += deposito; break;
        case 4: tiempo += actualizacion; break;
        case 5: tiempo += pago; break;

}
    }
    void operacionesimprimir(String pnombre,ColaGeneral cola, String nombrec ) throws IOException{ //convertir esto en un string que de las operaciones realizadas.
    FileReader fr=new FileReader(pnombre);
        BufferedReader br=new BufferedReader(fr);
        String linea=br.readLine();
       
        while ((linea=br.readLine())!=null)
        {
            String datos;
            datos=("/r");
            String nombre = datos;
            Cliente cliente=new Cliente(nombrec);
            cola.encolarNodo_ge(cliente);
    }
}
}