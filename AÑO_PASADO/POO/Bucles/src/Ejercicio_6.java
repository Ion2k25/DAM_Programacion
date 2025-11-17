import java.util.Scanner;
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Hacer un programa que pida un número, y después muestre su tabla de multiplicar.
	
	Scanner lector= new Scanner(System.in);
	
	
	int num;
	int num_2=1;
	
	System.out.println("Introduce un número");
	
	num=lector.nextInt();
	
//	do {
//		System.out.println(num+" x " +(num_2)+ " = " +(num*num_2));
//		num_2++;
//	}while(num_2<10);
//	
	
	for(;num_2<=10;num_2++) {
		System.out.println(num+" x " +(num_2)+ " = " +(num*num_2));
	}
	
	
	
	}

}
