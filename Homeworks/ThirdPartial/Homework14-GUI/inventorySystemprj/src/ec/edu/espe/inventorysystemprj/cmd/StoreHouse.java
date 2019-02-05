package ec.edu.espe.inventorysystemprj.cmd;

import ec.edu.espe.inventorysystemprj.utils.FilePrj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author TopCoders
 */

public class StoreHouse {
    
   private int numberAdd=0;
   private int numberDelete; 
   
   
   public StoreHouse()
   {
   }
   /**
    * Method that add clothe to inventory system trough of file
    * @param clothes ClothinItem recieves all atributes of the class ClothingItem
    */
      public void addClothesToFile(ClothingItem clothes)
   {
       FilePrj file=new FilePrj();
       String text;
       String fileName="StoreHouse.csv";
       file.exists(fileName);
       text= file.convertsToString(clothes);
       file.save(fileName,text);
       JOptionPane.showMessageDialog(null,"Se ha agregado correctamente al archivo");
     
   } 
      /**
       * Method that add clothe to inventory system trough of file with all the characteristics 
       
   /**
    * Method that delete clothing to inventory system trough of file with all the characteristics 
    */
   public void deleteClothes(int option,int option2,int chooseQuantity)
   {
       ArrayList<String> staticTypes=new ArrayList<>();
       staticTypes.add("Cinturon");
       staticTypes.add("Gorro");
       staticTypes.add("Pantalon");
       staticTypes.add("Sombrero");
       staticTypes.add("Camisa");
       staticTypes.add("Chaqueta");
       staticTypes.add("Zapatos");
       
       FilePrj file=new FilePrj();
       file.read("StoreHouse.csv");
       //System.out.println("Envíe 1 para borrar la existencia un artículo");
       //System.out.println("Envíe 2 para ingresar la cantidad que se desea borrar de dicho artículo");

      if(option==1)
      {
          switch (option2)
          {
              case 1:
                  if(file.searchString("StoreHouse.csv", "Cinturon"))
                  {
                     file.deleteLine("Cinturon", "StoreHouse.csv");
                     JOptionPane.showMessageDialog(null,"Todos los cinturones fueron borrados exitosamente del almacén");
                     
                  }
                    break;
              case 2:
                  if(file.searchString("StoreHouse.csv", "Gorro"))
                  {
                     file.deleteLine("Gorro", "StoreHouse.csv");
                     JOptionPane.showMessageDialog(null,"Todos los gorros fueron borrados exitosamente del almacén");
                     
                  }
                  break;
              case 3:
                  if(file.searchString("StoreHouse.csv", "Pantalon"))
                  {
                    file.deleteLine("Pantalon", "StoreHouse.csv");
                    JOptionPane.showMessageDialog(null,"Todos los pantalones fueron borrados exitosamente del almacén");
                     
                  }
                  break;
              case 4:
                  if(file.searchString("StoreHouse.csv", "Sombrero"))
                  {
                    file.deleteLine("Sombrero", "StoreHouse.csv");
                    JOptionPane.showMessageDialog(null,"Todos los sombreros fueron borrados exitosamente del almacén");
                  
                  }
                  break;
              case 5:
                  if(file.searchString("StoreHouse.csv", "Camisa"))
                  {
                     file.deleteLine("Camisa", "StoreHouse.csv");
                     JOptionPane.showMessageDialog(null,"Todas las camisas fueron borradas exitosamente del almacén");

                  }
                  break;    
               case 6:
                   if(file.searchString("StoreHouse.csv", "Chaqueta"))
                  { 
                    file.deleteLine("Chaqueta", "StoreHouse.csv");
                    JOptionPane.showMessageDialog(null,"Todos las chaquetas fueron borrados exitosamente del almacén");
                        
                  }
                  break;        
               default:
                   JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                  
                   break;
          }     
          
      }
      else if(option==2)
      {
   
          ArrayList<ClothingItem>clothing= new ArrayList<>();
          
          switch (option2)
          {
              
              case 1:
                  if(file.searchString("StoreHouse.csv", staticTypes.get(0)))
                  {
                     
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", staticTypes.get(0));
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                           int i=1;
                           
                          
                          for(ClothingItem c:clothing)
                          {
                              JOptionPane.showMessageDialog(null,"************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op=0;
                          
                          do{
                              op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea"));
                          }while(op<=0);
                          
                          
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(--op) , -chooseQuantity);
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                              
                           }
                       }
                       
                  }
                    break;
              case 2:
                  if(file.searchString("StoreHouse.csv", "Gorro"))
                  {
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", staticTypes.get(1));
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                           int i=1;
                           
                           
                          for(ClothingItem c:clothing)
                          {
                          JOptionPane.showMessageDialog(null,"************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op=0;
                          
                          do{
                              op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea"));
                          }while(op<=0);
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(--op) , -chooseQuantity);
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                       }
                       
                  }
                  break;
              case 3:
                  if(file.searchString("StoreHouse.csv", "Pantalon"))
                  {
                     
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", staticTypes.get(2));
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                           int i=1;
                           
                           
                          for(ClothingItem c:clothing)
                          {
                              JOptionPane.showMessageDialog(null,"************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          
                        int op=0;
                          
                          do{
                              op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea"));
                          }while(op<=0);
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(--op) , -chooseQuantity);
                           } catch (IOException ex) {
                             JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                       }
                        
                  }
                  break;
              case 4:
                  if(file.searchString("StoreHouse.csv", "Sombrero"))
                  {
                   
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", staticTypes.get(3));
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                           int i=1;
                           
                           
                          for(ClothingItem c:clothing)
                          {
                              JOptionPane.showMessageDialog(null,"************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op=0;
                          
                          do{
                              op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea"));
                          }while(op<=0);
                        
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(--op) , -chooseQuantity);
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                       }
                  }
                  break;
              case 5:
                  if(file.searchString("StoreHouse.csv", "Camisa"))
                  {
                  
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", staticTypes.get(4));
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                           int i=1;
                           
                          for(ClothingItem c:clothing)
                          {
                              JOptionPane.showMessageDialog(null,"************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op=0;
                          
                          do{
                              op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea"));
                          }while(op<=0);
                        
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(--op) , -chooseQuantity);
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                              
                           }
                       }
                          
                  }
                  break;    
               case 6:
                   if(file.searchString("StoreHouse.csv", "Chaqueta"))
                  { 
                    
                        
                        
                        if(chooseQuantity>0)
                       {
                           
                           try {
                               clothing=file.searchClothes("StoreHouse.csv", staticTypes.get(5));
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                           int i=1;
                           
                           
                          for(ClothingItem c:clothing)
                          {
                              JOptionPane.showMessageDialog(null,"************Opcion "+i+" :************");
                              c.showInformation();
                              i++;
                          }
                          int op=0;
                          
                          do{
                              op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea"));
                          }while(op<=0);
                       
                           try {
                               file.changeQuantity("StoreHouse.csv",clothing.get(--op) , -chooseQuantity);
                           } catch (IOException ex) {
                               JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                               
                           }
                       }
                  }
                  break;        
               default:
                   JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
                    
                   break;
          }     
          
      }
      
      else
      {
          JOptionPane.showMessageDialog(null,"ERROR: Opción no válida, nada qué borrar");
           
      }
   }
   /**
    * Method that send warning when the quantity of clothing in the store house was short 
    * @return warning of the file that contains all the clothing
    * @throws IOException the method can handle exceptions of IOException type
    */
   public boolean makeAWarning() throws IOException
   {
       FilePrj file= new FilePrj();
       String fileName="StoreHouse.csv";
       return file.warning(fileName);
   }
     
 
    public int getClothesNumberAdd() {
        return numberAdd;
    }

    public void setClothesNumberAdd(int clothesNumberAdd) {
        this.numberAdd = clothesNumberAdd;
    }

    public int getClothesNumberDelete() {
        return numberDelete;
    }

    public void setClothesNumberDelete(int clothesNumberDelete) {
        this.numberDelete = clothesNumberDelete;
    }
}
