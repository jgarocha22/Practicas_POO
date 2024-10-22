package exSupermercado;
import java.time.LocalDate;

public class testMain {

    public static void main(String[] args) {
        LocalDate fc = LocalDate.now();
        Cereal c = new Cereal("si","maiz",20);
        c.setCaducidad(fc);
        Detergente d = new Detergente("waaw","sisa",40,5,12);
        Vino v = new Vino("webo","vino","brrr",12,50,15,23);
        v.setCaducidad(fc);
        v.setVolumen(40);

        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(v.toString());
    }
}
