/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab25.utils;

import ec.edu.espe.lab25.cmd.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 *
 * @author Fernanda Galárraga
 */
public class FilePrj {
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
      
    public void exists(String fileName)
    { 
        File file =new File(fileName);
       
        if(fileName=="Product.csv" || fileName.equals("Product.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Id;Name;Price;Percent;PVP";
                   this.save(fileName,text);
                  return;
             }
            }
    }
    
    public String convertsToString(Product product)
    {
        String text;
        text=product.getId()+";"+product.getName()+";"+product.getPrice()+";"+product.getPercent()+";"+product.getPvp();
        
        return text;
    }
    
    

    
     public ArrayList<Product> readProduct(String fileName) throws IOException{
           ArrayList<Product> product=new ArrayList<>();
            String line= null;
            String text;
            File file = new File (fileName);
            
            int cont=0;
             if(file.exists()){
                 try {
                     BufferedReader read = new BufferedReader(new FileReader(fileName));
                     while((line=read.readLine())!=null)
                     {
                         Product product1= new Product();
                         cont++;
                         StringTokenizer mistokens = new StringTokenizer(line, ";");
                         String id= mistokens.nextToken().trim();
                         String name =  mistokens.nextToken().trim();
                         String price =  mistokens.nextToken().trim();
                         String percent =  mistokens.nextToken().trim();
                         String pvp =  mistokens.nextToken().trim();

                         if (cont!=1)
                         {
                         product1.setId(Integer.parseInt(id));
                         product1.setName(name);
                         product1.setPrice(Float.parseFloat(price));
                         product1.setPercent(Float.parseFloat(percent));
                         product1.setPvp(Float.parseFloat(pvp));
                         product.add(product1);
                         }
                         
                    }                 
                    } catch (FileNotFoundException ex) {
                        
                 }

             }
        return product;
     }
}
