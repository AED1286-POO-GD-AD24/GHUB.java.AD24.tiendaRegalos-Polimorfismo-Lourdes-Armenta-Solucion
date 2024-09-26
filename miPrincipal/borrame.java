package miPrincipal;

import datos.Inventario;
import datos.Libro;
import negocio.TiendaDeRegalos;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class borrame {
    public static void main(String[] args) {
        //

    TiendaDeRegalos tienda;
    Libro producto1;
    Libro producto2;
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    final PrintStream originalOut = System.out;

    //inventario = new Inventario(7);

    //creo una Tienda de regalos con capacidad para 20 productos
    tienda = new TiendaDeRegalos(20);
    tienda.setNombre("Tienda de Lulú");
    tienda.setDireccion("Culiacán, Sinaloa");

    producto1 = new Libro("3", "Revista",50.00,"Revista National Geographic", "ProductoLiterario", 
                           "National Geographic Society", "Editorial", 2000, "Ciencia y Naturaleza",20,"ISBN");

   producto2 = new Libro("2","LibroABC", 250,"Libro de prueba","ProductoLiterario",
                                 "autor","editorial",2000,"genero",0,"ISBN");

   tienda.agregarProducto(producto1);
   tienda.agregarProducto(producto2);
   
  
   //System.setOut(new PrintStream(outContent));

   System.out.println("lo busco"+tienda.buscarProducto("LibroABC").getNombre());
   tienda.venderProducto("LibroABC");
    System.out.println("lo busco de nuevo"+tienda.buscarProducto("LibroABC").getNombre());

   
        //tienda.venderProducto("LibroABC");
        //tienda.buscarProducto("LibroABC");
        outContent.toString().contains("Producto vendido: LibroABC");


    }
    
}
