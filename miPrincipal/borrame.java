package miPrincipal;

import datos.Inventario;
import datos.Libro;
import datos.Producto;
import datos.ProductoLiterario;
import datos.ProductoPromocional;
import negocio.TiendaDeRegalos;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class borrame {
    private static TiendaDeRegalos tienda;

    private static Producto producto1;
    private static Producto producto2;
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    //private final PrintStream originalOut = System.out;
    public static void main(String[] args) {

       

        tienda = new TiendaDeRegalos(20);
        tienda.setNombre("Tienda de Lulú");
        tienda.setDireccion("Culiacán, Sinaloa");

        producto1 = new ProductoLiterario("3", "Revista",50.00,"Revista National Geographic", "ProductoLiterario", 
                               "National Geographic Society", "Editorial", 2000, "Ciencia y Naturaleza",20);

       producto2 = new ProductoLiterario("2","LibroABC", 250,"Libro de prueba","ProductoLiterario",
                                     "autor","editorial",2000,"genero",0);

       tienda.agregarProducto(producto1);
       tienda.agregarProducto(producto2);
       System.setOut(new PrintStream(outContent));


        ProductoPromocional productoPromocional = new ProductoPromocional("9", "Camiseta Deportiva", 
        19.99, "Camiseta de algodón para deportes","ProductoPromocional");
        tienda.agregarProducto(productoPromocional);

        // Intentar vender el producto promocional
        tienda.venderProducto("Camiseta Deportiva");

        // Verificar que el producto sigue existiendo en el inventario
        assertNotNull(tienda.buscarProducto("Camiseta Deportiva"));

        // Verificar que no se imprimió el mensaje de producto vendido
       assertFalse(outContent.toString().contains("Producto vendido: Promo123"));
        

    
    }
    
}
