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
	
	
	ArrayList<String> nombre = new ArrayList<String>();
	
	nombre.add("Aitor Menta");
	nombre.add("Carlos");
	nombre.add("Juanlu");
	
	Iterator<String> i = nombre.iterator();
		while(i.hasNext()){
			String nombres = i.next();
			System.out.println(nombres);
		}

}
}
