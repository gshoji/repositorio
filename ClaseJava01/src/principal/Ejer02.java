package principal;

public class Ejer02 {

	public static void main(String[] args) {
		float ingresos_minimo = 489083;
        boolean Vehiculos= false;
        boolean Barco_Avion_Acciones= false;
        boolean  Inmubles= false;
        float IMT= 5000000;


if ( (IMT >= ingresos_minimo) && (Vehiculos) && (Inmubles) && (Barco_Avion_Acciones) )
{
  System.out.println("Si, pertenece al segmento de mayor ingreso");
} 
else 
{
  System.out.println("No, pertenece al segmento de mayor ingreso");
}
	}
}
