package ui;

import negocio.TiendaDeRegalosService;
import datos.Licuadora;
import datos.ProductoDAO;

import java.util.Scanner;

public class Menu {
    private TiendaDeRegalosService tiendaService;

    public Menu() {
        ProductoDAO productoDAO = new ProductoDAO(100); // Capacidad del inventario
        this.tiendaService = new TiendaDeRegalosService(productoDAO);
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    tiendaService.presentarse();
                    break;
                case 2:
                    //
                    break;
                case 3:{
                   int tipo = sel_FamiliaProducto(scanner);
                   agregarProducto(scanner,tipo);
                    break;
                }
                case 4:
                    eliminarProducto(scanner);
                    break;
                case 5:
                    listarProductos();
                    break;
                case 6:
                    venderProducto(scanner);
                    break;
                case 7:
                    actualizarPrecio(scanner);
                    break;
                case 8:
                    aplicarDescuento(scanner);
                    break;
                case 9:
                    calcularValorTotalProductos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        scanner.close();
    }
    private void mostrarMenu() {
        System.out.println("\n--- Menú de Tienda de Regalos ---");
        System.out.println("1. Presentarse");
        System.out.println("2. Mostrar Familia de Producto");
        System.out.println("3. Agregar Producto");
        System.out.println("4. Eliminar Producto");
        System.out.println("5. Listar Productos");
        System.out.println("6. Vender Producto");
        System.out.println("7. Actualizar Precio");
        System.out.println("8. Aplicar Descuento");
        System.out.println("9. Calcular valor total de productos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");

    }
    
    private int sel_FamiliaProducto(Scanner scanner){
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Electrodoméstico");
        System.out.println("2. Electrónico");
        System.out.println("3. Literario");
        System.out.println("4. Promocionales");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int famProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        return famProducto;
    }

   
    private void captura_Electrodomestico(Scanner scanner){
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Licuadora");
        System.out.println("2. Tostadora");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        return tipoProducto;
    }
    
    private void captura_Electronico(Scanner scanner){
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Licuadora");
        System.out.println("2. Tostadora");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        return tipoProducto;
    }
    
    private void captura_literario(Scanner scanner){
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Licuadora");
        System.out.println("2. Tostadora");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        return tipoProducto;
    }
    
    

    
    
    private void captura_Promocionales(Scanner scanner){
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Licuadora");
        System.out.println("2. Tostadora");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        return tipoProducto;
    }

    private void agregarProducto(Scanner scanner,int famProducto){

        
        
        if(famProducto == 0){
            return;
        }
        //solicitar datos comunes
        
        System.out.println("Ingrese el Id del producto: ");
        String idProducto = scanner.nextLine();
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.println("Ingrese la descripcion del producto");
        String descripcion = scanner.nextLine();
        switch(famProducto){
            case 1://Electrodomestico
            {
                
                System.out.println("Ingrese la marca del producto");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el modelo del producto");
                String modelo = scanner.nextLine();
                System.out.println("Ingrese el color del producto");
                String color = scanner.nextLine();
                System.out.println("Ingrese la garantia del producto");
                int garantia = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese el voltaje del producto");
                int voltaje = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese la capacidad del producto");
                int capacidad = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                //tiendaService.agregarLicuadora(idProducto, nombre, precio, descripcion, marca, modelo, color, garantia, voltaje, capacidad);
                System.out.println("Licuadora agregada exitosamente.");
                break;
            }
            case 2://Electronico
            {
                System.out.println("Ingrese la marca del producto");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el modelo del producto");
                String modelo = scanner.nextLine();
                System.out.println("Ingrese el color del producto");
                String color = scanner.nextLine();
                System.out.println("Ingrese la garantia del producto");
                int garantia = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese el voltaje del producto");
                int voltaje = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese la capacidad del producto");
                int capacidad = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                //tiendaService.agregarLicuadora(idProducto, nombre, precio, descripcion, marca, modelo, color, garantia, voltaje, capacidad);
                System.out.println("Licuadora agregada exitosamente.");
                break;
            }
            case 3://Literario
            {
                System.out.println("Ingrese la marca del producto");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el modelo del producto");
                String modelo = scanner.nextLine();
                System.out.println("Ingrese el color del producto");
                String color = scanner.nextLine();
                System.out.println("Ingrese la garantia del producto");
                int garantia = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese el voltaje del producto");
                int voltaje = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese la capacidad del producto");
                int capacidad = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                //tiendaService.agregarLicuadora(idProducto, nombre, precio, descripcion, marca, modelo, color, garantia, voltaje, capacidad);
                System.out.println("Licuadora agregada exitosamente.");
                break;
            }
            case 4://Promocionales
            {
                System.out.println("Ingrese la marca del producto");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el modelo del producto");
                String modelo = scanner.nextLine();
                System.out.println("Ingrese el color del producto");
                String color = scanner.nextLine();
                System.out.println("Ingrese la garantia del producto");
                int garantia = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese el voltaje del producto");
                int voltaje = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese la capacidad del producto");
                int capacidad = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                //tiendaService.agregarLicuadora(idProducto, nombre, precio, descripcion, marca, modelo, color, garantia, voltaje, capacidad);
                System.out.println("Licuadora agregada exitosamente.");
                break;
            }
        
            default:
                System.out.println("Tipo de producto no válido.");
                return;

        }

    }

    private void agregarProducto2(Scanner scanner) {
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Libro");
        System.out.println("2. Televisor");
        System.out.println("3. Celular");
        System.out.println("4. Calculadora");
        System.out.println("5. Licuadora");
        System.out.println("6. Tostadora");
      
        System.out.println("0. Cancelar/Terminar");
        
        System.out.print("Ingrese el número correspondiente al tipo de producto: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        //Datos comunes del producto
        System.out.println("Ingrese el Id del producto: ");
        String idProducto = scanner.nextLine();
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.println("Ingrese la descripcion del producto");
        String descripcion = scanner.nextLine();

        switch (tipoProducto) {
            case 1:
                
                
                System.out.print("Ingrese el titulo del libro: ");
                String titulo= scanner.nextLine();
                System.out.print("Ingrese el autor del libro: ");
                String autor = scanner.nextLine();
                System.out.print("Ingrese el número de páginas del libro: ");
                int paginas = scanner.nextInt();

                tiendaService.agregarLibro(nombre, precio, titulo,autor, paginas);
                System.out.println("Libro agregado exitosamente.");
                
                break;
            case 2:
                System.out.print("Ingrese la marca del celular: ");
                String marca = scanner.nextLine();
                System.out.print("Ingrese el modelo del celular: ");
                String modelo = scanner.nextLine();
                tiendaService.agregarCelular(nombre, precio, marca, modelo);
                System.out.println("Celular agregado exitosamente.");
                
                break;
            case 3:
                System.out.print("Ingrese el tamaño del televisor (en pulgadas): ");
                String tamanio = scanner.nextLine();
                //scanner.nextLine(); // Consumir la nueva línea
                System.out.print("Ingrese la resolución del televisor: ");
                String resolucion = scanner.nextLine();
                tiendaService.agregarTelevision(nombre, precio, tamanio, resolucion);
                System.out.println("Televisor agregado exitosamente.");
                break;
            case 4:{
                /* 
                System.out.println("Ingrese el id del producto");
                String idProducto = scanner.nextLine();
                System.out.println("Ingrese el nombre  del producto");
                String nombreProducto = scanner.nextLine();
                System.out.println("Ingrese el precio del producto");
                double precioProducto = scanner.nextDouble();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese la descripcion del producto");
                String descripcion = scanner.nextLine();
                System.out.println("Ingrese la marca del producto");
                String marcaProducto = scanner.nextLine();
                System.out.println("Ingrese el modelo del producto");
                String modeloProducto = scanner.nextLine();
                System.out.println("Ingrese el color del producto");
                String color = scanner.nextLine();
                System.out.println("Ingrese la garantia del producto");
                int garantia = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese el voltaje del producto");
                int voltaje = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese la capacidad de la licuadora (en mililitros): ");
                int capacidad= scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                
                tiendaService.agregarLicuadora(idProducto,nombreProducto, precioProducto,descripcion,marcaProducto,modeloProducto,
                                               color,garantia,voltaje, capacidad);
                System.out.println("Licuadora agregada exitosamente.");
                
                
                break;
                */
            }
            case 5:
                System.out.print("Ingrese el número de ranuras de la tostadora: ");
                int ranuras = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                String material = scanner.nextLine();
                tiendaService.agregarTostadora(nombre, precio, ranuras, material);
                System.out.println("Tostadora agregada exitosamente.");
               
                break;
            case 6:
                System.out.print("Ingrese el tipo de calculadora (científica, básica, etc.): ");
                String tipo = scanner.nextLine();
                tiendaService.agregarCalculadora(nombre, precio, tipo);
                System.out.println("Calculadora agregada exitosamente.");
               
                break;
            default:
                System.out.println("Tipo de producto no válido.");
                return;
    }

   
    }

    private void eliminarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();
        tiendaService.eliminarProducto(nombre);
    }

    private void listarProductos() {
        tiendaService.listarProductos();
    }

    private void venderProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a vender: ");
        String nombre = scanner.nextLine();
        tiendaService.venderProducto(nombre);
    }

    private void aplicarDescuento(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a aplicar descuento: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el porcentaje de descuento: ");
        double porcentaje = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        tiendaService.aplicarDescuento(nombre, porcentaje);
    }

    private void actualizarPrecio(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo precio del producto: ");
        double nuevoPrecio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        tiendaService.actualizarPrecio(nombre, nuevoPrecio);
    }

    private void calcularValorTotalProductos() {
        double valorTotal = tiendaService.calcularValorTotalProductos();
        System.out.println("Valor total de los productos en inventario: $" + valorTotal);
    }
}