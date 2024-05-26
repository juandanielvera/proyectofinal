package co.edu.uniquindio.poo.model;

public abstract class Moto extends Vehiculo {
    
    private final String velocidadMaxima;

    public Moto(String velocidadMaxima, String placa, String modelo, double tarifaHora){

        super(placa, modelo, tarifaHora);
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }
}