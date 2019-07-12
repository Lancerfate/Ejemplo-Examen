package resuelto1;

public class Invitado 
{
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	
	public Invitado(String nombre, String apellido, int dni, int edad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}
	public String getNombre()
	{
		return nombre;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	public int getDni()
	{
		return dni;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public String toString()
	{
		return apellido + " , " + nombre;
	}
	

}
