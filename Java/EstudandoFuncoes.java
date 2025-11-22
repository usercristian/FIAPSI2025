import java.util.Scanner;

public class EstudandoFuncoes {

  public static void soma() {
	int v1, v2, resultado;
	Scanner sc = new Scanner(System.in);
	System.out.println("Por favor, digite um valor para a multiplicação:");
	v1 = sc.nextInt();
	System.out.println("Por favor, digite outro valor para a multiplicação:");
	v2 = sc.nextInt();
	resultado = v1 * v2;
	System.out.println("O resultado da multiplicação foi: " + resultado);
	sc.close();		
}

}