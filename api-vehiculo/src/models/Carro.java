package models;

public class Carro extends Vehiculo implements services.PruebaRuta {
    String tipoTransmision;

    public Carro(String marca, String modelo, String placa, int velocidadMaxima, String tipoTransmision) {
        super(marca, modelo, placa, velocidadMaxima);
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el carro...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el carro...");
    }

    @Override
    public void estacionar() {
        System.out.println("Estacionando el carro...");
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigiendo el carro...");
    }
}