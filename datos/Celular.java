
package datos;
import negocio.Vendible;

public class Celular extends ProductoElectronico implements Vendible{
    private int numCamaras;
    private String sistemaOperativo;
    private int capacidadAlmacenamiento;
    private int ram;
    private String tipoPantalla;

    public Celular(String idProducto, String nombre, double precio, String descripcion
                    ,String marca, String modelo, String color, int garantia, String voltaje
                    ,int numCamaras, String sistemaOperativo, int capacidadAlmacenamiento, int ram, String tipoPantalla)
    {
        super(idProducto, nombre, precio, descripcion, marca, modelo, color, garantia, voltaje);
        this.numCamaras = numCamaras;
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.ram = ram;
        this.tipoPantalla = tipoPantalla;
    }

    public int getNumCamaras() {
        return numCamaras;
    }

    public void setNumCamaras(int numCamaras) {
        this.numCamaras = numCamaras;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
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