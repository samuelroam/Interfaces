package ciudad;
import java.util.ArrayList;
import java.util.Iterator;



public class Alumnos {
	
	
	public static void main(String[] args) {

	


	ArrayList<Persona> alumnos = new ArrayList<Persona>();
	
	Persona alumno = new Persona("Juan", "Pedro", "21354687");
	alumnos.add(alumno);

	alumno = new Persona("nombre2", "apellido2", "dni2");
	alumnos.add(alumno);
	
	
	ArrayList<String> nombres = new ArrayList<String>();
	
	nombres.add("Aitor Menta");
	nombres.add("Carlos");
	nombres.add("Juanlu");
	
	Iterator<String> i = nombres.iterator();
		while(i.hasNext()){
			String nombre = i.next();
			System.out.println(nombre);
			
			
	Iterator<Persona> j = alumnos.iterator();
		while(j.hasNext()){
			Persona alumno = j.next();
			System.out.println(alumno);
		}
		}
}
}
