package negocio;
import datos.ProductoDAO;
import datos.Producto;
import datos.Libro;
import datos.Celular;
import datos.Television;
import datos.Licuadora;
import datos.Tostadora;
import datos.Calculadora;
public class TiendaDeRegalosService {
    private ProductoDAO productoDAO;

    public TiendaDeRegalosService(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    public void presentarse() {
        System.out.println("Bienvenido a la Tienda de Regalos");
    }

    public void agregarProducto(Producto producto) {
        productoDAO.agregarProducto(producto);
    }

    public void eliminarProducto(String nombreProducto) {
        productoDAO.eliminarProducto(nombreProducto);
    }

    public Producto buscarProducto(String nombreProducto) {
        return productoDAO.buscarProducto(nombreProducto);
    }

    public void listarProductos() {
        Producto[] productos = productoDAO.getProductos();
        System.out.println("Productos en inventario:");
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println("- " + producto.getIdProducto()+" "+producto.getNombre() + 
                                   ": $" + producto.getPrecio()+" "+producto.getDescripcion());
                System.out.println(producto);
            }
        }
    }

    public void venderProducto(String nombreProducto) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            eliminarProducto(nombreProducto);
            System.out.println("Producto vendido: " + nombreProducto);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

    

    public void actualizarPrecio(String nombreProducto, double nuevoPrecio) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
            productoDAO.actualizarProducto(producto);
            System.out.println("Precio actualizado para " + nombreProducto + ": $" + nuevoPrecio);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }
    public void aplicarDescuento(String nombreProducto, double porcentaje) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            producto.aplicarDescuento(porcentaje);
            productoDAO.actualizarProducto(producto);
            System.out.println("Descuento aplicado a " + nombreProducto + ": " + porcentaje + "%");
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

    public double calcularValorTotalProductos() {
        Producto[] productos = productoDAO.getProductos();
        double total = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }

    public void agregarLibro(String idProducto, String nombre, double precio, String descripcion
                            ,String autor, String editorial, int anioPublicacion, String genero, 
                            int numeroPaginas, String isbn)  {
        Libro libro = new Libro(idProducto, nombre, precio, descripcion, autor, editorial, 
                                anioPublicacion, genero, numeroPaginas, isbn) ;
         
        productoDAO.agregarProducto(libro);
    }

    public void agregarCelular(String idProducto, String nombre, double precio, String descripcion
                              ,String marca, String modelo, String color, int garantia, String voltaje
                              ,int numCamaras, String sistemaOperativo, int capacidadAlmacenamiento
                              ,int ram, String tipoPantalla) {
        Celular celular = new Celular(idProducto, nombre, precio, descripcion
                                    ,marca, modelo, color, garantia, voltaje
                                    ,numCamaras, sistemaOperativo, capacidadAlmacenamiento
                                    ,ram, tipoPantalla);
        productoDAO.agregarProducto(celular);
    }

    public void agregarTelevision(String idProducto, String nombre, double precio, String descripcion
                                ,String marca, String modelo, String color, int garantia, String voltaje
                                ,String tamanio, String resolucion, String tipoPantalla) {
        Producto producto = new Television(idProducto, nombre, precio, descripcion
                                            ,marca, modelo, color, garantia, voltaje
                                            ,tamanio,  resolucion, tipoPantalla);
        productoDAO.agregarProducto(producto);
    }

    public void agregarLicuadora(String idProducto, String nombre, double precio, String descripcion,
                                 String marca, String modelo, String color, int garantia, String voltaje,
                                 int potencia, int capacidad) {  
        Producto producto = new Licuadora(idProducto, nombre, precio, descripcion, marca, modelo, color, 
                                         garantia, voltaje, potencia, capacidad);
        productoDAO.agregarProducto(producto);
    }

   

    public void agregarTostadora(String idProducto, String nombre, double precio, String descripcion
                                ,String marca, String modelo, String color, int garantia, String voltaje
                                ,int numRanuras) {
        Producto producto = new Tostadora(idProducto, nombre, precio,  descripcion
                                        ,marca, modelo, color, garantia, voltaje
                                        ,numRanuras);
        productoDAO.agregarProducto(producto);
    }

    public void agregarCalculadora(String idProducto, String nombre, double precio, String descripcion
                                    ,String marca, String modelo, String color, int garantia
                                    ,String voltaje ,String tipo) {
        Producto producto = new Calculadora(idProducto, nombre, precio, descripcion
                                            ,marca, modelo, color, garantia
                                            ,voltaje ,tipo);
        productoDAO.agregarProducto(producto);
    }

}