package ec.edu.espe.inventorysystemprj.cmd;
import ec.edu.espe.inventorysystemprj.utils.*;

import javax.swing.JOptionPane;
/**
 * @author TopCoders
 */
public class Customer {
    
    private String nameAndSurname;
    private long id;
    private long phone;
    private String address;
    private final int idSize=10;
    
/**
 * Method that show personal information that the customer has 
 */    
public void showInformation()
{
    System.out.println("*************Cliente***************");
    System.out.println("La información del cliente es:");
    System.out.println("Nombre: " +nameAndSurname);
    System.out.println("La cedula de identidad o ruc es: " +id);
    System.out.println("El telefono es: "+phone);
    System.out.println("La dirección de domicilio es:" +address);
    System.out.println("***********************************");
}

/**
 * Method that verify if the customer's id is correct or not
 * @param id int receives the customer's id 
 * @return if the id is true or not
 */
    public boolean setId(int id) {
       
           boolean isValid;
           isValid=id(id);
           if(!isValid)
           {
            JOptionPane.showMessageDialog(null,"NÚMERO DE CÉDULA INCORRECTA","¡ERROR!",JOptionPane.ERROR_MESSAGE);
             return false;
           }
           else
           {
               this.id=id;
               return true;
           }

    }

  /**
   * Method that create the customer's information in a file 
   */
  public void addCostumerToFile()
   {
        String text;
           FilePrj file =new FilePrj();
           file.exists("Customer.csv");
           text=file.convertsToString(this);
           file.save("Customer.csv",text);
           JOptionPane.showMessageDialog(null, "Se ha agregado un cliente correctamente");
   } 

    public long getPhone() {
        return phone;
    }

    public boolean setPhone(long phone) {
        if (phone<100000000l || phone>999999999l)
        {
        JOptionPane.showMessageDialog(null,"NÚMERO DE TELÉFONO NO VÁLIDO","¡ERROR!",JOptionPane.ERROR_MESSAGE);
        
             return false;
        }
        
        this.phone = phone;
        return true;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  
    public void digit_id(int[] v,int siz,int id)
       {
            for(int i=(siz-1);i>=0;i--)
            {
              v[i]=(int)id%10;
              id=id/10;
            }
        } 
       
       
      public void initId(int[] v,int siz)
        {
            int a;
            for(a=0;a<siz;a++)
            {
                v[a]=0;
            }
        }
      /**
       * Method that valide the customer's id 
       * @param v int[] receives a array, for fill the other variables with their stored value
       * @param last int receives the last value
       * @param tam int 
       * @return if the validation is true or false
       */
       public boolean validateId(int v[],int tam,int last)
        {
            int r1=0;
            int add=0;
            int r2=0;
            int add3=0;
            int res=0;
            int digval=0;
            int resul=0;
            for(int i=0;i<=8;i+=2)
            {
                r1=v[i]*2;
                if(r1>9)
                {
                    r1=r1-9;
                }
                add=r1+add;

            }
            for(int i=1;i<=7;i+=2)
            {
                r2=r2+v[i];
            }
            add=r2+add;
            resul=add;
            res=((add/10)+1)*10;
            digval=res-resul;
            if (digval==10)
            {
                digval=0;
            }
            if (digval==last)
            {
                return true;

            }
            else
            {
                return false;
            }

        }
        /**
         * Method that compare the expected Id with the real Id obtained
         * @param expectedId int 
         * @return if the Id is valid or not 
         */
       public boolean id(int expectedId)
        {
            int[] ced=new int[idSize];
            int ul;
            int stat;
            int idU;
            boolean valid;
            try{
                 do
                 {
                        idU=expectedId;
                     initId(ced,idSize);
                      digit_id(ced,idSize,expectedId);
                 } while((((ced[0]*10)+(ced[1]))<1 || ((ced[0]*10)+(ced[1]))>24) && (ced[idSize] > 99999999));
                     
            }catch(ArrayIndexOutOfBoundsException ex)
            {
                  return false;
            }
                ul=ced[9];
                valid=validateId(ced,idSize,ul);

                if (valid)
                {
                        return true;

                }
                else
                {
                        return false;
                }
        }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public boolean setNameAndSurname(String nameAndSurname) {
        if(nameAndSurname.matches("[a-zA-Z][a-zA-Z ]*"))  
        {
            this.nameAndSurname = nameAndSurname;
            return true;
        }
        else
        {
              JOptionPane.showMessageDialog(null,"Un nombre no puede contener números","¡ERROR!",JOptionPane.ERROR_MESSAGE);
              return false;
        }

    }

    public long getId() {
        return id;
    }

       
}
