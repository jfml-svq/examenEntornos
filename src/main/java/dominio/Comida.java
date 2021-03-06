package dominio;

public class Comida {

    private String nombre;
    private String descripcion;
    private boolean estado;
    private int precioPrecio;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPrecioPrecio() {
        return precioPrecio;
    }

    public void setPrecioPrecio(int precioPrecio) {
        this.precioPrecio = precioPrecio;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", precio=" + precioPrecio +
                '}';
    }
}
