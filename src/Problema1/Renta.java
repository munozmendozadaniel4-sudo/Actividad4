package Problema1;

import java.io.PrintStream;

public class Renta {
    private String fechaRenta;
    private String fechaInicio;
    private String fechaFin;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Renta(String fechaRenta, String fechaInicio, String fechaFin, Cliente cliente, Vehiculo vehiculo) {
        this.fechaRenta = fechaRenta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }


    public String getFechaRenta() {
        return this.fechaRenta;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public String getFechaFin() {
        return this.fechaFin;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public double calcularTotal(int dias) {
        return this.vehiculo.calcularCosto(dias);
    }

    public String toString() {
        String var10000 = String.valueOf(this.cliente);
        return var10000 + " renta " + String.valueOf(this.vehiculo);
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Perez", "2721234567", "INE");
        Vehiculo auto = new Automovil("A23B4C", "Nissan", "Versa", 2022, (double)400.0F, 4, "Manual", 5);
        Vehiculo camioneta = new Camioneta("DEF456", "Ford", "Ranger", 2021, (double)600.0F, "4x4", (double)1200.0F, 2);
        Vehiculo moto = new Motocicleta("GHI789", "Yamaha", "R3", 2023, (double)300.0F, 300, "Deportiva", true);
        Renta rentaAuto = new Renta("01/01/2026", "02/01/2026", "10/01/2026", cliente, auto);
        Renta rentaCamioneta = new Renta("05/01/2026", "06/01/2026", "15/01/2026", cliente, camioneta);
        Renta rentaMoto = new Renta("10/01/2026", "11/01/2026", "20/01/2026", cliente, moto);
        int dias = 10;
        System.out.println("-DATOS DEL CLIENTE:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Celular: " + cliente.getCelular());
        System.out.println("Identificacion: " + cliente.getIdentificacion());
        System.out.println("\n-INFORMACION DE RENTAS:");
        System.out.println("\n-AUTOMOVIL:");
        System.out.println("Placa: " + auto.getPlaca());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Año: " + auto.getAño());
        System.out.println("Costo por dia: $" + auto.getCostoPorDia());
        System.out.println("Puertas: " + ((Automovil)auto).getNumeroPuertas());
        System.out.println("Transmision: " + ((Automovil)auto).getTransmision());
        System.out.println("Capacidad pasajeros: " + ((Automovil)auto).getCapacidadPasajeros());
        PrintStream var10000 = System.out;
        double var10001 = rentaAuto.calcularTotal(dias);
        var10000.println("Total renta: $" + var10001);
        System.out.println("\n-CAMIONETA:");
        System.out.println("Placa: " + camioneta.getPlaca());
        System.out.println("Marca: " + camioneta.getMarca());
        System.out.println("Modelo: " + camioneta.getModelo());
        System.out.println("Año: " + camioneta.getAño());
        System.out.println("Costo por dia: $" + camioneta.getCostoPorDia());
        System.out.println("Traccion: " + ((Camioneta)camioneta).getTipoTraccion());
        System.out.println("Capacidad carga: " + ((Camioneta)camioneta).getCapacidadCarga() + " kg");
        System.out.println("Filas asientos: " + ((Camioneta)camioneta).getFilasAsientos());
        var10000 = System.out;
        var10001 = rentaCamioneta.calcularTotal(dias);
        var10000.println("Total renta: $" + var10001);
        System.out.println("\n-MOTOCICLETA:");
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Año: " + moto.getAño());
        System.out.println("Costo por dia: $" + moto.getCostoPorDia());
        System.out.println("Cilindrada: " + ((Motocicleta)moto).getCilindrada());
        System.out.println("Tipo: " + ((Motocicleta)moto).getTipo());
        System.out.println("Incluye casco: " + ((Motocicleta)moto).getIncluyeCasco());
        var10000 = System.out;
        var10001 = rentaMoto.calcularTotal(dias);
        var10000.println("Total renta: $" + var10001);
    }
}
