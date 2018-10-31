/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprj;
import ec.edu.espe.zooprj.model.Storehouse;
/**
 *
 * @author Fernanda Galarraga
 */
public class ZooPrj {

    /**
     * @param args the command line arguments
     */
   private static String name="Fernanda";
    
    public static void main(String[] args) {
        System.out.println("Hi my name is " + name);
        Storehouse storehouse = new Storehouse(true, 1, 2, 50, 2);
        System.out.println("El stock de la ropa es: " + storehouse.isClothesStock()
        + " La cantidad de ropa añadida es: " + storehouse.getClothesNumberAdd()
        + "La cantidad de ropa eliminada es: " + storehouse.getClothesNumberDelete()
        + "La cantidad de ropa vendidad es: " + storehouse.getClothesSoldNumber()
        + "La cantidad de ropa restaurada es: " + storehouse.getRestoredClothesNumber());
    }
}
