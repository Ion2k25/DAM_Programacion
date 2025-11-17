import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Repetir el programa For4, pero en el caso que M < N, intercambie los valores y muestre los números comprendidos entre ellos.
		
		
		Scanner lector=new Scanner(System.in);
		
		int n;
		int m;
		
		System.out.println("Introduce numero 1");
		
		n=lector.nextInt();
		
		System.out.println("Introduce numero 2");
		
		m=lector.nextInt();
		
		
		if(m>n) {
			for(n++;m>n;n++) {
				System.out.println(n);
		
			}
		}else {
			int aux=m;
			m=n;
			n=aux;
			for(m++;n>m;m++) {
				System.out.println(m);
			}
		}
	}

}
