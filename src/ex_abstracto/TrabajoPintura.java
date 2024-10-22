package ex_abstracto;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public double costeAdicional() {
        double adicional = costeMaterial() + costeManoObra();
        if(superficie >= 50)
            return 0;
        else
            return (adicional * 15)/100;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    @Override
    public double costeMaterial() {
        return (superficie/7.8) * precioPintura;
    }

    @Override
    public double costeManoObra() {
        return (superficie/10) * 9.5;
    }

    @Override
    public double costeTotal() {
        double coste_material = costeMaterial();
        double coste_mano_obra = costeManoObra();
        double coste_total;
        coste_total = coste_material + coste_mano_obra;
        if(superficie >= 50)
            return coste_total;
        else
            return coste_total + costeAdicional();
    }

    @Override
    public String detalleServicio() {
        return "Cliente: " + getCliente() +
                "\nFecha de inicio: " + getFechaInicio() +
                "\n----------------------------------------\n" +
                "Pintor: "+ getTrabajador() +
                "\nCoste Material..... " + costeMaterial() + "$" +
                "\nCoste Mano de Obra.... " + costeManoObra() + "$" +
                "\nCoste Adicional.... " + costeAdicional() + "$" +
                "\n" +
                "TOTAL............ "+ costeTotal() + "$" +
                "\n" +
                "--------------------------------------";
    }
}
