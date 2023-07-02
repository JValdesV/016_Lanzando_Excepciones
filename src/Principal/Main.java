package Principal;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando metodo 1");
		metodo2();
		System.out.println("Fin metodo 1");
	}
	
	public static void metodo2() {
		System.out.println("Iniciando metodo 2");
		metodo3();
		System.out.println("Fin metodo 2");
	}
	
	public static void metodo3() {
		System.out.println("Iniciando metodo 3");
		metodo4();
		//Creando un objeto de tipo excepcion segun corresponda
		//ArithmeticException exception = new ArithmeticException();
		//Aqui lanzamos la excepcion
		//throw exception;
		System.out.println("Fin metodo 3");
	}
	
	public static void metodo4() {
		System.out.println("Iniciando metodo 4");
		throw new ArithmeticException("Aqui ocurre un error");
		//System.out.println("Fin metodo 3");
	}
	
	
	
	

}
