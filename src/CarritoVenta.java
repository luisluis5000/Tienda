public class CarritoVenta
{
   private int venta, producto;
   float cantidad;

   
   //constructor
   public CarritoVenta(int venta, int producto, float cantidad)
   {   
      this.venta=venta;
      this.producto=producto;  
      this.cantidad=cantidad; 
   }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
  

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }


      
 
}