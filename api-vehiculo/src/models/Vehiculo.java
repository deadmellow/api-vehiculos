package models;

public abstract class Vehiculo {
    String marca;
    String modelo;
    String placa;
    int velocidadMaxima;

    public Vehiculo(String marca, String modelo, String placa, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
    }
}