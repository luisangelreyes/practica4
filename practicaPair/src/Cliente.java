public class Cliente {
    private String id;
    private String nombre;

    public Cliente(String id, String nombre){
        this.id = id;
        this.nombre= nombre;
    }
public void setNombreCliente(String nombre){
    this.nombre = nombre;
}
public String getNombreCliente(){
    return nombre;
}
public void setId(String id){
    this.id= id;   
}

public String getId(){
    return id;
}
}
