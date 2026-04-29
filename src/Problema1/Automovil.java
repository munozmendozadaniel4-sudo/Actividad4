package Problema1;

public class Automovil {

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private String transmision;
    private int capacidadPasajeros;

    public Automovil(String placa, String marca, String modelo, int año, double costoPorDia, int numeroPuertas, String transmision, int capacidadPasajeros) {
        super(placa, marca, modelo, año, costoPorDia);
        this.numeroPuertas = numeroPuertas;
        this.transmision = transmision;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public String getTransmision() {
        return this.transmision;
    }

    public int getCapacidadPasajeros() {
        return this.capacidadPasajeros;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " | Puertas: " + this.numeroPuertas + " | Transmision: " + this.transmision + " | Pasajeros: " + this.capacidadPasajeros;
    }

}
