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
        /*String nomString, ubic,disc;
        Integer edadInteger;
        int salir = 0;
        int i=0; 
        int opcion=0;
        System.out.println("Bienvenido al sistema banesco, escoja una opcion por favor /n"
                    + "1.cargar cliente /n"
                    + "2.Atender cliente /n"
                    + "3.verificar hora /n"
                    + "4.salir del sistema /n");
        switch (opcion){
            case 1:Boolean disBoolean;
        Scanner Let = new Scanner(System.in);
        archivo ar=new archivo();
        ColaGeneral cola=new ColaGeneral();
        while (salir != 1) {
            
            disBoolean = false;                        
            System.out.println("nombre: ");
            nomString=Let.nextLine();
           if(i>0){
            nomString=Let.nextLine();}
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
            i++;
            ar.crear(ubic, cliente.Nombre);                                               
            System.out.println(" Si desea salir presione 1 si no presione cualquier otro numero ");
            salir = Let.nextInt();
        }
            case 2:
             operaciones oper1= new operaciones();
             oper1.sumartiempo();
            case 3:*/
                //operaciones oper2= new operaciones();
                //oper2.sumartiempo();
                //oper2.horaactual();
                //Scanner Let = new Scanner(System.in);
                archivo ar=new archivo();
                ColaGeneral cola= new ColaGeneral();
                ar.crear("arhivopruebamain.txt","hola");
                archivo al=new archivo();
                al.leer("arhivopruebamain.txt", cola);
                System.out.println(al.tamaño);
        }
        
        

    }
