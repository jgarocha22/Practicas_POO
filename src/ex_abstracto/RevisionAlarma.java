package ex_abstracto;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    private double numeroAlarmas;

    public RevisionAlarma(String trabajador, LocalDate fechaInicio, String cliente, double numeroAlarmas) {
        super(trabajador, fechaInicio, cliente);
        this.numeroAlarmas = numeroAlarmas;
    }

    public double getNumeroAlarmas() {
        return numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (numeroAlarmas / 3) * 40;
    }

    @Override
    public double costeTotal() {
        return 0;
    }

    @Override
    public String detalleServicio() {
        return "Cliente: " + getCliente() +
                "\n" +
                "Fecha revisión: " + getFechaInicio() +
                "\n" +
                "----------------------------------------\n" +
                "TOTAL....... " + costeManoObra()+
                "\n" +
                "--------------------------------------";
    }
}
