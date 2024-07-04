
package models;

import java.time.LocalDate;

public class Pelicula {
    public String codigo;
    public String titulo;
    public String genero;
    public String sinopsis;
    public LocalDate  fechaEstreno;
    public LocalDate  fechaAgregacion;
    public int stock;

    public Pelicula() {
    }

    public Pelicula(String codigo, String titulo, String genero,  String sinopsis, LocalDate fechaEstreno, LocalDate fechaAgregacion, int stock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
        this.fechaAgregacion = fechaAgregacion;
        this.stock = stock;
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

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
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

    public void setFechaAgregacion(LocalDate fechaAgregacion) {
        this.fechaAgregacion = fechaAgregacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
