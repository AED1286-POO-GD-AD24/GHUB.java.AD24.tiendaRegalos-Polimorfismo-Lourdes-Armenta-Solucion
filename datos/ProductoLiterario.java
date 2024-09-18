package datos;

public abstract class ProductoLiterario extends Producto{
    private String autor;
    private String editorial;
    private int anioPublicacion;
    private String genero;
    private int numeroPaginas;
    public ProductoLiterario(String idProducto, String nombre, double precio, String descripcion
                        ,String autor, String editorial, int anioPublicacion, String genero, int numeroPaginas) {
        super(idProducto, nombre, precio, descripcion);
        this.autor = autor;
        this.editorial = editorial;  
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;

    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String obtenerDetalles() {
        return "ProductoLiterario [autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", editorial=" + editorial + ", genero=" + genero
                + ", numeroPaginas=" + numeroPaginas + "]";
    }
    
}
