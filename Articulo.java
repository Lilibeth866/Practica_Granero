public class Articulo {
    private String codigo;
    private String nombre;
    private String categoria;
    private long cantidad;
    private double valorCompra;
    private double ganancia;

    public Articulo(String codigo, String nombre, String categoria, long cantidad, double valorCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
        //this.ganancia = 0.0;
    }

    public Articulo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getGanancia() {
        return ganancia;
    }

    /*public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }*/

    public void showInfo(){
        System.out.println( this.getCodigo() );
        System.out.println( this.getNombre() );
        System.out.println( this.getCategoria() );
        System.out.println( this.getCantidad() );
        System.out.println( this.getValorCompra() );
        System.out.println(this.getGanancia());
        System.out.println("--------------------");
    }

    public void setGanancia(ListaCategorias listaCategorias){
        for (Categoria c: listaCategorias.categoriaList){
            if(this.getCategoria()==c.getCodigo()){
                this.ganancia = this.valorCompra * c.getGanancia() + this.valorCompra;


            }
        }
    }

}
