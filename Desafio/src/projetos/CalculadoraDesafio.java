package projetos;
import java.util.Scanner;

public class CalculadoraDesafio {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Pedir para o usuário digitar uma das operações ( + - * / % )
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Informe o snúmero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		String op = entrada.next();
		
		//Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 * num2 : resultado;

		
		System.out.printf("%.2f %S %.2f = %.2f", 
				num1, op, num2, resultado);
		entrada.close();
	}
}
