package co.edu.uniquindio.poo.model;

public class Propietario {
    
    private String nombre;
    private String apellido;
    private Vehiculo vehiculo;

    public Propietario(String nombre, String apellido, Vehiculo vehiculo){

        this.nombre = nombre;
        this.apellido = apellido;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    
}