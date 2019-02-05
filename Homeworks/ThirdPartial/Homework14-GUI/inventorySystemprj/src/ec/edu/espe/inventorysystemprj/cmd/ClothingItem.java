package ec.edu.espe.inventorysystemprj.cmd;

import javax.swing.JOptionPane;

/**
 * @author TopCoders
 */

public class ClothingItem
{
    private float price;
    private int size;
    private int color;
    private int gender;
    private String type;
    private int quantity;
    /**
     * Method contructor that receives all the parameters that the class ClothingItem needs
     * @param type String receives the clothing type
     * @param price float receives the clothing's price 
     * @param size int receives the clothing's size 
     * @param color int receives the clothing's color
     * @param gender int receives the clothing's gender
     * @param quantity int receives the clothing's quantity
     */
    public ClothingItem(String type, float price, int size, int color, int gender,int quantity) {
        this.price = price;
        this.size = size;
        this.color = color;
        this.gender = gender;
        //this.type=type;
        this.quantity=quantity;
    }
    /**
     * Method contructor that receives only two parameters that the class ClothingItem needs
     * @param size int receives the clothing's size 
     * @param quantity int receives the clothing's quantity
     */
    public ClothingItem(int size,int quantity) {
        this.size = size;
        this.quantity=quantity;
    }
    
    /**
     * Method that show characteristics for the clothing that it has 
     */
    public void showInformation()
    {
        JOptionPane.showMessageDialog(null,"*************PRENDAS DE VESTIR***************"+
                "\nLa información de las prendas es la siguiente:"+
                "\nEl tipo de ropa es : " + this.type+
                "\nPrecio : " + String.valueOf(this.price));
         
         
         String size = "";
         switch(this.size)
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
         switch(this.color)
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
         switch(this.gender)
         {
             case 1:
                 gender="Hombre";
                 break;
             case 2:
                 gender="Mujer";
                 break;
         }
         JOptionPane.showMessageDialog(null,"Tamaño : "+ size+
                 "\nColor :" + color+
                 "\nLa prenda de vestir es para :" + gender+
                 "\nSolo tiene "+this.quantity+ " de existencias"+
                 "\n***********************************");
        
    }
    /**
     * Method that verify if the clothing's characteristics are equals
     * @param obj Object allows compare the parameters with the getters that obj 
     * @return the equality of parameters between the obj object and the class ClothingItem
     */
    @Override
    public boolean equals(Object obj) {
    ClothingItem c= (ClothingItem)obj;

    return ((this.quantity==c.getQuantity())&&(c.getType().equals(this.type))&&(c.getSize()==this.size)&&(c.getColor()==this.color)&&(c.getGender()==this.gender)&&(c.getPrice()==this.price));

    }
    
    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int clothesSize) {
        this.size = clothesSize;
    }    

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
 
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
         

}
