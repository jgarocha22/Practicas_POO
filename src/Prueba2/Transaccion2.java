package Prueba2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaccion2 {
  private LocalDateTime fechaEmision;
  private double monto;

  /** <p>Constructor Transaccion</p>
   * @param fechaEmision cuando se hizo la transaccion
   * @param monto monto de la transaccion
   */
  public Transaccion2(LocalDateTime fechaEmision, double monto) {
    this.fechaEmision = fechaEmision;
    this.monto = monto;
  }

  /** <p>Metodo para mostrar transaccion por consola</p>
   */
  public void mostrarTransaccion(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"); // formato de la fecha
    System.out.println(fechaEmision.format(formatter)+" "+ monto); //se aplica formato


  }
}
