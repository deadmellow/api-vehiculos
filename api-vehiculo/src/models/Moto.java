package models;

public class Moto extends Vehiculo implements services.PruebaRuta {
    int cilindraje;

    public Moto(String marca, String modelo, String placa, int velocidadMaxima, int cilindraje) {
        super(marca, modelo, placa, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando la moto...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando la moto...");
    }

    @Override
    public void estacionar() {
        System.out.println("Estacionando la moto...");
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigiendo la moto...");
    }
}