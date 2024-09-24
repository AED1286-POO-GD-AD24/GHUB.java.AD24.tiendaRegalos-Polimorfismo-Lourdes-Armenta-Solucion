package datos;
public abstract class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    private String descripcion;


    public Producto(String idProducto, String nombre,  double precio,  String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto : "+ idProducto + ", " + nombre + ", $" + precio + ", " + descripcion;
    }
    
    public abstract String obtenerDetalles();

    public abstract boolean aplicarDescuento(double porcentaje);


}