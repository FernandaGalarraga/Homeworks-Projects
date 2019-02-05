/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.inventorysystem.controller;

import ec.edu.espe.inventorysystemprj.cmd.ClothingItem;
import ec.edu.espe.inventorysystemprj.gui.SalesNoteFrame;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Josselyne Gutiérrez
 */
public class Table {
       public void showProducts (ArrayList<ClothingItem>clothes, JTable tblProducts){
       String matriz[][] = new String[clothes.size()][10];
                for (int i = 0; i < clothes.size(); i++) {

                    
                    clothes.get(i).getColor();
                    String size = "";
         switch(clothes.get(i).getSize())
         {
             case 1:
                 size="Small";
                 break;
             case 2:
                 size="Medium";
                 break;
             case 3:
                 size="Large";
                 break;
             case 4:
                 size="Extra Large";
                 break;
                 //Color
         }
         String color="";
         switch(clothes.get(i).getColor())
         {
             case 1:
                 color="Negro";
                 break;
             case 2:
                 color="Rojo";
                 break;
             case 3:
                 color="Café";
                 break;
         }
         String gender="";
         switch(clothes.get(i).getGender())
         {
             case 1:
                 gender="Hombre";
                 break;
             case 2:
                 gender="Mujer";
                 break;
         }
                    matriz[i][0] = String.valueOf(clothes.get(i).getQuantity());
                    matriz[i][1] = clothes.get(i).getType();
                    matriz[i][2] = size;
                    matriz[i][3] = color;
                    matriz[i][4] = gender;
                    matriz[i][5] = Float.toString(clothes.get(i).getPrice());
                    }
     tblProducts.setModel(new javax.swing.table.DefaultTableModel( matriz,new String []{"Cantidad","Tipo","Tamaño","Color","Género", "Precio"}));               
    }
       
     public void updateClothes(JComboBox cmbChoose) throws IOException{
        String line= null;
        String text;
        String fileName="StoreHouse.csv";
	ArrayList<String> types=new ArrayList<String>();
        File file = new File (fileName);
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
                         types.add(type);
                        
                     }
                 }
                 
             }catch (FileNotFoundException ex) {
                 Logger.getLogger(SalesNoteFrame.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println("Un error ha ocurrido intentelo de nuevo");
             }
         }
        Set<String> hs = new HashSet<>();
        hs.addAll(types);
        types.clear();
        types.addAll(hs);
        Iterator<String> it = types.iterator();
        while(it.hasNext()){
        String item=it.next();
        cmbChoose.addItem(item.toString());
        }   
    }
     
    
    
     public ClothingItem getInfoTable(JTable tblProducts)
     {
         ClothingItem clothes =new ClothingItem(0,0);
         clothes.setQuantity(Integer.parseInt(tblProducts.getValueAt(tblProducts.getSelectedRow(), 0).toString()));
         clothes.setType(tblProducts.getValueAt(tblProducts.getSelectedRow(), 1).toString());
         switch(tblProducts.getValueAt(tblProducts.getSelectedRow(),2).toString())
                 {
                   case "Small":
                        clothes.setSize(1);
                        break;
                    case "Medium":
                        clothes.setSize(2);
                        break;
                    case "Large":
                        clothes.setSize(3);
                        break;
                    case "Extra Large":
                        clothes.setSize(4);
                        break;  
                   }
         
         
         switch(tblProducts.getValueAt(tblProducts.getSelectedRow(),3).toString())
         {
             case "Negro":
                 clothes.setColor(1);
                 break;
             case "Rojo":
                 clothes.setColor(2);
                 break;
             case "Café":
                 clothes.setColor(3);
                 break;
         }
         switch(tblProducts.getValueAt(tblProducts.getSelectedRow(),4).toString())
         {
             case "Hombre":
                 clothes.setGender(1);
                 break;
             case "Mujer":
                 clothes.setGender(2);
                 break;
         }
         clothes.setPrice(Float.parseFloat(tblProducts.getValueAt(tblProducts.getSelectedRow(), 5).toString()));
        
         return clothes;
      
     }
       
       
}
