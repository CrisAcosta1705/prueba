package prueba;
import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		int n, num;
		double z;
		double a[];
		double b[];
		double pp;
		double suma = 0, op = 0, op1 = 0, op2 = 0, mod1 = 0, mod2 = 0;
		double cantidad[];
		System.out.println("Ingrese la cantidad de valores");
		n = tc.nextInt();
		a = new double[n];
		b = new double[n];
		cantidad = new double[(int)n];
		
		for(int i = 0; i < cantidad.length; i++) {
			System.out.println("Ingrese el valor A #"+(i+1));
			num = tc.nextInt();
			a[i] = num;
		}
			for(int i = 0; i < cantidad.length; i++) {
				
			
			System.out.println("Ingrese el valor B #"+(i+1));
			num = tc.nextInt();
			b[i] = num;
			}
			for(int i = 0; i < cantidad.length; i++) {
				
			pp = (a[i]*b[i]);
			suma = suma + pp;
			op1 = Math.pow(a[i], 2);
			op2 = Math.pow(b[i], 2);
			}			
		
		System.out.println("El producto punto es: "+suma);
		
		mod1 = (double) Math.sqrt(op1);
		mod2 = (double) Math.sqrt(op2);
		op = mod1 * mod2; 
		z = suma/op;
		System.out.println("La expresion Z es igual a: "+z);
		
	}
}

