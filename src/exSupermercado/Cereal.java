package exSupermercado;

import java.time.LocalDate;

public class Cereal implements EsAlimento{
    private String Marca;
    private String tipo;
    private double Preico;
    private LocalDate caducidad;

    public Cereal(String Marca,String tipo,double Preico) {
        this.Marca = Marca;
        this.Preico = Preico;
        this.tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getPreico() {
        return Preico;
    }

    public void setPreico(double preico) {
        Preico = preico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        if(tipo == "espelta") {
            return 5;
        }
        if(tipo == "maiz") {
            return 8;
        }if(tipo == "trigo") {
            return 12;
        }else {
            return 15;
        }
    }

    @Override
    public String toString() {
        return "\nCereal" +
                "\nMarca: " + Marca +
                "\nPreico:" + Preico +
                "\ntipo: " + tipo +
                "\ncalorias: " + getCalorias() +
                "\ncaducidad: " + caducidad;
    }
}
