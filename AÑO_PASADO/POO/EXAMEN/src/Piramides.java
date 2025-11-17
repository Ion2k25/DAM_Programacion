import java.util.Scanner;

public class Piramides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner lector= new Scanner(System.in);
		
		int inicial=0, fin=0, i=0;
		
		System.out.println("Introduce tamaño de la piramide ");
		
		fin=lector.nextInt();
		
		for(inicial=0;inicial<fin;inicial++) {
			for(i=0;i<inicial;i++) {
				System.out.print(" "+i);
				
			}
			System.out.println();
		}
	
		
		for(inicial=fin;inicial>0;inicial--) {
			for(i=0;i<inicial;i++) {
				System.out.print(" "+i);
	
			}
			System.out.println();
		}
	}
}

		
	

