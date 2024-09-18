package datos;
import negocio.Vendible;

public class Licuadora extends Producto implements Vendible{
    private int potencia;
    private int capacidad;

    public Licuadora(String idProducto, String nombre, double precio, String descripcion
                        ,int potencia, int capacidad) {
        super(idProducto, nombre, precio, descripcion);
        this.potencia = potencia;
        this.capacidad = capacidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public boolean aplicarDescuento(double porcentaje) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String obtenerDetalles() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
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