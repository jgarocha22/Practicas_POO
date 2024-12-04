package Prueba2;

import java.util.LinkedList;

public class Intermediario2 {
  private static Banco2 banco;

  public static void setBanco(Banco2 banco1){
    banco=banco1;
  }

  public static Banco2 getBanco(){
    return banco;
  }
  public static Administrador2 getAdministrador(){
    return banco.getAdmin();
  }

  public static LinkedList<Cliente2> getClientesBanco(){
    return banco.getClientes();
  }
}
