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
                //System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
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

    public void agregarLibro(String nombre, double precio, String titulo,String autor, int paginas) {
        Libro libro = new Libro(nombre, autor, precio, titulo, autor, autor, paginas, autor, paginas, autor);
        productoDAO.agregarProducto(libro);
    }

    public void agregarCelular(String nombre, double precio, String marca, String modelo) {
        Celular celular = new Celular(nombre, modelo, precio, marca, modelo, modelo, modelo, 0, modelo, 0, modelo, 0, 0, modelo);
        productoDAO.agregarProducto(celular);
    }

    public void agregarTelevision(String nombre, double precio, String tamanio, String resolucion) {
        Producto producto = new Television(nombre, resolucion, precio, tamanio, resolucion, resolucion, resolucion, 0, resolucion, resolucion, resolucion, resolucion);
        productoDAO.agregarProducto(producto);
    }

    public void agregarLicuadora(String idProducto, String nombre, double precio, String descripcion,
                                 String marca, String modelo, String color, int garantia, String voltaje,
                                 int potencia, int capacidad) {  
        Producto producto = new Licuadora(idProducto, nombre, precio, descripcion, marca, modelo, color, 
                                         garantia, voltaje, potencia, capacidad);
        productoDAO.agregarProducto(producto);
    }

   

    public void agregarTostadora(String nombre, double precio, int ranuras, String color) {
        Producto producto = new Tostadora(nombre, color, precio, color, color, color, color, ranuras, color, ranuras);
        productoDAO.agregarProducto(producto);
    }

    public void agregarCalculadora(String nombre, double precio, String tipo) {
        Producto producto = new Calculadora(nombre, tipo, precio, tipo, tipo, tipo, tipo, 0, tipo, tipo);
        productoDAO.agregarProducto(producto);
    }

}