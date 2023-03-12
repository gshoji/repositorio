package Clase03;

public class Ejer01 {
	

	public static void main(String[] args) {
		
		String palabra="araxi";
		String letra='a';
		int cont=0;
		for(int i=0;i<palabra.length();i++)
		{
			if(palabra.contains(letra))
			{
				cont++;
			}
		}
		System.out.println("La palabra "+palabra+" contiene "+cont+" letras "+let);
		
	}

}
