import java.util.Scanner;
public class Ahorcado
{
	public static void main(String[] args) 
	{
		String palabra = "";
		char[] palabraArray = new char[50]//Arrays suck.
		char letra;
		Scanner scan = new Scanner(System.in);
		char oculto = '_';

		int contador = 0, posicion = 0, vida = 5, longitud = 0;

		System.out.print("Ingrese la palabra: ");
		palabra = scan.next();

		longitud = palabra.length();


		for(contador = 0; contador < longitud; contador++)
		{
			//if (letra == palabra.charAt)
			System.out.print(oculto+" ");
		}
		while(vida > 0)
		{
			System.out.print("\nTiene "+vida+" oportunidad(es) restantes. Ingrese una letra:");
			letra = scan.next().charAt(0);

			for (posicion = 0; posicion < longitud; posicion++)
			{
				if (letra == palabra.charAt(posicion))
				{
					System.out.print(letra);
					palabraArray[posicion] = palabra.charAt(posicion);

					//break;
				}
				else
				{
					System.out.print("_");
				}

				System.out.print(" ");
			}//Hace falta restar vidas en letras incorrectas y hacer que se guarden las correctas.
		}	
	}
}