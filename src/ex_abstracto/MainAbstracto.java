package ex_abstracto;

import javax.swing.*;
import java.time.LocalDate;

public class MainAbstracto {

    public static void main(String[] args) {
        LocalDate fc = LocalDate.now();
        TrabajoPintura t1 = new TrabajoPintura("Pedro",fc,"Fermin",50,200);
        TrabajoPintura t2 = new TrabajoPintura("Joshua",fc,"Putupau",20,125);
        RevisionAlarma a1 = new RevisionAlarma("",fc,"Ozuna",20);

        JOptionPane.showMessageDialog(null,t1.detalleServicio());
        JOptionPane.showMessageDialog(null,t2.detalleServicio());
        JOptionPane.showMessageDialog(null,a1.detalleServicio());
    }
}
