import java.util.Scanner;
import java.util.Random;
public class PPoT
{
	public static void main(String[] args) 
	{
		//	Definiciones
		Scanner chooseUrDestiny = new Scanner(System.in);
		Random rng_jesus = new Random(0);
		int destiny;//seleccion de jugador
		String otravez;

		do
		{

			//Jugador escoge su destino…
			while (true)
			{			
				System.out.print("\nSeleccione: \n1.Piedra \n2.Papel \n3.Tijera? \nSelección: ");
				destiny = chooseUrDestiny.nextInt();
				if (destiny == 1 || destiny == 2 || destiny ==3)
					break;
				else
					System.out.println("Selección inválida.");//crashea si ingresa texto, no números. :/ oh well.

			}
			// fin de selección

			//Strings que le dan nombres a las selecciones
			String realdestiny = "";//jugador
			String computerdestiny = "";//computadora

			//la computadora escoge su destino…
			int computer_choice;
			computer_choice = rng_jesus.nextInt(3)+1;

			//Se le asigna nombre a la selección de la computadora
			switch (computer_choice)
			{
				case 1:
				computerdestiny = "Piedra";
				break;

				case 2:
				computerdestiny = "Papel";
				break;

				case 3:
				computerdestiny = "Tijera";
				break;

			}
			System.out.print("\n\n");//separa el texto cause muh aesthetics

			//asigna nombre a selección de jugador y define el ganador.
			switch (destiny)
			{
				case 1://jugador escoge piedra
					realdestiny = "Piedra";
					System.out.println("Ha escogido: "+realdestiny+".");
					System.out.println("La computadora ha escogido: "+computerdestiny+".");
					switch (computer_choice)
					{
						case 1: //	ai escoge piedra
							System.out.println("Empate.");
							break;
						case 2: //	ai escoge papel
							System.out.println("Gana la computadora.");
							break;
						case 3: //	ai escoge tijera
							System.out.println("Gana el jugador.");
							break;	

					}	
						break;


				case 2://jugador escoge papel
					realdestiny = "Papel";
					System.out.println("Ha escogido: "+realdestiny+".");
					System.out.println("La computadora ha escogido: "+computerdestiny+".");
					switch (computer_choice)
					{
						case 1: //	ai escoge piedra
							System.out.println("Gana el jugador.");
							break;
						case 2: //	ai escoge papel
							System.out.println("Empate.");
							break;
						case 3: //	ai escoge tijera
							System.out.println("Gana la computadora.");
							break;	

					}
					break;


				case 3://jugador escoge tijera
					realdestiny = "Tijera";
					System.out.println("La computadora ha escogido: "+computerdestiny+".");
					System.out.println("Ha escogido: "+realdestiny+".");	

					switch (computer_choice)
					{
						case 1: //	ai escoge piedra
							System.out.println("Gana la computadora.");
							break;
						case 2: //	ai escoge papel
							System.out.println("Gana el jugador.");
							break;
						case 3: //	ai escoge tijera
							System.out.println("Empate.");
							break;	
					}
					break;
			}
			//¿otra vez?
			while(true)
			{
				System.out.print("\nOtra vez? "); 
				otravez = chooseUrDestiny.next().toUpperCase();
				if(!otravez.equals("SI") && !otravez.equals("NO"))
					System.out.print("Selección inválida.\n");
				else
					break;
			}

		}while (otravez.equals("SI"));
		//fin del "otravez"	
	}
}