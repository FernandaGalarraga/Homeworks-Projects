package ec.edu.espe.inventorysystemprj.utils;
import ec.edu.espe.inventorysystemprj.cmd.ClothingItem;
import ec.edu.espe.inventorysystemprj.cmd.Customer;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 * @author TopCoders
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
          System.out.println("ERROR: No se pudo escribir en el archivo");
        }
       
    }
    
    public void read(String fileName)
    {
        
        File file =new File(fileName);
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
        
        File file =new File(fileName);
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
    
    public float readSalesMoney(String fileName) throws FileNotFoundException, IOException
    {
        String line= null;
        File file = new File (fileName);
        float sales=0;
        int cont=0;
        if(file.exists()){
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            while((line=read.readLine())!=null)
            {
                StringTokenizer mistokens = new StringTokenizer(line, ";");
                String salesMoney= mistokens.nextToken().trim();
                sales=Float.parseFloat(salesMoney);
                return sales;
            }
        } catch (FileNotFoundException ex) 
            {
                Logger.getLogger(FilePrj.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Un error ha ocurrido intentelo de nuevo");
            }
    }
    return sales;
      
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
    
    
        public String convertsToString(ClothingItem clothes)
    {
        String text;
        text=clothes.getQuantity()+";"+clothes.getType()+";"+clothes.getSize()+";"+clothes.getColor()+";"+clothes.getGender()+";"+clothes.getPrice()+";";
        
        return text;
    
    }
        
    
        public void changeQuantity(String fileName, ClothingItem clothesS, int quantityDelete) throws IOException
{
    String line= null;
    File file = new File (fileName);
    ClothingItem clothes= new ClothingItem(0,0);
    int cont=0;
    if(file.exists()){
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            while((line=read.readLine())!=null){
                cont++;
                StringTokenizer mistokens = new StringTokenizer(line, ";");
                String quantity= mistokens.nextToken().trim();
                String type =  mistokens.nextToken().trim();
                String size =  mistokens.nextToken().trim();
                String color =  mistokens.nextToken().trim();
                String gender =  mistokens.nextToken().trim();
                String price =  mistokens.nextToken().trim();
               
                if (cont!=1)
                {
                clothes.setQuantity(Integer.parseInt(quantity));
                clothes.setType(type);
                clothes.setSize(Integer.parseInt(size));
                clothes.setColor(Integer.parseInt(color));
                clothes.setGender(Integer.parseInt(gender));
                clothes.setPrice(Float.parseFloat(price));
                
                
                if(clothesS.equals(clothes))
                {
                    clothes.setQuantity(clothes.getQuantity()+(quantityDelete));
                    String oldText, newText;
                    newText=this.convertsToString(clothes);
                    oldText=this.convertsToString(clothesS);
                    this.modify(oldText,newText,fileName);
                    break;
                }
            }    
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePrj.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Un error ha ocurrido, inténtelo de nuevo");
        }
    }  
}
        
    public void modify(String oldText, String newText ,String name)
    {
         try
            {
                    BufferedReader a = new BufferedReader(new FileReader(name));
                    String line;
                    String input = "";
                    while ((line = a.readLine()) != null) 
                    {
                        input = input + line + "\n";
                    }

                    input=input.replace(oldText,newText);
                    FileOutputStream getText = new FileOutputStream(name);
                    getText.write(input.getBytes());
                    a.close();
                    getText.close();

            }
            catch (IOException e)
            {
               System.out.println("Un error a ocurrido, inténtelo más tarde");
            }

    }
       
       public void deleteLine(String delete, String file){        
      try
        {
                BufferedReader rd = new BufferedReader(new FileReader(file));
                String line;
                String input = "";
                while ((line = rd.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(delete))
                    {
                        //espacio
                        line = "\n";
                    }
                    input += line;
                }
                FileOutputStream getText = new FileOutputStream(file);
                getText.write(input.getBytes());
                rd.close();
                getText.close();       
        }
        catch (Exception e)
        {
           System.out.println("ERROR: No se pudo abrir el archivo");
        }
      }
    
    public ArrayList<String> readTicket(String fileName)
        {

            File file =new File(fileName);
            FileReader fileread;
            BufferedReader buffer;
            ArrayList<String> text = new ArrayList<String>();
               if (!file.exists()) {
                  System.out.println("ERROR: El archivo no existe");
                  return text;
                  }
            try {
               fileread = new FileReader(file);
               buffer = new BufferedReader(fileread);
               String lines;
             while((lines=buffer.readLine())!=null) {
                   text.add(lines);
                   }
             fileread.close();
            } catch (IOException e) {
               System.out.println("ERROR: No se pudo abrir el archivoo");
           }
        return text;
        }

        public void exists(String fileName)
    { 
        File file =new File(fileName);
        if(fileName=="Ticket.txt" || fileName.equals("Ticket.txt"))
            {
               if (!file.exists()) {
                  this.save(fileName,"0");
                  return;
             }
            }
        if(fileName=="StoreHouse.csv" || fileName.equals("StoreHouse.csv")
        || fileName=="Sales.csv" || fileName.equals("Sales.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Quantity;Tipe;Size;Color;Gender;Price";
                   this.save(fileName,text);
                  return;
             }
            }
        if(fileName=="SalesMoney.csv" || fileName.equals("SalesMoney.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="0";
                   this.save(fileName,text);
                  return;
             }
            }
        if(fileName=="Customer.csv" || fileName.equals("Customer.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="NameAndSurname;Id;Phone;Address";
                   this.save(fileName,text);
                  return;
             }
         }
    }
        
          public String convertsToString(Customer person)
    {
        String text;
        text=person.getNameAndSurname()+";"+person.getId()+";"+person.getPhone()+";"+person.getAddress()+";";
        
        return text;
    
    }
    public void outLine(String fileName, String request)
    {
         File file =new File(fileName);
          if (!file.exists()) {
              return;
              }
         try {
          BufferedReader rd = new BufferedReader(new FileReader(fileName));
          String line = "";
          
          while((line = rd.readLine())!= null){
              if(line.indexOf(request)!= -1){
                   System.out.println(line);
                 } 
         
            }
            rd.close();
        }catch (Exception e) {
             e.printStackTrace();  }
    }


   public ArrayList<ClothingItem> searchClothes(String fileName,String request) throws IOException{
       ArrayList<ClothingItem> clothing=new ArrayList<>();
        String line= null;
        String text;
        File file = new File (fileName);
       int cont=0;
         if(file.exists()){
             try {
                 BufferedReader read = new BufferedReader(new FileReader(fileName));
                 while((line=read.readLine())!=null)
                 {
                     ClothingItem clothes= new ClothingItem(0,0);
                     cont++;
                     StringTokenizer mistokens = new StringTokenizer(line, ";");
                     String quantity= mistokens.nextToken().trim();
                     String type =  mistokens.nextToken().trim();
                     String size =  mistokens.nextToken().trim();
                     String color =  mistokens.nextToken().trim();
                     String gender =  mistokens.nextToken().trim();
                     String price =  mistokens.nextToken().trim();

                     if (cont!=1)
                     {
                     clothes.setQuantity(Integer.parseInt(quantity));
                     clothes.setType(type);
                     clothes.setSize(Integer.parseInt(size));
                     clothes.setColor(Integer.parseInt(color));
                     clothes.setGender(Integer.parseInt(gender));
                     clothes.setPrice(Float.parseFloat(price));
                         text=clothes.getType();
                         boolean bool = (text.equals(request)||(text==request));      
                     if(text.equals(request)||(text==request))
                     {
                        clothing.add(clothes);
                        if(((line=read.readLine())==null))
                        {
                        return clothing;
                        }
                     }
                     }
                 }
                 
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(FilePrj.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println("Un error ha ocurrido intentelo de nuevo");
             }
         }
    return clothing;
}
   
       public float readPrice(String fileName, ClothingItem clothesS) throws IOException
{
    String line= null;
    File file = new File (fileName);
    ClothingItem clothes= new ClothingItem(0,0);
    float price1=0;
   int cont=0;
    if(file.exists()){
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            while((line=read.readLine())!=null)
            {
                cont++;
                StringTokenizer mistokens = new StringTokenizer(line, ";");
                String quantity= mistokens.nextToken().trim();
                String type =  mistokens.nextToken().trim();
                String size =  mistokens.nextToken().trim();
                String color =  mistokens.nextToken().trim();
                String gender =  mistokens.nextToken().trim();
                String price =  mistokens.nextToken().trim();
               
                if (cont!=1)
                {
                clothes.setQuantity(Integer.parseInt(quantity));
                clothes.setType(type);
                clothes.setSize(Integer.parseInt(size));
                clothes.setColor(Integer.parseInt(color));
                clothes.setGender(Integer.parseInt(gender));
                clothes.setPrice(Float.parseFloat(price));
                price1=Float.parseFloat(price);
                    if(clothesS.equals(clothes))
                    {
                        return price1;
                    }
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePrj.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Un error ha ocurrido intentelo de nuevo");
        }
        
    }
    return price1;
        
}

   
    public boolean warning(String fileName) throws IOException{
        boolean result=false;
        String line= null;
    File file = new File (fileName);
    ClothingItem clothes= new ClothingItem(0,0);
   int cont=0;
    if(file.exists()){
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            while((line=read.readLine())!=null)
            {
                cont++;
                StringTokenizer mistokens = new StringTokenizer(line, ";");
                String quantity= mistokens.nextToken().trim();
                String type =  mistokens.nextToken().trim();
                String size =  mistokens.nextToken().trim();
                String color =  mistokens.nextToken().trim();
                String gender =  mistokens.nextToken().trim();
                String price =  mistokens.nextToken().trim();
               
                if (cont!=1)
                {
                clothes.setQuantity(Integer.parseInt(quantity));
                clothes.setType(type);
                clothes.setSize(Integer.parseInt(size));
                clothes.setColor(Integer.parseInt(color));
                clothes.setGender(Integer.parseInt(gender));
                clothes.setPrice(Float.parseFloat(price));

                if (clothes.getQuantity()<=3)
                {
                    System.out.println("*******************ALERTA*******************");
                    System.out.println("Este producto está por terminar");
                    clothes.showInformation();
                    result=true;
                }
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePrj.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Un error ha ocurrido intentelo de nuevo");
        }
       
    }
    return result;
}    

   public ArrayList<ClothingItem> readClothes(String fileName) throws IOException{
            ArrayList<ClothingItem> clothing=new ArrayList<>();
            String line= null;
            String text;
            File file = new File (fileName);
            int cont=0;
             if(file.exists()){
                 try {
                     BufferedReader read = new BufferedReader(new FileReader(fileName));
                     while((line=read.readLine())!=null)
                     {
                         ClothingItem clothes= new ClothingItem(0,0);
                         cont++;
                         StringTokenizer mistokens = new StringTokenizer(line, ";");
                         String quantity= mistokens.nextToken().trim();
                         String type =  mistokens.nextToken().trim();
                         String size =  mistokens.nextToken().trim();
                         String color =  mistokens.nextToken().trim();
                         String gender =  mistokens.nextToken().trim();
                         String price =  mistokens.nextToken().trim();

                         if (cont!=1)
                         {
                         clothes.setQuantity(Integer.parseInt(quantity));
                         clothes.setType(type);
                         clothes.setSize(Integer.parseInt(size));
                         clothes.setColor(Integer.parseInt(color));
                         clothes.setGender(Integer.parseInt(gender));
                         clothes.setPrice(Float.parseFloat(price));
                         clothing.add(clothes);
                         }
                         
                    }                 
                    } catch (FileNotFoundException ex) {
                    Logger.getLogger(FilePrj.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Un error ha ocurrido intentelo de nuevo");
                 }

             }
             return clothing;
    }
   public Customer searchCustomer(String fileName,String request) throws IOException{
       ArrayList<ClothingItem> clothing=new ArrayList<>();
        String line= null;
        String text;
        File file = new File (fileName);
       int cont=0;
       Customer customer= null;
         if(file.exists()){
             try {
                 BufferedReader read = new BufferedReader(new FileReader(fileName));
                 while((line=read.readLine())!=null)
                 {
                     customer=new Customer();
                     cont++;
                     StringTokenizer mistokens = new StringTokenizer(line, ";");
                     String name= mistokens.nextToken().trim();
                     String id=  mistokens.nextToken().trim();
                     String phone =  mistokens.nextToken().trim();
                     String address =  mistokens.nextToken().trim();
                     
                     if (cont!=1)
                     {
                     customer.setNameAndSurname(name);
                     customer.setId(Integer.parseInt(id));
                     customer.setPhone(Integer.parseInt(phone));
                     customer.setAddress(address);
                         text=""+customer.getId();
                         
                     if(text.equals(request)||(text==request))
                     {
                        return customer;  
                     }
                     }
                 }
                 
             } catch (FileNotFoundException ex) {
                 
                 System.out.println("Un error ha ocurrido intentelo de nuevo");
             }
         }
    return customer;
    } 
   
    public ArrayList<Customer> readCustomer(String fileName) throws IOException{
            ArrayList<Customer> customer=new ArrayList<>();
            String line= null;
            String text;
            File file = new File (fileName);
            int cont=0;
             if(file.exists()){
                 try {
                     BufferedReader read = new BufferedReader(new FileReader(fileName));
                     while((line=read.readLine())!=null)
                     {
                         Customer user= new Customer();
                         cont++;
                         StringTokenizer mistokens = new StringTokenizer(line, ";");
                         String name= mistokens.nextToken().trim();
                         String id =  mistokens.nextToken().trim();
                         String phone =  mistokens.nextToken().trim();
                         String address =  mistokens.nextToken().trim();
                         

                         if (cont!=1)
                         {
                         user.setNameAndSurname(name);
                         user.setId(Integer.parseInt(id));
                         user.setPhone(Integer.parseInt(phone));
                         user.setAddress(address);
                         customer.add(user);
                         }
                         
                    }                 
                    } catch (FileNotFoundException ex) {
                    Logger.getLogger(FilePrj.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Un error ha ocurrido intentelo de nuevo");
                 }

             }
             return customer;
    }
   
       public void deleteFile(String fileName) throws IOException {
        File file = new File(fileName);
        
        if (file.delete()) {
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        } else {
            file.deleteOnExit();
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("");
            bw.close();
            System.out.println("El fichero no pudó ser borrado");
        }
    }

   
   
}

