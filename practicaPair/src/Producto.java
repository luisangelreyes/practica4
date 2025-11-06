public class Producto {
    private String SKU;
    private String nombre;
    private int precioBase;

    public Producto(String SKU,String nombre, int precioBase){
        this.SKU = SKU;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    public void setNombreProducto(String nombre){
        this.nombre = nombre;
    }
    public String getNombreProducto(){
        return nombre;
    }
        public void setSKU(String SKU){
        this.SKU = SKU;
    }
    public String getSKU(){
        return SKU;
    }
    public void setPrecioBase(int precioBase){
        this.precioBase = precioBase;
    }
    public int getPrecioBase(){
        return precioBase;
    }
}
