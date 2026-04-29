package Problema1;

public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private String tipo;
    private boolean incluyeCasco;

    public Motocicleta(String placa, String marca, String modelo, int año, double costoPorDia, int cilindrada, String tipo, boolean incluyeCasco) {
        super(placa, marca, modelo, año, costoPorDia);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.incluyeCasco = incluyeCasco;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public String getTipo() {
        return this.tipo;
    }

    public boolean getIncluyeCasco() {
        return this.incluyeCasco;
    }

    public double calcularCosto(int dias) {
        double total = super.calcularCosto(dias);
        return total * 0.95;
    }

}

