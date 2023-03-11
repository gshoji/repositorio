package Clase03;

public class Ejer01 {
	

	public static void main(String[] args) {
		
		String palabra="araxi";
		char let='a';
		int cont=0;
		for(int i=0;i<palabra.length();i++)
		{
			if(palabra.contains(let))
			{
				cont++;
			}
		}
		System.out.println("La palabra "+palabra+" contiene "+cont+" letras "+let);
		
	}

}
