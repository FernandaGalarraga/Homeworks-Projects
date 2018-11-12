/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivotexto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ArchivoTexto {

    public static void main(String[] args) throws IOException {
        String ruta = "/Users/MegaSystem/Desktop/archivo.txt";
                File archivo = new File (ruta);
                BufferedWriter bw;
                if(archivo.exists()){
             bw = new BufferedWriter(new FileWriter(archivo));
             bw.write("El fichero de texto ya estaba creado");
                   
                }else{
                    bw = new BufferedWriter(new FileWriter(archivo));
                    bw.write("Acabo de crear el fichero de texto");
                }
                bw.close();
                //if (archivo.delete()){
                    //System.out.println("El fichero ha sido borrado");
                //}else{
                    //System.out.println("El fichero no puede ser borrado");
                //}
                    muestraContenido("/Users/MegaSystem/Desktop/archivo.txt");
    }

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null){
            System.out.println(cadena);
        }
        b.close();
    }
    
}
