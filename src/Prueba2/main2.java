package Prueba2;

import java.util.LinkedList;

public class main2 {
  protected main2() {
  }

  /**
   * Método principal de la aplicación que se ejecuta al iniciar el programa.
   * Es el punto de entrada de cualquier aplicación Java.
   *
   * @param args Argumentos de la línea de comandos pasados al programa.
   *             En este caso, no se utilizan.
   */
  public static void main(final String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Cliente2 client1 = new Cliente2(" Pepe Gomez","pepe","123","paraiso");
    Cliente2 client2 = new Cliente2("Pablo Escobar","pablo","333","paraiso");

    Banco2 b1 = new Banco2();
    Administrador2 admin= b1.getAdmin();
    System.out.println(b1.getClientes().isEmpty());
    admin.anadirCliente(client1);
    admin.anadirCliente(client2);

    System.out.println(b1.getClientes().isEmpty());
    //admin.eliminarCliente("pepe");

    System.out.println(b1.getClientes().isEmpty());

    client1.setCuentas("Corriente");
    client1.setCuentas("Ahorro");
    /*client1.depositar(200);
    client1.retirarSaldo(50);
    client1.resumenTransacciones();*/

    mostrarCuentas(client1.getCuentas());

    /*admin.anadirCliente(client1);

    //Parte grafica
    Intermediario.setBanco(b1);
    //MenuPrincipal ventana1= new MenuPrincipal();


    System.out.println(Intermediario.getBanco().getClientes().isEmpty());*/


  }

  public static void mostrarCuentas(LinkedList<Cuenta2> c1) {
    for(Cuenta2 c : c1) {
      System.out.println(c.getTipo()+" "+ c.obtenerSaldo());
    }
    int opcion = 1;
    aumentarsaldo(c1.get(opcion));
    for(Cuenta2 c : c1) {
      System.out.println(c.getTipo() + " " + c.obtenerSaldo());
    }
    System.out.println("\n\nprobando en main 2");
  }

  public static void aumentarsaldo(Cuenta2 cuenta2) {
    cuenta2.depositarSaldo(500);
    //System.out.println(cuenta.obtenerSaldo()+" "+cuenta.getTipo());
  }
}
