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

    //sobreescritura del metodo obtenerDetalles de la clase ProductoElectronico y
    //agregando el atributo tipo
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+"Calculadora [tipo=" + tipo + "]";
    }

    @Override
    public boolean aplicarDescuento(double porcentaje) {
        if (super.aplicarDescuento(porcentaje)){
           this.setPrecio(this.getPrecio()-this.getPrecio()*(porcentaje/100));
           return true;
        }
        else
            return false;  
         
    }

    @Override
    public String toString() {
    
        return super.toString()+", tipo:" + tipo ;
    }

    @Override
    public double calcularPrecio() {
        
        return 0;
    }

    @Override
    public double calcularPrecio(double porcentaje) {
        return 0;
    }

    @Override
    public boolean esVendible() {
        
        return true;//este producto es vendible al público
    }
    
    

    


    

    
}