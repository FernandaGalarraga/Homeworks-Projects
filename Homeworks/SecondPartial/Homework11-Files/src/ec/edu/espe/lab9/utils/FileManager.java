/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;import java.io.BufferedWriter;



/**
 *
 * @author yazbe
 */
public class FileManager {
    
    private String name;
    private String text;
 
    
    
    public void save(String name, String text)
{
                File file = new File (name);
                try
                {
                    BufferedWriter bw;
                if(file.exists()){
                    bw = new BufferedWriter(new FileWriter(file,true));
                    bw.write(text);

                }else{
                    file.createNewFile();
                    bw = new BufferedWriter(new FileWriter(file,true));
                    bw.write(text);
                }
                bw.close();
         
                }catch (IOException e){}
                
                
}

    public FileManager(String name, String text) {
        this.name = name;
        this.text = text;
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

