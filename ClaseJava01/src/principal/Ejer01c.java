package principal;

public class Ejer01c {

	public static void main(String[] args) {
		
		int numeroInicio=5;
		int numeroFin=14;
		String tipo="impar";
		
		while (numeroInicio<=numeroFin)
		{
			if(tipo=="par")
			{
			 if(numeroInicio%2==0)
			 {
			   System.out.println(numeroInicio);
			 }
			 numeroInicio++;
			}
			else
			{
				if(numeroInicio%2!=0)
				 {
				   System.out.println(numeroInicio);
				 }
				 numeroInicio++;
				
			}
		}
	}
}