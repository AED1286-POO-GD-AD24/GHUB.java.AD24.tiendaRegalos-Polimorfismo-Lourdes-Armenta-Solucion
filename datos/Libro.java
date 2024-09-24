package datos;
import negocio.Vendible;
public class Libro extends ProductoLiterario implements Vendible{
    private String isbn;
    
    public Libro(String idProducto, String nombre, double precio, String descripcion
                        ,String autor, String editorial, int anioPublicacion, String genero, int numeroPaginas, String isbn) 
            {
                super(idProducto, nombre, precio, descripcion, autor, editorial, anioPublicacion, genero, numeroPaginas);
                this.isbn = isbn;

            }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //sobreescritura del metodo obtenerDetalles de la clase ProductoLiterario y
    //agregando el atributo isbn
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+"Libro [isbn=" + isbn + "]";
    }

    @Override
    //a un producto literario se le puede aplicar un descuento de hasta el 80%
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
       
        return true;//este producto es vendible al público
    }

    
    
    


}