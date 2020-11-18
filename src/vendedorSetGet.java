
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZAYSER
 */
public class vendedorSetGet {

    int id;
    String nomb;
    String ape;
 

    public vendedorSetGet() {
        this.id=0;
        this.nomb="";
        this.ape="";

    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
 public float getStringToFloat(String x)throws NumberFormatException, NullPointerException
   {
   float f=0.0f;
   try{ 
       f=Float.parseFloat(x);
       }
      catch(NumberFormatException er){
         JOptionPane.showMessageDialog(null,"haz intentado intrudir un valor diferente a un floatante ");

         }         
       catch(NullPointerException er){
         JOptionPane.showMessageDialog(null,"te faltan campos por llenar");

         } 
  
      return f;    
   
   }
   
   public int getStringToInt( String x)throws NumberFormatException, NullPointerException 
   {
   int i= 0;
   
   try{
       i=Integer.parseInt(x);     

      }
      catch(NumberFormatException er){
         JOptionPane.showMessageDialog(null,"haz intentado intrudir un valor diferente a un entero ");

         } 
       catch(NullPointerException er){
         JOptionPane.showMessageDialog(null,"te faltan campos por llenar");

         }   
         return i; 
   }     

    void id(int stringToInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
