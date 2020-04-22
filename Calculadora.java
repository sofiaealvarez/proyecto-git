import java.util.Scanner;

public class Calculadora {

	Integer a;
	Integer b;
	Integer opcion;
	Integer resultado;

	public Calculadora(Integer a, Integer b, Integer resultado, Integer opcion) {
		this.a = a;
		this.b = b;
		this.resultado = resultado;
		this.opcion = opcion;
	}

	public Calculadora(Integer a, Integer b) {
		this.a = a;
		this.b = b;

	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getOpcion() {
		return opcion;
	}

	public void setOpcion(Integer opcion) {
		this.opcion = opcion;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;

	}

	public Integer suma(Integer a, Integer b) {
		this.resultado = this.a + this.b;
		return resultado;
	}

	public Integer resta(Integer a, Integer b) {
		this.resultado = this.a - this.b;
		return resultado;
	}

	public Integer division(Integer a, Integer b) {
		this.resultado = this.a / this.b;
		return resultado;
	}

	public Integer multiplicacion(Integer a, Integer b) {
		this.resultado = this.a * this.b;
		return resultado;
	}

	public static void main(String[] args) {

		Calculadora r1 = new Calculadora(10, 5);

		Scanner teclado = new Scanner(System.in);

		Integer opcion = 0;

		switch (opcion) {

		case 1:

			System.out.println("Ingrese su operación 1 para Sumar");
			opcion = teclado.nextInt();

			System.out.println("Ingrese el primer numero");
			teclado.nextInt();

			System.out.println("Ingrese el segundo numero");
			teclado.nextInt();

			System.out.println("El resultado es " + r1.suma(10, 5));

			break;

		case 2:

			System.out.println("Ingrese su operación 1 para Sumar");
			opcion = teclado.nextInt();

			System.out.println("Ingrese el primer numero");
			teclado.nextInt();

			System.out.println("Ingrese el segundo numero");
			teclado.nextInt();

			System.out.println("El resultado es " + r1.resta(10, 5));

			break;

		case 3:

			System.out.println("Ingrese su operación 1 para Sumar");
			opcion = teclado.nextInt();

			System.out.println("Ingrese el primer numero");
			teclado.nextInt();

			System.out.println("Ingrese el segundo numero");
			teclado.nextInt();

			System.out.println("El resultado es " + r1.multiplicacion(10, 5));

			break;

		case 4:

			System.out.println("Ingrese su operación 1 para Sumar");
			opcion = teclado.nextInt();

			System.out.println("Ingrese el primer numero");

			teclado.nextInt();

			System.out.println("Ingrese el segundo numero");
			teclado.nextInt();

			System.out.println("El resultado es " + r1.division(10, 5));

			break;


		}
	}
}