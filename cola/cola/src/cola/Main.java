package cola;

import java.io.*;
import java.util.Scanner;

public class Main {

    /*
     * aqui defino los punteros para
     * los metodos con los que manipulo las colas
     */

    public static void main(String[] args) {

        /* Declaro estos valores para rellenar clientes */
        String nomString;
        Integer edadInteger,opcionf;
        int salir = 0;
        Boolean disBoolean;
        Scanner Let = new Scanner(System.in);

        while (salir != 1) {
            disBoolean = false;
            System.out.println(" Bienvenido al programa ");
            System.out.println(" Dijite los clientes para salir presione 0   ");

            System.out.println(" Dijite nombre del cliente ");
            nomString = Let.nextLine();
            System.out.println(" El nombre que escogiste es: " + nomString);

            System.out.println(" Dijite Edad del cliente ");
            edadInteger = Let.nextInt(); 
            System.out.println(" La Edad que escogiste es: " + edadInteger);

            System.out.println(" Si el clientes es discapacitado presione 5 ");
            opcionf = Let.nextInt(); 
            System.out.println(" Escogio " + opcionf);

            if (opcionf == 5 ){
                disBoolean = true; 
                
            } else {
                disBoolean = false;
            }
            Cliente Usuario = new Cliente(nomString,edadInteger,disBoolean);

            System.out.println(" El nombre es:  " + Usuario.Nombre);
            System.out.println(" La edad  es:  " + Usuario.Edad);
            System.out.println(" La edad  es:  " + Usuario.Discapacidad);

            System.out.println(" La edad  es:  " + Usuario.Edad);
            ColaComun LaFila = new ColaComun();

            LaFila.encolarNodo_comun(Usuario);
            System.out.println(LaFila.obtenerNodo_comun());



            System.out.println(" Si desea salir presione 1 si no presione cualquier otro numero ");
            salir = Let.nextInt();
        }

    }
}