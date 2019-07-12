package resuelto1;

public class Discoteca 
{
	private String nombre;
	private int capacidadMaxima;
	private Invitado[] invitados;
	private int invitadosIngresados;
	private int mayoresA30Ingresados;
	
	
	public Discoteca(String nombre, int capacidadMaxima)
	{
		this.nombre = nombre;
		this.capacidadMaxima = capacidadMaxima;
		this.invitadosIngresados = 0;
		this.mayoresA30Ingresados = 0;
		this.invitados = new Invitado[capacidadMaxima];
	}
	
	//--> METODO QUE ingresara al invitado solo si es mayor de edad y si no supera la capacidad maxima
	public boolean ingresarInvitado(Invitado invitado)
	{
		if(invitado.getEdad() > 18 && invitadosIngresados <= capacidadMaxima)
			/*si la edad del invitado es mayor a 18 y los invitados que ingresaron son menores a la capacidad que soporta
			la disco entonces se cumple la condicion de poder entrar (agregarlo a la lista de invitados[])*/
		{
			for(int i = 0; i <= invitadosIngresados; i++)
			{
				//for para recorrer el array de invitados[]
				if(invitados[i] == null)
				{
					/*condicion que se fija si el invitado en la posicion i (invitados[i]) esta vacio. si esta vacio
					el invitado pasado por parametro se guardara en la posicion i que esta vacia y se sumara 1 al
					 contador de invitados y devolvera un true porque el metodo pide que se devuelva un boolean*/
					invitados[i] = invitado;
					invitadosIngresados ++;
					return true;
				}
			}
			
		}
		return false;
	}
	
	/*--> METODO QUE LE TENDRAS QUE PASAR UN DNI Y BUSCARA UN INVITADO CON EL MISMO DNI Y SI LO ENCUENTRA
	TE DIRA QUIEN ES*/
	public Invitado buscarInvitadoPorDni(int dni)
	{
		for(int i = 0; i < invitadosIngresados; i++)
		{
			//for para recorrer el array y acceder a los distintos invitados en las diferentes posiciones
			if(invitados[i].getDni() == dni)
				/*condicion que verifica si el dni del invitado en la posicion i es igual al del dni pasado 
				  por parametro que es el invitado que se quiere buscar 
				Si se cumple la condicion significa que se encontro el invitado con un dni igual al que se pasa 
				  por parametro, entonces devolveremos al invitado en la posicion i con un return*/
				 
				 
			{
				return invitados[i];
			}
		}
		return null;
	}
	
	//--> METODO QUE ORDENARA LOS INVITADOS POR SU EDAD
	public void ordenarInvitadorPorEdad()
	{
		for(int i = 0; i < invitadosIngresados ; i++) /*for para volver a empezar el siguiente for 
			de vuelta una vez que termino*/
		{
			for(int j = 0; j < invitadosIngresados-1; j++) //for para recorrer el array de invitados[] y acceder a ellos
			{
				if(invitados[j].getDni() > invitados[j+1].getDni()) /*condicion que si EL DNI del invitado en la 
				posicion j es mayor al del invitado en la posicion j+1
				Si se cumple la condicion entonces cambiara de lugar los invitados, dejando al de menor dni adelante
				del de mayor*/
				{
					Invitado temporal = null;
					temporal = invitados[j];
					invitados[j] = invitados[j+1];
					invitados[j+1] = temporal;
				}
			}
		}
		
	}
	
	
	/*--> METODO QUE GUARDARA EN OTRA LISTA DIFERENTE A LOS INVITADOS QUE TENGAN UNA EDAD MAYOR A 30.
	PIDE QUE DEVUELVA UNA LISTA DE INVITADO[]*/
	public Invitado[] obtenerListaDeInvitadosMayorA30Anios()
	{
		Invitado listaMayoresA30[] = new Invitado[capacidadMaxima]; /*creo una lista de tipo Invitado que
		                                                              va a guardar los que sean mayores a 30*/
		for(int i = 0; i < invitadosIngresados; i++) //con este for voy a recorrer el array de invitados[]
		{
			if(invitados[i].getEdad() >= 30)// me fijo si la edad del invitado en la posicion i es mayor a 30
			{ //si es mayor a 30 lo guardo el mismo invitado del array de invitados[] en el array de listaMayoresA30[]
					listaMayoresA30[mayoresA30Ingresados] = invitados[i];
					mayoresA30Ingresados++;
				
			}
		}
			for(int i = 0; i < mayoresA30Ingresados ; i++) /*un for aparate para una vez que termine el anterior con 
				                                   este poder imprimir por pantalla los invitados mayores de 30 años*/
			{
				System.out.println(listaMayoresA30[i]);
			}
				
		return null; /* al final no supe como devolver el tipo invitado asi que devolvi un null y anteriormente 
		imprimi los invitados por pantalla con un for*/
	}

}
