public class Empresa {
    private String nombre;
    private String ruc;
    private String direccion;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRuc() {
        return ruc;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", ruc='" + ruc + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

