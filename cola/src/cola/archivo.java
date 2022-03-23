/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Usuario
 */
public class archivo
{
    PrintWriter pf;
    FileReader fr;
    
    void crear(String pNombre,String pDatos) throws IOException
    {
        pf=new PrintWriter(new FileWriter(pNombre, true));
        pf.println(pDatos);
        pf.close();
        System.out.println("Generacion ok");
        
    }
void leer(String pnombre,ColaGeneral cola ) throws IOException{
    FileReader fr=new FileReader(pnombre);
        BufferedReader br=new BufferedReader(fr);
        String linea=br.readLine();
       
        while ((linea=br.readLine())!=null)
        {
            String datos;
            datos=("/r");
            
            String nombre = datos;
            Cliente cliente=new Cliente(nombre);
            cola.encolarNodo_ge(cliente);
    }
}
int obtenertamaño(String pnombre)throws IOException{
    int x=0;
    FileReader fr=new FileReader(pnombre);
        BufferedReader br=new BufferedReader(fr);
        String linea=br.readLine();
       
        while ((linea=br.readLine())!=null)
        {
            x++;
}
        return x;
}
}
