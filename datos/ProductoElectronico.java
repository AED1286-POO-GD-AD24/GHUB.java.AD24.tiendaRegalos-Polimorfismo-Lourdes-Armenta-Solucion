package datos;

public abstract class ProductoElectronico  extends Producto{
    private String marca;
    private String modelo;
    private String color;
    private int garantia;
    private String voltaje;
    public ProductoElectronico(String idProducto, String nombre, double precio, String descripcion
                        ,String marca, String modelo, String color, int garantia, String voltaje) {
        super(idProducto, nombre, precio, descripcion);
        this.marca = marca;
        this.modelo = modelo;  
        this.color = color;
        this.garantia = garantia;
        this.voltaje = voltaje;

    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getGarantia() {
        return garantia;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    public String getVoltaje() {
        return voltaje;
    }
    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String obtenerDetalles() {
        return "ProductoElectronico [color=" + color + ", garantia=" + garantia + ", marca=" + marca + ", modelo=" + modelo
                + ", voltaje=" + voltaje + "]";
    }
    
}
