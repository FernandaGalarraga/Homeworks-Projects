/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab24.utils;

import ec.edu.espe.lab24.cmd.Person;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fernanda Galárraga
 */
public class FilePrj {
    public void save(String fileName, String text)
    {
        try
        {
             java.io.File file=new java.io.File(fileName);
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
    
    public void read(String fileName)
    {
        
        java.io.File file =new java.io.File(fileName);
        FileReader fileread;
        BufferedReader buffer;
        
           if (!file.exists()) {
              System.out.println("ERROR: El archivo no existe");
              return;
              }
   
        try {
	   fileread = new FileReader(file);
	   buffer = new BufferedReader(fileread);
	   String lines;
         while((lines=buffer.readLine())!=null) {
	       System.out.println(lines);
               }
         fileread.close();
        } catch (IOException e) {
           System.out.println("ERROR: No se pudo abrir el archivo");
            
       }
     
    }
    
     public String readLine(String fileName)
    {
        
        java.io.File file =new java.io.File(fileName);
        String returnLines="";
        FileReader fileread;
        BufferedReader buffer;
        
           if (!file.exists()) {
              System.out.println("ERROR: El archivo no existe");
              return null;
              }
   
        try {
	   fileread = new FileReader(file);
	   buffer = new BufferedReader(fileread);
	   String lines;
         while((lines=buffer.readLine())!=null) {
	     returnLines=lines;
               }
         fileread.close();
        } catch (IOException e) {
           System.out.println("ERROR: No se pudo abrir el archivo");
            
       }
     return returnLines;
    }
    public String convertsToString(Person person)
    {
        String text;
        text=person.getSurname()+";"+person.getSalary()+";"+person.getHour()+";";
        
        return text;
    
    }
    
    public void exists(String fileName)
    { 
        File file =new File(fileName);
        if(fileName=="Person.csv" || fileName.equals("Person.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Surname;Salary;Hour";
                   this.save(fileName,text);
                  return;
             }
            }
        if(fileName=="Salary.csv" || fileName.equals("Salary.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Total Salary;IESS;Sale";
                   this.save(fileName,text);
                  return;
             }
            }
    }
}
