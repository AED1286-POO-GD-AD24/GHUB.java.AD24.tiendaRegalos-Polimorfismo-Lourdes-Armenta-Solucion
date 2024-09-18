package datos;
import negocio.Vendible;

public class Calculadora extends ProductoElectronico  implements Vendible{
    private String tipo;

    public Calculadora(String idProducto, String nombre, double precio, String descripcion
                       ,String marca, String modelo, String color, int garantia, 
                       String voltaje ,String tipo) {

        super(idProducto, nombre, precio, descripcion, marca, modelo, color, garantia, voltaje);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles();
    }

    @Override
    public boolean aplicarDescuento(double porcentaje) {
    
        return false;
    }

    @Override
    public String toString() {
    
        return super.toString();
    }

    @Override
    public double calcularPrecio() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calcularPrecio(double porcentaje) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean esVendible() {
        // TODO Auto-generated method stub
        return false;
    }


    

    
}