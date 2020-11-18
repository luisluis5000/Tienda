
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
public class loginSetGet {
    int id;
    String pass;
    int tipo;

    public loginSetGet() {
        this.id=0;
        this.pass="";
        this.tipo=0;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
