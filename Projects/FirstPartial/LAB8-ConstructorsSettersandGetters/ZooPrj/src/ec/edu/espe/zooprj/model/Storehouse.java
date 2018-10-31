/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zooprj.model;

/**
 *
 * @author MegaSystem
 */
public class Storehouse {
    private boolean clothesStock;
    private int clothesNumberAdd;
    private int clothesNumberDelete;
    private int clothesSoldNumber;
    private int restoredClothesNumber;

    /**
     * @return the clothesStock
     */
    public boolean isClothesStock() {
        return clothesStock;
    }

    /**
     * @param clothesStock the clothesStock to set
     */
    public void setClothesStock(boolean clothesStock) {
        this.clothesStock = clothesStock;
    }

    /**
     * @return the clothesNumberAdd
     */
    public int getClothesNumberAdd() {
        return clothesNumberAdd;
    }

    /**
     * @param clothesNumberAdd the clothesNumberAdd to set
     */
    public void setClothesNumberAdd(int clothesNumberAdd) {
        this.clothesNumberAdd = clothesNumberAdd;
    }

    /**
     * @return the clothesNumberDelete
     */
    public int getClothesNumberDelete() {
        return clothesNumberDelete;
    }

    /**
     * @param clothesNumberDelete the clothesNumberDelete to set
     */
    public void setClothesNumberDelete(int clothesNumberDelete) {
        this.clothesNumberDelete = clothesNumberDelete;
    }

    /**
     * @return the clothesSoldNumber
     */
    public int getClothesSoldNumber() {
        return clothesSoldNumber;
    }

    /**
     * @param clothesSoldNumber the clothesSoldNumber to set
     */
    public void setClothesSoldNumber(int clothesSoldNumber) {
        this.clothesSoldNumber = clothesSoldNumber;
    }

    /**
     * @return the restoredClothesNumber
     */
    public int getRestoredClothesNumber() {
        return restoredClothesNumber;
    }

    /**
     * @param restoredClothesNumber the restoredClothesNumber to set
     */
    public void setRestoredClothesNumber(int restoredClothesNumber) {
        this.restoredClothesNumber = restoredClothesNumber;
    }

    public Storehouse(boolean clothesStock, int clothesNumberAdd, int clothesNumberDelete, int clothesSoldNumber, int restoredClothesNumber) {
        this.clothesStock = clothesStock;
        this.clothesNumberAdd = clothesNumberAdd;
        this.clothesNumberDelete = clothesNumberDelete;
        this.clothesSoldNumber = clothesSoldNumber;
        this.restoredClothesNumber = restoredClothesNumber;
    }
    
}
