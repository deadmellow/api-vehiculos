package common;

import java.util.Scanner;
import models.Moto;
import models.Carro;
import services.PruebaRuta;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos de la moto
        System.out.println("Ingrese los datos de la moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Placa: ");
        String placaMoto = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaMoto = scanner.nextInt();
        System.out.print("Cilindraje: ");
        int cilindrajeMoto = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear objeto de tipo Moto con los datos ingresados
        Moto moto = new Moto(marcaMoto, modeloMoto, placaMoto, velocidadMaximaMoto, cilindrajeMoto);

        // Ingresar datos del carro
        System.out.println("\nIngrese los datos del carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Placa: ");
        String placaCarro = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaCarro = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Tipo de Transmisión: ");
        String tipoTransmisionCarro = scanner.nextLine();

        // Crear objeto de tipo Carro con los datos ingresados
        Carro carro = new Carro(marcaCarro, modeloCarro, placaCarro, velocidadMaximaCarro, tipoTransmisionCarro);

        // Realizar prueba de ruta para la moto
        System.out.println("\nPrueba de ruta para la moto:");
        realizarPruebaRuta(moto);

        // Realizar prueba de ruta para el carro
        System.out.println("\nPrueba de ruta para el carro:");
        realizarPruebaRuta(carro);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para realizar la prueba de ruta
    private static void realizarPruebaRuta(PruebaRuta vehiculo) {
        vehiculo.acelerar();
        vehiculo.frenar();
        vehiculo.estacionar();
        vehiculo.dirigir();
    }
}