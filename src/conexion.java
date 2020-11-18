
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZAYSER
 */
public class conexion {

 String url="mysql://uofjjtbw0qggphz9:ySoKAkzAqB9w5xdoJYyt@brwhhl0fuapmigwjogua-mysql.services.clever-cloud.com:3306/brwhhl0fuapmigwjogua";
 String user ="uofjjtbw0qggphz9";
 String pass="ySoKAkzAqB9w5xdoJYyt";

    PreparedStatement psPrepararSentencia;          //Creamos un objeto de tipo  PreparedStatement para los querys que queramos hacer a la BD
    Connection con = null; 
//Dentro del constructor de la clase, intentaremos conectarnos usando un try-catch para agarrar las excepciones
   
    public conexion() {
     try{   //Inicio del try
         
         Class.forName("com.mysql.cj.jdbc.Driver");     //Con el metodo de la clase forName, le pasamos el driver de MySQL para que lo cargue    
         con = DriverManager.getConnection("jdbc:"+url,user,pass);    //Apuntamos nuestro objeto con a el intento de conectarse con los parametros o las credenciales que tenemos en MYSQL
        //Aqui mandamos la url donde viene la direccion de la BD, nuestro nombre de usuario y la contraseña, que por defecto al instalar viene vacia
        if (con!=null){                         //Si logramos conectarnos, con deja de apuntar a null y obtenemos conexion
            System.out.println("Conexión a base de datos funcionando");                //Sin funciona imprimimos en consola un mensaje
         }
      }//cerramos el try
         catch(SQLException | ClassNotFoundException e )        //Agarramos excepciones de tipo SQL
         {
         System.out.println(e);          //las mostramos en consola
         }
     //las mostramos en consola
     //agarramos excepciones de tipo clase en java

    }
     /**
     *
     * @return
     */
 public Connection conectado(){  //Este metodo de tipo Connection nos devuelve el estado del objeto
      return con;
}

    public void desconectar(){     //Por seguridad, cuando terminemos sentencias, cerramos la conexion o si la necesitamos cerrar por otro caso
      con = null;                  //Ahora de nuevo con sera null
      System.out.println("La conexion la BD se ha cerrado");

    } 


    
    
}
