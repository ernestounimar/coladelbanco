package cola;

import java.io.*;
import java.util.Scanner;

public class Main {

    /*
     * aqui defino los punteros para
     * los metodos con los que manipulo las colas
     */

    public static void main(String[] args) throws IOException {

        /* Declaro estos valores para rellenar clientes */
        String nomString, ubic,disc;
        Integer edadInteger;
        int salir = 0;
        Boolean disBoolean;
        Scanner Let = new Scanner(System.in);
        archivo ar=new archivo();
        ColaGeneral cola=new ColaGeneral();
        while (salir != 1) {
            
            disBoolean = false;
            System.out.println(" Bienvenido al programa  ");
            System.out.println("nombre: ");
            nomString=Let.nextLine();
            System.out.println("donde quiere el archivo");
            ubic=Let.nextLine();
            System.out.println(" Si el cliente es discapacitado escriba si, si no es el caso escriba cualquier otra cosa: ");
            disc=Let.nextLine();
            System.out.println(" Escogio " + disc);

            if (disc.equals("si") ){
                disBoolean = true; 
                
            } else {
                disBoolean = false;
            }
            Cliente cliente=new Cliente(nomString);
            cliente.Discapacidad=disBoolean;
            
            ar.crear(ubic, cliente.Nombre);                                               
            System.out.println(" Si desea salir presione 1 si no presione cualquier otro numero ");
            salir = Let.nextInt();
        }
        
        

    }
}