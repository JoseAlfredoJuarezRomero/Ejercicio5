package Examen;
import java.util.HashSet;
import java.util.Scanner;
public class Familia {
	
	private String padre;
	private String madre;
	private HashSet<String>hijos=new HashSet<String>();


	public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);
		
		
		int hijos=0, HijoNuevo=0;
		char respuesta='s';
		
		while((respuesta=='s')||(respuesta=='s')) {
			
			System.out.println("¿Cuantos hijos tiene?");
			hijos=entrada.nextInt();
			hijos+=HijoNuevo;
			System.out.println("¿Existen más Hijos? S para si ó N para no");
			respuesta=entrada.next().charAt(0);
		}
		 System.out.println("La suma fue: " + hijos);

	}



	}


