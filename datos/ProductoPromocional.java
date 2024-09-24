package datos;
import negocio.Vendible;

public class ProductoPromocional extends Producto implements Vendible{
    public ProductoPromocional(String idProducto, String nombre, double precio, String descripcion) {
        super(idProducto, nombre, precio, descripcion);
    }


    @Override
    public boolean esVendible() {
        return false; // Este producto no es vendible al público
    }

    @Override
    public double calcularPrecio() {
        return getPrecio(); // Retorna el precio original
    }

    // Calcula el precio con un descuento valido
    @Override
    public double calcularPrecio(double porcentaje) {
        if (aplicarDescuento(porcentaje)) {
            return getPrecio() - getPrecio() * (porcentaje / 100);
        }
        return getPrecio();
    }

   
    //a un producto promocional se le puede aplicar un descuento de hasta el 100%
    @Override
    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            
            return true;
        }
        return false;
    }


    @Override
    public String obtenerDetalles() {
        return "Nombre: " + getNombre() + ", Precio: " + getPrecio() + ", Descripción: " + getDescripcion();
    }

    
}
