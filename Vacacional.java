// Importamos la librería que nos permite interactuar con el usuario.
import java.util.Scanner;
/* Creamos la primera linea de codigo diciendo que este proyecto se llama Vacacional
 Después creamos la segunda linea con el metodo main como todos los proyectos en java*/
public class Vacacional{
	public static void main(String[] args) {
		// aquí determinamos las variables
		Scanner keyboard = new Scanner(System.in);
		String name = "";
		int clave = 0;
		int anti = 0;
		// aquí le damos la bienvenida al usuario y le preguntamos su nombre(la variable es name)
		System.out.println("Bienvenido al sistema Vacacional de coca-cola Company");
		System.out.println("¿Cual es el nombre del trabajador?");
		name = keyboard.nextLine();
		// aquí le preguntamos cuantos años de servicio tiene(la variable es anti)
		System.out.println("Cuantos años de servicio tiene el trabajador?");
		anti = keyboard.nextInt();
		// aquí le preguntamos cual es la clave de su departamento(la variable es clave)
		System.out.println("¿Cual es la clave de su departamento?");
		clave = keyboard.nextInt();
		/* Aquí empieza lo bueno, en estas líneas de codigo le decimos al programa que depende de que clave 
		ponga va a hacer una o otra cosa. El código está hecho con todo lo que se sobre Java entonces es 
		normal que sea tan primitivo y se base en if y sin elses porque todavía no se utilizarlos. Si los
		sabes utilizar porfavor ayuda.*/
		if(clave == 1){
			if (anti == 1) {
				System.out.println(name + " derecho a 6 días");
			}
			if (anti >= 2 && anti <= 6) {
				System.out.println(name + " derecho a 14 días");
			}
			if (anti == 7) {
				System.out.println(name + " derecho a 20 días");
			}
			if(anti > 7){
				System.out.println("Aun no tiene derecho a vacaciones");
			}
		}
		if (clave == 2) {
			if (anti == 1) {
				System.out.println( name + " Derecho a 7 días");
			}
			if (anti >= 2 && anti <= 6) {
				System.out.println(name + " Derecho a 15 días");
			}
			if (anti == 7) {
				System.out.println(name + " Dercho a 22 días");
			}
			if(anti > 7){
				System.out.println("Aun no tiene derecho a vacaciones");
			}
		}
		if (clave == 3) {
			if (anti == 1) {
				System.out.println(name + " Derecho a 10 días");
			}
			if (anti >=2 && anti <= 6) {
				System.out.println(name + " Derecho a 20 días");
			}
			if (anti == 7) {
				System.out.println(name + " Derecho a 30 días");
			}
			if(anti > 7){
				System.out.println(name + " Aun no tiene vacaciones");
			}
		}
		if(anti < 3){
			System.out.println("Error, la clave de departamento no existe");
		}
	}
}
// aquí acaba el programa gracias por hehcarle un vistazo.
