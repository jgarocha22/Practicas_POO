package exSupermercado;

import java.time.LocalDate;

public class Vino implements ConDescuento,EsLiquido,EsAlimento {
    private String marca;
    private String tipo;
    private String envase;
    private int gradosAlcohol;
    private double precio;
    private double descuento;
    private double volumen;
    private LocalDate caducidad;

    public Vino(String marca, String tipo,String envase ,int gradosAlcohol, double precio,double descuento,double volumen) {
        this.marca = marca;
        this.tipo = tipo;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
        this.descuento = descuento;
        this.volumen = volumen;
        this.envase = envase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescuento(double des) {
        descuento = des;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - ((descuento * precio)/100);
    }

    @Override
    public void setVolumen(double v) {
        volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        envase = env;
    }

    @Override
    public String getTipoEnvase() {
        return envase;
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
        return gradosAlcohol * 10;
    }

    @Override
    public String toString() {
        return "\nVino" +
                "\nmarca: " + marca +
                "\ntipo: " + tipo +
                "\ngradosAlcohol: " + gradosAlcohol +
                "\nprecio: " + precio +
                "\ncalorias: " + getCalorias() +
                "\ncaducidad: " + caducidad +
                "\nenvase: " + getTipoEnvase() +
                "\nVolumen: " + getVolumen() +
                "\nDescuento: " + getDescuento() +
                "\nPrecio con descuento: " + getPrecioDescuento();
    }
}
