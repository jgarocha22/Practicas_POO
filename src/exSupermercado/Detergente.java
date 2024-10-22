package exSupermercado;

public class Detergente implements ConDescuento,EsLiquido {
    private String Marca;
    private String envase;
    private double Precio;
    private double volumen;
    private double descuento;


    public Detergente(String marca,String envase,double precio,double volumen,double descuento) {
        Marca = marca;
        Precio = precio;
        this.envase = envase;
        this.volumen = volumen;
        this.descuento = descuento;
    }

    public String getMarca() {
        return Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public void setDescuento(double des) {
        descuento = des;
    }


    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return Precio - ((descuento * Precio)/100);
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
        return "Envase: "+envase;
    }

    @Override
    public String toString() {
        return "\nDetergente" +
                "\nMarca: " + Marca +
                "\nPrecio: " + Precio +
                "\n" + getTipoEnvase() +
                "\nVolumen: " + getVolumen() +
                "\nDescuento: " + getDescuento() +
                "\nPrecio + descuento: " + getPrecioDescuento();
    }
}
