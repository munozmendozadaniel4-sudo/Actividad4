package Problema1;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double costoPorDia;


    public Vehiculo(String placa, String marca, String modelo, int año, double costoPorDia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costoPorDia = costoPorDia;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAño() {
        return this.año;
    }

    public double getCostoPorDia() {
        return this.costoPorDia;
    }

    public void setCostoPorDia(double costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    public double calcularCosto(int dias) {
        double total = (double)dias * this.costoPorDia;
        if (dias > 7) {
            total *= 0.9;
        }

        return total;
    }

    public String toString() {
        return this.marca + " " + this.modelo;
    }
}

