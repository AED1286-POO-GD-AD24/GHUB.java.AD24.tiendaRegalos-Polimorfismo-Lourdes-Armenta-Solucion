package datos;

public class CamisetaPromocional extends ProductoPromocional {
    private String talla;
    private String color;

    public CamisetaPromocional(String idProducto, String nombre, double precio, String descripcion, 
                               String talla, String color) {
        super(idProducto, nombre, precio, descripcion);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Talla: " + talla + ", Color: " + color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Talla: " + talla + ", Color: " + color;
    }

    
}
