package ex_abstracto;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainAbstracto {

    static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void showArrayResult() {
        double totalTrabajos = 0;
        double totalSueldos = 0;
        for(Servicio s: servicios) {
            totalTrabajos += s.costeTotal();
            totalSueldos += s.costeManoObra();
        }

        String mensaje = "Coste total de todos los trabajos........."+String.format("%.2f",totalTrabajos)+" $\n"+
                         "Coste sueldos a pagar........."+String.format("%.2f",totalSueldos)+" $";

        JOptionPane.showMessageDialog(null,mensaje,"CUENTAS A PAGAR",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        LocalDate fc = LocalDate.now();
        TrabajoPintura t1 = new TrabajoPintura("Pedro",fc,"Fermin",50,200);
        TrabajoPintura t2 = new TrabajoPintura("Joshua",fc,"Fercho",20,125);
        RevisionAlarma a1 = new RevisionAlarma("pepeto",fc,"Ozuna",20);

        servicios.add(t1);
        servicios.add(t2);
        servicios.add(a1);

        JOptionPane.showMessageDialog(null,t1.detalleServicio(),"SERVICIO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,t2.detalleServicio(),"SERVICIO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,a1.detalleServicio(),"SERVICIO", JOptionPane.INFORMATION_MESSAGE);

        showArrayResult();


    }
}
