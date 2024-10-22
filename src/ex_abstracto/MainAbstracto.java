package ex_abstracto;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainAbstracto {

    static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void main(String[] args) {
        LocalDate fc = LocalDate.now();
        TrabajoPintura t1 = new TrabajoPintura("Pedro",fc,"Fermin",50,200);
        TrabajoPintura t2 = new TrabajoPintura("Joshua",fc,"Fercho",20,125);
        RevisionAlarma a1 = new RevisionAlarma("pepeto",fc,"Ozuna",20);

        JOptionPane.showMessageDialog(null,t1.detalleServicio(),"SERVICIO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,t2.detalleServicio(),"SERVICIO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,a1.detalleServicio(),"SERVICIO", JOptionPane.INFORMATION_MESSAGE);
    }
}
