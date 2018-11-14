/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab11.model;
import ec.edu.espe.Lab11.model.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Jazz Gutierrez/Fernanda Galárraga
 */
public class File {
    private String name;
    private String text;

    public File(String name, String text) {
        this.name = name;
        this.text = text;
    }
    public String convert(){
        Mammal mammal =new Mammal(0,0,0,""); 
        int validation;
        do
        {
            System.out.println("Enter the arrival year");
            Scanner a = new Scanner(System.in);
            mammal.setArrivalYear(a.nextInt());
            validation=mammal.validation(mammal.getArrivalYear());
        
        }while (validation==1);
         
        mammal.computeYearsOfStay(mammal.getArrivalYear());
        String text;
        text=mammal.getNumberOfNipple()+";"+mammal.getId()+";"+mammal.getArrivalYear()+";"+mammal.getScientificName()+";\n";
        return text;
}

public String convert(Mammal mammal)
{       
        String text;
        text=mammal.getNumberOfNipple()+";"+mammal.getId()+";"+mammal.getArrivalYear()+";"+mammal.getScientificName()+";\n";
        return text;
}
    public void save(String name, String text){
                java.io.File file = new java.io.File (name);
                try
                {
                    BufferedWriter bw;
                if(file.exists()){
                    bw = new BufferedWriter(new FileWriter(file,true));
                    bw.write(text);
                    System.out.println("The text is writen");
                }else{
                    bw = new BufferedWriter(new FileWriter(file,true));
                    bw.write(text);
                    System.out.println("The file is created and the text is writen");
                }
                bw.close();
         
                }catch (IOException e){}
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
 
}
