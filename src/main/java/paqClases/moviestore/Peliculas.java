
package paqClases.moviestore;
//a
import java.time.LocalDate;

public class Peliculas {
    public String codigo;
    public String titulo;
    public String genero;
    public LocalDate  fechaEstreno;
    public String sinopsis;
    public LocalDate  fechaAgregacion;
    public int stock;
    public int cantidad;
    public int nueStock;

    public Peliculas() {
    }

    public Peliculas(String codigo, String titulo, String genero, LocalDate fechaEstreno, String sinopsis, LocalDate fechaAgregacion, int stock, int cantidad, int nueStock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaEstreno = fechaEstreno;
        this.sinopsis = sinopsis;
        this.fechaAgregacion = fechaAgregacion;
        this.stock = stock;
        this.cantidad = cantidad;
        this.nueStock = nueStock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public LocalDate getFechaAgregacion() {
        return fechaAgregacion;
    }
    
    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setFechaAgregacion(LocalDate fechaAgregacion) {
        this.fechaAgregacion = fechaAgregacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNueStock() {
        return nueStock;
    }

    public void setNueStock(int nueStock) {
        this.nueStock = nueStock;
    }
    
}
