package ec.edu.espe.inventorysystemprj.cmd;
import ec.edu.espe.inventorysystemprj.utils.FilePrj;
import java.io.IOException;
import java.util.Scanner;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 * @author TopCoders
 */
public class InventorySystemPrj {

    public static String getMasterPass() {
        return masterPass;
    }

    public static String getSellerPass() {
        return sellerPass;
    }

 
    public static String getStorePass() {
        return storePass;
    }


    private static StoreHouse storeHouse;
    private static Customer customer;
    private static SalesNote salesNote;
    private static ProfitsReport profitsReport;
    private static boolean oldClient=false;
    private static boolean validClient=false;
    
    
    //ANTIGUO MAIN
  /*  public static void main(String[] args) {
       
        FilePrj file=new FilePrj();
        int option;
        storeHouse=new StoreHouse();
        customer=new Customer();
        salesNote = new SalesNote(); 
        profitsReport=new ProfitsReport();
        
        System.out.println("*******SISTEMA DE INVENTARIO DE ROPA*********");
        System.out.println("TopCoders © 2018");
        
        try {
            storeHouse.makeAWarning();
        } catch (IOException ex) {
            Logger.getLogger(InventorySystemPrj.class.getName()).log(Level.SEVERE, null, ex);
        }

        
           do{
             try{
           System.out.println("\t\t\tElija una opción por favor"
                                                + "\n"       
                                                +"\n**CONTROL DE ALMACEN**"   
                                                + "\n1) Añadir contenido del Almacén"
                                                + "\n2) Borrar contenido del Almacén"
                                                + "\n3) Ver contenido del Almacén"
                                                + "\n"     
                                                +"\n**NOTA DE VENTA**"   
                                                + "\n4) Añadir producto para la nota de venta."
                                                + "\n5) Borrar producto para la nota de venta."
                                                + "\n6) Añadir cliente "
                                                + "\n7) Pedir nota de venta"
                                                +"\n\n**GANANCIAS**"  
                                                + "\n8) Imprimir reporte"
                                                +"\n9) Salir"
                                                + "\n");
             option=9;
             try{
             Scanner enter = new Scanner(System.in);
             option=enter.nextInt();
             }catch(Exception ex)
             {
                 System.out.println("ERROR: Opción incorrecta");
                 
             }
             }catch(NumberFormatException ex){
                 
                 return;
             }
           
           switch (option){
               case 1: 
                   storeHouse.addNewClothes();
                   
                   break;
               case 2:
                   storeHouse.deleteClothes();
                   break;
               case 3:
                {
                    try {
                        file.readClothes("StoreHouse.csv");
                    } catch (IOException ex) {
                        System.out.println("ERROR");
                    }
                }
                   
                          break;
               case 4:
                   if(!oldClient)
                   {
                      customer=customerInformation();
                      oldClient=true;
                       if(customer==null)
                        {
                           System.out.println("Hubo un error dentro del registro");
                           oldClient=false;
                        }
                       else
                       {
                         oldClient=true;
                      }
                   }
                   else
                   {
                       salesNote.addClothes();
                   }
                  
                   break;
               case 5: 
 
                   if(!oldClient)
                   {
                  
                          customer=customerInformation();
                          if(customer==null)
                          {
                              System.out.println("Hubo un error dentro del registro");
                              oldClient=false;
                          }
                          else
                          {
                             oldClient=true;
                          }
                    
                      System.out.println("Tiene que agregar ropa para comprar antes de borrar");
                   }
                   else
                   {
                       salesNote.deleteClothes();
                   }
                  
                   break;
               case 6:
                    if(!oldClient)
                   {
                      customer=customerInformation();
                      oldClient=true;
                       if(customer==null)
                        {
                           System.out.println("Hubo un error dentro del registro");
                           oldClient=false;
                        }
                       else
                       {
                         oldClient=true;
                      }
                   }
                   break;
                   
                case 7:
                    reportSalesNote();
                    
                   break;
                 case 8:
                    String fileName="SalesMoney.csv";
                    file.exists(fileName);
                    float sales;
                    float investment;
                    {
                        try {
                            sales=file.readSalesMoney(fileName);
                            System.out.println("El dinero recaudado por ventas es: \n"+sales);
                            profitsReport.setTotalOfSalesMoney(sales);
                        } catch (IOException ex) {
                        }
                    }
                     System.out.println("Por favor ingrese sus  gastos e inversiones para poder calcular sus ganancias");
                    do
                    {
                    try
                    {
                        Scanner sc = new Scanner(System.in);
                         investment=sc.nextFloat();
                         profitsReport.setInvestment(investment);
                    }catch(Exception ex)
                    {
                        System.out.println("ERROR: Número no válido");  
                        investment=-1;
                    }
                    }while(investment<0);
                     System.out.println("Las ganancias obtenidas son:"+profitsReport.computeProfits());
                    
                     break;
                 case 9:
                      System.out.println("Muchas Gracias por preferirnos :)");  
                   break;                   
               default:System.out.println("ERROR: Opción incorrecta");
           }
            }while(option!=9);
        }

   */ public static Customer customerInformation()
    {
        Customer register=new Customer();
        String getData=null;
        int id;
        long number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido, por favor ingrese los siguientes datos a continuación");
        System.out.println("Ingrese su cédula de identidad");
        try{
            id=sc.nextInt();
        }catch(Exception ex){
            System.out.println("ERROR: Número no válido");
            return null;
        }
         if(!register.setId(id))
        {
           return null;
        }
        register.setId(id);
        String id2=""+id;
        FilePrj file= new FilePrj();
        String fileName="Customer.csv";
        if(file.searchString(fileName, id2)){
            try{
                register=file.searchCustomer(fileName, id2);
            }catch(IOException ex){
                System.out.println("ERROR: No hay ningún cliente");
            }
        }else{
         System.out.println("Ingrese su nombre");
        getData=sc.next();
        if(!register.setNameAndSurname(getData))
        {
            return null;     
        }
        register.setNameAndSurname(getData);
        System.out.println("Ingrese su teléfono"); 
          try
        {
        number=sc.nextLong();
        }catch(Exception ex)
        {
            System.out.println("ERROR: Número no válido");  
            return null;
        }
          if(!register.setPhone(number))
        {
           return null;
        }
        register.setPhone(number); 
        System.out.println("Ingrese su dirección de domicilio");        
        getData=sc.next();
        register.setAddress(getData);
        register.addCostumerToFile();
        }
        System.out.println("Gracias por registrarse, "+register.getNameAndSurname()+ ". Disfrute de su compra");          
        return register;      
    }
    
    public static void reportSalesNote()
    {
        System.out.println("*******SISTEMA DE INVENTARIO DE ROPA*********");
        System.out.println("TopCoders © 2018");
        System.out.println("Su nombre: ");
        
       if(!oldClient)
       {
           System.out.println("ERROR: Usted no está registrado");
       }
       else
       {
            System.out.println("*******SISTEMA DE INVENTARIO DE ROPA*********");
            System.out.println("TopCoders © 2018");
            customer.showInformation();
            System.out.println("La fecha de hoy es: "+salesNote.date());
            System.out.println("# NOTA DE VENTA: 00"+salesNote.computeNumberTicket());
            System.out.println("El total a pagar es: "+salesNote.getMoneyTotalToPay());
            salesNote.computeChange();
        
       }

        
    }
    public static String cript(String text) {
 
        String secretKey = "topCodersKey";
        String base64EncryptedString = "";
        try {
 
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = text.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);
 
        } catch (Exception ex) {
        }
        return base64EncryptedString;
}
    
    public static String decript(String textCript) throws Exception {
 
        String secretKey = "topCodersKey";
        String base64EncryptedString = "";
 
        try {
            byte[] message = Base64.decodeBase64(textCript.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            base64EncryptedString = new String(plainText, "UTF-8");
 
        } catch (Exception ex) {
        }
        return base64EncryptedString;
}
   private static  String masterPass="wpH5vwWNlurZiNfcBP12QQ==";
    private static String sellerPass="xr73/Wu7/II=";
    private static String storePass="e+bBPfA78DP66614DrxygA==";
  }


