package Prueba2;


import java.util.LinkedList;

public class Cliente2 extends Usuario2 {
  private LinkedList<Cuenta2> cuenta2s = new LinkedList<>();

  /**
   * <p>Constructor de Cliente</p>
   * @param nombreCliente nombre del cliente
   * @param nombreUsuario nombre del usuario
   * @param contraseña    contraseña del usuario
   * @param direccion     direccion del usuario
   */
  public Cliente2(String nombreCliente, String nombreUsuario, String contraseña, String direccion) {
    super(nombreCliente,nombreUsuario, contraseña, direccion);
  }

  public void setCuentas(String tipoDeCuenta){
    cuenta2s.add(new Cuenta2(tipoDeCuenta));
  }

  /** <p>Metodo para depositar saldo a la cuenta</p>
   * @param monto monto de la transaccion
   */
  public void depositar(double monto, Cuenta2 cuenta2){
    cuenta2.depositarSaldo(monto);
  }

  /** <p>Metodo para retirar saldo a la cuenta</p>
   * @param monto monto de la transaccion
   */
  public void retirarSaldo(double monto, Cuenta2 cuenta2){
    if(cuenta2.retiroPosible(monto)==true) {
      cuenta2.retirarSaldo(monto);
    }
    else {

      try {
        throw new Exception("No puede retirar un monto mayor a su saldo");
      }
      catch (Exception e){
        e.getMessage();
      }

    }
  }

  /** <p>Metodo para obtener saldo de la cuenta</p>
   * @return saldo de la cuenta
   */
  public double saldoDisponible(Cuenta2 cuenta2){
    return cuenta2.obtenerSaldo();
  }

  /** <p>Metodo para obtener la cuenta del cliente</p>
   * @return cuenta
   */
/*  public Cuenta obtenerCuenta(){
    return cuenta;   //METODO NO NECESARIO
  }
*/

  /** <p>Metodo para validar contraseña</p>
   * @return true si es igual false en caso contrario
   */
  public boolean validarContraseña(String contraseña){

    boolean boleano= false;
    if (super.getContraseña() == contraseña){
      boleano=true;
    }
    return boleano;
  }

  /** <p>Metodo para mostrar las transacciones de la cuenta en consola</p>
   */
  public void resumenTransacciones(Cuenta2 cuenta2){
    cuenta2.mostrarTransacciones();
  }

  public LinkedList<Cuenta2> getCuentas() {
    return cuenta2s;
  }

}