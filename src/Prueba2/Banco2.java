package Prueba2;

import java.util.LinkedList;

public class Banco2 {
  private LinkedList<Cliente2> cliente2s = new LinkedList<>();
  private Administrador2 admin= new Administrador2();

  public Banco2(){
    admin.setClientesAdministrado(cliente2s);
  }

  /**<p>Metodo para obtener la lista de clientes</p>
   * @return lista de clientes
   */
  public LinkedList getClientes(){
    return cliente2s;
  }

  /**<p>Metodo para settear la lista de clientes</p>
   */
  public void setclientes(LinkedList<Cliente2> cliente2s){
    this.cliente2s = cliente2s;
  }

  /**<p>Metodo para obtener el administrador</p>
   * @return admin
   */
  public Administrador2 getAdmin(){
    return admin;
  }
}
