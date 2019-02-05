package ec.edu.espe.inventorysystemprj.cmd;
import ec.edu.espe.inventorysystemprj.utils.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 
 * @author TopCoders
 */

public class SalesNote {
    
    private float moneyReceived;
    private float moneyChange;
    private float moneyTotalToPay;
    private String dateStatus;
    private int clothesQuantity;
    private ClothingItem[] clothes;
    



    public SalesNote() {
    }
    /**
     * Method that allows buy clothing, showing all the characteristics that each clothing, and store the amount to be paid
     */
    public void addClothes(){
       int option=0;
       int counterId=0;
       float acummulator=0;
       FilePrj file=new FilePrj();
       
       int option2;
       Scanner sc =new Scanner(System.in);
       ArrayList<ClothingItem>clothing= new ArrayList<>();
       do
       {
          System.out.println("Artículos disponibles para vender, escoja uno para añadir a la nota de venta");
          System.out.println("1) Cinturón");
          System.out.println("2) Gorro");
          System.out.println("3) Pantalón");
          System.out.println("4) Sombrero");
          System.out.println("5) Camisa");    
          System.out.println("6) Chaqueta");  
          System.out.println("7) Salir");
          try
          {
              option2=sc.nextInt();

          }catch(Exception ex){
             System.out.println("ERROR: Opción no válida");
             return;
          }
          int chooseQuantity=0;
          String name="StoreHouse.csv";
          switch (option2)
          {
              
              case 1:
                  if(file.searchString("StoreHouse.csv", "Cinturon"))
                  {
                       System.out.println("Elija cuantos desea comprar");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Cinturon");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea comprar:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           try {
                               
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                    break;
              case 2:
                  if(file.searchString("StoreHouse.csv", "Gorro"))
                  {
                    chooseQuantity=0;
                   System.out.println("Elija cuantos desea comprar");
                             try
                            {
                                chooseQuantity=sc.nextInt();

                            }catch(Exception ex){
                               System.out.println("ERROR: Opción no válida");
                               return;
                            }

                             if(chooseQuantity>0)
                            {

                                try {
                                    clothing=file.searchClothes("StoreHouse.csv", "Gorro");
                                } catch (IOException ex) {
                                    System.out.println("ERROR: Opción no válida");
                                }
                                int i=1;

                                System.out.println("Escoja que prenda desea comprar:");
                               for(ClothingItem c:clothing)
                               {
                                   System.out.println("**************************************");
                                   System.out.println("************Opcion "+i+" :************");
                                   c.showInformation();
                                   i++;
                               }
                               int op;
                             try
                             {
                                op=sc.nextInt();

                            }catch(Exception ex){
                               System.out.println("ERROR: Opción no válida");
                               return;
                            }
                             op--;
                                try {
                                    file.changeQuantity("StoreHouse.csv",clothing.get(op) ,-chooseQuantity);
                                } catch (IOException ex) {
                                    System.out.println("ERROR: Opción no válida");
                                }
                                try {
                                    acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);

                                            } catch (IOException ex) {
                                    System.out.println("ERROR: Opción no válida");
                                }
                            }
                       }
                       
                  break;
              case 3:
                  if(file.searchString("StoreHouse.csv", "Pantalon"))
                  {
             chooseQuantity=0;
                     System.out.println("Elija cuantos desea comprar");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Pantalon");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea comprar:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida, nada qué borrar");
                           }
                           try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                  
                  break;
              case 4:
                  if(file.searchString("StoreHouse.csv", "Sombrero"))
                  {
                    chooseQuantity=0;
                     System.out.println("Elija cuantos desea comprar");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Sombrero");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea comprar:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                  break;
              case 5:
                  if(file.searchString("StoreHouse.csv", "Camisa"))
                  {

                    chooseQuantity=0;
                     System.out.println("Elija cuantos desea comprar");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida, nada qué borrar");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Camisa");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea comprar:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  
                  }
                      
                  break;    
               case 6:
                   if(file.searchString("StoreHouse.csv", "Chaqueta"))
                  { 
                    chooseQuantity=0;
                     System.out.println("Elija cuantos desea comprar");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Chaqueta");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea comprar:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                                System.out.println("ERROR: Opción no válida");
                           }
                           try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                  
                  break; 
               case 7:
                   System.out.println("Gracias por utilizar este servicio");
                   break;
               default:
                    System.out.println("ERROR: Opción no válida");
                   break;
          }
       }while(option2!=7);
       this.setMoneyTotalToPay(acummulator);
       this.acumulateMoney();
    }

    /**
     * Method that allows delete clothes of the store house, deleting the system, showing all the characteristics that each clothing
     */
   public void deleteClothes()
   {
       FilePrj file= new FilePrj();
       int option2;
       float acummulator=0;
       Scanner sc =new Scanner(System.in);
       ArrayList<ClothingItem>clothing= new ArrayList<>();
       do
       {
          System.out.println("Artículos disponibles para vender, escoja uno para eliminar de la nota de venta");
          System.out.println("1) Cinturon");
          System.out.println("2) Gorro");
          System.out.println("3) Pantalon");
          System.out.println("4) Sombrero");
          System.out.println("5) Camisa");    
          System.out.println("6) Chaqueta");  
          System.out.println("7) Salir");
          try
          {
              option2=sc.nextInt();

          }catch(Exception ex){
             System.out.println("ERROR: Opción no válida");
             return;
          }
          int chooseQuantity=0;
          switch (option2)
          {
              
              case 1:
                  if(file.searchString("StoreHouse.csv", "Cinturon"))
                  {
                       System.out.println("Elija cuantos desea devolver");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Cinturon");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea devolver:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , chooseQuantity);
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                    break;
              case 2:
                  if(file.searchString("StoreHouse.csv", "Gorro"))
                  {
                    chooseQuantity=0;
                   System.out.println("Elija cuantos desea devolver:");
                             try
                            {
                                chooseQuantity=sc.nextInt();

                            }catch(Exception ex){
                               System.out.println("ERROR: Opción no válida");
                               return;
                            }

                             if(chooseQuantity>0)
                            {

                                try {
                                    clothing=file.searchClothes("StoreHouse.csv", "Gorro");
                                } catch (IOException ex) {
                                    System.out.println("ERROR: Opción no válida");
                                }
                                int i=1;

                                System.out.println("Escoja que prenda desea devolver:");
                               for(ClothingItem c:clothing)
                               {
                                   System.out.println("**************************************");
                                   System.out.println("************Opcion "+i+" :************");
                                   c.showInformation();
                                   i++;
                               }
                               int op;
                             try
                             {
                                op=sc.nextInt();

                            }catch(Exception ex){
                               System.out.println("ERROR: Opción no válida");
                               return;
                            }
                             op--;
                                try {
                                    file.changeQuantity("StoreHouse.csv",clothing.get(op) ,-chooseQuantity);
                                } catch (IOException ex) {
                                    System.out.println("ERROR: Opción no válida");
                                }
                                try {
                                    acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);

                                            } catch (IOException ex) {
                                    System.out.println("ERROR: Opción no válida");
                                }
                            }
                       }
                       
                  break;
              case 3:
                  if(file.searchString("StoreHouse.csv", "Pantalon"))
                  {
             chooseQuantity=0;
                     System.out.println("Elija cuantos desea devolver:");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Pantalon");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea devolver:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida, nada qué borrar");
                           }
                           try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                  
                  break;
              case 4:
                  if(file.searchString("StoreHouse.csv", "Sombrero"))
                  {
                    chooseQuantity=0;
                     System.out.println("Elija cuantos desea devolver:");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Sombrero");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea devolver:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                  break;
              case 5:
                  if(file.searchString("StoreHouse.csv", "Camisa"))
                  {
                      if(file.searchString("StoreHouse.csv", "Camisa"))
                  {
                    chooseQuantity=0;
                     System.out.println("Elija cuantos desea comprar");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida, nada qué borrar");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Camisa");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea devolver:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                  }
                      
                  break;    
               case 6:
                   if(file.searchString("StoreHouse.csv", "Chaqueta"))
                  { 
                    chooseQuantity=0;
                     System.out.println("Elija cuantos desea comprar");
                        try
                       {
                           chooseQuantity=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", "Camisa");
                           } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                           int i=1;
                           
                           System.out.println("Escoja que prenda desea comprar:");
                          for(ClothingItem c:clothing)
                          {
                              System.out.println("**************************************");
                              System.out.println("************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op;
                        try
                        {
                           op=sc.nextInt();

                       }catch(Exception ex){
                          System.out.println("ERROR: Opción no válida");
                          return;
                       }
                        op--;
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(op) , -chooseQuantity);
                           } catch (IOException ex) {
                                System.out.println("ERROR: Opción no válida");
                           }
                                      try {
                               acummulator=acummulator+this.computeTotal(file.readPrice("StoreHouse.csv",clothing.get(op)),chooseQuantity);
                                
                                       } catch (IOException ex) {
                               System.out.println("ERROR: Opción no válida");
                           }
                       }
                  }
                  break;
                  case 7:
                   System.out.println("Gracias por utilizar este servicio");
                   break;
               default:
                    System.out.println("ERROR: Opción no válida");
                   break;
          }
       }while(option2!=7);
       this.setMoneyTotalToPay(getMoneyTotalToPay()-acummulator);
      this.acumulateMoney();
   }
   /**
    * Method that compute the change asking the customer to enter the amount with which he will paye
    * @return show the change to paid
    */
    public float computeChange()
    {
        this.moneyChange=getMoneyReceived()-getMoneyTotalToPay();
        System.out.println("El cambio es de : "+moneyChange);
        return moneyChange;
            
    }
     /**
      * Method that show the actual date, day, month, and year
      * @return a String with the actual date with the structure dd/mm/yy
      */
    public String date()
    {
        Calendar date = new GregorianCalendar();
        
         return "Fecha: "+date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR)+".";
    }   
    
     /**
      * Method that compute the number of ticket for the sales note, following an ascending order
      * @return the number of ticket
      */
    public int computeNumberTicket()
    {
       ArrayList<String> lastTicket = new ArrayList<String>();
        int ticket=0;
        FilePrj file= new FilePrj();
        String fileName="Ticket.txt";
        file.exists(fileName);
        lastTicket=file.readTicket(fileName);
        String text;
        text=lastTicket.get(0).toString();
        text.replaceAll(" ", "");
        text.replaceAll("\n","");
        ticket=Integer.parseInt(text);
        ticket++;
        
        file.modify(text,  String.valueOf(ticket), fileName);
        
        return ticket;
    }
    /**
     * Method that compute the total money, receiving two paremeters
     * @param price float receives the price the each clothing 
     * @param quantitySold int receives the quantity sold of clothing
     * @return total money
     */
    public float computeTotal(float price, int quantitySold)
    {
        
        return quantitySold*price;
    }
    /**
     * Method that save the accumulated money for the profits report
     */
    public void acumulateMoney(){
        
        ArrayList<String> salesMoney = new ArrayList<String>();
        float sales=0;
        FilePrj file= new FilePrj();
        String fileName="SalesMoney.csv";
        file.exists(fileName);
        salesMoney=file.readTicket(fileName);
        String text;
        text=salesMoney.get(0).toString();
        text.replaceAll(" ", "");
        text.replaceAll("\n","");
        sales=Float.parseFloat(text);
        sales=sales+this.moneyTotalToPay;
        file.modify(text,  String.valueOf(sales), fileName);
    }
    
    public float getMoneyReceived() {
        return moneyReceived;
    }

    public void setMoneyReceived(float moneyReceived) {
        this.moneyReceived = moneyReceived;
    }

 
    public float getMoneyChange() {
        return moneyChange;
    }

    public void setMoneyChange(float moneyChange) {
        this.moneyChange = moneyChange;
    }

    public float getMoneyTotalToPay() {
        return moneyTotalToPay;
    }

    public void setMoneyTotalToPay(float moneyTotalToPay) {
        this.moneyTotalToPay = moneyTotalToPay;
    }


    public String getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(String dateStatus) {
        this.dateStatus = dateStatus;
    }
    
    public int getClothesQuantity() {
        return clothesQuantity;
    }

    public void setClothesQuantity(int clothesQuantity) {
        this.clothesQuantity = clothesQuantity;
    }
    
}
