import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pricipal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Articulo> articulos = new ArrayList<>();
        List<Venta> ventas = new ArrayList<>();
        ListaCategorias categorias = new ListaCategorias();


        categorias.addCategoriaToList(new Categoria("0-A", "Alimentos", 0.10));
        categorias.addCategoriaToList(new Categoria("0-B", "Aseo", 0.15));
        categorias.addCategoriaToList(new Categoria("0-C", "Bebidas", 0.12));

        int numeroVenta = 1;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Agregar articulo");
            System.out.println("2. Realizar venta");
            System.out.println("3. Mostrar articulos");
            System.out.println("4. Mostrar categorias");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el codigo del articulo: ");
                    String codigo = scanner.next();
                    System.out.print("Ingrese el nombre del articulo: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la categoria del articulo: ");
                    String categoria = scanner.next();
                    System.out.print("Ingrese la cantidad del articulo: ");
                    long cantidad = scanner.nextLong();
                    System.out.print("Ingrese el valor de compra del articulo: ");
                    double valorCompra = scanner.nextDouble();

                    Articulo articulo = new Articulo(codigo, nombre, categoria, cantidad, valorCompra);
                    articulos.add(articulo);

                    System.out.println("Articulo agregado con exito.");
                    break;

                case 2:
                    Venta venta = new Venta("V" + numeroVenta);
                    numeroVenta++;

                    while (true) {
                        System.out.print("Ingrese el codigo del articulo (0 para terminar la venta): ");
                        String codigoArticulo = scanner.next();
                        if (codigoArticulo.equals("0")) {
                            break;
                        }

                        for (Articulo art : articulos) {
                            if (art.getCodigo().equals(codigoArticulo)) {
                                venta.agregarArticulo(art);
                                break;
                            }
                        }
                    }

                    ventas.add(venta);
                    double totalVenta = venta.calcularTotal();
                    System.out.println("Total de la venta #" + venta.getCodigoVenta() + ": " + totalVenta);
                    break;

                case 3:
                    System.out.println("Listado de Articulos:");
                    for (Articulo art : articulos) {
                        art.showInfo();
                    }
                    break;

                case 4:
                    System.out.println("Listado de Categorias:");
                    categorias.showList();
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
                    break;
            }
        }
    }
}
