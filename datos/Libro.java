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