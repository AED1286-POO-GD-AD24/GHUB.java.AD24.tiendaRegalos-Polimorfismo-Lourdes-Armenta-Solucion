package datos;
import negocio.Vendible;

public class Tostadora extends ProductoElectroDomestico implements Vendible{
    private int numRanuras;
    
    public Tostadora(String idProducto, String nombre, double precio, String descripcion
                        ,String marca, String modelo, String color, int garantia, String voltaje
                        ,int numRanuras) {
        super(idProducto, nombre, precio, descripcion, marca, modelo, color, garantia, voltaje);
        this.numRanuras = numRanuras;
    }

    public int getNumRanuras() {
        return numRanuras;
    }

    public void setNumRanuras(int numRanuras) {
        this.numRanuras = numRanuras;
    }


    @Override
    public String obtenerDetalles() {
        // TODO Auto-generated method stub
        return super.obtenerDetalles();
    }


    @Override
    public boolean aplicarDescuento(double porcentaje) {
        // TODO Auto-generated method stub
        return false;
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