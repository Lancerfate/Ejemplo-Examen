package resuelto1;

import java.util.Scanner;

public class AdministracionInvitados 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		Discoteca discoPb1 = new Discoteca("Salsa-Latina", 5);
				
		int opcionIngresada=0;
		
		
		do {
			System.out.println("Bienvenido al sistema de ingreso de invitados.");
			System.out.println("Opcion 1: Agregar Invitado.");
			System.out.println("Opcion 2: Buscar Invitado por DNI.");
			System.out.println("Opcion 3: Mostrar Invitados mayores de 30.");
			opcionIngresada = teclado.nextInt();
			switch(opcionIngresada) 
			{
			case 1:
				System.out.println("Ingrese el nombre del invitado.");
				String nombre = teclado.next();
				System.out.println("Ingrese el apellido del invitado.");
				String apellido = teclado.next();
				System.out.println("Ingrese el dni del invitado.");
				int dni = teclado.nextInt();
				System.out.println("Ingrese la edad del invitado.");
				int edad = teclado.nextInt();
				
				Invitado miInvitado = new Invitado(nombre, apellido, dni, edad);
				
				discoPb1.ingresarInvitado(miInvitado);
				
				break;
			case 2:
				System.out.println("Ingrese el dni del invitado que desea buscar: ");
				int dniABuscar = teclado.nextInt();
				System.out.println(discoPb1.buscarInvitadoPorDni(dniABuscar));
				break;
			case 3:
				System.out.println(discoPb1.obtenerListaDeInvitadosMayorA30Anios());
				break;
			default:
				break;
			
			}
			
		}while(opcionIngresada != 0);
		

	}

}
