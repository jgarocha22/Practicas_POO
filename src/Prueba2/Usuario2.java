package Prueba2;

public class Usuario2 {
  private String nombreCliente;
  private String nombreUsuario;
  private String contraseña;
  private String direccion;

  /**<p>Constructor de Usuario</p>
   * @param nombrePersona nombre de la persona
   * @param nombreUsuario nombre del usuario
   * @param contraseña  contraseña del usuario
   * @param direccion direccion del usuario
   */
  public Usuario2(String nombrePersona, String nombreUsuario, String contraseña, String direccion) {
    this.nombreCliente = nombrePersona;
    this.nombreUsuario = nombreUsuario;
    this.contraseña = contraseña;
    this.direccion = direccion;
  }

  /** <p>Metodo para devolver el nombre del cliente</p>
   * @return retorna el nombre del usuario
   */
  public String getNombreCliente() {
    return nombreCliente;
  }

  /** <p>Metodo para cambiar el nombre del cliente</p>
   * @param nombreCliente nuevo nombre
   */
  public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
  }

  /** <p>Metodo para devolver el nombre de usuario</p>
   * @return retorna el nombre
   */
  public String getNombreUsuario() {
    return nombreUsuario;
  }

  /** <p>Metodo para cambiar el nombre de usuario</p>
   * @param nombreUsuario nuevo nombre
   */
  public void cambiarNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  /** <p>Metodo para devolver la contraseña del usuario</p>
   * @return retorna contraseña
   */
  public String getContraseña() {
    return contraseña;
  }

  /** <p>Metodo para cambiar la contraseña del usuario</p>
   * @param contraseña nueva contraseña
   */
  public void cambiarContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

  /** <p>Metodo para devolver la direcccon del usuario</p>
   * @return retorna direccion
   */
  public String getDireccion() {
    return direccion;
  }

  /** <p>Metodo para cambiar la direccion del usuario</p>
   * @param direccion nueva contraseña
   */
  public void cambiarDireccion(String direccion) {
    this.direccion = direccion;
  }
}
