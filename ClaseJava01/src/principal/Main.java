package principal;

public class Main {

	public static void main(String[] args) {
		
		String eq_local="Patronato";
		String eq_vis="Parana";
		int gol_local=3;
		int gol_vis=3;
		
		if(gol_local==gol_vis)
		{
			System.out.println("Empate entre "+eq_local+" y "+eq_vis);
		}
		if(gol_local>gol_vis)
		{
			if(gol_local-gol_vis==1)
			{
				System.out.println(eq_local+" gano por la minima diferencia");
			}
			else if(gol_local-gol_vis==2)
			{
				System.out.println(eq_local+" fue una justa diferencia");
			}
			else System.out.println(eq_local+" goleada");
		}
		if(gol_vis>gol_local)
		{
			if(gol_vis-gol_local==1)
			{
				System.out.println(eq_vis+" gano por la minima diferencia");
			}
			else if(gol_vis-gol_local==2)
			{
				System.out.println(eq_vis+" fue una justa diferencia");
			}
			else System.out.println(eq_vis+" goleada");
		}
	
	
	}

}
