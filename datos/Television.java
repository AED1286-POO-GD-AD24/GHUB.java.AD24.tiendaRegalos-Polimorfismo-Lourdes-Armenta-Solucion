package datos;
import negocio.Vendible;

public class Television extends ProductoElectronico implements Vendible{
    private String tamanio;
    private String resolucion;
    private String tipoPantalla;

    public Television(String idProducto, String nombre, double precio, String descripcion
                    ,String marca, String modelo, String color, int garantia, String voltaje
                    ,String tamanio, String resolucion, String tipoPantalla)
    {
        super(idProducto, nombre, precio, descripcion, marca, modelo, color, garantia, voltaje);
        this.tamanio = tamanio;
        this.resolucion = resolucion;
        this.tipoPantalla = tipoPantalla;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
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