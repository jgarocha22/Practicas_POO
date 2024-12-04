package Prueba2;

import java.util.LinkedList;

public class Administrador2 extends Usuario2 {

  private LinkedList<Cliente2> clientesBanco;


  /**<p>Constructor de administrador</p>
   */
  public Administrador2(){
    super("Tu","admin","1234","Generica");
  }


  /**<p>Metodo para settear la lista de clientes del banco a administrar</p>
   * @param clientesBanco  lista clientes a administrar
   */
  public void setClientesAdministrado(LinkedList<Cliente2> clientesBanco) {
    this.clientesBanco = clientesBanco;
  }

  /**<p>Metodo para agregar cliente a el banco a administrar</p>
   * @param cliente2 nuevo cliente
   */
  public void anadirCliente(Cliente2 cliente2){
   clientesBanco.add(cliente2);
  }

  /**<p>Metodo para eliminar cliente del banco por nombre </p>
   * @param nombreCliente a eliminar
   */
  public void eliminarCliente(String nombreCliente){
    clientesBanco.remove(buscarCliente(nombreCliente));
  }

  /**<p>Metodo para buscar cliente por nombre </p>
   * @param nombreCliente a buscar
   * @return cliente buscado
   */
  private Cliente2 buscarCliente(String nombreCliente){
    Cliente2 cliente2Buscado =null;
    for(Cliente2 ic: clientesBanco){
      if (ic.getNombreUsuario()==nombreCliente){
        cliente2Buscado =ic;
        break;
      }
    }

    return cliente2Buscado;
  }

  /**<p>Metodo para boleano para saber si un cliente esta en el banco por su nombre </p>
   * @param nombreCliente a buscar
   * @return true si esta o false en caso contrario
   */
  public boolean estaCliente(String nombreCliente){
    boolean bool=false;
    for(Cliente2 ic: clientesBanco){
      if (ic.getNombreUsuario()==nombreCliente){
        bool=true;
        break;
      }
    }
    return bool;
  }

  //metodo para actualizar los datos del cliente pero hay que ver como es
  public void actualizarCliente(){

  }

}
