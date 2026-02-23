public class Elemento extends Carrito{
    String nombreProduct;
    double precio;
    int cantidad;
    public Elemento(String nombreProduct, double precio, int cantidad) {
        this.nombreProduct = nombreProduct;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    
    public String getNombreProduct() {
        return nombreProduct;
    }


    public void setNombreProduct(String nombreProduct) {
        this.nombreProduct = nombreProduct;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return this.nombreProduct+" "+this.precio+" "+this.cantidad;
    }
   
}
