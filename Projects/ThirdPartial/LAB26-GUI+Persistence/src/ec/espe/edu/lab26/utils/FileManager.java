/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab26.utils;

import ec.edu.espe.lab26.cmd.Projectile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fernanda Galárraga
 */
public class FileManager {
     public void save(String fileName, String text)
    {
        try
        {
             File file=new File(fileName);
               if (!file.exists()) {
                   file.createNewFile();
                 }
             FileWriter wr=new FileWriter(file.getAbsoluteFile(),true);
             BufferedWriter bw = new BufferedWriter(wr);
             wr.write(text+"\n");
             wr.close();
             bw.close();
        } catch (IOException e)  {
          System.out.println("ERROR: No se pudo escribir en el archivo");
        }
       
    }
      public void exists(String fileName)
    { 
        File file =new File(fileName);

        if(fileName=="Projectile.csv" || fileName.equals("Projectile.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Apellido;SalarioxHora;Horas;Total;Seguro;Liquido;";
                   this.save(fileName,text);
                  return;
             }
            }
    }
     public boolean searchString(String fileName, String request)
    {

        File file =new File(fileName);
          if (!file.exists()) {
              return false;
              }
      try {    
          BufferedReader rd = new BufferedReader(new FileReader(fileName));
          String line = "";
          
          while((line = rd.readLine())!= null){
              if(line.indexOf(request)!= -1){
                   rd.close();
                    return true;
                 } 
        
            }
             rd.close();
        }catch (Exception e) {
             e.printStackTrace();  }
            return false;
    }
     
     public String convertsToString(Projectile projectile)
    {
        String text;
        text=projectile.getInitialVelocity()+";"+projectile.getAngle()+";"+projectile.getGravity()+";"+projectile.getVelocityX()+";";
        
        return text;
    }
}
