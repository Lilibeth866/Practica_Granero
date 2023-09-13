import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String codigoVenta;
    private List<Articulo> articulos;

    public Venta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
        this.articulos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public double calcularTotal() {
        double total = 0;
        for (Articulo articulo : articulos) {
            total += articulo.getValorCompra();
        }
        return total;
    }

    public void showInfo() {
        System.out.println("Codigo de Venta: " + codigoVenta);
        for (Articulo articulo : articulos) {
            articulo.showInfo();
        }
        System.out.println("Total de la Venta: " + calcularTotal());
        System.out.println("--------------------");
    }
    public String getCodigoVenta() {
        return codigoVenta;
    }

}
