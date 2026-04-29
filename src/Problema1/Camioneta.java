package Problema1;

public class Camioneta extends Vehiculo {
    private String tipoTraccion;
    private double capacidadCarga;
    private int filasAsientos;

    public Camioneta(String placa, String marca, String modelo, int año, double costoPorDia, String tipoTraccion, double capacidadCarga, int filasAsientos) {
        super(placa, marca, modelo, año, costoPorDia);
        this.tipoTraccion = tipoTraccion;
        this.capacidadCarga = capacidadCarga;
        this.filasAsientos = filasAsientos;
    }

    public String getTipoTraccion() {
        return this.tipoTraccion;
    }

    public double getCapacidadCarga() {
        return this.capacidadCarga;
    }

    public int getFilasAsientos() {
        return this.filasAsientos;
    }

    public double calcularCosto(int dias) {
        double total = super.calcularCosto(dias);
        if (this.tipoTraccion.equals("4x4")) {
            total *= 1.15;
        }

        return total;
    }

}

