package cola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class archivo {
    PrintWriter pf;
    FileReader fr;

    void crear(String pNombre, String pDatos) throws IOException {
        pf = new PrintWriter(new FileWriter(pNombre, true));
        pf.println(pDatos);
        pf.close();
        System.out.println("Generacion ok");

    }

    void leer(String pnombre) throws IOException {
        FileReader fr = new FileReader(pnombre);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();

        while ((linea = br.readLine()) != null) {
            String datos;
            datos = ("/r");
            String nombre = datos;
            lis.insertar(nombre);
        }
    }
}