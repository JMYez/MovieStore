package models;

public class Administrador {
    private int dni;
    private String nombre;
    private String apellidos;
    private String codigo;
    private String telefono;
    private String correo;

    public Administrador(int dni, String nombre, String apellidos, String codigo, String telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

}
