package ec.edu.espe.inventorysystemprj;

/**
 * @author TopCoders
 */

public class StoreHouse {

    public StoreHouse(boolean clothesStock, int clothesNumberAdd, int clothesNumberDelete, int clothesSoldNumber, int restoredClothesNumber) {
        this.clothesStock = clothesStock;
        this.clothesNumberAdd = clothesNumberAdd;
        this.clothesNumberDelete = clothesNumberDelete;
        this.clothesSoldNumber = clothesSoldNumber;
        this.restoredClothesNumber = restoredClothesNumber;
    }

    public boolean isClothesStock() {
        return clothesStock;
    }


    public void setClothesStock(boolean clothesStock) {
        this.clothesStock = clothesStock;
    }

    public int getClothesNumberAdd() {
        return clothesNumberAdd;
    }

    public void setClothesNumberAdd(int clothesNumberAdd) {
        this.clothesNumberAdd = clothesNumberAdd;
    }

    public int getClothesNumberDelete() {
        return clothesNumberDelete;
    }

    public void setClothesNumberDelete(int clothesNumberDelete) {
        this.clothesNumberDelete = clothesNumberDelete;
    }

    public int getClothesSoldNumber() {
        return clothesSoldNumber;
    }

    public void setClothesSoldNumber(int clothesSoldNumber) {
        this.clothesSoldNumber = clothesSoldNumber;
    }

    public int getRestoredClothesNumber() {
        return restoredClothesNumber;
    }

    public void setRestoredClothesNumber(int restoredClothesNumber) {
        this.restoredClothesNumber = restoredClothesNumber;
    }
    
   private boolean clothesStock;
   private int clothesNumberAdd;
   private int clothesNumberDelete;
   private int clothesSoldNumber;
   private int restoredClothesNumber;
   
   public void addNewClothes()
   {
       
   }
   
   public void deleteClothes()
   {
       
   }
   
   public boolean makeAWarning()
   {
       return true;
   }
    
}
