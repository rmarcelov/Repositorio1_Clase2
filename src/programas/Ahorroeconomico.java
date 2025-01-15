package programas;
import java.util.Scanner;
public class Ahorroeconomico {
  //método de la clase  
  public static void main(String[] args){
     //declarar variables
     String empleado;
     double ingreso,gasto,ahorrom,ahorroa;
     //crear un objeto de lectura de datos
     Scanner lectura=new Scanner(System.in);
     //entrada de datos
     System.out.println("Ingresar nombre del empleado:");
     empleado=lectura.next();
     System.out.println("Ingreso económico");
     ingreso=lectura.nextDouble();
     System.out.println("Gasto económico");
     gasto=lectura.nextDouble();
     //proceso de datos
     ahorrom=ingreso-gasto;
     ahorroa=ahorrom*12;
     //salida de datos
     System.out.println("Ahorro mensual:"+ahorrom);
     System.out.println("Ahorro anual:"+ahorroa);
  }  
}
